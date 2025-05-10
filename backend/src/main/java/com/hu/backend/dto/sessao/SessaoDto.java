package com.hu.backend.dto.sessao;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.hu.backend.entities.enums.Reacaotipo;

public record SessaoDto(
    Long id,
    LocalDate dataSessao,
    BigDecimal dose,
    Reacaotipo reacaoPosSessao,
    String observacoes,
    Integer tempoExposicao
) {
}
