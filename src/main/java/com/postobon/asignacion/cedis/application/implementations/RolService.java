package com.postobon.asignacion.cedis.application.implementations;

import com.postobon.asignacion.cedis.application.IRolService;
import com.postobon.asignacion.cedis.domain.dto.RolDTO;
import com.postobon.asignacion.cedis.domain.entity.RolEntity;
import com.postobon.asignacion.cedis.domain.repository.implementations.RolRepository;
import com.postobon.asignacion.cedis.domain.repository.jpa.RolJPA;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RolService implements IRolService {

    private final RolRepository rolRepository;

    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Override
    public List<RolDTO> findAll() {
        return this.rolRepository.findAll();
    }
}
