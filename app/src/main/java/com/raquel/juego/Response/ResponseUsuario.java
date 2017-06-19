package com.raquel.juego.Response;

import com.google.gson.Gson;
import com.raquel.juego.bean.UsuarioBean;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 19/06/2017.
 */

public class ResponseUsuario implements Serializable{
    private int resultado;

    private UsuarioBean usuario;

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    public UsuarioBean getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioBean usuario) {
        this.usuario = usuario;
    }

    public static ResponseUsuario fromJson (String json){
        if(json!=null && !json.isEmpty()){
            Gson gson = new Gson();
            return gson.fromJson(json, ResponseUsuario.class);
        }else{
            return new ResponseUsuario();
        }
    }

    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
