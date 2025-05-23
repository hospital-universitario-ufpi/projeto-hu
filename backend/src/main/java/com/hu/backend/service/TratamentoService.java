package com.hu.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hu.backend.dto.DtoUtils;
import com.hu.backend.dto.areaCorporalAcometida.AreaCorporalAcometidaCreationDto;
import com.hu.backend.dto.exame.ExameCreationDto;
import com.hu.backend.dto.particularidade.ParticularidadeCreationDto;
import com.hu.backend.dto.tratamento.TratamentoCreationDto;
import com.hu.backend.dto.tratamento.TratamentoDto;
import com.hu.backend.entities.AreaCorporalAcometida;
import com.hu.backend.entities.Exame;
import com.hu.backend.entities.Paciente;
import com.hu.backend.entities.Particularidade;
import com.hu.backend.entities.Tratamento;
import com.hu.backend.repositories.AreaCorporalRepository;
import com.hu.backend.repositories.ExameRepository;
import com.hu.backend.repositories.PacienteRepository;
import com.hu.backend.repositories.ParticularidadeRepository;
import com.hu.backend.repositories.TratamentoRepository;
import com.hu.backend.service.exception.PacienteNotFound;

@Service
public class TratamentoService {
    
    private TratamentoRepository tratamentoRepository;
    private PacienteRepository pacienteRepository;
    private ParticularidadeRepository particularidadeRepository;
    private ExameRepository exameRepository;
    private AreaCorporalRepository areaCorporalRepository;

    public TratamentoService(
        TratamentoRepository tratamentoRepository,
        PacienteRepository pacienteRepository,
        ParticularidadeRepository particularidadeRepository,
        ExameRepository exameRepository,
        AreaCorporalRepository areaCorporalRepository
        ){
        this.tratamentoRepository = tratamentoRepository;
        this.pacienteRepository = pacienteRepository;
    }

    //======================== GET =========================

    //======================== POST ========================
        public TratamentoDto create(
            TratamentoCreationDto tratamentoCreationDto,
            ParticularidadeCreationDto particularidadeCreationDto,
            List<ExameCreationDto> exameListCreationDto,
            AreaCorporalAcometidaCreationDto areaCorporalAcometidaCreationDto
            ) {
            Paciente paciente = pacienteRepository.findById(tratamentoCreationDto.pacienteId()).orElseThrow(PacienteNotFound::new);

            Tratamento tratamento = DtoUtils.toEntity(tratamentoCreationDto);
            tratamento.setPaciente(paciente);

            Particularidade particularidade = DtoUtils.toEntity(particularidadeCreationDto);
            particularidade.setTratamento(tratamento);
            tratamento.setParticularidade(particularidade);

            AreaCorporalAcometida areaCorporal = DtoUtils.toEntity(areaCorporalAcometidaCreationDto);
            areaCorporal.setTratamento(tratamento);
            tratamento.setAreaCorporalAcometida(areaCorporal);

            List<Exame> exames = exameListCreationDto.stream()
                .map(dto -> {
                    Exame exame = DtoUtils.toEntity(dto);
                    exame.setTratamento(tratamento);
                    return exame;
                }).toList();
            
            tratamento.setExames(exames);

            paciente.addTratamento(tratamento);

            pacienteRepository.save(paciente);

            return DtoUtils.toDto(tratamento);
        }
    //======================== PUT =========================

    //======================= DELETE =======================
}
