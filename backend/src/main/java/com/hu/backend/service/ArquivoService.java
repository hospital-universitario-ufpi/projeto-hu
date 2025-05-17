package com.hu.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hu.backend.dto.DtoUtils;
import com.hu.backend.dto.arquivos.ArquivoCreationDto;
import com.hu.backend.dto.arquivos.ArquivoDto;
import com.hu.backend.entities.Arquivo;
import com.hu.backend.entities.Sessao;
import com.hu.backend.repositories.ArquivoRepository;
import com.hu.backend.repositories.SessaoRepository;
import com.hu.backend.service.exception.SessaoNotFound;

@Service
public class ArquivoService {
    
    private final ArquivoRepository arquivoRepository;
    private final SessaoRepository sessaoRepository;

    public ArquivoService(
        ArquivoRepository arquivoRepository,
        SessaoRepository sessaoRepository
        ) {
        this.arquivoRepository = arquivoRepository;
        this.sessaoRepository = sessaoRepository;
    }

    //======================== GET =========================

    public List<ArquivoDto> findBySessaoId(Long sessaoId) {
        Sessao sessao = sessaoRepository.findById(sessaoId).orElseThrow(SessaoNotFound::new);

        List<Arquivo> arquivoList = arquivoRepository.findBySessao(sessao);

        return DtoUtils.toDtoList(arquivoList, DtoUtils::toDto);
    }
    
    //======================== POST ========================

    public ArquivoDto create(ArquivoCreationDto arquivoCreationDto) {
        Sessao sessao = sessaoRepository.findById(arquivoCreationDto.sessaoId()).orElseThrow(SessaoNotFound::new);
        
        Arquivo arquivo = DtoUtils.toEntity(arquivoCreationDto);

        arquivo.setSessao(sessao);

        Arquivo arquivoSaved = arquivoRepository.save(arquivo);

        sessao.addArquivo(arquivoSaved);

        sessaoRepository.save(sessao);

        return DtoUtils.toDto(arquivoSaved);
    }

    //======================== PUT =========================

    //======================= DELETE =======================

}
