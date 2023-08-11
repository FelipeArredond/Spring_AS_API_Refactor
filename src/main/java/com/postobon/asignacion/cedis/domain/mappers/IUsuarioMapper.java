package com.postobon.asignacion.cedis.domain.mappers;

import com.postobon.asignacion.cedis.domain.dto.UserDTO;
import com.postobon.asignacion.cedis.domain.entity.UsuarioEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring", uses = IRolMapper.class)
public interface IUsuarioMapper {

    @Mappings({
            @Mapping(source = "mail", target = "mail"),
            @Mapping(source = "idRol", target = "idRol"),
            @Mapping(source = "active", target = "active"),
            @Mapping(source = "username", target = "username"),
            @Mapping(source = "planing", target = "planning"),
            @Mapping(source = "rol", target = "rol")
    })
    UserDTO toUserDTO(UsuarioEntity usuarioEntity);
    @InheritInverseConfiguration
    UsuarioEntity toUsuarioEntity(UserDTO userDTO);

}
