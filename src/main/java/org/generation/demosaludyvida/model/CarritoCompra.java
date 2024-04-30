package org.generation.demosaludyvida.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "carrito_compras")
public class CarritoCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_actualizacion")
    private Timestamp fecha_actualizacion;

    @ManyToOne(optional = false)
    @JoinColumn(name = "usuarios_id_usuarios")
    private Usuario usuario;

    // Constructores, getters y setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(Timestamp fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CarritoCompra{");
        sb.append("id=").append(id);
        sb.append(", fecha_actualizacion=").append(fecha_actualizacion);
        sb.append(", usuario=").append(usuario);
        sb.append('}');
        return sb.toString();
    }
}