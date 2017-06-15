package com.raquel.juego.API;

import com.raquel.juego.Response.ResponsePersonajes;
import com.raquel.juego.Response.ResponsesPersonaje;
import com.raquel.juego.bean.PersonajeBean;
import com.raquel.juego.bean.UsuarioBean;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by ALUMNOS on 15/06/2017.
 */

public class API_Usuarios {
    private String URL =  APIEnvironment.getURLUsuario();
    private OkHttpClient client;

    public API_Usuarios(OkHttpClient client) {
        this.client = client;
    }

    public ArrayList<UsuarioBean> getUsuario(){
        Request request = new Request.Builder().url(URL).build();
        Response response = null;

        try {
            response = client.newCall(request).execute();
            String json= response.body().string();
            //Responses usaruio con <>

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
//Peticion delete usuario

}
