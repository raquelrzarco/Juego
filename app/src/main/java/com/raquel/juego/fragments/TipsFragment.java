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
import android.widget.ListView;

import com.raquel.juego.Modelos.ModeloPersonajes;
import com.raquel.juego.Modelos.Modelotips;
import com.raquel.juego.R;
import com.raquel.juego.activity.ObjetosActivity;
import com.raquel.juego.activity.TipsActivity;
import com.raquel.juego.adapter.TipsAdapter;
import com.raquel.juego.bean.ObjetosBeans;
import com.raquel.juego.bean.PersonajeBean;
import com.raquel.juego.bean.TipsBean;

import java.util.ArrayList;


public class TipsFragment extends Fragment implements AdapterView.OnItemClickListener {
    private ListView listtips;
    ArrayList<TipsBean> tips = new ArrayList<>();
    public static final String TIPS_KEY="TIPS_KEY";


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
        listtips = (ListView) view.findViewById(R.id.listtips);
        tips = Modelotips.getTip();

        TipsAdapter adaptertips = new TipsAdapter(getActivity(), R.layout.item_tips, tips);
        listtips.setAdapter(adaptertips);

        listtips.setOnItemClickListener(this);
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TipsBean tipsBean = tips.get(i);
        Intent intent = new Intent(getActivity(), TipsActivity.class);
        intent.putExtra(TIPS_KEY, tipsBean);

        startActivity(intent);
    }
}
