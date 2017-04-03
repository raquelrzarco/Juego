package com.raquel.juego.Modelos;

import com.raquel.juego.R;
import com.raquel.juego.bean.ObjetosBeans;
import com.raquel.juego.bean.PersonajeBean;

import java.util.ArrayList;

/**
 * Created by ALUMNOS on 03/04/2017.
 */

public class ModeloObjetos {
    public static ArrayList<ObjetosBeans> getObjeto() {

        ArrayList<ObjetosBeans> objetosBean = new ArrayList<>();

        objetosBean.add(new ObjetosBeans("Objeto puntos", R.drawable.puntuacion));
        objetosBean.add(new ObjetosBeans("Objeto vidas", R.drawable.vida));

        return objetosBean;
    }
}
