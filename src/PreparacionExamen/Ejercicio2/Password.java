package PreparacionExamen.Ejercicio2;

import Practica2daEvaluacion.Apartado1.Television;

import javax.swing.*;

public class Password {

    private final static int LONG_DEFECTO=8;

    /**atributos*/

    private int longitud=LONG_DEFECTO;
    private String contrasenya;

    public Password(){

    }
    public Password(int longitud) throws LongitudIncorrecta, ContraseñaIncorrecta {
        if (longitud < LONG_DEFECTO){
            throw new LongitudIncorrecta("Se necesita una contraseña con longitud minima de 8");
        }
        this.longitud = longitud;
        this.contrasenya = generarPassword();
        if (!esFuerte()){
            throw new ContraseñaIncorrecta("la contraseña generada no es totalmente segura");
        }
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) throws LongitudIncorrecta, ContraseñaIncorrecta {
        if (longitud < LONG_DEFECTO){
            throw new LongitudIncorrecta("Se necesita una contraseña con longitud minima de 8");
        }
        if (!esFuerte()){
            throw new ContraseñaIncorrecta("la contraseña generada no es totalmente segura");
        }
        this.longitud = longitud;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    private String generarPassword() {
        String password_generada = null;
        for (int i = 0 ; i < longitud ; i++){
            int eleccion = (int) Math.floor(Math.random()*3+1);
            if (eleccion == 1 ){
                //minusculas
                char minuscula = (char) ((int) Math.floor(Math.random()*(123-97)+97));
                password_generada += minuscula;
            }else {
                if(eleccion == 2){
                    //mayusculas
                    char mayuscula = (char) ((int) Math.floor(Math.random()*(91-65)+65));
                    password_generada +=mayuscula;
                }else {
                    //3 numeros
                    char numero = (char) ((int) Math.floor(Math.random()*(58-48)+48));
                    password_generada += numero;
                }
            }
        }

        return  password_generada;
    }
    public boolean esFuerte(){
        boolean resultado = false;
        int contador_num=0;
        int contador_minusculas=0;
        int contador_mayusculas=0;

        for (int i=0 ; i<contrasenya.length();i++) {
            if (contrasenya.charAt(i) > 97 && contrasenya.charAt(i) <= 122) {
                contador_minusculas++;
            } else {
                if (contrasenya.charAt(i) > 65 && contrasenya.charAt(i) <= 90) {
                    contador_mayusculas++;

                } else {
                    contador_num++;
                }
            }
        }

        if (contador_num >= 5 && contador_minusculas >= 1 && contador_mayusculas >= 2){
            resultado = true;
            System.out.println("La contraseña es fuerte");
        }else {
            System.out.println("La contraseña NO es fuerte");
        }


        return resultado;
    }


}