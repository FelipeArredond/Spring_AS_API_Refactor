package com.postobon.asignacion.cedis.domain.repository.jpa;

import com.postobon.asignacion.cedis.domain.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioJPA extends JpaRepository<UsuarioEntity, Integer> {
}
