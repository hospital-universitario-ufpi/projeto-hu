package com.hu.backend.dto.paciente;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hu.backend.entities.enums.Fototipo;
import com.hu.backend.entities.enums.PacienteSexo;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;

@Schema(name = "PacienteCreationDto", description = "DTO utilizado para cadastro de novos pacientes.")
public record PacienteCreationDto(

    @NotBlank(message = "O nome do paciente é obrigatório.")
    @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres.")
    @Schema(description = "Nome completo do paciente", example = "Maria de Souza")
    String nome,

    @NotBlank(message = "O prontuário é obrigatório.")
    @Size(max = 50, message = "O prontuário deve ter no máximo 50 caracteres.")
    @Schema(description = "Código do prontuário do paciente - vem da ficha do GHU", example = "PR123456")
    String prontuario,

    @NotNull(message = "O sexo do paciente é obrigatório.")
    @Schema(description = "Sexo do paciente", implementation = PacienteSexo.class)
    PacienteSexo sexo,

    @NotNull(message = "A data de nascimento é obrigatória.")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Past(message = "A data de nascimento deve ser uma data passada.")
    @Schema(description = "Data de nascimento do paciente", example = "20-05-1990")
    LocalDate dataDeNascimento,

    @Size(max = 100, message = "O nome do médico deve ter no máximo 100 caracteres.")
    @Schema(description = "Nome do médico que indicou o paciente", example = "Dr. Carlos Alberto")
    String medicoIndicacao,

    @Pattern(regexp = "\\d{10,15}", message = "O telefone do médico deve conter apenas dígitos, entre 10 e 15 caracteres.")
    @Schema(description = "Telefone do médico que indicou o paciente", example = "86999991234")
    String telefoneMedicoIndicacao,

    @Pattern(regexp = "\\d{10,15}", message = "O telefone do paciente deve conter apenas dígitos, entre 10 e 15 caracteres.")
    @Schema(description = "Telefone de contato do paciente", example = "86988885678")
    String telefonePaciente,

    @NotNull(message = "O fototipo do paciente é obrigatório.")
    @Schema(description = "Fototipo de pele do paciente", implementation = Fototipo.class)
    Fototipo fototipo,

    @Size(max = 3000, message = "O resumo de tratamentos anteriores deve ter no máximo 3000 caracteres.")
    @Schema(description = "Resumo opcional de tratamentos anteriores realizados", example = "Paciente já realizou sessões de fototerapia em 2022.")
    String resumoTratamentosAnteriores

) {}
