package org.generation.demosaludyvida.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tipos de pago")
public class TipoPago {

    @Id
    private Long id_tipo_pago;

    @Column(name = "descripcion_tipo_pago")
    private String descripcion_tipo_pago;

    // Constructores, getters y setters
}