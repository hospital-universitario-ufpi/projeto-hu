package com.hu.backend.dto.exame;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.hu.backend.entities.enums.ExameTipo;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "ExameCreationDto", description = "DTO utilizado para cadastrar novos exames realizados durante o tratamento.")
public record ExameCreationDto(

    @Schema(description = "ID do tratamento ao qual o exame está vinculado", example = "1")
    Long tratamentoId,

    @Schema(description = "Tipo do exame realizado", implementation = ExameTipo.class)
    ExameTipo exameTipo,

    @Schema(description = "Nome do exame específico", example = "25-OH Vitamina D")
    String nomeExame,

    @Schema(description = "Resultado numérico do exame, se aplicável", example = "28.7")
    BigDecimal resultadoNumerico,

    @Schema(description = "Resultado booleano do exame, se aplicável", example = "true")
    Boolean resultadoBoolean,

    @Schema(description = "Resultado textual alternativo (livre)", example = "Negativo para alterações significativas")
    String resultadoOutro,

    @Schema(description = "Data da realização do exame", example = "2025-04-22")
    LocalDate dataExame,

    @Schema(description = "Nome do laboratório responsável pelo exame", example = "Laboratório Santa Clara")
    String laboratorio,

    @Schema(description = "Observações adicionais sobre o exame", example = "Amostra coletada em jejum. Resultado validado por bioquímico.")
    String observacao

) {}
