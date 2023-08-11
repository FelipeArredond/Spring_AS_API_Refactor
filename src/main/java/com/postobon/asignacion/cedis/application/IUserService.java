package com.postobon.asignacion.cedis.application;

import com.postobon.asignacion.cedis.domain.dto.UserDTO;
import com.postobon.asignacion.cedis.domain.entity.UsuarioEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IUserService {
    List<UserDTO> findAll();
    void save(UserDTO userDTO);
}
