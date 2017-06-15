package com.raquel.juego.Response;

import com.google.gson.Gson;
import com.raquel.juego.bean.UsuarioBean;

/**
 * Created by ALUMNOS on 15/06/2017.
 */

public class UsuarioResponse {
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

    public static UsuarioResponse fromJson(String json){
        if(json!=null && !json.isEmpty()){
            Gson gson = new Gson();
            return gson.fromJson(json, UsuarioResponse.class);

        }else{
            return new UsuarioResponse();
        }
    }
}
