package com.hu.backend.mapper;

import org.mapstruct.*;

import com.hu.backend.dto.exame.ExameDto;
import com.hu.backend.entities.Exame;

@Mapper(componentModel = "spring")
public interface ExameMapper {

    ExameDto toDto(Exame exame);

    @Mapping(target = "tratamento", ignore = true)
    Exame toEntity(ExameDto exameDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "tratamento", ignore = true)
    void updateEntityFromDto(ExameDto dto, @MappingTarget Exame entity);

}
