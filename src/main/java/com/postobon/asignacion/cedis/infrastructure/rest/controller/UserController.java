package com.postobon.asignacion.cedis.infrastructure.rest.controller;

import com.postobon.asignacion.cedis.application.IUserService;
import com.postobon.asignacion.cedis.domain.dto.UserDTO;
import com.postobon.asignacion.cedis.domain.entity.UsuarioEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioEntity>> findAll(){
        return new ResponseEntity<>(this.userService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity save(@RequestBody UserDTO usuario){
        this.userService.save(usuario);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
