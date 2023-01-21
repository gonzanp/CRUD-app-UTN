
package com.mycompany.appsecretaria.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_alumno;
    private String nombre;
    private String apellido;
    private String carrera;
    private String correo;
    private String telefono;
    private String linkedIn;
    private String trabajo;
    private String observaciones;

    public Alumno() {
    }

    public Alumno(int id_alumno, String nombre, String apellido, String carrera, String correo, String telefono,String linkedIn, String trabajo, String observaciones) {
        this.id_alumno = id_alumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.correo = correo;
        this.telefono = telefono;
        this.linkedIn = linkedIn;
        this.trabajo = trabajo;
        this.observaciones = observaciones;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getLinkedIn(){
        return linkedIn;
    }
    public void setLinkedIn(String linkedIn){
        this.linkedIn = linkedIn;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
}
