package org.generation.demosaludyvida.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CompraLenteId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long compras_id_compras;
    private Long lentes_id_lentes;
    private Integer cantidad;

    // Constructores

    public CompraLenteId() {
    }

    public CompraLenteId(Long compras_id_compras, Long lentes_id_lentes, Integer cantidad) {
        this.compras_id_compras = compras_id_compras;
        this.lentes_id_lentes = lentes_id_lentes;
        this.cantidad = cantidad;
    }

    // Getters y setters

    public Long getCompras_id_compras() {
        return compras_id_compras;
    }

    public void setCompras_id_compras(Long compras_id_compras) {
        this.compras_id_compras = compras_id_compras;
    }

    public Long getLentes_id_lentes() {
        return lentes_id_lentes;
    }

    public void setLentes_id_lentes(Long lentes_id_lentes) {
        this.lentes_id_lentes = lentes_id_lentes;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}