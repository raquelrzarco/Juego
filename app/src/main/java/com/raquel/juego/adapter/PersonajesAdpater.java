package com.raquel.juego.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.raquel.juego.bean.PersonajeBean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by ALUMNOS on 29/03/2017.
 */

public class PersonajesAdpater extends ArrayList<PersonajeBean> {
    private Context context;
    private int resource;
    private List<PersonajeBean> objects;

    public PersonajesAdpater(Collection<? extends PersonajeBean> c, Context context, List<PersonajeBean> objects, int resource) {
        this.context = context;
        this.objects = objects;
        this.resource = resource;
    }
    class ViewHolder{
        TextView descripcion;
        ImageView foto;
    }

        //Falta get view
}
