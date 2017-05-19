package com.raquel.juego.Response;

import com.google.gson.Gson;
import com.raquel.juego.bean.ObjetosBeans;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ALUMNOS on 18/05/2017.
 */

public class ResponseObjetos implements Serializable {
    private int resultado;
    private ArrayList<ObjetosBeans> objetos;

    public ResponseObjetos() {
        this.resultado = resultado;
        this.objetos = objetos;
    }

    public ArrayList<ObjetosBeans> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<ObjetosBeans> objetos) {
        this.objetos = objetos;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    public  static  ResponseObjetos fromJson(String json){
        if(json!=null && !json.isEmpty()) {
            Gson gson = new Gson();
            return gson.fromJson(json, ResponseObjetos.class);
        }else{
            return new ResponseObjetos();
        }
    }
    public  String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
