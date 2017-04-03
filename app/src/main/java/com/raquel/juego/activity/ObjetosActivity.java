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
import com.raquel.juego.bean.ObjetosBeans;
import com.raquel.juego.bean.PersonajeBean;
import com.raquel.juego.fragments.ObjetosFragment;
import com.raquel.juego.fragments.PersonajesFragment;

public class ObjetosActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView puntosimagen;
    private TextView txtPuntuacion;
    private ImageView vidaimagen;
    private TextView txtVida;
    private Button btnCompartir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objetos);
        puntosimagen = (ImageView) findViewById(R.id.puntosimagen);
        txtPuntuacion = (TextView) findViewById(R.id.txtPuntuacion);
        vidaimagen = (ImageView) findViewById(R.id.vidaimagen);
        txtVida = (TextView) findViewById(R.id.txtVida);
        btnCompartir = (Button) findViewById(R.id.btnCompartir);


        Intent intent = getIntent();
        ObjetosBeans objetosBeans = (ObjetosBeans) intent.getSerializableExtra(ObjetosFragment.OBJETOS_KEY);

        txtPuntuacion.setText(objetosBeans.getDescripcion());
        puntosimagen.setImageDrawable(ContextCompat.getDrawable(this,objetosBeans.getFoto()));

        txtVida.setText(objetosBeans.getDescripcion());
        vidaimagen.setImageDrawable(ContextCompat.getDrawable(this,objetosBeans.getFoto()));

        btnCompartir.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text");

        intent.putExtra(Intent.EXTRA_TEXT, String.valueOf(txtPuntuacion));
        startActivity(intent);
    }
}
