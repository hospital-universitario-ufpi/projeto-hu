package com.hu.backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hu.backend.dto.arquivos.ArquivoCreationDto;
import com.hu.backend.dto.arquivos.ArquivoDto;
import com.hu.backend.service.ArquivoService;

@RequestMapping
@RestController
public class ArquivoController {
    
    private final ArquivoService arquivoService;

    public ArquivoController(ArquivoService arquivoService) {
        this.arquivoService = arquivoService;
    }

    //======================== GET =========================

    @GetMapping(value = "/sessao/{sessaoId}/fotos")
    public ResponseEntity<List<ArquivoDto>> findBySessaoId(@PathVariable("sessaoId") Long sessaoId) {
        return ResponseEntity.status(HttpStatus.OK).body(arquivoService.findBySessaoId(sessaoId));
    }
    
    //======================== POST ========================

    @PostMapping(value = "/arquivo")
    public ResponseEntity<ArquivoDto> create(@RequestBody ArquivoCreationDto arquivo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(arquivoService.create(arquivo));
    }

    //======================== PUT =========================

    //======================= DELETE =======================


}
