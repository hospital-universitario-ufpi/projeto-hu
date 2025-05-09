package com.hu.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hu.backend.service.PacienteService;

@RestController
@RequestMapping
public class PacienteController {
    
    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    //======================== GET =========================

    //======================== POST ========================

    //======================== PUT =========================

    //======================= DELETE =======================
}


    //======================== GET =========================

    //======================== POST ========================

    //======================== PUT =========================

    //======================= DELETE =======================
