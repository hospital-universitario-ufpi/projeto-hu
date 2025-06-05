package com.hu.backend.mapper;

import org.mapstruct.*;

import com.hu.backend.dto.tratamento.TratamentoDto;
import com.hu.backend.entities.Tratamento;

@Mapper(componentModel = "spring")
public interface TratamentoMapper {

    TratamentoDto toDto(Tratamento tratamento);

    Tratamento toEntity(TratamentoDto tratamentoDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(TratamentoDto dto, @MappingTarget Tratamento entity);
    
}
