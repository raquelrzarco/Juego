package com.raquel.juego;

/**
 * Created by ALUMNOS on 09/03/2017.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Utils {

        //validación email
        public static boolean isEmail(String email){ //Lista de validación
            String regex= ("^[_a-z0-9-]+(_a-z0-9-)*@[_a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$");//Comprueba el email con una expresión regular
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();//true si es email o false si no es email

        }
        //validación URL
        public static boolean isURL (String email){ //Lista de validación
            String regex= ( "^(https?://)?(([\\w!~*'().&=+$%-]+: )?[\\w!~*'().&=+$%-]+@)?(([0-9]{1,3}.){3}[0-9]{1,3}|([\\w!~*'()-]+.)*([w^-][\\w-]{0,61})?[\\w].[a-z]{2,6})(:[0-9]{1,4})?((/*)|(/+[\\w!~*'().;?:@&=+$,%#-]+)+/*)$");//Comprueba el email con una expresión regular
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();//true si es email o false si no es email

        }
        //validación Telefono
        public static boolean isTelefono (String email){ //Lista de validación
            String regex= ("(\\+34|0034|34)?[ -]*(6|7)[ -]*([0-9][ -]*){8}");//Comprueba la URL con una expresión regular
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();//true si es email o false si no es email

        }

}
