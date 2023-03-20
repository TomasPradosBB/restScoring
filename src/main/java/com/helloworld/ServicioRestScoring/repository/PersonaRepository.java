package com.helloworld.ServicioRestScoring.repository;

import com.helloworld.ServicioRestScoring.models.Persona;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

@Mapper
public interface PersonaRepository {
    @Insert("INSERT INTO PERSONA(PERSONA_ID, NOMBRE, APELLIDO1, DIRECCION_DOMICILIO_ID, DIRECCION_NOTIFICACION_ID, NIF, " +
            "FECHA_NACIMIENTO, NACIONALIDAD) VALUES(#{persona.idPersona}, #{persona.nombre}, #{persona.apellido1}, " +
            "#{persona.idDireccionDomicilio}, #{persona.idDireccionNotificacion}, #{persona.NIF}, #{persona.fechaNacimiento}," +
            " #{persona.nacionalidad})")
    @Results(value = {
            @Result(property = "idPersona", column = "PERSONA_ID"),
            @Result(property = "nombre", column = "NOMBRE"),
            @Result(property = "apellido1", column = "APELLIDO1"),
            @Result(property = "idDireccionDomicilio", column = "DIRECCION_DOMICILIO_ID"),
            @Result(property = "idDireccionNotificacion", column = "DIRECCION_NOTIFICACION_ID"),
            @Result(property = "NIF", column = "NIF"),
            @Result(property = "fechaNacimiento", column = "FECHA_NACIMIENTO"),
            @Result(property = "nacionalidad", column = "NACIONALIDAD")
    })
    public void alta(Persona persona);
}
