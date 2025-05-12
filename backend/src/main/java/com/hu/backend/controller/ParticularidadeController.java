package com.hu.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hu.backend.dto.particularidade.ParticularidadeCreationDto;
import com.hu.backend.dto.particularidade.ParticularidadeDto;
import com.hu.backend.service.ParticularidadeService;

@RestController
@RequestMapping
public class ParticularidadeController {
    
    private final ParticularidadeService particularidadeService;

    public ParticularidadeController(
        ParticularidadeService particularidadeService
    ) {
        this.particularidadeService = particularidadeService;
    }

    //======================== GET =========================

    @GetMapping(value = "/particularidades/tratamento/{tratamentoId}")
    public ResponseEntity<ParticularidadeDto> findByTratamentoId(@PathVariable("tratamentoId") Long tratamentoId) {
        return ResponseEntity.status(HttpStatus.OK).body(particularidadeService.findByTratamentoId(tratamentoId));
    }

    //======================== POST ========================

    @PostMapping(value = "/particularidades")
    public ResponseEntity<ParticularidadeDto> create(@RequestBody ParticularidadeCreationDto particularidade) {
        return ResponseEntity.status(HttpStatus.CREATED).body(particularidadeService.create(particularidade));

    }

    //======================== PUT =========================

    //======================= DELETE =======================

    @DeleteMapping(value = "/particularidades/tratamento/{tratamentoId}")
    public ResponseEntity<Void> deleteByTratamentoId(@PathVariable("tratamentoId") Long tratamentoId) {
        particularidadeService.deleteById(tratamentoId);
        return ResponseEntity.noContent().build();
    }
}
