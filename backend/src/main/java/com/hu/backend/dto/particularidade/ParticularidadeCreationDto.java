package com.hu.backend.dto.particularidade;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "ParticularidadeCreationDto", description = "DTO utilizado para registrar particularidades do paciente durante o tratamento.")
public record ParticularidadeCreationDto(

    @Schema(description = "ID do tratamento ao qual essa particularidade está vinculada", example = "1")
    Long tratamentoId,

    @Schema(description = "Indica se o paciente precisa de degrau na cabine", example = "true")
    boolean usoDegrau,

    @Schema(description = "Indica se o paciente utiliza óculos durante a sessão", example = "true")
    boolean usoOculos,

    @Schema(description = "Indica se o paciente expõe a face durante o tratamento", example = "false")
    boolean exporFace,

    @Schema(description = "Descrição adicional sobre a exposição da face", example = "Paciente expõe parcialmente a testa")
    String descricaoExporFace,

    @Schema(description = "Indica se há proteção genital durante a sessão", example = "true")
    boolean protecaoGenital,

    @Schema(description = "Descrição da proteção genital utilizada", example = "Uso de cueca de algodão durante as sessões")
    String descricaoProtecaoGenital,

    @Schema(description = "Descrição sobre a posição do paciente na cabine", example = "De pé com os braços elevados")
    String descricaoPosicaoCabine,

    @Schema(description = "Outras particularidades relevantes", example = "Paciente com mobilidade reduzida no joelho esquerdo")
    String descricaoOutros

) {}
