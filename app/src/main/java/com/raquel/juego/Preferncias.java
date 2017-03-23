package com.raquel.juego;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.raquel.juego.bean.UsuarioBean;

/**
 * Created by ALUMNOS on 06/03/2017.
 */

public class Preferncias {
    private Context context;
    private final String PREFERENCIAS = "Preferencias";
    private final String USUARIO_KEY = "USUARIO_KEY";
    private final String LOGIN = "login";

    public Preferncias(Context context) {
        this.context = context;
    }

    public void setLogin(boolean login){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCIAS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(LOGIN, login);
        editor.commit();
    }
    public boolean isLogin(){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCIAS, context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(LOGIN, false);
    }
    public void setUsuario(UsuarioBean usuario){
        String usuarioJson=usuario.toJson();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCIAS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(USUARIO_KEY,usuarioJson);
        editor.commit();
    }

    public UsuarioBean getUsuario(){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCIAS, Context.MODE_PRIVATE);
        String json = sharedPreferences.getString(USUARIO_KEY,"");

        return UsuarioBean.fromJson(json);
    }
}
