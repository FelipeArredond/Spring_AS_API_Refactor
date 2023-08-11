package com.postobon.asignacion.cedis.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dbo.TBL_Roles")
public class RolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_Id")
    private Integer pkId;
    @Column(name = "S_Descripcion")
    private String sDescripcion;
    @OneToOne(mappedBy = "rol")
    @JsonIgnore
    private UsuarioEntity usuario;
}
