package com.raquel.juego;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.raquel.juego.Dialogs.RegistroFragment;
import com.raquel.juego.activity.FormularioRegistroActivity;
import com.raquel.juego.bean.UsuarioBean;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Preferncias preferncias;
    private EditText txtNombre;
    private EditText txtContraseña;
    private Button btnEntrar;
    private Button btnRegistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        preferncias = new Preferncias(this);

        if(preferncias.isLogin()==false) {
            txtNombre = (EditText) findViewById(R.id.txtNombre);
            txtContraseña = (EditText) findViewById(R.id.txtContraseña);
            btnEntrar = (Button) findViewById(R.id.btnEntrar);
            btnRegistrarse = (Button) findViewById(R.id.btnRegistrarse);

            btnEntrar.setOnClickListener(this);
            btnRegistrarse.setOnClickListener(this);
        }else{
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.btnEntrar:
                //recoger los textos
                String nombre = txtNombre.getText().toString();
                String contraseña = txtContraseña.getText().toString();

                if (nombre != null && !nombre.isEmpty() && contraseña != null && !contraseña.isEmpty()) {
                    //Creas un usuario
                    UsuarioBean usuarioBean = preferncias.getUsuario();
                    Log.d("LoginActivity","***********Usuario: "+usuarioBean.toJson());
                    //Compruebas si el usuario está en preferencias
                    if (usuarioBean.getNombre() != null && !usuarioBean.getNombre().isEmpty() && usuarioBean.getContraseña() != null && !usuarioBean.getContraseña().isEmpty() && nombre.equals(usuarioBean.getNombre()) && contraseña.equals(usuarioBean.getContraseña())) {
                        preferncias.setLogin(true);

                        //lanzar el main btnEntrar
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Intent intent = new Intent(LoginActivity.this, FormularioRegistroActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }

                break;
            case R.id.btnRegistrarse:
                //Lanzar una activity con un formulario


                Intent intent = new Intent(LoginActivity.this, FormularioRegistroActivity.class);
                startActivity(intent);

                break;

        }
    }
}
