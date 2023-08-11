package com.postobon.asignacion.cedis.application;

import com.postobon.asignacion.cedis.application.implementations.RolService;
import com.postobon.asignacion.cedis.domain.repository.IRolRepository;
import com.postobon.asignacion.cedis.domain.repository.implementations.RolRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class IRolServiceTest {

     @Mock private RolRepository rolRepository;
     private RolService rolService;
     @BeforeEach
     void setup(){
         this.rolService = new RolService(this.rolRepository);
     }

    @Test
    void canFindAll() {
        //given
        //when
        this.rolService.findAll();
        //then
        verify(this.rolRepository).findAll();
    }
}