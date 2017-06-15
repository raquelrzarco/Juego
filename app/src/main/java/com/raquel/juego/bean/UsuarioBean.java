package com.raquel.juego.bean;

import android.widget.EditText;

import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by ALUMNOS on 06/03/2017.
 */

public class UsuarioBean {
    private String id;
    private String token;
    private String nombre;
    private String contraseña;
    private String correo;
    private ArrayList<UsuarioBean> usuarios;

    public UsuarioBean() {
    }

    public UsuarioBean(String contraseña, String correo, String id, String nombre, String token, ArrayList<UsuarioBean> usuarios) {
        this.contraseña = contraseña;
        this.correo = correo;
        this.id = id;
        this.nombre = nombre;
        this.token = token;
        this.usuarios = usuarios;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public ArrayList<UsuarioBean> getUsuarios() {
        return usuarios;
    }

    public void setArticulos(ArrayList<UsuarioBean> usuarios) {
        this.usuarios = usuarios;
    }

    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static UsuarioBean fromJson(String json){
        if(json!=null && !json.isEmpty()) {
            Gson gson = new Gson();
            return gson.fromJson(json, UsuarioBean.class);
        }else{
            return new UsuarioBean();
        }
    }
}

