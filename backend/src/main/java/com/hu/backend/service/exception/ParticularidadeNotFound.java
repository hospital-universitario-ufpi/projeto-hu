package com.hu.backend.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ParticularidadeNotFound extends NotFoundException{
    public ParticularidadeNotFound(){
        super("Particularidade não encontrada");
    }
    
}
