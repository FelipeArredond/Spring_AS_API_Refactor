package com.postobon.asignacion.cedis.domain.mappers;

import com.postobon.asignacion.cedis.domain.dto.RolDTO;
import com.postobon.asignacion.cedis.domain.entity.RolEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IRolMapper {
    @Mappings({
            @Mapping(source = "pkId", target = "idRol"),
            @Mapping(source = "sDesc", target = "description")
    })
    RolDTO toRolDTO(RolEntity rol);
    @InheritInverseConfiguration
    RolEntity toRolEntity(RolDTO rolDTO);
}
