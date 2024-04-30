package org.generation.demosaludyvida.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class LenteCarritoId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id_carrito;
    private Long id_lentes;

    // Constructor vacío
    public LenteCarritoId() {
    }

    // Constructor con todos los campos
    public LenteCarritoId(Long id_carrito, Long id_lentes) {
        this.id_carrito = id_carrito;
        this.id_lentes = id_lentes;
    }

    // Getters y setters
    public Long getId_carrito() {
        return id_carrito;
    }

    public void setId_carrito(Long id_carrito) {
        this.id_carrito = id_carrito;
    }

    public Long getId_lentes() {
        return id_lentes;
    }

    public void setId_lentes(Long id_lentes) {
        this.id_lentes = id_lentes;
    }
}