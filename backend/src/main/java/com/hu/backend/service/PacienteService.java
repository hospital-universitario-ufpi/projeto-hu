package com.hu.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.hu.backend.dto.DtoUtils;
import com.hu.backend.dto.paciente.PacienteCreationDto;
import com.hu.backend.dto.paciente.PacienteDto;
import com.hu.backend.repositories.PacienteRepository;
import com.hu.backend.service.exception.NotFoundException;
import com.hu.backend.entities.Paciente;

@Service
public class PacienteService {
    
    private PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }


    //======================== GET =========================

    public List<PacienteDto> findAll() {
        List<Paciente> pacienteList = pacienteRepository.findAll();

        return DtoUtils.toDtoList(pacienteList, DtoUtils::toDto);
    }

    public PacienteDto findById(Long id) {
        Paciente paciente = pacienteRepository.findById(id).orElseThrow(() -> new NotFoundException("Paciente não encontrado"));

        return DtoUtils.toDto(paciente);
    }

    //======================== POST ========================

    public PacienteDto create(PacienteCreationDto pacienteCreationDto) {
        Paciente paciente = DtoUtils.toEntity(pacienteCreationDto);
        Paciente pacienteSaved = pacienteRepository.save(paciente);

        return DtoUtils.toDto(pacienteSaved);
    }


    //======================== PUT =========================



    //======================= DELETE =======================
    

}
