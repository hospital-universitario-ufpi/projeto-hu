package com.hu.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hu.backend.dto.areaCorporalAcometida.AreaCorporalAcometidaCreationDto;
import com.hu.backend.dto.areaCorporalAcometida.AreaCorporalAcometidaDto;
import com.hu.backend.service.AreaCorporalService;

import jakarta.validation.Valid;

@RestController
@RequestMapping
public class AreaCorporalController {
    
    private AreaCorporalService areaCorporalService;

    public AreaCorporalController(AreaCorporalService areaCorporalService){
        this.areaCorporalService = areaCorporalService;
    }

// ======================== GET =========================
@GetMapping(value = "/tratamento/{tratamentoId}/areacorporal")
public ResponseEntity<AreaCorporalAcometidaDto> findByTratamentoId(@PathVariable("tratamentoId") Long id){
    return ResponseEntity.status(HttpStatus.OK).body(areaCorporalService.findByTratamentoId(id));
}

// ======================== POST ========================
@PostMapping(value = "/areacorporal")
public ResponseEntity<AreaCorporalAcometidaDto> create(@RequestBody AreaCorporalAcometidaCreationDto areaCorporalAcometidaCreationDto){
    return ResponseEntity.status(HttpStatus.CREATED).body(areaCorporalService.create(areaCorporalAcometidaCreationDto));
}
// ======================== PUT =========================
@PutMapping(value = "/areacorporal/{id}")
public ResponseEntity<AreaCorporalAcometidaDto> updateAreaCorporal(@PathVariable("id") Long id, @RequestBody @Valid AreaCorporalAcometidaCreationDto areaCorporalAcometidaCreationDto){
    return ResponseEntity.status(HttpStatus.OK).body(areaCorporalService.updateAreaCorporal(id, areaCorporalAcometidaCreationDto));
}
// ======================= DELETE =======================

}
