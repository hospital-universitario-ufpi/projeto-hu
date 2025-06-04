package com.hu.backend.controller;

import com.hu.backend.dto.auth.LoginRequest;
import com.hu.backend.dto.auth.RegisterRequest;
import com.hu.backend.dto.auth.AuthResponse;
import com.hu.backend.entities.Usuario;
import com.hu.backend.repositories.UsuarioRepository;
import com.hu.backend.security.model.UsuarioDetails;
import com.hu.backend.security.service.JwtService;
import com.hu.backend.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.security.authentication.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody RegisterRequest request) {
        authService.register(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

    @GetMapping("/validate")
    public ResponseEntity<Void> validateToken() {
        return ResponseEntity.ok().build();
    }
}
