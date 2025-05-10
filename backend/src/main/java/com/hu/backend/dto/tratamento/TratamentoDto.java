package com.hu.backend.dto.tratamento;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import com.hu.backend.dto.areaCorporalAcometida.AreaCorporalAcometidaDto;
import com.hu.backend.dto.particularidade.ParticularidadeDto;
import com.hu.backend.dto.sessao.SessaoDto;
import com.hu.backend.entities.enums.DiaSemana;
import com.hu.backend.entities.enums.RespostaTratamento;

public record TratamentoDto(
    Long tratamentoId,
    String nomeTratamento,
    LocalDate dataInicio,
    LocalDate dataFim,
    boolean finalizado,
    String modalidade,
    String diagnostico,
    Integer frequenciaTratamento,
    Set<DiaSemana> diasSessao,
    RespostaTratamento respostaTratamento,
    AreaCorporalAcometidaDto areaCorporalAcometida,
    List<SessaoDto> sessoes,
    ParticularidadeDto particularidade 
) {
}
