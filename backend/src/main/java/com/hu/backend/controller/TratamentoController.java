package com.hu.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hu.backend.dto.tratamento.TratamentoCreationRequest;
import com.hu.backend.dto.tratamento.TratamentoDto;
import com.hu.backend.service.TratamentoService;

@RestController
@RequestMapping
public class TratamentoController {
    
    TratamentoService tratamentoService;

    public TratamentoController(
        TratamentoService tratamentoService
    ) {
        this.tratamentoService = tratamentoService;
    }

    //======================== GET =========================

    //======================== POST ========================

    @PostMapping(value = "/tratamento")
    public ResponseEntity<TratamentoDto> create(
        @RequestBody TratamentoCreationRequest tratamento
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(tratamentoService.create(
            tratamento.tratamento(),
            tratamento.particularidade(),
            tratamento.exames(),
            tratamento.areaCorporal()
            ));
    }

    //======================== PUT =========================

    //======================= DELETE =======================


}
