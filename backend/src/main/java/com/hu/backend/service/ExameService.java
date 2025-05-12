package com.hu.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hu.backend.dto.DtoUtils;
import com.hu.backend.dto.exame.ExameCreationDto;
import com.hu.backend.dto.exame.ExameDto;
import com.hu.backend.entities.Exame;
import com.hu.backend.entities.Tratamento;
import com.hu.backend.repositories.ExameRepository;
import com.hu.backend.repositories.TratamentoRepository;
import com.hu.backend.service.exception.ExameNotFound;

@Service
public class ExameService {
    
    private ExameRepository exameRepository;
    private TratamentoRepository tratamentoRepository;

    private ExameService(ExameRepository exameRepository, TratamentoRepository tratamentoRepository){
        this.exameRepository = exameRepository;
        this.tratamentoRepository = tratamentoRepository;
    }

    //======================== GET =========================
    public List<ExameDto> findAll(){
        List<Exame> exameList = exameRepository.findAll();
        
        return DtoUtils.toDtoList(exameList, DtoUtils::toDto);
    }

    public List<ExameDto> findByTratamentoId(Long tratamentoId){
        Tratamento tratamento = tratamentoRepository.findById(tratamentoId).orElseThrow(ExameNotFound::new);

        return DtoUtils.toDtoList(tratamento.getExames(), DtoUtils::toDto);
    }

    //======================== POST ========================
    public ExameDto create(ExameCreationDto exameCreationDto){
        Tratamento tratamento = tratamentoRepository.findById(exameCreationDto.tratamentoId()).orElseThrow(ExameNotFound::new);
        
        Exame exame = DtoUtils.toEntity(exameCreationDto);

        exame.setTratamento(tratamento);
        tratamento.addExame(exame);
        Exame exameSaved = exameRepository.save(exame);
        tratamentoRepository.save(tratamento);

        return DtoUtils.toDto(exameSaved);
    }

    public List<ExameDto> createMultiple(List<ExameCreationDto> exameCreationDtoList, Long tratamentoId) {
        Tratamento tratamento = tratamentoRepository.findById(tratamentoId).orElseThrow(ExameNotFound::new);

        List<Exame> exameList = exameCreationDtoList.stream()
        .map(exameCreationDto -> {
            Exame exame = DtoUtils.toEntity(exameCreationDto);
            exame.setTratamento(tratamento);
            return exame;
        })
        .toList();

        List<Exame> examesSalvos = exameRepository.saveAll(exameList);

        tratamento.getExames().addAll(examesSalvos);
        tratamentoRepository.save(tratamento);
        
        return DtoUtils.toDtoList(examesSalvos, DtoUtils::toDto);
    }

    //======================== PUT =========================

    //======================= DELETE =======================
    public void deleteById(Long exameId){
        exameRepository.findById(exameId).orElseThrow(ExameNotFound::new);

        exameRepository.deleteById(exameId);
    }
}
