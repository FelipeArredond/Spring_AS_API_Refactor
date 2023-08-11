package com.postobon.asignacion.cedis.domain.entity;

import jakarta.persistence.*;
import lombok.*;

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isPlaning() {
        return planing;
    }

    public void setPlaning(boolean planing) {
        this.planing = planing;
    }

    public RolEntity getRol() {
        return rol;
    }

    public void setRol(RolEntity rol) {
        this.rol = rol;
    }
}
