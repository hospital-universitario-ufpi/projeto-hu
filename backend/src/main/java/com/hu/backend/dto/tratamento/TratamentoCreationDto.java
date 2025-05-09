package com.hu.backend.dto.tratamento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

import com.hu.backend.entities.enums.DiaSemana;
import com.hu.backend.entities.enums.RespostaTratamento;

public record TratamentoCreationDto(
    Long pacienteId,
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
    Set<DiaSemana> diasSessao
) {  
}
