package com.hu.backend.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class SessaoNotFound extends NotFoundException{
    public SessaoNotFound(){
        super("Sessão não encontrada");
    }
}
