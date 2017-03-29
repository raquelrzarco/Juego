package com.raquel.juego.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.raquel.juego.LoginActivity;
import com.raquel.juego.R;

public class SalirActivity extends AppCompatActivity implements View.OnClickListener{
    private Button  salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salir);

        salir = (Button) findViewById(R.id.salir);
        salir.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(SalirActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
