package Sesion1710.Condicionales;
/*

 */

import java.util.Scanner;

public class Ejercicio6Condicionales {
    public static void main(String[] args) {
        // declaramos e inicializamos variables
        final float G= 9.8f ;
        float t = 0;
        float h = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Para calcular el tiempo de caida de un objeto nesesitamos la altura de la que va a caer el objeto");
        System.out.println("Porfavor introduzca la altura en metros");
        h=sc.nextFloat();
        if (h<0){
            System.out.println("NO existe solucion real para raices negativas");
        }else {

            System.out.println("El tiempo en caer el objeto es de "+Math.sqrt((2*h)/G)+" segundos");}


    }

    }

