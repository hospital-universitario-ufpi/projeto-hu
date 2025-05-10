package com.hu.backend.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PacienteNotFound extends NotFoundException{
    public PacienteNotFound(){
        super("Paciente não encontrado");
    }
    
}
