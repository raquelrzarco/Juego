package com.raquel.juego.API;

import com.raquel.juego.Response.ResponseUsuario;
import com.raquel.juego.bean.UsuarioBean;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by ALUMNOS on 15/06/2017.
 */

public class API_Usuarios {
    private String URL =  APIEnvironment.getURLUsuario();
    private OkHttpClient client;

    public API_Usuarios() {
        this.client = new OkHttpClient();
    }

    public int setUsuarios(String nombre, String correo, String pass){
        RequestBody body = new FormBody.Builder().add("email",correo).add("nombre",nombre).add("apellidos","").add("password",pass).build();
        Request request = new Request.Builder().url(URL+"new/").post(body).build();
        Response response = null;

        try {
            response = client.newCall(request).execute();
            String json= response.body().string();
            ResponseUsuario responseUsuario =ResponseUsuario.fromJson(json);
            return responseUsuario.getResultado();

        } catch (IOException e) {
            e.printStackTrace();
        }
      return 0;
    }


}
