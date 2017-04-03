package com.raquel.juego.bean;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 29/03/2017.
 */

public class PersonajeBean implements Serializable {
    private  int foto;
    private  String descripcion;

    public PersonajeBean(String descripcion, int foto) {
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public  String getDescripcion() {return descripcion;}

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return  descripcion;
    }
}
