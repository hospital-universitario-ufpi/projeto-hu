package com.hu.backend.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Particularidade{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uso_degrau")
    private boolean usoDegrau;

    @Column(name = "uso_oculos")
    private boolean usoOculos;

    @Column(name = "expor_face")
    private boolean exporFace;

    @Column(name = "descricao_expor_face")
    private String descricaoExporFace;

    @Column(name = "protecao_genital")
    private boolean protecaoGenital;

    @Column(name = "descricao_protecao_genital")
    private String descricaoProtecaoGenital;

    @Column(name = "decricao_posicao_cabine")
    private String descricaoPosicaoCabine;

    @Column(name = "descricao_outros")
    private String descricaoOutros;

    @OneToOne(mappedBy = "particularidade")
    private Tratamento tratamento;


}
