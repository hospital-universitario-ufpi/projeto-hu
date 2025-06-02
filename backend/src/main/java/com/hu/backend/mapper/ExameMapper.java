package com.hu.backend.mapper;

import org.mapstruct.*;

import com.hu.backend.dto.exame.ExameDto;
import com.hu.backend.entities.Exame;

@Mapper(componentModel = "spring")
public interface ExameMapper {

    ExameDto toDto(Exame exame);

    Exame toEntity(ExameDto exameDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(ExameDto dto, @MappingTarget Exame entity);

}
