package com.hu.backend.entities;

import java.time.LocalDate;

import com.hu.backend.entities.enums.Fototipo;
import com.hu.backend.entities.enums.PacienteSexo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String prontuario;

    @Enumerated(EnumType.STRING)
    private PacienteSexo sexo;

    private String cpf;

    @Column(name = "data_de_nascimento")
    private LocalDate dataDeNascimento;

    private String medicoIndicacao;

    private String telefone;

    @Enumerated(EnumType.STRING)
    private Fototipo fototipo;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "area_corporal_acometida")
    private AreaCorporalAcometida areaCorporalAcometida;





}
