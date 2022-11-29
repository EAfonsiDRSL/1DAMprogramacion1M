package SesionRecreo;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        String palabra = "";

        System.out.println("que opcion quiere usted?");
        opcion = sc.nextInt();

        System.out.println("¿que palabra quiere usted ");
        palabra = sc.next();
        System.out.println("1.buscar cierta vocal en una palabra");
        System.out.println("2.Invertir la palabra");
        System.out.println("3.Contar la longitud de la palabra");
        System.out.println("4.Comparar dos palabras");


        switch (opcion){

            case 1:
                System.out.println("Digame la vocal que quiere buscar en la palabra");
                char vocal = sc.next().charAt(0);
                int numero_vocales = buscar_vocal_palabra(palabra,vocal);
                System.out.println("El numero de "+vocal+" en la palabra "+palabra+" es "+numero_vocales);
            case 3:
                System.out.println("Digame su palabra");
                String long_palabra = "";
                long_palabra = sc.next();
               // int longitud = longitudo_palabra(long_palabra);
                System.out.println("La longitud de su palabra es ");

        }

    }

    private static String longitudo_palabra(String long_palabra) {
        String longitudo_palabra = "";
       // longitudo_palabra = long_palabra.length();
        return longitudo_palabra;
    }

    private static int buscar_vocal_palabra(String palabra, char vocal) {
        int resultado=0;
        for (int i = 0; i < palabra.length();i++){
            if (palabra.charAt(i) == vocal){
                resultado++;
            }
        }
        return resultado;
    }

}
