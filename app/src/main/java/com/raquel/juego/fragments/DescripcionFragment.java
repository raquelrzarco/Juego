package com.raquel.juego.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.raquel.juego.R;


public class DescripcionFragment extends Fragment implements View.OnClickListener{
    private ImageView fotodes;
    private TextView txtDescritptcion;
    private Button btnCompartir;

    public DescripcionFragment() {
        // Required empty public constructor
    }
    public static DescripcionFragment newInstance(){
        return new DescripcionFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_descripcion, container, false);
        fotodes = (ImageView) view.findViewById(R.id.fotodes);
        txtDescritptcion = (TextView) view.findViewById(R.id.txtDescritptcion);
        btnCompartir = (Button) view.findViewById(R.id.btnCompartir);

        btnCompartir.setOnClickListener(this);
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
    public void onClick(View view) { // boton compartir
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");

        intent.putExtra(Intent.EXTRA_TEXT, txtDescritptcion.getText());
        startActivity(intent);
    }
}
