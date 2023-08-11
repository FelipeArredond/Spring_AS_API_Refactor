package com.postobon.asignacion.cedis.domain.repository.implementations;

import com.postobon.asignacion.cedis.domain.dto.UserDTO;
import com.postobon.asignacion.cedis.domain.mappers.IUsuarioMapper;
import com.postobon.asignacion.cedis.domain.repository.IUserRepository;
import com.postobon.asignacion.cedis.domain.repository.jpa.UsuarioJPA;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRepository implements IUserRepository {
    private final UsuarioJPA usuarioJPA;
    private final IUsuarioMapper usuarioMapper;

    public UserRepository(UsuarioJPA usuarioJPA, IUsuarioMapper usuarioMapper) {
        this.usuarioJPA = usuarioJPA;
        this.usuarioMapper = usuarioMapper;
    }


    @Override
    public List<UserDTO> findAll() {
        return this.usuarioJPA.findAll()
                .stream()
                .map(this.usuarioMapper::toUserDTO)
                .toList();
    }

    @Override
    public void save(UserDTO userDTO) {
        this.usuarioJPA.save(this.usuarioMapper.toUsuarioEntity(userDTO));
    }
}