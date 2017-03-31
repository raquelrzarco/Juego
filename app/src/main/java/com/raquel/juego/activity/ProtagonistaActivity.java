package com.raquel.juego.activity;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.raquel.juego.R;
import com.raquel.juego.bean.PersonajeBean;

public class ProtagonistaActivity extends AppCompatActivity {
    private ImageView protagonistaimg;
    private TextView txtpez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protagonista);
        txtpez = (TextView) findViewById(R.id.txtpez);
        protagonistaimg = (ImageView) findViewById(R.id.protagonistaimg);


        txtpez.setText(PersonajeBean.getDescripcion());
        protagonistaimg.setImageDrawable(ContextCompat.getDrawable(this, PersonajeBean.getFoto()));
    }
}
