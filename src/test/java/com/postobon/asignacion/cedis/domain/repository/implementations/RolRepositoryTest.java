package com.postobon.asignacion.cedis.domain.repository.implementations;

import com.postobon.asignacion.cedis.domain.dto.RolDTO;
import com.postobon.asignacion.cedis.domain.entity.RolEntity;
import com.postobon.asignacion.cedis.domain.mappers.IRolMapper;
import com.postobon.asignacion.cedis.domain.repository.IRolRepository;
import com.postobon.asignacion.cedis.domain.repository.jpa.RolJPA;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class RolRepositoryTest {
    @Mock private RolJPA rolJPA;
    @Mock private IRolMapper rolMapper;

    private RolRepository rolRepository;

    @BeforeEach
    void setup(){
        this.rolRepository = new RolRepository(this.rolJPA, this.rolMapper);
    }

    @Test
    void canFindAll() {
        //given
        //when
        this.rolRepository.findAll();
        //then
        verify(this.rolJPA).findAll();
    }

    @Test
    @Disabled
    void canSave() {
        //given
        RolDTO rolTest = RolDTO
                .builder()
                .idRol(1)
                .description("TEST")
                .build();
        //when
        this.rolRepository.save(rolTest);
        ArgumentCaptor<RolEntity> rolEntityArgumentCaptor = ArgumentCaptor.forClass(RolEntity.class);
        //then
        verify(this.rolJPA).save(rolEntityArgumentCaptor.capture());
        RolDTO toCompare = this.rolMapper.toRolDTO(rolEntityArgumentCaptor.getValue());
        assertThat(toCompare).isEqualTo(rolTest);
    }
}