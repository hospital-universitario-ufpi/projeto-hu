package com.hu.backend.dto.tratamento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.hu.backend.dto.areaCorporalAcometida.AreaCorporalAcometidaDto;
import com.hu.backend.dto.sessao.SessaoDto;
import com.hu.backend.entities.Paciente;
import com.hu.backend.entities.Particularidade;
import com.hu.backend.entities.enums.RespostaTratamento;

public record TratamentoDto(
    Long tratamentoId,
    Paciente pacienteId,
    String nomeTratamento,
    LocalDate dataInicio,
    LocalDate dataFim,
    Integer quantidadeSessoes,
    BigDecimal doseAcumulada,
    String local,
    boolean finalizado,
    String modalidade,
    Integer frequenciaTratamento,
    RespostaTratamento respostaTratamento,
    AreaCorporalAcometidaDto areaCorporalAcometida,
    List<SessaoDto> sessoes,
    Particularidade particularidade // trocar para Dto
) {
}
