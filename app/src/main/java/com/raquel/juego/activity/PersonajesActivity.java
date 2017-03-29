package com.raquel.juego.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
