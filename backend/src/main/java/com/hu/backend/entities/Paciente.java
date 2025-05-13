package com.hu.backend.entities;

import java.time.LocalDate;
import java.util.List;

import com.hu.backend.entities.enums.Fototipo;
import com.hu.backend.entities.enums.PacienteSexo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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
public class Paciente{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true, nullable = false)
    private String prontuario; // vem da ficha do ghu;

    @Enumerated(EnumType.STRING)
    private PacienteSexo sexo;

    @Column(name = "data_de_nascimento")
    private LocalDate dataDeNascimento;

    private String medicoIndicacao;

    @Column(name = "telefone_medico")
    private String telefoneMedicoIndicacao;

    @Column(name = "telefone_paciente")
    private String telefonePaciente;

    @Enumerated(EnumType.STRING)
    private Fototipo fototipo;

    @Lob
    @Column(name = "resumo_tratamentos_anteriores", columnDefinition = "TEXT")
    private String resumoTratamentosAnteriores;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Tratamento> tratamentos;

    //======================================
    public void addTratamento(Tratamento tratamento){
        this.tratamentos.add(tratamento);
    }



}
