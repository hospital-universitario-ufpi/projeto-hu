package com.hu.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hu.backend.entities.Exame;

public interface ExameRepository extends JpaRepository<Exame, Long> {
    
}
