package com.postobon.asignacion.cedis.domain.dto;

import lombok.Builder;
import lombok.Data;

@Builder
public class RolDTO {
    private Integer idRol;
    private String description;

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
