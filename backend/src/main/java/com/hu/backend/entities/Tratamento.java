package com.hu.backend.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
public class Tratamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @Column(name = "fototerapia_anterior_descricao")
    private String fototerapiaAnteriorDescricao;

    @Column(name = "sessoes_fototerapia_anterior")
    private Integer sessoesFototerapiaAnterior;

    // private String modalidadeFototerapiaAnterior;

    @Column(name = "dose_acumulada_fototerapia_anterior")
    private BigDecimal doseAcumuladaFototerapiaAnterior; // J/cm²

    @Column(name = "tratamento_anterior_descricao")
    private String tratamentoAnteriorDescricao;

    @Column(name = "tratamento_anterior_data")
    private LocalDate tratamentoAnteriorData;

    

    

}
