package com.hu.backend.entities;

import java.time.Duration;
import java.time.LocalDate;

import com.hu.backend.entities.converters.DurationConverter;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sessaoId;

    private LocalDate dataSessao;

    private int Dose;

    private String reacaoPosSessao;

    private String observacoes;

    @Column(name = "tempo_exposicao")
    @Convert(converter = DurationConverter.class) 
    private Duration tempoExposicao;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false) 
    private Paciente paciente;
}
