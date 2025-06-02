package com.hu.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.hu.backend.dto.DtoUtils;
import com.hu.backend.dto.paciente.PacienteCreationDto;
import com.hu.backend.dto.paciente.PacienteDto;
import com.hu.backend.dto.tratamento.TratamentoDto;
import com.hu.backend.repositories.PacienteRepository;
import com.hu.backend.service.exception.NotFoundException;
import com.hu.backend.service.exception.PacienteNotFound;
import com.hu.backend.entities.Paciente;
import com.hu.backend.mapper.PacienteMapper;

@Service
public class PacienteService {

    private PacienteMapper pacienteMapper;

    private PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository, PacienteMapper pacienteMapper) {
        this.pacienteRepository = pacienteRepository;
        this.pacienteMapper = pacienteMapper;
    }

    // ======================== GET =========================

    public List<PacienteDto> findAll() {
        List<Paciente> pacienteList = pacienteRepository.findAll();

        return DtoUtils.toDtoList(pacienteList, DtoUtils::toDto);
    }

    public PacienteDto findById(Long id) {
        Paciente paciente = pacienteRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Paciente não encontrado"));

        return DtoUtils.toDto(paciente);
    }

    public PacienteDto findByProntuario(String prontuario) {
        Paciente paciente = pacienteRepository.findByProntuario(prontuario).orElseThrow(PacienteNotFound::new);
        return DtoUtils.toDto(paciente);
    }

    public List<TratamentoDto> findTratamentosByPacienteId(Long pacienteId) {
        Paciente paciente = pacienteRepository.findById(pacienteId).orElseThrow(PacienteNotFound::new);

        return DtoUtils.toDtoList(paciente.getTratamentos(), DtoUtils::toDto);
    }

    // ======================== POST ========================

    public PacienteDto create(PacienteCreationDto pacienteCreationDto) {
        Paciente paciente = DtoUtils.toEntity(pacienteCreationDto);
        Paciente pacienteSaved = pacienteRepository.save(paciente);

        return DtoUtils.toDto(pacienteSaved);
    }

    // ======================== PUT =========================
    public PacienteDto updatePaciente(Long id, PacienteDto pacienteDto) {
        Paciente paciente = pacienteRepository.findById(id)
                .orElseThrow(PacienteNotFound::new);

        pacienteMapper.updateEntityFromDto(pacienteDto, paciente);

        Paciente pacienteAtualizado = pacienteRepository.save(paciente);

        return pacienteMapper.toDto(pacienteAtualizado);
    }

    // ======================= DELETE =======================

    public void deleteById(Long id) {
        pacienteRepository.deleteById(id);
    }

}
