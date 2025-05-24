package com.hu.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hu.backend.entities.Paciente;
import com.hu.backend.entities.Tratamento;
import java.util.List;


public interface TratamentoRepository extends JpaRepository<Tratamento, Long> {
    List<Tratamento> findByPaciente(Paciente paciente);
    
}
