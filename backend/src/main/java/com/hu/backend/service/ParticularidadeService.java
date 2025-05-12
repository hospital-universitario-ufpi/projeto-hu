package com.hu.backend.service;

import org.springframework.stereotype.Service;

import com.hu.backend.repositories.ParticularidadeRepository;

@Service
public class ParticularidadeService {

    private final ParticularidadeRepository particularidadeRepository;

    public ParticularidadeService(ParticularidadeRepository particularidadeRepository) {
        this.particularidadeRepository = particularidadeRepository;
    }

    
}
