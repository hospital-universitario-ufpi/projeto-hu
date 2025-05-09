package com.hu.backend.dto.sessao;

import java.time.LocalDate;

import com.hu.backend.entities.enums.Reacaotipo;

public record SessaoDto(
    Long id,
    LocalDate dataSessao,
    int Dose,
    Reacaotipo reacaoPosSessao,
    String observacoes,
    Integer tempoExposicao,
    Long tratamentoId
) {
}
