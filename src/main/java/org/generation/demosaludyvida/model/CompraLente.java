package org.generation.demosaludyvida.model;

import jakarta.persistence.*;

@Entity
@Table(name = "compras_has_lentes")
public class CompraLente {

    @EmbeddedId
    private CompraLenteId id;

    @Column(name = "cantidad")
    private Integer cantidad;

    @ManyToOne
    @MapsId("compras_id_compras")
    @JoinColumn(name = "compras_id_compras")
    private Compra compra;

    @ManyToOne
    @MapsId("lentes_id_lentes")
    @JoinColumn(name = "lentes_id_lentes")
    private Lente lente;

    // Constructores, getters y setters
}