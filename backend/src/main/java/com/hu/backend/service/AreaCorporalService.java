package com.hu.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hu.backend.dto.DtoUtils;
import com.hu.backend.dto.areaCorporalAcometida.AreaCorporalAcometidaCreationDto;
import com.hu.backend.dto.areaCorporalAcometida.AreaCorporalAcometidaDto;
import com.hu.backend.entities.AreaCorporalAcometida;
import com.hu.backend.entities.Tratamento;
import com.hu.backend.repositories.AreaCorporalRepository;
import com.hu.backend.repositories.TratamentoRepository;
import com.hu.backend.service.exception.TratamentoNotFound;

@Service
public class AreaCorporalService {
    
    private final AreaCorporalRepository areaCorporalRepository;

    
    private final TratamentoRepository tratamentoRepository;

    public AreaCorporalService(
        AreaCorporalRepository areaCorporalRepository,
        TratamentoRepository tratamentoRepository
    ) {
        this.areaCorporalRepository = areaCorporalRepository;
        this.tratamentoRepository = tratamentoRepository;
    }

    //======================== GET =========================

    public AreaCorporalAcometidaDto findByTratamentoId(Long tratamentoId) {
        Tratamento tratamento = tratamentoRepository.findById(tratamentoId).orElseThrow(TratamentoNotFound::new);
        return DtoUtils.toDto(tratamento.getAreaCorporalAcometida());
    }
    
    //======================== POST ========================

    public AreaCorporalAcometidaDto create(AreaCorporalAcometidaCreationDto areaCorporalCreationDto) {
        Tratamento tratamento = tratamentoRepository.findById(areaCorporalCreationDto.tratamentoId()).orElseThrow(TratamentoNotFound::new);

        AreaCorporalAcometida areaCorporal = DtoUtils.toEntity(areaCorporalCreationDto);
        areaCorporal.setTratamento(tratamento);
        AreaCorporalAcometida areaCorporalsaved = areaCorporalRepository.save(areaCorporal);
        tratamento.setAreaCorporalAcometida(areaCorporalsaved);
        tratamentoRepository.save(tratamento);
        return DtoUtils.toDto(areaCorporalsaved);
        
    }

    //======================== PUT =========================

    //======================= DELETE =======================
}
