package com.postobon.asignacion.cedis.domain.repository;

import com.postobon.asignacion.cedis.domain.dto.RolDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRolRepository {
    List<RolDTO> findAll();
    void save(RolDTO rolDTO);
}
