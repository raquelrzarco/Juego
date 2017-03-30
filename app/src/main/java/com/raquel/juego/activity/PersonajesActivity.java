package com.raquel.juego.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.raquel.juego.R;
import com.raquel.juego.bean.PersonajeBean;

import java.util.List;

public class PersonajesActivity extends AppCompatActivity {
    private List listpersonajes;
    String[] personajes = {"protagonista","enemigo","boss"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personajes);
        listpersonajes = (List) findViewById(R.id.listpersonajes);

        ArrayAdapter adapter = new ArrayAdapter(PersonajesActivity.this, android.R.layout.simple_list_item_1, personajes);
       //listpersonajes.setAdapter(adapter);
        //Preguntar por que no quiere el adapter

    }
}
