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

        objetosBean.add(new ObjetosBeans("Objetos puntos", R.drawable.puntuacion,"Este objeto nos lo encontraremos aleatoriamente en el mapa y nos sumará puntuacion"));
        objetosBean.add(new ObjetosBeans("Objetos Vidas", R.drawable.vida,"Este objeto nos sumará vida cada vez que lo obtengamos"));


        return objetosBean;
    }
}
