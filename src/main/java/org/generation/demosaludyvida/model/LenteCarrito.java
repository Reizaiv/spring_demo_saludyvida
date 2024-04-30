package org.generation.demosaludyvida.model;

import jakarta.persistence.*;

@Entity
@Table(name = "carrito_compras_has_lentes")
public class LenteCarrito {

    @EmbeddedId
    private LenteCarritoId id;

    @Column(name = "cantidad")
    private Integer cantidad;

    @ManyToOne
    @MapsId("id_carrito")
    @JoinColumn(name = "id_carrito")
    private CarritoCompra carrito;

    @ManyToOne
    @MapsId("id_lentes")
    @JoinColumn(name = "id_lentes")
    private Lente lente;

    // Constructores, getters y setters
}