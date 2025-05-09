package com.hu.backend.dto;

import java.util.List;
import java.util.function.Function;

import com.hu.backend.dto.exame.ExameCreationDto;
import com.hu.backend.dto.exame.ExameDto;
import com.hu.backend.dto.paciente.PacienteCreationDto;
import com.hu.backend.dto.paciente.PacienteDto;
import com.hu.backend.dto.particularidade.ParticularidadeCreationDto;
import com.hu.backend.dto.particularidade.ParticularidadeDto;
import com.hu.backend.entities.Exame;
import com.hu.backend.entities.Paciente;
import com.hu.backend.entities.Particularidade;

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

    public static Exame toEntity(ExameCreationDto exame) {
        return Exame.builder()
            .dataExame(exame.dataExame())
            .exameTipo(exame.exameTipo())
            .laboratorio(exame.laboratorio())
            .nomeExame(exame.nomeExame())
            .observacao(exame.observacao())
            .resultadoBoolean(exame.resultadoBoolean())
            .resultadoOutro(exame.resultadoOutro())
            .build();
        }

    public static ExameDto toDto(Exame exame) {
        return new ExameDto(
            exame.getId(),
            exame.getExameTipo(),
            exame.getNomeExame(),
            exame.getResultadoNumerico(),
            exame.isResultadoBoolean(),
            exame.getResultadoOutro(),
            exame.getDataExame(),
            exame.getLaboratorio(),
            exame.getObservacao()
            );
        }

    // ========================= AreaCorporalAcometida ========================== vitao


    // ========================= Particularidade ========================== marcos

    public static Particularidade toEntity(ParticularidadeCreationDto particularidade) {
        return Particularidade.builder()
            .descricaoExporFace(particularidade.descricaoExporFace())
            .descricaoOutros(particularidade.descricaoOutros())
            .descricaoPosicaoCabine(particularidade.descricaoPosicaoCabine())
            .descricaoProtecaoGenital(particularidade.descricaoProtecaoGenital())
            .exporFace(particularidade.exporFace())
            .protecaoGenital(particularidade.protecaoGenital())
            .usoDegrau(particularidade.usoDegrau())
            .usoOculos(particularidade.usoOculos())
            .build();
    }

    public static ParticularidadeDto toDto(Particularidade particularidade) {
        return new ParticularidadeDto(
            particularidade.getId(),
            particularidade.isUsoDegrau(),
            particularidade.isUsoOculos(),
            particularidade.isExporFace(),
            particularidade.getDescricaoExporFace(),
            particularidade.isProtecaoGenital(),
            particularidade.getDescricaoProtecaoGenital(),
            particularidade.getDescricaoPosicaoCabine(),
            particularidade.getDescricaoOutros()
        );
    }

    // ========================= Sessao ========================== vitao


    // ========================= Tratamento ========================== vitao


    //==============================================================

    public static <T, R> List<R> toDtoList(List<T> modelList, Function<T, R> mapper) {
        return modelList.stream().map(mapper).toList();
    }
    
}
