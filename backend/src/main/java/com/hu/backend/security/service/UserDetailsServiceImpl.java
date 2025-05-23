package com.hu.backend.security.service;

import com.hu.backend.entities.Usuario;
import com.hu.backend.repositories.UsuarioRepository;
import com.hu.backend.security.model.UsuarioDetails;
import com.hu.backend.service.exception.UserNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByEmail(email)
                .orElseThrow(UserNotFound::new);

        return new UsuarioDetails(usuario);
    }
}
