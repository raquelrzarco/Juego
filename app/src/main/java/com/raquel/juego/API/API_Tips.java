package com.raquel.juego.API;
import com.raquel.juego.Response.ResponseTip;
import com.raquel.juego.Response.ResponseTips;
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

public class API_Tips implements Serializable{
    private String URL =  APIEnvironment.getTips();
    private OkHttpClient client;

    public API_Tips() {
        client = new OkHttpClient();
    }
    public ArrayList<TipsBean> getTips(String token){
        Request request = new Request.Builder().addHeader("Token", token).url(URL).build();
        Response response = null;

        try {
            response = client.newCall(request).execute();
            String json= response.body().string();
            ResponseTips responseTips = ResponseTips.fromJson(json);
            return responseTips.getTips();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    //Peticion Get ListarTIP

    public  TipsBean getTip(String id){
        try {
            Request request = new Request.Builder().url(URL+id).build();
            Response response = client.newCall(request).execute();
            String json = response.body().string();
            ResponseTip responseTip = ResponseTip.fromJson(json);
            return responseTip.getTip();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
