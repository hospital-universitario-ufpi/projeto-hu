package com.hu.backend.dto.exame;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.hu.backend.entities.enums.ExameTipo;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "ExameDto", description = "DTO de resposta contendo os dados do exame associado a um tratamento.")
public record ExameDto(

    @Schema(description = "ID do exame", example = "101")
    Long id,

    @Schema(description = "Tipo do exame realizado", implementation = ExameTipo.class)
    ExameTipo exameTipo,

    @Schema(description = "Nome do exame específico", example = "25-OH Vitamina D")
    String nomeExame,

    @Schema(description = "Resultado numérico do exame, se aplicável", example = "30.5")
    BigDecimal resultadoNumerico,

    @Schema(description = "Resultado booleano do exame, se aplicável", example = "false")
    Boolean resultadoBoolean,

    @Schema(description = "Resultado textual alternativo (livre)", example = "Sem alterações clínicas relevantes")
    String resultadoOutro,

    @Schema(description = "Data de realização do exame", example = "2025-04-22")
    LocalDate dataExame,

    @Schema(description = "Laboratório onde o exame foi realizado", example = "Laboratório Central")
    String laboratorio,

    @Schema(description = "Observações complementares", example = "Paciente realizou o exame após jejum de 12 horas.")
    String observacao

) {}
