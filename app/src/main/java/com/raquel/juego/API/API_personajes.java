package com.raquel.juego.API;

import com.raquel.juego.Response.ResponsePersonajes;
import com.raquel.juego.Response.ResponsesPersonaje;
import com.raquel.juego.bean.PersonajeBean;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by ALUMNOS on 19/05/2017.
 */

public class API_personajes {
    private String URL =  APIEnvironment.getPersonajes();
    private OkHttpClient client;

    public API_personajes() {
        client = new OkHttpClient();
    }

    public ArrayList<PersonajeBean> getPersonaje(){
        Request request = new Request.Builder().url(URL).build();
        Response response = null;

        try {
            response = client.newCall(request).execute();
            String json= response.body().string();
            ResponsePersonajes responsePersonajes = ResponsePersonajes.fromJson(json);
            return responsePersonajes.getPersonajes();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
//Peticion Get ListarPersonajes

    public  PersonajeBean getPersonaje(String id){
        try {
            Request request = new Request.Builder().url(URL+id).build();
            Response response = client.newCall(request).execute();
            String json = response.body().string();
          ResponsesPersonaje responsePersonajes = ResponsesPersonaje.fromJson(json);
            return responsePersonajes.getPersonaje();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
