package com.postobon.asignacion.cedis.domain.repository.jpa;

import com.postobon.asignacion.cedis.domain.entity.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolJPA extends JpaRepository<RolEntity, Integer> {
}
