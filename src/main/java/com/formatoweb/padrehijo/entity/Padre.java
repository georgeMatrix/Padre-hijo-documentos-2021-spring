package com.formatoweb.padrehijo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Padre {
    private Long id;
    private String nombrePadre;
    private String apellidoPadre;
    private Integer edadPadre;
    private List<Hijo> hijosById;
    private Documento documentoById;

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
    @Column(name = "nombre_padre")
    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    @Basic
    @Column(name = "apellido_padre")
    public String getApellidoPadre() {
        return apellidoPadre;
    }

    public void setApellidoPadre(String apellidoPadre) {
        this.apellidoPadre = apellidoPadre;
    }

    @Basic
    @Column(name = "edad_padre")
    public Integer getEdadPadre() {
        return edadPadre;
    }

    public void setEdadPadre(Integer edadPadre) {
        this.edadPadre = edadPadre;
    }

    @OneToMany(mappedBy = "padreByPadreId")
    @JsonManagedReference
    public List<Hijo> getHijosById() {
        return hijosById;
    }

    public void setHijosById(List<Hijo> hijosById) {
        this.hijosById = hijosById;
    }

    @OneToOne(mappedBy = "padreById")
    @JsonBackReference
    public Documento getDocumentoById() {
        return documentoById;
    }

    public void setDocumentoById(Documento documentoById) {
        this.documentoById = documentoById;
    }
}
