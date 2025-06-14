package com.hu.backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hu.backend.dto.sessao.SessaoCreationDto;
import com.hu.backend.dto.sessao.SessaoDto;
import com.hu.backend.service.SessaoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping
public class SessaoController {

    private SessaoService sessaoService;

    public SessaoController(SessaoService sessaoService){
        this.sessaoService = sessaoService;
    }
    
    //======================== GET =========================
    @GetMapping(value = "/sessao")
    public ResponseEntity<List<SessaoDto>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(sessaoService.findAll());
    }

    @GetMapping(value = "/tratamento/{tratamentoId}/sessoes")
    public ResponseEntity<List<SessaoDto>> findByTratamentoId(@PathVariable Long tratamentoId){
        return ResponseEntity.status(HttpStatus.OK).body(sessaoService.findByTratamentoId(tratamentoId));
    }
    //======================== POST ========================
    @PostMapping(value = "/sessao")
    public ResponseEntity<SessaoDto> create(@RequestBody SessaoCreationDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(sessaoService.create(dto));
    }
    //======================== PUT =========================
    @PutMapping(value = "/sessao/{id}")
    public ResponseEntity<SessaoDto> updateSessao(@PathVariable("id") Long id, @RequestBody @Valid SessaoCreationDto sessaoCreationDto){
        return ResponseEntity.status(HttpStatus.OK).body(sessaoService.updateSessao(id, sessaoCreationDto));
    }

    //======================= DELETE =======================
    @DeleteMapping(value = "/sessao/{sessaoId}")
    public ResponseEntity<Void> deleteById(@PathVariable("sessaoId") Long sessaoId){
        sessaoService.delete(sessaoId);
        return ResponseEntity.noContent().build();
    }
}
