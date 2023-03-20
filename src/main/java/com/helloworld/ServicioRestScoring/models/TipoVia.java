package com.helloworld.ServicioRestScoring.models;

public class TipoVia {
    private int idTipoVia;
    private String descripcion;

    public TipoVia(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdTipoVia() {
        return idTipoVia;
    }

    public void setIdTipoVia(int idTipoVia) {
        this.idTipoVia = idTipoVia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
