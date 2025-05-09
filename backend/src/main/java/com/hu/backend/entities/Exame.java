package com.hu.backend.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.hu.backend.entities.enums.ExameTipo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Exame {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "exame_tipo")
    private ExameTipo exameTipo;

    @Column(name = "nome_exame")
    private String nomeExame;

    private BigDecimal resultadoNumerico;

    private boolean resultadoBoolean;

    private String resultadoOutro;

    @Column(name = "exame_tipo")
    private LocalDate dataExame;

    private String laboratorio;

    private String observacao;
}
