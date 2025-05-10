package com.hu.backend.dto.exame;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.hu.backend.entities.enums.ExameTipo;

public record ExameCreationDto(
    Long tratamentoId,
    ExameTipo exameTipo,
    String nomeExame,
    BigDecimal resultadoNumerico,
    Boolean resultadoBoolean,
    String resultadoOutro,
    LocalDate dataExame,
    String laboratorio,
    String observacao
) {
    
}
