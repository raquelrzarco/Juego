package com.raquel.juego.activity;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.raquel.juego.R;
import com.raquel.juego.bean.PersonajeBean;

public class EnemigoActivity extends AppCompatActivity {
    private ImageView enemigoimagen;
    private TextView txtEnemigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enemigo);
        enemigoimagen = (ImageView) findViewById(R.id.enemigoimagen);
        txtEnemigo = (TextView) findViewById(R.id.txtEnemigo);


        txtEnemigo.setText(PersonajeBean.getDescripcion());
        enemigoimagen.setImageDrawable(ContextCompat.getDrawable(this, PersonajeBean.getFoto()));
    }
}
