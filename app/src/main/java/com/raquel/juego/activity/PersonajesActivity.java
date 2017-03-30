package com.raquel.juego.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.raquel.juego.Modelos.ModeloPersonajes;
import com.raquel.juego.R;

import java.util.List;

public class PersonajesActivity extends AppCompatActivity {
    private List listpersonajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personajes);
        listpersonajes = (List) findViewById(R.id.listpersonajes);


    }
}
