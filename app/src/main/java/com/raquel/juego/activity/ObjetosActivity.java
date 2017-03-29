package com.raquel.juego.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.raquel.juego.R;

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
    }
}
