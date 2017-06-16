package com.raquel.juego.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.raquel.juego.API.API_personajes;
import com.raquel.juego.Modelos.ModeloPersonajes;
import com.raquel.juego.Preferncias;
import com.raquel.juego.R;
import com.raquel.juego.activity.PersonajesActivity;
import com.raquel.juego.bean.PersonajeBean;

import java.util.ArrayList;
import java.util.List;

public class PersonajesFragment extends Fragment implements AdapterView.OnItemClickListener {

    private ListView listpersonajes;
    private Preferncias preferncias;
    ArrayList<PersonajeBean> personajes = new ArrayList<>();
    public static final String PERSONAJE_KEY="PERSONAJE_KEY";


    public static PersonajesFragment newInstance(){
        return new PersonajesFragment();
    }

    public PersonajesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        preferncias = new Preferncias(getActivity());
        View view = inflater.inflate(R.layout.fragment_personajes,null);
        listpersonajes = (ListView) view.findViewById(R.id.listpersonajes);
        //personajes = ModeloPersonajes.getPersonaje();

        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, personajes);
        listpersonajes.setAdapter(adapter);
        listpersonajes.setOnItemClickListener(this);

        Hilo hilo = new Hilo();
        hilo.execute(preferncias.getUsuario().getToken());

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


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long l) {
        PersonajeBean personajeBean = personajes.get(posicion);
        Intent intent = new Intent(getActivity(), PersonajesActivity.class);
        intent.putExtra(PERSONAJE_KEY, personajeBean);

        startActivity(intent);
    }

    public class Hilo extends AsyncTask<String, Void, ArrayList<PersonajeBean>>{

        @Override
        protected ArrayList<PersonajeBean> doInBackground(String... args) {
            String token = args[0]; //Cogemos el tokken
            return API_personajes.getPersonajes(); //lo devolvemos con el metodo getPersonajes
        }

        @Override
        protected void onPostExecute(ArrayList<PersonajeBean> personajeBeen) {
            super.onPostExecute(personajeBeen);

            if(personajeBeen != null) {
                personajes.clear();
                personajes.addAll(personajeBeen);
                ArrayAdapter adapter = (ArrayAdapter) listpersonajes.getAdapter(); //Recuperas el adapter de la lista
                adapter.notifyDataSetChanged();

            }else{
                Snackbar.make(getView(), "No se ha podido realizar la peticion", Snackbar.LENGTH_LONG).show();

            }

        }
    }
}
