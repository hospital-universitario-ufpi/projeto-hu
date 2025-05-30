package com.hu.backend.mapper;
import org.mapstruct.*;

import com.hu.backend.dto.paciente.PacienteCreationDto;
import com.hu.backend.dto.paciente.PacienteDto;
import com.hu.backend.entities.Paciente;

@Mapper(componentModel = "spring")
public interface PacienteMapper {
    PacienteDto toDto(Paciente entity);

    @Mappings({
        @Mapping(target = "id", ignore = true),
        @Mapping(target = "tratamentos", ignore = true)
    })
    Paciente toEntity(PacienteCreationDto dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mappings({
        @Mapping(target = "id", ignore = true),
        @Mapping(target = "tratamentos", ignore = true)
    })
    void updateEntityFromDto(PacienteDto dto, @MappingTarget Paciente entity);
}

