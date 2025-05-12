package com.hu.backend.service;

import org.springframework.stereotype.Service;

import com.hu.backend.dto.DtoUtils;
import com.hu.backend.dto.tratamento.TratamentoCreationDto;
import com.hu.backend.dto.tratamento.TratamentoDto;
import com.hu.backend.entities.Paciente;
import com.hu.backend.entities.Tratamento;
import com.hu.backend.repositories.PacienteRepository;
import com.hu.backend.repositories.TratamentoRepository;
import com.hu.backend.service.exception.PacienteNotFound;

@Service
public class TratamentoService {
    
    private TratamentoRepository tratamentoRepository;
    private PacienteRepository pacienteRepository;

    public TratamentoService(TratamentoRepository tratamentoRepository, PacienteRepository pacienteRepository){
        this.tratamentoRepository = tratamentoRepository;
        this.pacienteRepository = pacienteRepository;
    }

    //======================== GET =========================

    //======================== POST ========================
        public TratamentoDto create(TratamentoCreationDto tratamentoCreationDto){
            Paciente paciente = pacienteRepository.findById(tratamentoCreationDto.pacienteId()).orElseThrow(PacienteNotFound::new);

            Tratamento tratamento = DtoUtils.toEntity(tratamentoCreationDto);

            tratamento.setPaciente(paciente);
            paciente.addTratamento(tratamento);
            Tratamento tratamentoSaved = tratamentoRepository.save(tratamento);
            pacienteRepository.save(paciente);
            
            return DtoUtils.toDto(tratamentoSaved);
        }
    //======================== PUT =========================

    //======================= DELETE =======================
}
