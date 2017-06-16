package com.raquel.juego.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.raquel.juego.bean.PersonajeBean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ALUMNOS on 08/06/2017.
 */

public class PersonajesAdapter implements Serializable {
    // Poner en Personajes fragment
    private Context context;
    private int resource;
    private List<PersonajeBean> objects;

    public PersonajesAdapter(Context context, List<PersonajeBean> objects, int resource) {
        this.context = context;
        this.objects = objects;
        this.resource = resource;
    }

    private class ViewHolder {
        private TextView txtpersonaje;
        private ImageView imgpersonaje;
        private TextView txtdescripPersonaje;
    }

    public View getViewPersonajes(int position, View convertView, ViewGroup parent) {
        //Como no hicimos el adapter pues no hay item voy a probar a hacerlo con lo que tengo y sino haz item
        View item = convertView;
        ViewHolder viewHolder;
        if (item == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            item = layoutInflater.inflate(resource, null);
            viewHolder = new ViewHolder();

        }
return null; //para que no pete
    }
}
