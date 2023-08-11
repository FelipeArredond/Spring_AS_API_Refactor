package com.postobon.asignacion.cedis.domain.repository.implementations;

import com.postobon.asignacion.cedis.domain.dto.UserDTO;
import com.postobon.asignacion.cedis.domain.entity.UsuarioEntity;
import com.postobon.asignacion.cedis.domain.mappers.IUsuarioMapper;
import com.postobon.asignacion.cedis.domain.repository.jpa.UsuarioJPA;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class UserRepositoryTest {
    @Mock private UsuarioJPA usuarioJPA;
    private UserRepository userRepository;
    @Autowired
    private IUsuarioMapper usuarioMapper;
    @BeforeEach
    void setup(){
        this.userRepository = new UserRepository(usuarioJPA, this.usuarioMapper);
    }

    @Test
    void canFindAll() {
        //given
        //when
        this.userRepository.findAll();
        //then
        verify(this.usuarioJPA).findAll();
    }

    @Test
    void canSave() {
        //given
        UserDTO userDTO = UserDTO
                .builder()
                .idRol(1)
                .mail("test@mail.com")
                .username("testUsername")
                .active(true)
                .planning(true)
                .build();
        //when
        this.userRepository.save(userDTO);
        //then
        ArgumentCaptor<UsuarioEntity> argumentCaptor = ArgumentCaptor.forClass(UsuarioEntity.class);
        verify(this.usuarioJPA).save(argumentCaptor.capture());
        UsuarioEntity result = this.usuarioMapper.toUsuarioEntity(userDTO);
        assertThat(result).isEqualTo(this.usuarioMapper.toUsuarioEntity(userDTO));
    }
}