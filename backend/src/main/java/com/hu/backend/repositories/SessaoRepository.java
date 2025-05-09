package com.hu.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hu.backend.entities.Sessao;

public interface SessaoRepository extends JpaRepository<Sessao, Long> {
    
}
