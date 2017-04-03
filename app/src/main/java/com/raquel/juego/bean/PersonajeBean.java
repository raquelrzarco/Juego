package com.raquel.juego.bean;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 29/03/2017.
 */

public class PersonajeBean implements Serializable {
    private  int foto;
    private  String descripcion;
    private String histroiapersonaje;

    public PersonajeBean(String descripcion, int foto, String histroiapersonaje) {
        this.descripcion = descripcion;
        this.foto = foto;
        this.histroiapersonaje = histroiapersonaje;
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
