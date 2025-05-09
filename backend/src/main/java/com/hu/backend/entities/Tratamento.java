package com.hu.backend.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.hu.backend.entities.enums.DiaSemana;
import com.hu.backend.entities.enums.RespostaTratamento;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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

    @Column(name = "nome_tratamento")
    private String nomeTratamento;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    @Column(name = "quantidade_sessoes")
    private Integer quantidadeSessoes;

    private BigDecimal doseAcumulada;

    private String local;

    private boolean finalizado;

    private String modalidade; 

    private Integer frequenciaTratamento;

    @Enumerated(EnumType.STRING)
    @Column(name = "reposta_tratamento")
    private RespostaTratamento respostaTratamento;

    @ElementCollection(targetClass = DiaSemana.class)
    @CollectionTable(name = "dias_sessao", joinColumns = @JoinColumn(name = "tratamento_id"))
    @Enumerated(EnumType.STRING)
    @Builder.Default
    @Column(name = "dia")
    private Set<DiaSemana> diasSessao = new HashSet<>();

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "area_corporal_acometida_id")
    private AreaCorporalAcometida areaCorporalAcometida;

    @OneToMany(mappedBy = "tratamento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Sessao> sessoes;
    
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "particularidade_id")
    private Particularidades particularidade;

    

}
/*
 * 
 * {
 *      id: 654654654654654,
 *      nome
 * }
 */