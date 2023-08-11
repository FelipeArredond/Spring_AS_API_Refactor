package com.postobon.asignacion.cedis.application.implementations;

import com.postobon.asignacion.cedis.application.IUserService;
import com.postobon.asignacion.cedis.domain.dto.UserDTO;
import com.postobon.asignacion.cedis.domain.entity.UsuarioEntity;
import com.postobon.asignacion.cedis.domain.repository.UsuarioJPA;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService implements IUserService {
    private final UsuarioJPA usuarioJPA;

    public UserService(UsuarioJPA usuarioJPA) {
        this.usuarioJPA = usuarioJPA;
    }

    @Override
    public List<UsuarioEntity> findAll() {
        return this.usuarioJPA.findAll();
    }

    @Override
    public void save(UserDTO userDTO) {
        UsuarioEntity usuarioEntity = UsuarioEntity
                .builder()
                .mail(userDTO.getMail())
                .active(userDTO.isActive())
                .planing(userDTO.isPlanning())
                .username(userDTO.getUsername())
                .idRol(userDTO.getIdRol())
                .build();
        this.usuarioJPA.save(usuarioEntity);
    }
}
