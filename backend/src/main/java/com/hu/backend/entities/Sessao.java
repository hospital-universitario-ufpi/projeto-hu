package com.hu.backend.entities;

import java.time.LocalDate;

import com.hu.backend.entities.enums.Reacaotipo;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataSessao;

    private int Dose;

    @Enumerated(EnumType.STRING)
    private Reacaotipo reacaoPosSessao;

    private String observacoes;

    private Integer tempoExposicao;

    @ManyToOne
    @JoinColumn(name = "tratamento_id", nullable = false)
    private Tratamento tratamento;

}
