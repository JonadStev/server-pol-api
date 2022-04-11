package com.demo.pol.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fechaNacimiento;

    private boolean activo;

    @Enumerated(EnumType.STRING)
    private Dependencia dependencia;

    @Column(name = "perfil", columnDefinition = "text[]")
    @Type(type = "com.demo.pol.arraymapping.CustomStringArrayType")
    private String[] perfiles;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Fila> filas;

}
