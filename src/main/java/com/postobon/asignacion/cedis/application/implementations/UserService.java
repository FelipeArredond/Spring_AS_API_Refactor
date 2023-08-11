package com.postobon.asignacion.cedis.application.implementations;

import com.postobon.asignacion.cedis.application.IUserService;
import com.postobon.asignacion.cedis.domain.dto.UserDTO;
import com.postobon.asignacion.cedis.domain.entity.UsuarioEntity;
import com.postobon.asignacion.cedis.domain.repository.IUserRepository;
import com.postobon.asignacion.cedis.domain.repository.jpa.UsuarioJPA;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService implements IUserService {
    private final IUserRepository userRepository;

    public UserService(UsuarioJPA usuarioJPA, IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDTO> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public void save(UserDTO userDTO) {
        this.userRepository.save(userDTO);
    }
}
