package com.hu.backend.mapper;

import org.mapstruct.*;

import com.hu.backend.dto.particularidade.ParticularidadeDto;
import com.hu.backend.entities.Particularidade;

@Mapper(componentModel = "spring")
public interface ParticularidadeMapper {

    ParticularidadeDto toDto(Particularidade particularidade);

    Particularidade toEntity(ParticularidadeDto particularidadeDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(ParticularidadeDto dto, @MappingTarget Particularidade entity);
    
}
