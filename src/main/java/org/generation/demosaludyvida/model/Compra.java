package org.generation.demosaludyvida.model;

import jakarta.persistence.*;

import java.sql.Timestamp;


@Entity
@Table(name = "compras")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_compras;

    @ManyToOne(optional = false)
    @JoinColumn(name="id_usuario", nullable=false)
    private Usuario usuario;

    @ManyToOne(optional = false)
    @JoinColumn(name="id_tipo_pago", nullable=false)
    private TipoPago tipoPago;

    @Column(name = "fecha_compra")
    private Timestamp fecha_compra;

    @Column(name = "pago_total")
    private Long pago_total;

    // Constructores, getters y setters


    public Long getId_compras() {
        return id_compras;
    }

    public void setId_compras(Long id_compras) {
        this.id_compras = id_compras;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Timestamp getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Timestamp fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public Long getPago_total() {
        return pago_total;
    }

    public void setPago_total(Long pago_total) {
        this.pago_total = pago_total;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Compra{");
        sb.append("id_compras=").append(id_compras);
        sb.append(", usuario=").append(usuario);
        sb.append(", tipoPago=").append(tipoPago);
        sb.append(", fecha_compra=").append(fecha_compra);
        sb.append(", pago_total=").append(pago_total);
        sb.append('}');
        return sb.toString();
    }
}