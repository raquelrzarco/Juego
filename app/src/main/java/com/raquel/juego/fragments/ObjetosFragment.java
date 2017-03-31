package com.raquel.juego.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.raquel.juego.Modelos.ModeloPersonajes;
import com.raquel.juego.R;
import com.raquel.juego.activity.ObjetosActivity;
import com.raquel.juego.adapter.ObjetosAdapter;
import com.raquel.juego.bean.PersonajeBean;

import java.util.ArrayList;

public class ObjetosFragment extends Fragment {

    private ListView listobjetos;
    ArrayList<PersonajeBean> objetos = new ArrayList<>();

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
        objetos = ModeloPersonajes.getPersonaje();

        //ObjetosAdapter objetosAdapter = new ObjetosAdapter(getActivity(), android.R.layout.item_objetos, objetos);
       // listobjetos.setAdapter(objetosAdapter);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
