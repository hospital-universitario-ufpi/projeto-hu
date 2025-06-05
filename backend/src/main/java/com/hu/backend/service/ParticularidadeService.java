package com.hu.backend.service;

import org.springframework.stereotype.Service;

import com.hu.backend.dto.DtoUtils;
import com.hu.backend.dto.particularidade.ParticularidadeCreationDto;
import com.hu.backend.dto.particularidade.ParticularidadeDto;
import com.hu.backend.entities.Particularidade;
import com.hu.backend.entities.Tratamento;
import com.hu.backend.mapper.ParticularidadeMapper;
import com.hu.backend.repositories.ParticularidadeRepository;
import com.hu.backend.repositories.TratamentoRepository;
import com.hu.backend.service.exception.ParticularidadeNotFound;
import com.hu.backend.service.exception.TratamentoNotFound;

@Service
public class ParticularidadeService {

    private ParticularidadeMapper particularidadeMapper;
    private final ParticularidadeRepository particularidadeRepository;
    private final TratamentoRepository tratamentoRepository;

    public ParticularidadeService(
            ParticularidadeRepository particularidadeRepository,
            TratamentoRepository tratamentoRepository,
            ParticularidadeMapper particularidadeMapper) {
        this.particularidadeRepository = particularidadeRepository;
        this.tratamentoRepository = tratamentoRepository;
        this.particularidadeMapper = particularidadeMapper;
    }

    // ======================== GET =========================

    public ParticularidadeDto findByTratamentoId(Long tratamentoId) {
        Tratamento tratamento = tratamentoRepository.findById(tratamentoId).orElseThrow(TratamentoNotFound::new);

        Particularidade particularidade = tratamento.getParticularidade();
        return DtoUtils.toDto(particularidade);
    }

    // ======================== POST ========================

    public ParticularidadeDto create(ParticularidadeCreationDto particularidadeCreationDto) {

        Tratamento tratamento = tratamentoRepository.findById(particularidadeCreationDto.tratamentoId())
                .orElseThrow(TratamentoNotFound::new);
        Particularidade particularidade = DtoUtils.toEntity(particularidadeCreationDto);
        particularidade.setTratamento(tratamento);
        Particularidade particularidadeSaved = particularidadeRepository.save(particularidade);
        tratamento.setParticularidade(particularidadeSaved);
        tratamentoRepository.save(tratamento);
        return DtoUtils.toDto(particularidadeSaved);
    }

    // ======================== PUT =========================
    public ParticularidadeDto updateParticularidade(Long id, ParticularidadeCreationDto particularidadeCreationDto) {
        Particularidade particularidade = particularidadeRepository.findById(id)
                .orElseThrow(ParticularidadeNotFound::new);

        ParticularidadeDto particularidadeDto = DtoUtils.toDto(DtoUtils.toEntity(particularidadeCreationDto));

        particularidadeMapper.updateEntityFromDto(particularidadeDto, particularidade);

        Particularidade particularidadeAtualizada = particularidadeRepository.save(particularidade);

        return particularidadeMapper.toDto(particularidadeAtualizada);
    }

    // ======================= DELETE =======================

    public void deleteById(Long tratamentoId) {
        Tratamento tratamento = tratamentoRepository.findById(tratamentoId).orElseThrow(TratamentoNotFound::new);
        tratamento.setParticularidade(null);
        tratamentoRepository.save(tratamento);

    }
}
