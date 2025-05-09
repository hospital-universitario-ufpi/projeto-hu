package com.hu.backend.dto;

import java.util.List;
import java.util.function.Function;

import com.hu.backend.dto.areaCorporalAcometida.AreaCorporalAcometidaCreationDto;
import com.hu.backend.dto.areaCorporalAcometida.AreaCorporalAcometidaDto;
import com.hu.backend.dto.paciente.PacienteCreationDto;
import com.hu.backend.dto.paciente.PacienteDto;
import com.hu.backend.dto.sessao.SessaoCreationDto;
import com.hu.backend.dto.sessao.SessaoDto;
import com.hu.backend.dto.tratamento.TratamentoCreationDto;
import com.hu.backend.dto.tratamento.TratamentoDto;
import com.hu.backend.entities.AreaCorporalAcometida;
import com.hu.backend.entities.Paciente;
import com.hu.backend.entities.Sessao;
import com.hu.backend.entities.Tratamento;

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
        public static AreaCorporalAcometida toEntity(AreaCorporalAcometidaCreationDto areaCorporalAcometida){
            return AreaCorporalAcometida.builder()
                .cabecaPescoco(areaCorporalAcometida.cabecaPescoco())
                .bracoDireito(areaCorporalAcometida.bracoDireito())
                .bracoEsquerdo(areaCorporalAcometida.bracoEsquerdo())
                .pernaDireita(areaCorporalAcometida.pernaDireita())
                .pernaEsquerda(areaCorporalAcometida.pernaEsquerda())
                .troncoAnterior(areaCorporalAcometida.troncoAnterior())
                .troncoPosterior(areaCorporalAcometida.troncoPosterior())
                .genitalia(areaCorporalAcometida.genitalia())
                .build();
        }

        public static AreaCorporalAcometidaDto toDto(AreaCorporalAcometida areaCorporalAcometida){
            return new AreaCorporalAcometidaDto(
                areaCorporalAcometida.getId(),
                areaCorporalAcometida.getCabecaPescoco(),
                areaCorporalAcometida.getBracoDireito(),
                areaCorporalAcometida.getBracoEsquerdo(),
                areaCorporalAcometida.getPernaDireita(),
                areaCorporalAcometida.getPernaEsquerda(),
                areaCorporalAcometida.getTroncoAnterior(),
                areaCorporalAcometida.getTroncoPosterior(),
                areaCorporalAcometida.getGenitalia()
            );
        }

    // ========================= Particularidades ========================== marcos


    // ========================= Sessao ========================== vitao
        public static Sessao toEntity(SessaoCreationDto sessao){
            return Sessao.builder()
                .dataSessao(sessao.dataSessao())
                .Dose(sessao.Dose())
                .reacaoPosSessao(sessao.reacaoPosSessao())
                .observacoes(sessao.observacoes())
                .tempoExposicao(sessao.tempoExposicao())
                .build();
        }

        public static SessaoDto toDto(Sessao sessao){
            return new SessaoDto(
                sessao.getId(),
                sessao.getDataSessao(),
                sessao.getDose(),
                sessao.getReacaoPosSessao(),
                sessao.getObservacoes(),
                sessao.getTempoExposicao(),
                sessao.getId()
            );
        }

    // ========================= Tratamento ========================== vitao
        public static Tratamento toEntity(TratamentoCreationDto tratamento){
            return Tratamento.builder()
                .nomeTratamento(tratamento.nomeTratamento())
                .dataInicio(tratamento.dataInicio())
                .dataFim(tratamento.dataFim())
                .quantidadeSessoes(tratamento.quantidadeSessoes())
                .doseAcumulada(tratamento.doseAcumulada())
                .local(tratamento.local())
                .finalizado(tratamento.finalizado())
                .modalidade(tratamento.modalidade())
                .frequenciaTratamento(tratamento.frequenciaTratamento())
                .respostaTratamento(tratamento.respostaTratamento())
                .diasSessao(tratamento.diasSessao())
                .build();
        }

        public static TratamentoDto toDto(Tratamento tratamento){
            return new TratamentoDto(
                tratamento.getId(),
                tratamento.getNomeTratamento(),
                tratamento.getDataInicio(),
                tratamento.getDataFim(),
                tratamento.getQuantidadeSessoes(),
                tratamento.getDoseAcumulada(),
                tratamento.getLocal(),
                tratamento.isFinalizado(),
                tratamento.getModalidade(),
                tratamento.getFrequenciaTratamento(),
                tratamento.getRespostaTratamento(),
                tratamento.getAreaCorporalAcometida(),
                DtoUtils.toDtoList(tratamento.getSessoes(), DtoUtils::toDto),
                DtoUtils.toDto(tratamento.getParticularidade())
            );
        }

    //==============================================================

    public static <T, R> List<R> toDtoList(List<T> modelList, Function<T, R> mapper) {
        return modelList.stream().map(mapper).toList();
    }
    
}
