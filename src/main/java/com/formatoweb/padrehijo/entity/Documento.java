package com.formatoweb.padrehijo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Documento {
    private Long id;
    private String curp;
    private String rfc;
    private Padre padreById;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "curp")
    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Basic
    @Column(name = "rfc")
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @OneToOne
    @JsonManagedReference
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Padre getPadreById() {
        return padreById;
    }

    public void setPadreById(Padre padreById) {
        this.padreById = padreById;
    }
}
