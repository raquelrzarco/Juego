package com.raquel.juego.Response;

import com.google.gson.Gson;
import com.raquel.juego.bean.PersonajeBean;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 08/06/2017.
 */

public class ResponsesPersonaje implements Serializable {
    private int resultado;
    private PersonajeBean personaje;

    public ResponsesPersonaje() {
    }

    public PersonajeBean getPersonaje() {
        return personaje;
    }

    public int getResultado() {
        return resultado;
    }

    public static ResponsesPersonaje fromJson (String json){
        if(json!=null && !json.isEmpty()){
            Gson gson = new Gson();
            return gson.fromJson(json, ResponsesPersonaje.class);
        }else{
            return new ResponsesPersonaje();
        }
    }

    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

}
