package org.generation.demosaludyvida.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CarritoComprasId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id_carrito;
    private Long usuarios_id_usuarios;

    // Constructor vacío
    public CarritoComprasId() {
    }

    // Constructor con todos los campos
    public CarritoComprasId(Long id_carrito, Long usuarios_id_usuarios) {
        this.id_carrito = id_carrito;
        this.usuarios_id_usuarios = usuarios_id_usuarios;
    }

    // Getters y setters
    public Long getId_carrito() {
        return id_carrito;
    }

    public void setId_carrito(Long id_carrito) {
        this.id_carrito = id_carrito;
    }

    public Long getUsuarios_id_usuarios() {
        return usuarios_id_usuarios;
    }

    public void setUsuarios_id_usuarios(Long usuarios_id_usuarios) {
        this.usuarios_id_usuarios = usuarios_id_usuarios;
    }
}