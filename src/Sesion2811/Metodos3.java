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
}
