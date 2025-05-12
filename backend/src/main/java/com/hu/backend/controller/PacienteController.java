package com.hu.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hu.backend.dto.paciente.PacienteCreationDto;
import com.hu.backend.dto.paciente.PacienteDto;
import com.hu.backend.service.PacienteService;

@RestController
@RequestMapping
public class PacienteController {
    
    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    //======================== GET =========================

    @GetMapping(value = "/paciente/")
    
    //======================== POST ========================
    @PostMapping(value = "/paciente")
    public ResponseEntity<PacienteDto> create(@RequestBody PacienteCreationDto paciente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(pacienteService.create(paciente));
    }

    //======================== PUT =========================

    //======================= DELETE =======================
}


    //======================== GET =========================

    //======================== POST ========================

    //======================== PUT =========================

    //======================= DELETE =======================
