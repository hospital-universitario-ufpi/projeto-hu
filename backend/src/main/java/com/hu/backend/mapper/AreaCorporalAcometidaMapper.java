package com.hu.backend.mapper;

import org.mapstruct.*;

import com.hu.backend.dto.areaCorporalAcometida.AreaCorporalAcometidaDto;
import com.hu.backend.entities.AreaCorporalAcometida;

@Mapper(componentModel = "spring")
public interface AreaCorporalAcometidaMapper {

    AreaCorporalAcometidaDto toDto(AreaCorporalAcometida areaCorporalAcometida);

    AreaCorporalAcometida toEntity(AreaCorporalAcometidaDto areaCorporalAcometidaDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(AreaCorporalAcometidaDto dto, @MappingTarget AreaCorporalAcometida entity);
    
}
