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

        tipsBeanTipsAdapter.add(new TipsBean("tip1","tip1","tip1", "tip1" ));
        tipsBeanTipsAdapter.add(new TipsBean("tip2","tip2","tip2", "tip2" ));
        tipsBeanTipsAdapter.add(new TipsBean("tip3","tip3","tip3", "tip3" ));

        return tipsBeanTipsAdapter;
    }
}
