package com.helloworld.ServicioRestScoring.models;

public class Telefono {
    private int idTelefono;
    private int idPersona;
    private String telefono;

    public Telefono(int idPersona, String telefono) {
        this.idPersona = idPersona;
        this.telefono = telefono;
    }

    public int getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(int idTelefono) {
        this.idTelefono = idTelefono;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
