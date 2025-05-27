package com.hu.backend.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserNotFound extends NotFoundException {
    public UserNotFound() {
        super("Usuário não encontrado");
    }
}
