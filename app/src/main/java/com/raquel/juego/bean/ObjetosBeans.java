package com.raquel.juego.bean;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 29/03/2017.
 */

public class ObjetosBeans implements Serializable{
    private static int foto;
    private static String descripcion;

    public ObjetosBeans(String descripcion, int foto) {
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public static String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
