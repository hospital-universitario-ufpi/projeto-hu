package com.hu.backend.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.hu.backend.service.exception.NotFoundException;

@ControllerAdvice
public class GeneralControllerAdvice {
    
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> handleNotFound(RuntimeException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
}
