package com.helloworld.ServicioRestScoring.models;

import java.util.Date;

public class Persona {
    private int idPersona;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int idDireccionDomicilio;
    private int idDireccionNotificacion;
    private String NIF;
    private Date fechaNacimiento;
    private String nacionalidad;
    private int scoring;
    private Date fechaScoring;

    public Persona(int idPersona, String nombre, String apellido1, int idDireccionDomicilio, int idDireccionNotificacion, String NIF, Date fechaNacimiento, String nacionalidad) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.idDireccionDomicilio = idDireccionDomicilio;
        this.idDireccionNotificacion = idDireccionNotificacion;
        this.NIF = NIF;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getIdDireccionDomicilio() {
        return idDireccionDomicilio;
    }

    public void setIdDireccionDomicilio(int idDireccionDomicilio) {
        this.idDireccionDomicilio = idDireccionDomicilio;
    }

    public int getIdDireccionNotificacion() {
        return idDireccionNotificacion;
    }

    public void setIdDireccionNotificacion(int idDireccionNotificacion) {
        this.idDireccionNotificacion = idDireccionNotificacion;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getScoring() {
        return scoring;
    }

    public void setScoring(int scoring) {
        this.scoring = scoring;
    }

    public Date getFechaScoring() {
        return fechaScoring;
    }

    public void setFechaScoring(Date fechaScoring) {
        this.fechaScoring = fechaScoring;
    }
}
