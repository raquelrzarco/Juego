package com.raquel.juego.API;


import com.raquel.juego.BuildConfig;

/**
 * Created by ALUMNOS on 15/06/2017.
 */

public class APIEnvironment {
    private static final int DEV = 0;
    private static final int PRO = 1;
    private static final String URL_BASE_DEV = "http://raquelzarco.hol.es/APIandroid/";
    private static final String URL_BASE_PRO = "http://raquelzarco.hol.es/APIandroid/";


    public static String getURLBase() {
        switch (BuildConfig.ENVIRONMENT) {
            case DEV: return URL_BASE_DEV;
            case PRO: return URL_BASE_PRO;
        }
        return URL_BASE_DEV + "/usuarios/";
    }

    public static String getURLUsuario() {
        switch (BuildConfig.ENVIRONMENT) {
            case DEV: return URL_BASE_DEV + "/usuarios/";
            case PRO: return URL_BASE_PRO + "/usuarios/";
        }
        return URL_BASE_DEV + "/usuarios/";
    }

    public static String getPersonajes() {
        switch (BuildConfig.ENVIRONMENT) {
            case DEV: return URL_BASE_DEV + "/personajes/";
            case PRO: return URL_BASE_PRO + "/personajes/";
        }
        return URL_BASE_DEV + "/personajes/";
    }

    public static String getObjetos() {
        switch (BuildConfig.ENVIRONMENT) {
            case DEV: return URL_BASE_DEV + "/objetos/";
            case PRO: return URL_BASE_PRO + "/objetos/";
        }
        return URL_BASE_DEV + "/objetos/";
    }
    public static String getTips() {
        switch (BuildConfig.ENVIRONMENT) {
            case DEV: return URL_BASE_DEV + "/tips/";
            case PRO: return URL_BASE_PRO + "/tips/";
        }
        return URL_BASE_DEV + "/tips/";
    }

}

