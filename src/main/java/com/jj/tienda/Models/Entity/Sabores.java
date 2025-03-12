package com.jj.tienda.Models.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sabores")
public class Sabores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String descripcion;

    // Getters y Setters
}
