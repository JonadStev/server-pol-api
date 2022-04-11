package com.demo.pol.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarea")
    private Long id;
    private String nombre;

}
