package com.raquel.juego.activity;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.raquel.juego.R;
import com.raquel.juego.bean.PersonajeBean;
import com.raquel.juego.fragments.PersonajesFragment;

import java.util.List;

public class PersonajesActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtdescripPersonaje;
    private TextView txtpersonaje;
    private ImageView imgpersonaje;
    private Button btnCompartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personajes);
        // recoges el intent
        Intent intent = getIntent();
        PersonajeBean personajeBean = (PersonajeBean) intent.getSerializableExtra(PersonajesFragment.PERSONAJE_KEY);
        //coges los find de tu view
        txtdescripPersonaje = (TextView) findViewById(R.id.txtdescripPersonaje);
        imgpersonaje = (ImageView) findViewById(R.id.imgpersonaje);
        btnCompartir = (Button) findViewById(R.id.btnCompartir);
        txtpersonaje = (TextView) findViewById(R.id.txtpersonaje);

        // Coges la descripcion

        txtdescripPersonaje.setText(personajeBean.getDescripcion());
        txtpersonaje.setText(personajeBean.getHistroiapersonaje());
        imgpersonaje.setImageDrawable(ContextCompat.getDrawable(this,personajeBean.getFoto()));
        // boton compartir onclick
        btnCompartir.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) { // boton compartir
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");

        intent.putExtra(Intent.EXTRA_TEXT, txtdescripPersonaje.getText());
        startActivity(intent);
    }
}
