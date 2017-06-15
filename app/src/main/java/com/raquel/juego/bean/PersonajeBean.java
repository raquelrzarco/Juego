package com.raquel.juego.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 29/03/2017.
 */

public class PersonajeBean implements Serializable {
    public int id;
    @SerializedName("imagen") //Edta etiqueta te deja cambiar el nombre que le llega de servidor y usar el que le has puesto en java
    private  int foto;
    @SerializedName("nombre")
    private  String descripcion;
    @SerializedName("descripcion")
    private String histroiapersonaje;

    public PersonajeBean(String descripcion, int foto, String histroiapersonaje, int id) {
        this.descripcion = descripcion;
        this.foto = foto;
        this.histroiapersonaje = histroiapersonaje;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getHistroiapersonaje() {
        return histroiapersonaje;
    }

    public void setHistroiapersonaje(String histroiapersonaje) {
        this.histroiapersonaje = histroiapersonaje;
    }

    @Override
    public String toString() {
        return  descripcion;
    }
}
