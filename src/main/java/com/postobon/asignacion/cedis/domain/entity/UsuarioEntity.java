package com.postobon.asignacion.cedis.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dbo.TBL_Usuarios")
public class UsuarioEntity {
    @Id
    @Column(name = "PK_CorreoUsuario")
    private String mail;
    @Column(name = "FK_TBL_Roles")
    private Integer idRol;
    @Column(name = "B_Activo")
    private boolean active;
    @Column(name = "S_NombreUsuario")
    private String username;
    @Column(name = "planeando")
    private boolean planing;
    @OneToOne
    @JoinColumn(name = "FK_TBL_Roles", insertable = false, updatable = false)
    private RolEntity rol;
}
