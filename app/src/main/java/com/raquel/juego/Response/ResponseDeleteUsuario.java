package com.raquel.juego.Response;

import com.google.gson.Gson;

/**
 * Created by ALUMNOS on 15/06/2017.
 */

public class ResponseDeleteUsuario {

    private int resultado;

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }


    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static ResponseDeleteUsuario fromJson(String json){
        if(json!=null && !json.isEmpty()){
            Gson gson = new Gson();
            return gson.fromJson(json, ResponseDeleteUsuario.class);
        }else{
            return new ResponseDeleteUsuario();
        }
    }
}
