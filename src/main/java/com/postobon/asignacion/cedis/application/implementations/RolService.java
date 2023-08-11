package com.postobon.asignacion.cedis.application.implementations;

import com.postobon.asignacion.cedis.application.IRolService;
import com.postobon.asignacion.cedis.domain.entity.RolEntity;
import com.postobon.asignacion.cedis.domain.repository.jpa.RolJPA;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RolService implements IRolService {

    private final RolJPA rolJPA;

    public RolService(RolJPA rolJPA) {
        this.rolJPA = rolJPA;
    }

    @Override
    public List<RolEntity> findAll() {
        return this.rolJPA.findAll();
    }
}
