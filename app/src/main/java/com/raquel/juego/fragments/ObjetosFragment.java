package com.raquel.juego.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.raquel.juego.Modelos.ModeloObjetos;
import com.raquel.juego.R;
import com.raquel.juego.activity.ObjetosActivity;
import com.raquel.juego.activity.PersonajesActivity;
import com.raquel.juego.adapter.ObjetosAdapter;
import com.raquel.juego.bean.ObjetosBeans;

import java.util.ArrayList;

public class ObjetosFragment extends Fragment implements AdapterView.OnItemClickListener {

    private ListView listobjetos;
    ArrayList<ObjetosBeans> objetos = new ArrayList<>();
    public static final String OBJETOS_KEY="OBJETOS_KEY";

    public static ObjetosFragment newInstance(){
       return new ObjetosFragment();
    }

    public ObjetosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_objetos,null);
        listobjetos = (ListView) view.findViewById(R.id.listobjetos);
        // baso el objeto en el modelo que tenemos hecho
        objetos = ModeloObjetos.getObjeto();
        // usamos el adaptador y el item que le hemos hecho
        ObjetosAdapter objetosAdapter = new ObjetosAdapter(getActivity(), R.layout.item_objetos, objetos);
        //y le asignamos el adapter
        listobjetos.setAdapter(objetosAdapter);
        listobjetos.setOnItemClickListener(this);
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        ObjetosBeans objetosBeans = objetos.get(i);
        Intent intent = new Intent(getActivity(), ObjetosActivity.class);
        intent.putExtra(OBJETOS_KEY, objetosBeans);

        startActivity(intent);
    }
}
