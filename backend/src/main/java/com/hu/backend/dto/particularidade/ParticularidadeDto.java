package com.hu.backend.dto.particularidade;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "ParticularidadeDto", description = "DTO de resposta contendo as particularidades do paciente no tratamento.")
public record ParticularidadeDto(

    @Schema(description = "ID do registro de particularidade", example = "1")
    Long id,

    @Schema(description = "Indica se o paciente precisa de degrau na cabine", example = "true")
    boolean usoDegrau,

    @Schema(description = "Indica se o paciente utiliza óculos durante a sessão", example = "false")
    boolean usoOculos,

    @Schema(description = "Indica se o paciente expõe a face durante o tratamento", example = "true")
    boolean exporFace,

    @Schema(description = "Descrição adicional sobre a exposição da face", example = "Paciente cobre parte do rosto com máscara")
    String descricaoExporFace,

    @Schema(description = "Indica se há proteção genital durante a sessão", example = "true")
    boolean protecaoGenital,

    @Schema(description = "Descrição da proteção genital utilizada", example = "Uso de proteção específica fornecida pela clínica")
    String descricaoProtecaoGenital,

    @Schema(description = "Descrição da posição do paciente na cabine", example = "De pé com braços elevados")
    String descricaoPosicaoCabine,

    @Schema(description = "Outras particularidades relevantes", example = "Paciente com fobia de ambientes fechados")
    String descricaoOutros

) {}
