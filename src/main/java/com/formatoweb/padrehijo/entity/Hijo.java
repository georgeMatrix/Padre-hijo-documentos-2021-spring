package com.formatoweb.padrehijo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Hijo {
    private Long id;
    private String nombreHijo;
    private String apellidoHijo;
    private Integer edadHijo;
    private Padre padreByPadreId;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre_hijo")
    public String getNombreHijo() {
        return nombreHijo;
    }

    public void setNombreHijo(String nombreHijo) {
        this.nombreHijo = nombreHijo;
    }

    @Basic
    @Column(name = "apellido_hijo")
    public String getApellidoHijo() {
        return apellidoHijo;
    }

    public void setApellidoHijo(String apellidoHijo) {
        this.apellidoHijo = apellidoHijo;
    }

    @Basic
    @Column(name = "edad_hijo")
    public Integer getEdadHijo() {
        return edadHijo;
    }

    public void setEdadHijo(Integer edadHijo) {
        this.edadHijo = edadHijo;
    }

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "padre_id", referencedColumnName = "id", nullable = false)
    public Padre getPadreByPadreId() {
        return padreByPadreId;
    }

    public void setPadreByPadreId(Padre padreByPadreId) {
        this.padreByPadreId = padreByPadreId;
    }
}
