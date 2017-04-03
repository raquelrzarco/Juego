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

        personaje.add(new PersonajeBean("Protagonista",R.drawable.protagonista, " Este es nuestro protagonista, es un pez metalico cuyo proposito es intentar escapar de el restaurante japones antes de que los clientes lo pidan para llevar, pero él no es el unico que está intentancdo escapar de el restaurante y sus enemigos traran de impedirselo"));
        personaje.add(new PersonajeBean("Enemigo",R.drawable.enemigo,"Las rayas son la principal linea de defensa del boss ellas saben que no podrán escapar solas asi que decidieron unirse al boss para poder escpar, saben que no todas podrán escapar pero aun así seguiran intentandolo"));
        personaje.add(new PersonajeBean("Boss", R.drawable.boss,"El pulpo siempre ha sido uno de los reyes de la comida japonesa y esta vez no iba a ser una excepcion, no se dejará ganar por un simple pez su mision es escapar y no le importa nada más, aceptó ayudar a las rayas para que le hagan más facil el trabajo, ya que el pez está mostrando bastante resistencia, más de la esperada. Esto no quiere decir que nuestro pulpo tenga ninguna intencion de ayudar realmente a las rayas."));
        return personaje;


    }
}
