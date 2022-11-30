package Sesion2811;

import java.util.Arrays;
import java.util.Scanner;

public class Metodos3 {
    public static void main(String[] args) {

        String palabra = "";
        System.out.println("Introduzca una palabra");
        Scanner sc = new Scanner(System.in);
        palabra = sc.next();

        System.out.println("Menú de funcionalidades");
        System.out.println("1- Calcular la longitud de la palabra");
        System.out.println("2- Mostrar la inicial de la palabra");
        System.out.println("3- Mostrar la última letra de la palabra");
        System.out.println("4- Quitar espacios si hubiese");
        System.out.println("5- Mostrar la palabra en mayusculas");
        System.out.println("6- Mostrar la palabra en minusculas");
        System.out.println("7- Reemplazar una letra por otra");
        System.out.println("8- Indicar si el String está vacio");
        System.out.println("9- Pasar a un array de char");

        System.out.println("Introduzca la acción que desea realizar");
        int opcion = sc .nextInt();

        switch (opcion){
            case 1:System.out.println("Su palabra tiene "+longitud_String(palabra)+" letras");break;
            case 2:System.out.println("Su inicial es "+inicial(palabra));break;
            case 3:System.out.println("Su ultima letra es "+ultima_letra(palabra));break;
            case 4:quitar_espacios(palabra);break;
            case 5:System.out.println("Su palabra en mayusculas es "+mayus(palabra));break;
            case 6:minus(palabra);break;
            case 7:System.out.println("Su nueva palabra es "+cambio(palabra));break;
            case 8:vacio(palabra);break;
            case 9:
                char[] array = array_de_char(palabra);
                System.out.println(Arrays.toString(array));break;
            default:System.out.println("Has introducido una opcion incorrecta");break;


        }



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
   private static void quitar_espacios (String palabra){
       String espacios = " ";
       espacios=palabra.trim();
       System.out.println("Su palabra sin espacios es");
       System.out.println(espacios);
   }
    private static String mayus (String palabra){
        String mayus;
        mayus = palabra.toUpperCase();
        return mayus;
    }
    private static void minus(String palabra){
        String minus;
        minus = palabra.toLowerCase();
        System.out.println("Se palabra en minusculas es "+minus);

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
    private static void vacio (String palabra){

        System.out.println("¿La palabra introducida esta vacia? "+palabra.isEmpty());

    }
    private static char [] array_de_char (String palabra){
        char [] array_de_char;
        array_de_char = palabra.toCharArray();
        return array_de_char;
    }
}
