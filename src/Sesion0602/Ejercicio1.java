package Sesion0602;

import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.println("Ejercicio 1");
        Random objeto = new Random();
        int numero1 = objeto.nextInt();
        int numero2 = objeto.nextInt();

        System.out.println("El primer numero es "+numero1);
        System.out.println("El segundo numero es "+numero2);
        System.out.println("El maximo es "+Math.max(numero1,numero2));
    }



}
