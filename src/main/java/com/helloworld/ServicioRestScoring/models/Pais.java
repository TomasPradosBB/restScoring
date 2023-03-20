package com.helloworld.ServicioRestScoring.models;

public class Pais {
    private String isoAlfa2;
    private int isoNum3;
    private String isoAlfa3;
    private String nombre;
    private int orden;

    public Pais(String isoAlfa2, int isoNum3, String isoAlfa3, String nombre) {
        this.isoAlfa2 = isoAlfa2;
        this.isoNum3 = isoNum3;
        this.isoAlfa3 = isoAlfa3;
        this.nombre = nombre;
    }

    public String getIsoAlfa2() {
        return isoAlfa2;
    }

    public void setIsoAlfa2(String isoAlfa2) {
        this.isoAlfa2 = isoAlfa2;
    }

    public int getIsoNum3() {
        return isoNum3;
    }

    public void setIsoNum3(int isoNum3) {
        this.isoNum3 = isoNum3;
    }

    public String getIsoAlfa3() {
        return isoAlfa3;
    }

    public void setIsoAlfa3(String isoAlfa3) {
        this.isoAlfa3 = isoAlfa3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
}
