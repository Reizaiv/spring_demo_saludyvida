package org.generation.demosaludyvida.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuarios;

    @Column(name = "id_tipo")
    private Long id_tipo;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "fecha_nacimiento")
    private Date fecha_nacimiento;

    @Column(name = "genero")
    private String genero;

    @Column(name = "correo")
    private String correo;

    @Column(name = "password")
    private String password;

    @Column(name = "fecha_registro")
    private Date fecha_registro;

    @Column(name = "estatus")
    private String estatus;

    // Constructores, getters y setters
}