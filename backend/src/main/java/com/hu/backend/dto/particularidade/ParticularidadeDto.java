package com.hu.backend.dto.particularidade;

public record ParticularidadeDto(
    Long id,
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
