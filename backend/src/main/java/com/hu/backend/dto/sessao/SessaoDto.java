package com.hu.backend.dto.sessao;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.hu.backend.entities.enums.Reacaotipo;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "SessaoDto", description = "DTO de resposta contendo os dados de uma sessão de tratamento.")
public record SessaoDto(

    @Schema(description = "ID da sessão", example = "12")
    Long id,

    @Schema(description = "Data da sessão realizada", example = "2025-05-10")
    LocalDate dataSessao,

    @Schema(description = "Dose aplicada na sessão (em J/cm²)", example = "1.75")
    BigDecimal dose,

    @Schema(description = "Tipo de reação pós-sessão", implementation = Reacaotipo.class)
    Reacaotipo reacaoPosSessao,

    @Schema(description = "Observações registradas sobre a sessão", example = "Paciente apresentou eritema leve.")
    String observacoes,

    @Schema(description = "Tempo total de exposição (em segundos)", example = "150")
    Integer tempoExposicao

) {}
