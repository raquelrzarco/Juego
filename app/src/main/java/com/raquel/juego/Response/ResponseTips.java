package com.raquel.juego.Response;

import com.google.gson.Gson;
import com.raquel.juego.bean.TipsBean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ALUMNOS on 18/05/2017.
 */

public class ResponseTips implements Serializable {
    private int resultado;
    private ArrayList<TipsBean> tips;

    public ResponseTips() {
        this.resultado = resultado;
        this.tips = tips;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public ArrayList<TipsBean> getTips() {
        return tips;
    }

    public void setTips(ArrayList<TipsBean> tips) {
        this.tips = tips;
    }
    public  static  ResponseTips fromJson(String json){
        if(json!=null && !json.isEmpty()) {
            Gson gson = new Gson();
            return gson.fromJson(json, ResponseTips.class);
        }else{
            return new ResponseTips();
        }
    }
    public  String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
