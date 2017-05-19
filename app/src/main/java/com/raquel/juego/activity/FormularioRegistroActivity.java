package com.raquel.juego.activity;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.raquel.juego.Dialogs.RegistroFragment;
import com.raquel.juego.LoginActivity;
import com.raquel.juego.MainActivity;
import com.raquel.juego.Preferncias;
import com.raquel.juego.R;
import com.raquel.juego.Utils;
import com.raquel.juego.bean.UsuarioBean;

public class FormularioRegistroActivity extends AppCompatActivity implements View.OnClickListener, RegistroFragment.RegistroDialogListener {
    private EditText nombreUsuario;
    private EditText password;
    private EditText email;
    private Button confirmar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_registro);
        nombreUsuario = (EditText) findViewById(R.id.nombreUsuario);
        password = (EditText) findViewById(R.id.password);
        email = (EditText) findViewById(R.id.email);
        confirmar = (Button) findViewById(R.id.confirmar);

        confirmar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
            String nombre = nombreUsuario.getText().toString();
            String correo = email.getText().toString();
            String contraseña = password.getText().toString();

            if (correo!=null && !correo.isEmpty()  && contraseña!=null && !contraseña.isEmpty() && nombre!=null && !nombre.isEmpty()) {
                if (Utils.isEmail(correo)) {//LLama a la clase utils validando el correo
                    //Creas un usuario en el orden del constructor

                    RegistroFragment dialogRegistroFragment = new  RegistroFragment();
                    DialogFragment fragment = dialogRegistroFragment.newInstance();
                    fragment.show(getSupportFragmentManager(),"Dialog");
                   /*
                    UsuarioBean usuario = new UsuarioBean(contraseña,correo,nombre);

                        //Creas unas precerencias
                        Preferncias preferencias = new Preferncias(FormularioRegistroActivity.this);
                        //guardas el usuario que creamos antes en preferencias
                        preferencias.setUsuario(usuario);
                        Intent intent = new Intent(FormularioRegistroActivity.this, LoginActivity.class);
                        startActivity(intent);
                        finish();
                        */
                }
            }else {
                Toast.makeText(this,getString(R.string.error),Toast.LENGTH_SHORT).show();
               }
        }

    @Override
    public void onPositiveClick(RegistroFragment dialogRegistroFragment) {

        String nombre = nombreUsuario.getText().toString();
        String correo = email.getText().toString();
        String contraseña = password.getText().toString();

        //Creas unas precerencias
        Preferncias preferencias = new Preferncias(FormularioRegistroActivity.this);
        //guardas el usuario que creamos antes en preferencias
        UsuarioBean ususario = new UsuarioBean();
        ususario.setNombre(nombre);
        ususario.setContraseña(contraseña);
        ususario.setCorreo(correo);

        preferencias.setUsuario(ususario);
        Intent intent = new Intent(FormularioRegistroActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onNegativeClick(RegistroFragment dialogRegistroFragment) {

    }
}