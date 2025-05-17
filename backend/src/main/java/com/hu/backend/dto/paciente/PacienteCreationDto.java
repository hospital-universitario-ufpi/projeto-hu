package com.hu.backend.dto.paciente;

import java.time.LocalDate;

import com.hu.backend.entities.enums.Fototipo;
import com.hu.backend.entities.enums.PacienteSexo;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "PacienteCreationDto", description = "DTO utilizado para cadastro de novos pacientes.")
public record PacienteCreationDto(

    @Schema(description = "Nome completo do paciente", example = "Maria de Souza")
    String nome,

    @Schema(description = "Código do prontuário do paciente - vem da ficha do GHU", example = "PR123456")
    String prontuario,

    @Schema(description = "Sexo do paciente", implementation = PacienteSexo.class)
    PacienteSexo sexo,

    @Schema(description = "Data de nascimento do paciente", example = "1990-05-20")
    LocalDate dataDeNascimento,

    @Schema(description = "Nome do médico que indicou o paciente", example = "Dr. Carlos Alberto")
    String medicoIndicacao,

    @Schema(description = "Telefone do médico que indicou o paciente", example = "(86)99999-1234")
    String telefoneMedicoIndicacao,

    @Schema(description = "Telefone de contato do paciente", example = "(86)98888-5678")
    String telefonePaciente,

    @Schema(description = "Fototipo de pele do paciente", implementation = Fototipo.class)
    Fototipo fototipo,

    @Schema(description = "Resumo opcional de tratamentos anteriores realizados", example = "Paciente já realizou sessões de fototerapia em 2022.")
    String resumoTratamentosAnteriores // textarea

) {}
