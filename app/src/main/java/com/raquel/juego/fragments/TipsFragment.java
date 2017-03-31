package com.raquel.juego.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.raquel.juego.Modelos.ModeloPersonajes;
import com.raquel.juego.R;


public class TipsFragment extends Fragment {

    public TipsFragment() {
        // Required empty public constructor
    }


    public static TipsFragment newInstance() {
        TipsFragment fragment = new TipsFragment();

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tips,null);
        return view;

    }

}
