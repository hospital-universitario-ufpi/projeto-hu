package com.hu.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hu.backend.entities.Tratamento;

public interface TratamentoRepository extends JpaRepository<Tratamento, Long> {
    
}
