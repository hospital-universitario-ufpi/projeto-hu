package com.hu.backend.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.hu.backend.entities.enums.Reacaotipo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Sessao{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataSessao;

    private BigDecimal dose;

    @Enumerated(EnumType.STRING)
    private Reacaotipo reacaoPosSessao;

    private Integer tempoExposicao;

    private String observacoes;


    @ManyToOne
    @JoinColumn(name = "tratamento_id", nullable = false)
    private Tratamento tratamento;

    @OneToMany(mappedBy = "sessao", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Arquivo> arquivos;

    public void addArquivo(Arquivo arquivo) {
        this.arquivos.add(arquivo);
    }

}
