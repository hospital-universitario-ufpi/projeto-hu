package com.hu.backend;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

@Component
public class OpenApiExporter implements ApplicationRunner {

    private final OpenAPI openAPI;

    public OpenApiExporter(OpenAPI openAPI) {
        this.openAPI = openAPI;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        String json = mapper.writeValueAsString(openAPI);

        // Gera openapi.json
        Path jsonPath = Paths.get("docs/openapi.json");
        Files.createDirectories(jsonPath.getParent());
        Files.writeString(jsonPath, json);
        System.out.println("✅ openapi.json gerado em: " + jsonPath.toAbsolutePath());

        // Gera openapi.yaml
        ProcessBuilder yamlBuilder = new ProcessBuilder(
            "openapi-generator-cli", "generate",
            "-i", jsonPath.toString(),
            "-g", "openapi-yaml",
            "-o", "docs/yaml-doc"
        );
        runProcess(yamlBuilder, "YAML");

        // Gera HTML
        ProcessBuilder htmlBuilder = new ProcessBuilder(
            "openapi-generator-cli", "generate",
            "-i", jsonPath.toString(),
            "-g", "html2",
            "-o", "docs/html-docs"
        );
        runProcess(htmlBuilder, "HTML");

        // Gera Markdown
        ProcessBuilder mdBuilder = new ProcessBuilder(
            "openapi-generator-cli", "generate",
            "-i", jsonPath.toString(),
            "-g", "markdown",
            "-o", "docs/markdown-docs"
        );
        runProcess(mdBuilder, "Markdown");
    }

    private void runProcess(ProcessBuilder builder, String tipo) throws Exception {
        builder.inheritIO(); // mostra os logs no console
        Process process = builder.start();
        int code = process.waitFor();
        if (code == 0) {
            System.out.println("✅ Documentação " + tipo + " gerada com sucesso.");
        } else {
            System.err.println("❌ Erro ao gerar documentação " + tipo + ". Verifique o openapi-generator-cli.");
        }
    }
}