package org.generation.demosaludyvida.model;

import jakarta.persistence.*;

@Entity
@Table(name = "lentes_has_categorias")
public class LenteCategoria {

    @EmbeddedId
    private LenteCategoriaId id;

    @ManyToOne
    @MapsId("lentes_id_lentes")
    @JoinColumn(name = "lentes_id_lentes")
    private Lente lente;

    @ManyToOne
    @MapsId("categorias_id_categorias")
    @JoinColumn(name = "categorias_id_categorias")
    private Categoria categoria;

    // Constructores, getters y setters
}