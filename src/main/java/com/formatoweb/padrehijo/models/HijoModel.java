package com.formatoweb.padrehijo.models;

public class HijoModel {
    private Long id;
    private String nombreHijo;
    private String apellidoHijo;
    private Integer edadHijo;
    private Long idPadre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreHijo() {
        return nombreHijo;
    }

    public void setNombreHijo(String nombreHijo) {
        this.nombreHijo = nombreHijo;
    }

    public String getApellidoHijo() {
        return apellidoHijo;
    }

    public void setApellidoHijo(String apellidoHijo) {
        this.apellidoHijo = apellidoHijo;
    }

    public Integer getEdadHijo() {
        return edadHijo;
    }

    public void setEdadHijo(Integer edadHijo) {
        this.edadHijo = edadHijo;
    }

    public Long getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Long idPadre) {
        this.idPadre = idPadre;
    }
}
