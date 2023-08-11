package com.postobon.asignacion.cedis.domain.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDTO {
    private Integer idRol;
    private String mail;
    private boolean active;
    private String username;
    private boolean planning;
    private RolDTO rol;
}
