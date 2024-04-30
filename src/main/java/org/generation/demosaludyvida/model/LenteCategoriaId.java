package org.generation.demosaludyvida.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class LenteCategoriaId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long lentes_id_lentes;
    private Long categorias_id_categorias;

    // Constructor vacío
    public LenteCategoriaId() {
    }

    // Constructor con todos los campos
    public LenteCategoriaId(Long lentes_id_lentes, Long categorias_id_categorias) {
        this.lentes_id_lentes = lentes_id_lentes;
        this.categorias_id_categorias = categorias_id_categorias;
    }

    // Getters y setters
    public Long getLentes_id_lentes() {
        return lentes_id_lentes;
    }

    public void setLentes_id_lentes(Long lentes_id_lentes) {
        this.lentes_id_lentes = lentes_id_lentes;
    }

    public Long getCategorias_id_categorias() {
        return categorias_id_categorias;
    }

    public void setCategorias_id_categorias(Long categorias_id_categorias) {
        this.categorias_id_categorias = categorias_id_categorias;
    }
}