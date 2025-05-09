package com.hu.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hu.backend.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{
    
}
