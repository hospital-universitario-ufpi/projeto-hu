package com.hu.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hu.backend.dto.DtoUtils;
import com.hu.backend.dto.paciente.PacienteCreationDto;
import com.hu.backend.dto.paciente.PacienteDto;
import com.hu.backend.repositories.PacienteRepository;
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

    //======================== POST ========================

    public PacienteDto create(PacienteCreationDto pacienteCreationDto) {
        Paciente paciente = DtoUtils.toEntity(pacienteCreationDto);

        return DtoUtils.toDto(paciente);
    }


    //======================== PUT =========================

    //======================= DELETE =======================
    

}
