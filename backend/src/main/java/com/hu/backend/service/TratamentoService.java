package com.hu.backend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
import com.hu.backend.mapper.TratamentoMapper;
import com.hu.backend.repositories.AreaCorporalRepository;
import com.hu.backend.repositories.ExameRepository;
import com.hu.backend.repositories.PacienteRepository;
import com.hu.backend.repositories.ParticularidadeRepository;
import com.hu.backend.repositories.TratamentoRepository;
import com.hu.backend.service.exception.PacienteNotFound;
import com.hu.backend.service.exception.TratamentoNotFound;

@Service
public class TratamentoService {

    private TratamentoMapper tratamentoMapper;
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
            AreaCorporalRepository areaCorporalRepository,
            TratamentoMapper tratamentoMapper) {
        this.tratamentoRepository = tratamentoRepository;
        this.pacienteRepository = pacienteRepository;
        this.particularidadeRepository = particularidadeRepository;
        this.areaCorporalRepository = areaCorporalRepository;
        this.exameRepository = exameRepository;
        this.tratamentoMapper = tratamentoMapper;
    }

    // ======================== GET =========================

    public TratamentoDto findById(Long tratamentoId) {
        Tratamento tratamento = tratamentoRepository.findById(tratamentoId).orElseThrow(TratamentoNotFound::new);
        return DtoUtils.toDto(tratamento);
    }

    // ======================== POST ========================
    @Transactional
    public TratamentoDto create(
            TratamentoCreationDto tratamentoCreationDto,
            ParticularidadeCreationDto particularidadeCreationDto,
            List<ExameCreationDto> exameListCreationDto,
            AreaCorporalAcometidaCreationDto areaCorporalAcometidaCreationDto) {

        Paciente paciente = pacienteRepository.findById(tratamentoCreationDto.pacienteId())
                .orElseThrow(PacienteNotFound::new);

        Tratamento tratamento = tratamentoRepository.save(DtoUtils.toEntity(tratamentoCreationDto));

        tratamento.setPaciente(paciente);
        paciente.addTratamento(tratamento);

        pacienteRepository.save(paciente);

        Particularidade particularidade = DtoUtils.toEntity(particularidadeCreationDto);
        particularidade.setTratamento(tratamento);
        tratamento.setParticularidade(particularidade);
        particularidadeRepository.save(particularidade);

        AreaCorporalAcometida areaCorporal = DtoUtils.toEntity(areaCorporalAcometidaCreationDto);
        areaCorporal.setTratamento(tratamento);
        tratamento.setAreaCorporalAcometida(areaCorporal);
        areaCorporalRepository.save(areaCorporal);

        List<Exame> exames = exameListCreationDto.stream()
                .map(dto -> {
                    Exame exame = DtoUtils.toEntity(dto);
                    exame.setTratamento(tratamento);
                    return exame;
                }).collect(Collectors.toList());

        tratamento.setExames(exames);
        exameRepository.saveAll(exames);

        Tratamento tratamentoSaved = tratamentoRepository.save(tratamento);

        return DtoUtils.toDto(tratamentoSaved);
    }
    // ======================== PUT =========================
    public TratamentoDto updateTratamento(Long id, TratamentoCreationDto tratamentoCreationDto){
        Tratamento tratamento = tratamentoRepository.findById(id).orElseThrow(TratamentoNotFound::new);

        TratamentoDto tratamentoDto = DtoUtils.toDto(DtoUtils.toEntity(tratamentoCreationDto));

        tratamentoMapper.updateEntityFromDto(tratamentoDto, tratamento);

        Tratamento tratamentoAtualizado = tratamentoRepository.save(tratamento);

        return tratamentoMapper.toDto(tratamentoAtualizado);
    }
    // ======================= DELETE =======================
}
