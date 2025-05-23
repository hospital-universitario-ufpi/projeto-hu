package com.hu.backend.dto.tratamento;

import java.util.List;

import com.hu.backend.dto.areaCorporalAcometida.AreaCorporalAcometidaCreationDto;
import com.hu.backend.dto.exame.ExameCreationDto;
import com.hu.backend.dto.particularidade.ParticularidadeCreationDto;

public record TratamentoCreationRequest(
    TratamentoCreationDto tratamento,
    ParticularidadeCreationDto particularidade,
    List<ExameCreationDto> exames,
    AreaCorporalAcometidaCreationDto areaCorporal
) {}
