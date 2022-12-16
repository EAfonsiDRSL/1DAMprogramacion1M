package Examen1Trimestre;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int opcion = 0 ;
        Scanner sc = new Scanner(System.in);
        // declarar el array de int

        int dimension = solicitardimension();
        int [] array = new int[dimension];

        do {
            System.out.println("----------Introduzca una de las siguientes opciones----------");
        System.out.println("0. Salir");
        System.out.println("1. Inicializa array aleatoriamente");
        System.out.println("2. Comprobar si es múltiplo de 3 y 5 a la vez");
        System.out.println("3. Indicar el numero de negativos en el array");
        System.out.println("4. Verificar si es capicua el array");
        System.out.println("Esperando opcion...");
            opcion = sc.nextInt();

        switch (opcion){
            case 1: array = inicializar(array);System.out.println(Arrays.toString(array));break;
            case 2: imprimir_multiplos(array);break;
            case 3: numeros_negativos(array);break;
            case 4: verifiar_capicua(array);break;
            }
        }while (opcion!=0);

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

    public static void imprimir_multiplos (int [] array){
        int contador = 0 ;
        for (int i =0 ; i < array.length; i++){
            if ((array[i] % 3 == 0) && (array[i] % 5 == 0 )){
                System.out.println("\u001B[31m"+array[i]+"\u001B[0m");
                contador++;
            }
        }
        if (contador==0){
            System.out.println("No hay multiplos");
        }


    }
    public static void numeros_negativos (int [] array){
        int contador=0;
        for (int i = 0 ; i < array.length ; i++){

            if (array[i]<0){
                contador++;
            }
        }

        if (contador==0){
            System.out.println("No hay numeros negativos");
        }else{
            System.out.println("El numero de negativos es "+contador);
        }
    }
    public static void verifiar_capicua (int [] array){

        int [] array_invertido = new int [array.length];
        int j = array.length;
        for (int i = 0 ; i < array_invertido.length; i++){
            array_invertido [i] = array[i];
            j--;
        }
        if (Arrays.equals(array_invertido,array)){
            System.out.println("Es capicua");

        }else {
            System.out.println("No es capicua");
        }


    }

}
