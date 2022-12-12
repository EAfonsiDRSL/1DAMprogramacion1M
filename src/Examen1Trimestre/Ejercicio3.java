package Examen1Trimestre;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        // declarar el array de int

        int dimension = solicitardimension();
        int [] array = new int[dimension];
        array = inicializar(array);
        System.out.println(Arrays.toString(array));

    }

    public static int solicitardimension() {
        Scanner sc = new Scanner(System.in);
        int resultado = 0;
        do {
            System.out.println("Introduzca la dimension del array");

            resultado = sc.nextInt();
        }while (resultado <= 0);


        return resultado;
    }
    public static int [] inicializar(int [] array){
        final int MIN = -200;
        final int MAX = 200;

        for (int i =0; i<array.length;i++){

            array[i] = (int) (Math.random()*((MAX-MIN+1))+MIN);
        }


        return array;
    }



}
