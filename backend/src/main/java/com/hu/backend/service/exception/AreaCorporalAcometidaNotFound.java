package com.hu.backend.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class AreaCorporalAcometidaNotFound extends NotFoundException{
    AreaCorporalAcometidaNotFound(){
        super("Area Corporal Acometida não encontrada");
    }
}
