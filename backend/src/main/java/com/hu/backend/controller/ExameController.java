package com.hu.backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hu.backend.dto.exame.ExameCreationDto;
import com.hu.backend.dto.exame.ExameDto;
import com.hu.backend.service.ExameService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping
public class ExameController {
    
    private ExameService exameService;
    
    public ExameController(ExameService exameService){
        this.exameService = exameService;
    }

    //======================== GET =========================
        @GetMapping(value = "/exame")
        public ResponseEntity<List<ExameDto>> findAll(){
            return ResponseEntity.status(HttpStatus.OK).body(exameService.findAll());
        }

        @GetMapping(value = "/exame/{exameId}")
        public ResponseEntity<ExameDto> findById(@PathVariable Long exameId){
            return ResponseEntity.status(HttpStatus.OK).body(exameService.findById(exameId));
        }

        @GetMapping(value = "/tratamento/{tratamentoId}/exames")
        public ResponseEntity<List<ExameDto>> findByTratamentoId(@PathVariable Long tratamentoId){
            return ResponseEntity.status(HttpStatus.OK).body(exameService.findByTratamentoId(tratamentoId));
        }
    //======================== POST ========================
        @PostMapping(value = "/exame")
        public ResponseEntity<ExameDto> create(@RequestBody ExameCreationDto exameCreationDto){
            return ResponseEntity.status(HttpStatus.CREATED).body(exameService.create(exameCreationDto));
        }
        
    //======================== PUT =========================
        @PutMapping(value = "/exame/{id}")
        public ResponseEntity<ExameDto> updateExame(@PathVariable("id") Long id, @RequestBody @Valid ExameCreationDto exameDto){
            return ResponseEntity.status(HttpStatus.OK).body(exameService.updateExame(id, exameDto));
        }

    //======================= DELETE =======================
        @DeleteMapping(value = "/exame/{exameId}")
        public ResponseEntity<Void> deleteById(@PathVariable Long exameId){
            exameService.deleteById(exameId);
            return ResponseEntity.noContent().build();
        }
}
