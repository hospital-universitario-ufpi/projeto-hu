package com.hu.backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hu.backend.dto.paciente.PacienteCreationDto;
import com.hu.backend.dto.paciente.PacienteDto;
import com.hu.backend.dto.tratamento.TratamentoDto;
import com.hu.backend.service.PacienteService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping
public class PacienteController {

    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    // ======================== GET =========================

    @GetMapping(value = "/paciente")
    public ResponseEntity<List<PacienteDto>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(pacienteService.findAll());
    }

    @GetMapping(value = "/paciente/{pacienteId}")
    public ResponseEntity<PacienteDto> findById(@PathVariable("pacienteId") Long pacienteId) {
        return ResponseEntity.status(HttpStatus.OK).body(pacienteService.findById(pacienteId));
    }

    @GetMapping(value = "/paciente/prontuario")
    public ResponseEntity<PacienteDto> findByProntuario(@RequestParam String prontuario) {
        return ResponseEntity.status(HttpStatus.OK).body(pacienteService.findByProntuario(prontuario));
    }

    @GetMapping(value = "/paciente/{pacienteId}/tratamentos")
    public ResponseEntity<List<TratamentoDto>> findTratamentosByPacienteId(
            @PathVariable("pacienteId") Long pacienteId) {
        return ResponseEntity.status(HttpStatus.OK).body(pacienteService.findTratamentosByPacienteId(pacienteId));
    }

    // ======================== POST ========================
    @PostMapping(value = "/paciente")
    public ResponseEntity<PacienteDto> create(@RequestBody @Valid PacienteCreationDto paciente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(pacienteService.create(paciente));
    }

    // ======================== PUT =========================

    @PutMapping(value = "/paciente/{id}")
    public ResponseEntity<PacienteDto> updatePaciente(@PathVariable("id") Long id, @RequestBody @Valid PacienteCreationDto pacienteDto) {
        return ResponseEntity.status(HttpStatus.OK).body(pacienteService.updatePaciente(id, pacienteDto));
    }

    // ======================= DELETE =======================

    @DeleteMapping(value = "/paciente/{pacienteId}")
    public ResponseEntity<Void> deleteById(@PathVariable Long pacienteId) {
        pacienteService.deleteById(pacienteId);
        return ResponseEntity.noContent().build();
    }
}

// ======================== GET =========================

// ======================== POST ========================

// ======================== PUT =========================

// ======================= DELETE =======================
