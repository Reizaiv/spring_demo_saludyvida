package org.generation.demosaludyvida.model;

import jakarta.persistence.*;

@Entity
@Table(name = "direcciones")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_direcciones;

    @Column(name = "usuarios_id_usuarios")
    private Long usuarios_id_usuarios;

    @Column(name = "calle")
    private String calle;

    @Column(name = "colonia")
    private String colonia;

    @Column(name = "municipio_alcaldia")
    private String municipio_alcaldia;

    @Column(name = "estado")
    private String estado;

    @Column(name = "codigo_postal")
    private String codigo_postal;

    // Constructores, getters y setters
}