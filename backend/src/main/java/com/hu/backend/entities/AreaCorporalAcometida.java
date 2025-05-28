package com.hu.backend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
public class AreaCorporalAcometida{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(0)
    @Max(9)
    private Integer cabecaPescoco;

    @Min(0)
    @Max(9)
    private Integer bracoDireito;

    @Min(0)
    @Max(9)
    private Integer bracoEsquerdo;

    @Min(0)
    @Max(18)
    private Integer pernaDireita;

    @Min(0)
    @Max(18)
    private Integer pernaEsquerda;

    @Min(0)
    @Max(18) 
    private Integer troncoAnterior;

    @Min(0)
    @Max(18)
    private Integer troncoPosterior;

    @Min(0)
    @Max(1)
    private Integer genitalia;

    @OneToOne(mappedBy = "areaCorporalAcometida")
    private Tratamento tratamento;

}
