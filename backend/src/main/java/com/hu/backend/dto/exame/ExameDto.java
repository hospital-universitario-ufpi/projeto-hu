package com.hu.backend.dto.exame;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.hu.backend.entities.enums.ExameTipo;

public record ExameDto(
    Long id,
    ExameTipo exameTipo,
    String nomeExame,
    BigDecimal resultadoNumerico,
    boolean resultadoBoolean,
    String resultadoOutro,
    LocalDate dataExame,
    String laboratorio,
    String observacao
) {
    
}
