package com.hu.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hu.backend.dto.DtoUtils;
import com.hu.backend.dto.sessao.SessaoCreationDto;
import com.hu.backend.dto.sessao.SessaoDto;
import com.hu.backend.entities.Sessao;
import com.hu.backend.entities.Tratamento;
import com.hu.backend.mapper.SessaoMapper;
import com.hu.backend.repositories.SessaoRepository;
import com.hu.backend.repositories.TratamentoRepository;
import com.hu.backend.service.exception.SessaoNotFound;
import com.hu.backend.service.exception.TratamentoNotFound;

@Service
public class SessaoService {

    private SessaoMapper sessaoMapper;
    private SessaoRepository sessaoRepository;
    private TratamentoRepository tratamentoRepository;

    private SessaoService(SessaoRepository sessaoRepository, TratamentoRepository tratamentoRepository, SessaoMapper sessaoMapper){
        this.sessaoRepository = sessaoRepository;
        this.tratamentoRepository = tratamentoRepository;
        this.sessaoMapper = sessaoMapper;
    }

    //======================== GET =========================
        public List<SessaoDto> findAll(){
            List<Sessao> sessaoList = sessaoRepository.findAll();

            return DtoUtils.toDtoList(sessaoList, DtoUtils::toDto);
        }

        public List<SessaoDto> findByTratamentoId(Long tratamentoId){
            Tratamento tratamento = tratamentoRepository.findById(tratamentoId).orElseThrow(TratamentoNotFound::new);

            return DtoUtils.toDtoList(tratamento.getSessoes(), DtoUtils::toDto);
        }
    //======================== POST ========================
        public SessaoDto create(SessaoCreationDto sessaoCreationDto){
             Tratamento tratamento = tratamentoRepository.findById(sessaoCreationDto.tratamentoId()).orElseThrow(TratamentoNotFound::new);

            Sessao sessao = DtoUtils.toEntity(sessaoCreationDto);

            sessao.setTratamento(tratamento);
            tratamento.addSessao(sessao);
            Sessao sessaoSaved = sessaoRepository.save(sessao);
            tratamentoRepository.save(tratamento);

            return DtoUtils.toDto(sessaoSaved);
        }

    //======================== PUT =========================
    public SessaoDto updateSessao(Long id, SessaoCreationDto sessaoCreationDto){
        Sessao sessao = sessaoRepository.findById(id).orElseThrow(SessaoNotFound::new);

        SessaoDto sessaoDto = DtoUtils.toDto(DtoUtils.toEntity(sessaoCreationDto));

        sessaoMapper.updateEntityFromDto(sessaoDto, sessao);

        Sessao sessaoAtualizada = sessaoRepository.save(sessao);

        return sessaoMapper.toDto(sessaoAtualizada);

    }

    //======================= DELETE =======================
        public void delete(Long sessaoId){
            sessaoRepository.findById(sessaoId).orElseThrow(SessaoNotFound::new);

            sessaoRepository.deleteById(sessaoId);
        }
}
