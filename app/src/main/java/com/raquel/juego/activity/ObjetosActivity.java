package com.raquel.juego.activity;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.raquel.juego.R;
import com.raquel.juego.bean.ObjetosBeans;
import com.raquel.juego.bean.PersonajeBean;

public class ObjetosActivity extends AppCompatActivity {
    private ImageView puntosimagen;
    private TextView txtPuntuacion;
    private ImageView vidaimagen;
    private TextView txtVida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objetos);
        puntosimagen = (ImageView) findViewById(R.id.puntosimagen);
        txtPuntuacion = (TextView) findViewById(R.id.txtPuntuacion);
        vidaimagen = (ImageView) findViewById(R.id.vidaimagen);
        txtVida = (TextView) findViewById(R.id.txtVida);

        txtPuntuacion.setText(String.valueOf(ObjetosBeans.getDescripcion()));
        txtVida.setText(String.valueOf(ObjetosBeans.getDescripcion()));
        puntosimagen.setImageDrawable(ContextCompat.getDrawable(this, ObjetosBeans.getFoto()));
        vidaimagen.setImageDrawable(ContextCompat.getDrawable(this, ObjetosBeans.getFoto()));

    }
}
