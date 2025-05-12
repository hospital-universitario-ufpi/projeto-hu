package com.hu.backend.dto.sessao;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.hu.backend.entities.enums.Reacaotipo;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "SessaoCreationDto", description = "DTO utilizado para cadastrar uma nova sessão de tratamento.")
public record SessaoCreationDto(

    @Schema(description = "Data da sessão", example = "2025-05-10")
    LocalDate dataSessao,

    @Schema(description = "Dose aplicada na sessão (em J/cm²)", example = "1.5")
    BigDecimal dose,

    @Schema(description = "Reação observada após a sessão", implementation = Reacaotipo.class)
    Reacaotipo reacaoPosSessao,

    @Schema(description = "Observações gerais da sessão", example = "Paciente relatou leve vermelhidão após 12h.")
    String observacoes,

    @Schema(description = "Tempo de exposição em segundos", example = "120")
    Integer tempoExposicao,

    @Schema(description = "ID do tratamento vinculado à sessão", example = "5")
    Long tratamentoId

) {}
