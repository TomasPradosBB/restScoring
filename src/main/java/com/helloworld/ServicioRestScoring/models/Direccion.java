package com.helloworld.ServicioRestScoring.models;

public class Direccion {
    private int idDireccion;
    private int idTipoVia;
    private String nombreCalle;
    private String num;
    private String piso;
    private String puerta;
    private String escalera;
    private String otroDato;
    private String codPostal;
    private String municipio;
    private String codProvincia;

    public Direccion(int idDireccion, int idTipoVia, String nombreCalle, String num, String codPostal, String municipio, String codProvincia) {
        this.idDireccion = idDireccion;
        this.idTipoVia = idTipoVia;
        this.nombreCalle = nombreCalle;
        this.num = num;
        this.codPostal = codPostal;
        this.municipio = municipio;
        this.codProvincia = codProvincia;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public int getIdTipoVia() {
        return idTipoVia;
    }

    public void setIdTipoVia(int idTipoVia) {
        this.idTipoVia = idTipoVia;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getEscalera() {
        return escalera;
    }

    public void setEscalera(String escalera) {
        this.escalera = escalera;
    }

    public String getOtroDato() {
        return otroDato;
    }

    public void setOtroDato(String otroDato) {
        this.otroDato = otroDato;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(String codProvincia) {
        this.codProvincia = codProvincia;
    }
}
