package com.raquel.juego.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.raquel.juego.Preferncias;
import com.raquel.juego.R;
import com.raquel.juego.activity.FormularioRegistroActivity;
import com.raquel.juego.bean.UsuarioBean;


public class PerfilFragment extends Fragment {

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
        return view;
    }
}
