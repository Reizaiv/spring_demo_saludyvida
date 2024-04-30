package org.generation.demosaludyvida.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "citas")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_citas;

    @Column(name = "fecha_hora_cita")
    private Date fecha_hora_cita;

    @ManyToOne(optional = false)
    @JoinColumn(name= "usuarios_id_usuarios")
    private Usuario usuario;

    // Constructores, getters y setters

    public Long getId_citas() {
        return id_citas;
    }

    public void setId_citas(Long id_citas) {
        this.id_citas = id_citas;
    }

    public Date getFecha_hora_cita() {
        return fecha_hora_cita;
    }

    public void setFecha_hora_cita(Date fecha_hora_cita) {
        this.fecha_hora_cita = fecha_hora_cita;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cita{");
        sb.append("id_citas=").append(id_citas);
        sb.append(", fecha_hora_cita=").append(fecha_hora_cita);
        sb.append(", usuario=").append(usuario);
        sb.append('}');
        return sb.toString();
    }
}