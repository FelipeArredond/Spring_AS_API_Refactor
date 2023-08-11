package com.postobon.asignacion.cedis.application;

import com.postobon.asignacion.cedis.domain.entity.RolEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IRolService {
    List<RolEntity> findAll();
}
