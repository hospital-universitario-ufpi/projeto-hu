package com.hu.backend.dto;

import java.util.List;
import java.util.function.Function;

import com.hu.backend.dto.paciente.PacienteCreationDto;
import com.hu.backend.dto.paciente.PacienteDto;
import com.hu.backend.entities.Paciente;

public class DtoUtils {

    // ========================= PACIENTE ==========================  marcos
        public static Paciente toEntity(PacienteCreationDto paciente) {
            return Paciente.builder()
                .cpf(paciente.cpf())
                .dataDeNascimento(paciente.dataDeNascimento())
                .fototipo(paciente.fototipo())
                .medicoIndicacao(paciente.medicoIndicacao())
                .telefoneMedicoIndicacao(paciente.telefoneMedicoIndicacao())
                .telefonePaciente(paciente.telefonePaciente())
                .prontuario(paciente.prontuario())
                .sexo(paciente.sexo())
                .build();
        }

        public static PacienteDto toDto(Paciente paciente) {
            return new PacienteDto(
                paciente.getId(),
                paciente.getProntuario(),
                paciente.getSexo(),
                paciente.getCpf(),
                paciente.getDataDeNascimento(),
                paciente.getMedicoIndicacao(),
                paciente.getTelefoneMedicoIndicacao(),
                paciente.getTelefonePaciente(),
                paciente.getFototipo()
            );
        }

    // ========================= EXAMES ==========================  marcos


    // ========================= AreaCorporalAcometida ========================== vitao


    // ========================= Particularidades ========================== marcos


    // ========================= Sessao ========================== vitao


    // ========================= Tratamento ========================== vitao


    //==============================================================

    public static <T, R> List<R> toDtoList(List<T> modelList, Function<T, R> mapper) {
        return modelList.stream().map(mapper).toList();
    }
    
}
