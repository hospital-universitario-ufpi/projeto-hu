package com.hu.backend.dto.tratamento;

import java.time.LocalDate;
import java.util.Set;

import com.hu.backend.entities.enums.DiaSemana;
import com.hu.backend.entities.enums.RespostaTratamento;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "TratamentoCreationDto", description = "DTO utilizado para criar um novo tratamento associado a um paciente.")
public record TratamentoCreationDto(

    @Schema(description = "ID do paciente vinculado ao tratamento", example = "1")
    Long pacienteId,

    @Schema(description = "Nome ou descrição breve do tratamento", example = "Fototerapia UVB NB")
    String nomeTratamento,

    @Schema(description = "Data de início do tratamento", example = "2025-05-01")
    LocalDate dataInicio,

    @Schema(description = "Data prevista ou efetiva de término do tratamento", example = "2025-08-15")
    LocalDate dataFim,

    @Schema(description = "Indica se o tratamento foi finalizado", example = "false")
    boolean finalizado,

    @Schema(description = "Número de sessões por semana (frequência)", example = "3")
    Integer frequenciaTratamento,

    @Schema(description = "Resposta clínica do paciente ao tratamento", implementation = RespostaTratamento.class)
    RespostaTratamento respostaTratamento,

    @Schema(description = "Dias da semana em que o paciente realiza as sessões", example = "[\"SEGUNDA\", \"QUARTA\", \"SEXTA\"]", implementation = DiaSemana.class)
    Set<DiaSemana> diasSessao,

    @Schema(description = "Diagnóstico clínico relacionado ao tratamento", example = "Psoríase em placas")
    String diagnostico

) {}
