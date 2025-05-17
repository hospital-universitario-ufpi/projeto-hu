package com.hu.backend.dto.arquivos;



public record ArquivoCreationDto(
    String url,
    String titulo,
    Long sessaoId
) {

}