package com.raquel.juego.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.raquel.juego.R;

public class DescripcionActivity extends AppCompatActivity {
    private ImageView fotodes;
    private TextView txtDescritptcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);
        fotodes = (ImageView) findViewById(R.id.fotodes);
        txtDescritptcion = (TextView) findViewById(R.id.txtDescritptcion);
    }
}
