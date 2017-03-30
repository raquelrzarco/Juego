package com.raquel.juego.Modelos;

import com.raquel.juego.R;
import com.raquel.juego.activity.PersonajesActivity;
import com.raquel.juego.bean.PersonajeBean;

import java.util.ArrayList;

/**
 * Created by ALUMNOS on 30/03/2017.
 */

public class ModeloPersonajes {

    public static ArrayList<PersonajeBean> getPersonaje(){

        ArrayList<PersonajeBean> personaje = new ArrayList<>();

        personaje.add(new PersonajeBean("Protagonista", R.drawable.protagonista));
        personaje.add(new PersonajeBean("Enemigo", R.drawable.enemigo));

        return personaje;

    }
}
