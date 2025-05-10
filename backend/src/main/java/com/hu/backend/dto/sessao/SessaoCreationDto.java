package com.hu.backend.dto.sessao;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.hu.backend.entities.enums.Reacaotipo;

public record SessaoCreationDto(
    LocalDate dataSessao,
    BigDecimal dose,
    Reacaotipo reacaoPosSessao,
    String observacoes,
    Integer tempoExposicao,
    Long tratamentoId
) {
}
