package com.hu.backend.dto.paciente;

import java.time.LocalDate;

import com.hu.backend.entities.enums.Fototipo;
import com.hu.backend.entities.enums.PacienteSexo;

public record PacienteDto(
    Long id,
    String prontuario,
    PacienteSexo sexo,
    String cpf,
    LocalDate dataDeNascimento,
    String medicoIndicacao,
    String telefoneMedicoIndicacao,
    String telefonePaciente,
    Fototipo fototipo,
    String nome
) {
    
}
