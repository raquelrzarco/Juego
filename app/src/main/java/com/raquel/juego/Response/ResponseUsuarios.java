package com.raquel.juego.Response;

import com.google.gson.Gson;
import com.raquel.juego.bean.UsuarioBean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ALUMNOS on 16/06/2017.
 */

public class ResponseUsuarios implements Serializable {
    private int resultado;
    private ArrayList<UsuarioBean> usuarios;

    public ResponseUsuarios() {
    }

    public ResponseUsuarios(ArrayList<UsuarioBean> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<UsuarioBean> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<UsuarioBean> usuarios) {
        this.usuarios = usuarios;
    }
    public  static  ResponseUsuarios fromJson(String json){
        if(json!=null && !json.isEmpty()) {
            Gson gson = new Gson();
            return gson.fromJson(json, ResponseUsuarios.class);
        }else{
            return new ResponseUsuarios();
        }
    }
    public  String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
