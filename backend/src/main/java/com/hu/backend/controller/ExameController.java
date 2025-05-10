package com.hu.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hu.backend.service.ExameService;

@RestController
@RequestMapping
public class ExameController {
    
    private ExameService exameService;
    
    public ExameController(ExameService exameService){
        this.exameService = exameService;
    }

    //======================== GET =========================
    
    //======================== POST ========================

    //======================== PUT =========================

    //======================= DELETE =======================
}
