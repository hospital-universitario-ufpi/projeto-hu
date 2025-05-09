package com.hu.backend.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hu.backend.entities.Paciente;
import java.util.List;


public interface PacienteRepository extends JpaRepository<Paciente, Long>{
    Optional<Paciente> findByCpf(String cpf);
    Optional<Paciente> findByProntuario(String prontuario);
    
}
