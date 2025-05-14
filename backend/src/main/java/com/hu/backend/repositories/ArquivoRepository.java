package com.hu.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hu.backend.entities.Arquivo;
import com.hu.backend.entities.Sessao;

public interface ArquivoRepository extends JpaRepository <Arquivo, Long> {
    List<Arquivo> findBySessao(Sessao sessao);
}
