package com.hu.backend.entities;

import java.time.LocalDate;
import java.util.ArrayList;
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
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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

    @NotBlank(message = "O nome do paciente é obrigatório.")
    @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres.")
    private String nome;

    @NotBlank(message = "O prontuário é obrigatório.")
    @Size(max = 50, message = "O prontuário deve ter no máximo 50 caracteres.")
    @Column(unique = true, nullable = false)
    private String prontuario;

    @NotNull(message = "O sexo do paciente é obrigatório.")
    @Enumerated(EnumType.STRING)
    private PacienteSexo sexo;

    @NotNull(message = "A data de nascimento é obrigatória.")
    @Column(name = "data_de_nascimento")
    private LocalDate dataDeNascimento;

    @Size(max = 100, message = "O nome do médico deve ter no máximo 100 caracteres.")
    private String medicoIndicacao;

    @Pattern(regexp = "\\d{10,15}", message = "O telefone do médico deve conter entre 10 e 15 dígitos numéricos.")
    @Column(name = "telefone_medico")
    private String telefoneMedicoIndicacao;

    @Pattern(regexp = "\\d{10,15}", message = "O telefone do paciente deve conter entre 10 e 15 dígitos numéricos.")
    @Column(name = "telefone_paciente")
    private String telefonePaciente;

    @NotNull(message = "O fototipo é obrigatório.")
    @Enumerated(EnumType.STRING)
    private Fototipo fototipo;

    @Size(max = 3000, message = "O resumo de tratamentos anteriores deve ter no máximo 3000 caracteres.")
    @Lob
    @Column(name = "resumo_tratamentos_anteriores", columnDefinition = "TEXT")
    private String resumoTratamentosAnteriores;

    @Builder.Default
    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tratamento> tratamentos = new ArrayList<>();

    public void addTratamento(Tratamento tratamento) {
        this.tratamentos.add(tratamento);
        tratamento.setPaciente(this);
    }
}
