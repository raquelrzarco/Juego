package com.raquel.juego.bean;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 29/03/2017.
 */

public class ObjetosBeans implements Serializable{
    private int id;
    private  int foto;
    private  String descripcion;
    private String nombre;

    public ObjetosBeans(String descripcion, int foto, int id, String nombre) {
        this.descripcion = descripcion;
        this.foto = foto;
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public  int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return descripcion + foto;
    }
}
