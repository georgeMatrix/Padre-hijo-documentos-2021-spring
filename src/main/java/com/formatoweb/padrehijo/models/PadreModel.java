package com.formatoweb.padrehijo.models;

public class PadreModel {
    private Long id;
    private String nombrePadre;
    private String apellidoPadre;
    private Integer edadPadre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getApellidoPadre() {
        return apellidoPadre;
    }

    public void setApellidoPadre(String apellidoPadre) {
        this.apellidoPadre = apellidoPadre;
    }

    public Integer getEdadPadre() {
        return edadPadre;
    }

    public void setEdadPadre(Integer edadPadre) {
        this.edadPadre = edadPadre;
    }
}
