package com.hu.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hu.backend.entities.Particularidade;

public interface ParticularidadeRepository extends JpaRepository<Particularidade, Long> {
    
}
