package com.raquel.juego.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.raquel.juego.R;
import com.raquel.juego.bean.ObjetosBeans;
import com.raquel.juego.bean.PersonajeBean;

import java.util.List;

/**
 * Created by ALUMNOS on 30/03/2017.
 */

public class ObjetosAdapter extends ArrayAdapter<ObjetosBeans> {
    private Context context;
    private int resource;
    private List<ObjetosBeans> objectos;

    public ObjetosAdapter(Context context, int resource, List<ObjetosBeans> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource = resource;
        this.objectos=objects;
    }

    class ViewHolder{
        TextView descripcion;
        ImageView foto;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder;

        if(view==null){
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(resource,null);
            viewHolder.descripcion = (TextView) view.findViewById(R.id.descripciontips);
            viewHolder.foto = (ImageView) view.findViewById(R.drawable.puntuacion);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }

        ObjetosBeans objetosBeans = objectos.get(position);
        viewHolder.descripcion.setText(objetosBeans.getDescripcion());
        return view;
    }
}
