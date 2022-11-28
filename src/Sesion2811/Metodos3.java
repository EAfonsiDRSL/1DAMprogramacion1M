package Sesion2811;

import java.util.Scanner;

public class Metodos3 {
    public static void main(String[] args) {

        String palabra = "";
        System.out.println("Introduzca una palabra");
        Scanner sc = new Scanner(System.in);
        palabra = sc.next();
        int resultado = longitud_String(palabra);
        System.out.println("Su palabra tiene "+longitud_String(palabra)+" letras");
        System.out.println("Su inicial es "+inicial(palabra));
        System.out.println("Su ultima letra es "+ultima_letra(palabra));
        System.out.println("Su palabra en mayusculas es "+mayus(palabra));
        System.out.println("Su palabra en minusculas es "+minus(palabra));
        System.out.println("Su nueva palabra es "+cambio(palabra));

    }
    private static int longitud_String (String palabra){
        int resultado = 0;
        resultado=palabra.length();
        return resultado;
    }
    private static char inicial (String palabra){
        char inicial;
        inicial=palabra.charAt(0);
        return inicial;
    }
    private static char ultima_letra (String palabra){
        char ultima_letra;
        ultima_letra=palabra.charAt(palabra.length()-1);
        return ultima_letra;
    }
   // private static void  (String palabra){
       // String espacios = " ";
      //  espacios=palabra.trim().length();
       // return espacios;
   // }
    private static String mayus (String palabra){
        String mayus;
        mayus = palabra.toUpperCase();
        return mayus;
    }
    private static String minus(String palabra){
        String minus;
        minus = palabra.toLowerCase();
        return minus;

    }
    private static String cambio (String palabra){
        String cambio;
        String old_char=" ";
        String new_char=" ";

        System.out.println("¿Que letra desea cambiar?");
        Scanner sc = new Scanner(System.in);
        old_char = sc.next();
        System.out.println("¿Cual letra desea poner como sustituta?");
        new_char = sc.next();
        cambio = palabra.replace(old_char,new_char);
        return cambio;
    }
    //private static String array_de_char (String palabra){
      //  String array_de_char=" ";

    //}
}
