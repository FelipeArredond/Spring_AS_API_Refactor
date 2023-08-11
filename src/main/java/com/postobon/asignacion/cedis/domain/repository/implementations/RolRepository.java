package com.postobon.asignacion.cedis.domain.repository.implementations;

import com.postobon.asignacion.cedis.domain.dto.RolDTO;
import com.postobon.asignacion.cedis.domain.mappers.IRolMapper;
import com.postobon.asignacion.cedis.domain.repository.IRolRepository;
import com.postobon.asignacion.cedis.domain.repository.jpa.RolJPA;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RolRepository implements IRolRepository {
    private final RolJPA rolJPA;
    private final IRolMapper rolMapper;

    public RolRepository(RolJPA rolJPA, IRolMapper rolMapper) {
        this.rolJPA = rolJPA;
        this.rolMapper = rolMapper;
    }

    @Override
    public List<RolDTO> findAll() {
        return this.rolJPA.findAll()
                .stream()
                .map(this.rolMapper::toRolDTO)
                .toList();
    }

    @Override
    public void save(RolDTO rolDTO) {
        this.rolJPA.save(this.rolMapper.toRolEntity(rolDTO));
    }
}
