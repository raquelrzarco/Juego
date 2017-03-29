package com.raquel.juego.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.raquel.juego.R;

public class AjustesActivity extends AppCompatActivity {
    private TextView version;
    private TextView contacto;
    private TextView infpro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);
        infpro = (TextView) findViewById(R.id.infpro);
        version = (TextView) findViewById(R.id.version);
        contacto = (TextView) findViewById(R.id.contacto);
    }
}
