package com.postobon.asignacion.cedis.infrastructure.rest.controller;

import com.postobon.asignacion.cedis.application.IRolService;
import com.postobon.asignacion.cedis.domain.entity.RolEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolController {
    private final IRolService rolService;

    public RolController(IRolService rolService) {
        this.rolService = rolService;
    }

    @GetMapping()
    public ResponseEntity<List<RolEntity>> findAll(){
        return new ResponseEntity<>(this.rolService.findAll(), HttpStatus.OK);
    }
}
