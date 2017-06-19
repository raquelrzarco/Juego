package com.raquel.juego.bean;
import java.io.Serializable;

/**
 * Created by ALUMNOS on 03/04/2017.
 */

public class TipsBean implements Serializable {
    private int id;
    private String presentaciontip;
    private String tip1;
    private String tip2;
    private String tip3;

    public TipsBean(int id, String presentaciontip, String tip1, String tip2, String tip3) {
        this.id = id;
        this.presentaciontip = presentaciontip;
        this.tip1 = tip1;
        this.tip2 = tip2;
        this.tip3 = tip3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPresentaciontip() {
        return presentaciontip;
    }

    public void setPresentaciontip(String presentaciontip) {
        this.presentaciontip = presentaciontip;
    }

    public String getTip1() {
        return tip1;
    }

    public void setTip1(String tip1) {
        this.tip1 = tip1;
    }

    public String getTip2() {
        return tip2;
    }

    public void setTip2(String tip2) {
        this.tip2 = tip2;
    }

    public String getTip3() {
        return tip3;
    }

    public void setTip3(String tip3) {
        this.tip3 = tip3;
    }

    @Override
    public String toString() {
        return  ", tip1='" + tip1 + '\'' +
                ", tip2='" + tip2 + '\'' +
                ", tip3='" + tip3 + '\'' +
                '}';
    }
}
