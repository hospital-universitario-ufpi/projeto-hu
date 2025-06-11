package com.hu.backend.mapper;

import org.mapstruct.*;

import com.hu.backend.dto.sessao.SessaoDto;
import com.hu.backend.entities.Sessao;

@Mapper(componentModel = "spring")
public interface SessaoMapper {
    
    SessaoDto toDto(Sessao sessao);

    Sessao toEntity(SessaoDto sessaoDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(SessaoDto dto, @MappingTarget Sessao entity);
    

}
