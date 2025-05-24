package com.hu.backend.dto.tratamento;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import com.hu.backend.dto.areaCorporalAcometida.AreaCorporalAcometidaDto;
import com.hu.backend.dto.exame.ExameDto;
import com.hu.backend.dto.particularidade.ParticularidadeDto;
import com.hu.backend.dto.sessao.SessaoDto;
import com.hu.backend.entities.enums.DiaSemana;
import com.hu.backend.entities.enums.RespostaTratamento;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "TratamentoDto", description = "DTO de resposta contendo os dados detalhados de um tratamento e seus componentes associados.")
public record TratamentoDto(

    @Schema(description = "ID do tratamento", example = "101")
    Long tratamentoId,

    @Schema(description = "Nome do tratamento realizado", example = "Fototerapia UVB NB")
    String nomeTratamento,

    @Schema(description = "Data de início do tratamento", example = "2025-05-01")
    LocalDate dataInicio,

    @Schema(description = "Data de término do tratamento", example = "2025-08-20")
    LocalDate dataFim,

    @Schema(description = "Indica se o tratamento já foi finalizado", example = "true")
    boolean finalizado,

    @Schema(description = "Modalidade ou tipo de tratamento", example = "Ambulatorial")
    String modalidade,

    @Schema(description = "Diagnóstico clínico associado ao tratamento", example = "Vitiligo segmentar")
    String diagnostico,

    @Schema(description = "Frequência semanal de sessões", example = "3")
    Integer frequenciaTratamento,

    @Schema(description = "Dias da semana em que o tratamento ocorre", example = "[\"SEGUNDA\", \"QUARTA\", \"SEXTA\"]", implementation = DiaSemana.class)
    Set<DiaSemana> diasSessao,

    @Schema(description = "Resposta clínica ao tratamento", implementation = RespostaTratamento.class)
    RespostaTratamento respostaTratamento,

    @Schema(description = "Informações sobre a área corporal acometida")
    AreaCorporalAcometidaDto areaCorporalAcometida,

    @Schema(description = "Particularidades específicas do paciente durante o tratamento")
    ParticularidadeDto particularidade,

    @Schema(description = "Exames do paciente feitos antes do tratamento")
    List<ExameDto> exames,

    @Schema(description = "Lista de sessões realizadas durante o tratamento")
    List<SessaoDto> sessoes


) {}
