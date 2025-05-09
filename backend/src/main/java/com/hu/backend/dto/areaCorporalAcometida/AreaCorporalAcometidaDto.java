package com.hu.backend.dto.areaCorporalAcometida;

public record AreaCorporalAcometidaDto(
    Long id,
    Integer cabecaPescoco,
    Integer bracoDireito,
    Integer bracoEsquerdo,
    Integer pernaDireita,
    Integer pernaEsquerda,
    Integer troncoAnterior,
    Integer troncoPosterior,
    Integer genitalia
) {
}
