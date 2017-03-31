package com.raquel.juego.activity;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.raquel.juego.R;
import com.raquel.juego.bean.PersonajeBean;

public class BossActivity extends AppCompatActivity {
    private ImageView bossimagen;
    private TextView txtboss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss);
        txtboss = (TextView) findViewById(R.id.txtboss);
        bossimagen = (ImageView) findViewById(R.id.bossimagen);

        txtboss.setText(PersonajeBean.getDescripcion());
        bossimagen.setImageDrawable(ContextCompat.getDrawable(this, PersonajeBean.getFoto()));
    }
}
