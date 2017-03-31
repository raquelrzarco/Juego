package com.raquel.juego.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.raquel.juego.Preferncias;
import com.raquel.juego.R;
import com.raquel.juego.activity.FormularioRegistroActivity;
import com.raquel.juego.activity.PersonajesActivity;
import com.raquel.juego.bean.PersonajeBean;
import com.raquel.juego.bean.UsuarioBean;


public class PerfilFragment extends Fragment{
    private TextView txtperfilnombre;
    private TextView txtperfilcorreo;

    public static PerfilFragment newInstance(){
        return new PerfilFragment();
    }


    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_perfil, container, false);
        Preferncias preferencias = new Preferncias(getActivity());
        UsuarioBean usuarioBean = preferencias.getUsuario();

        txtperfilnombre = (TextView) view.findViewById(R.id.txtperfilnombre);
        txtperfilcorreo = (TextView) view.findViewById(R.id.txtperfilcorreo);

        UsuarioBean usuariobean = new UsuarioBean();

        txtperfilnombre.setText("Nombre de ususario: " + usuarioBean.getNombre());
        txtperfilcorreo.setText("Correo de ususario: " + usuarioBean.getCorreo());

        return view;
    }

}
