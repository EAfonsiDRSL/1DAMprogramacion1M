package ModeloExamen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        String texto = "";


        texto=solicitar_usuario(texto);

        String [] array_string= convertir_array_string(texto);
        System.out.println(Arrays.toString(array_string));

        int [] array_entero=convetir_array_enteros(array_string);

        int sumatorio = suma_enteros(array_entero);
        System.out.println("El resultado de la suma de los elementos del array "+Arrays.toString(
                array_entero)+" es "+sumatorio);

    }

    private static int suma_enteros(int[] array_entero) {
        int resultado=0;

        for (int i=0;i<array_entero.length;i++){
            resultado=resultado+array_entero[i];
        }

        return resultado;

    }

    private static int[] convetir_array_enteros(String[] array_string) {
        int [] array_resultante = new int[array_string.length];
        int i;
        for (i=0;i<array_string.length;i++){
            array_resultante[i]=Integer.parseInt(array_string[i]);
        }





        return array_resultante;
    }

    private static String[] convertir_array_string(String texto) {
        String [] array_string = texto.split(",");

        return array_string;
    }

    private static String solicitar_usuario(String texto) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzcame un texto compuesto por numeros y separados por comas");
        texto = sc.next();

        return texto;
    }



}
