package com.postobon.asignacion.cedis.domain.repository;

import com.postobon.asignacion.cedis.domain.dto.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository {
    public List<UserDTO> findAll();
    public void save(UserDTO userDTO);
}
