package com.raquel.juego.API;

import com.raquel.juego.Response.ResponseObjeto;
import com.raquel.juego.Response.ResponseObjetos;
import com.raquel.juego.Response.ResponseTips;
import com.raquel.juego.Response.ResponsesPersonaje;
import com.raquel.juego.bean.ObjetosBeans;
import com.raquel.juego.bean.PersonajeBean;
import com.raquel.juego.bean.TipsBean;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by ALUMNOS on 19/06/2017.
 */

public class API_Objetos implements Serializable {
    private String URL =  APIEnvironment.getObjetos();
    private OkHttpClient client;

    public API_Objetos() {
        client = new OkHttpClient();
    }

    public ArrayList<ObjetosBeans> getObjetos(String token){
        Request request = new Request.Builder().addHeader("Token", token).url(URL).build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            String json= response.body().string();
            ResponseObjetos responseObjetos = ResponseObjetos.fromJson(json);
            return responseObjetos.getObjetos();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //Peticion Get ListarObjetos

    public ObjetosBeans getObjeto(String id){
        try {
            Request request = new Request.Builder().url(URL+id).build();
            Response response = client.newCall(request).execute();
            String json = response.body().string();
            ResponseObjeto responseObjeto = ResponseObjeto.fromJson(json);
            return  responseObjeto.getObjeto();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
