package com.hu.backend.dto.particularidade;

public record ParticularidadeCreationDto(
    Long tratamentoId,
    boolean usoDegrau,
    boolean usoOculos,
    boolean exporFace,
    String descricaoExporFace,
    boolean protecaoGenital,
    String descricaoProtecaoGenital,
    String descricaoPosicaoCabine,
    String descricaoOutros
) {
    
}
