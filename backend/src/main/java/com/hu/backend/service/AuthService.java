package com.hu.backend.service;

import com.hu.backend.dto.auth.AuthResponse;
import com.hu.backend.dto.auth.LoginRequest;
import com.hu.backend.dto.auth.RegisterRequest;
import com.hu.backend.entities.Usuario;
import com.hu.backend.repositories.UsuarioRepository;
import com.hu.backend.security.model.UsuarioDetails;
import com.hu.backend.security.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AuthService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    public void register(RegisterRequest request) {
        if (usuarioRepository.findByEmail(request.email()).isPresent()) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "E-mail já cadastrado");
        }

        Usuario usuario = new Usuario();
        usuario.setEmail(request.email());
        usuario.setPassword(passwordEncoder.encode(request.password()));
        usuario.setRole("ROLE_USER");

        usuarioRepository.save(usuario);
    }

    public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.email(), request.password())
        );

        Usuario usuario = usuarioRepository.findByEmail(request.email()).orElseThrow();
        UserDetails userDetails = new UsuarioDetails(usuario);
        String token = jwtService.generateToken(userDetails);

        return new AuthResponse(token);
    }
}
