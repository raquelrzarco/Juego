package com.raquel.juego.Response;

import com.google.gson.Gson;
import com.raquel.juego.bean.ObjetosBeans;


import java.io.Serializable;

/**
 * Created by ALUMNOS on 19/06/2017.
 */

public class ResponseObjeto implements Serializable {
    private int resultado;
    private ObjetosBeans objeto;

    public ResponseObjeto() {
    }

    public ObjetosBeans getObjeto() {
        return objeto;
    }

    public void setObjeto(ObjetosBeans objeto) {
        this.objeto = objeto;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    public static ResponseObjeto fromJson (String json){
        if(json!=null && !json.isEmpty()){
            Gson gson = new Gson();
            return gson.fromJson(json, ResponseObjeto.class);
        }else{
            return new ResponseObjeto();
        }
    }

    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

}
