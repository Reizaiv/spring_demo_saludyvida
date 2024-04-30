package org.generation.demosaludyvida.model;


import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_categorias;

    @Column(name = "material")
    private String material;

    // Constructores, getters y setters


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Long getId_categorias() {
        return id_categorias;
    }

    public void setId_categorias(Long id_categorias) {
        this.id_categorias = id_categorias;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Categoria{");
        sb.append("id_categorias=").append(id_categorias);
        sb.append(", material='").append(material).append('\'');
        sb.append('}');
        return sb.toString();
    }
}