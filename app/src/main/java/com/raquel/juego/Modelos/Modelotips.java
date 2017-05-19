package com.raquel.juego.Modelos;

import com.raquel.juego.R;
import com.raquel.juego.adapter.TipsAdapter;
import com.raquel.juego.bean.PersonajeBean;
import com.raquel.juego.bean.TipsBean;

import java.util.ArrayList;

/**
 * Created by ALUMNOS on 03/04/2017.
 */

public class Modelotips {
    public static ArrayList<TipsBean> getTip() {

        ArrayList<TipsBean> tipsBeanTipsAdapter = new ArrayList<>();

        tipsBeanTipsAdapter.add(new TipsBean("Tip 1","Esta es nuestra seccion de tips donde te ayudaremos a conocer mejor el juego, para ello te facilitaremos la experiencia del mismo con novedades y trucos que serán publicados en este lugar.","Tip Vida","Cuando chocas con un objeto de vida recuperas vida cada vez es decir que si te chocas más de una vez recuperaras dos veces vida" ));
        tipsBeanTipsAdapter.add(new TipsBean("Tip 2","Esta es nuestra seccion de tips donde te ayudaremos a conocer mejor el juego, para ello te facilitaremos la experiencia del mismo con novedades y trucos que serán publicados en este lugar.","Tip Puntuacion","La puntiacion es completamete aleatoria por lo que no te extrañe si no encuentras en un buen rato más puntos"));
        tipsBeanTipsAdapter.add(new TipsBean("Tip 3","Esta es nuestra seccion de tips donde te ayudaremos a conocer mejor el juego, para ello te facilitaremos la experiencia del mismo con novedades y trucos que serán publicados en este lugar.","Tip Enemigo","Tu personaje es más veloz que las rayas, pero no que el pulpo"));

        return tipsBeanTipsAdapter;
    }
}
