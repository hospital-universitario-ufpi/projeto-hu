package com.hu.backend.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TratamentoNotFound extends NotFoundException{
    public TratamentoNotFound(){
        super("Tratamento não encontrado");
    }
    
}
