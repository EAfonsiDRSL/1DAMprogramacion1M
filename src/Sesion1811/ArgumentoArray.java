package Sesion1811;

import java.util.Arrays;

public class ArgumentoArray {
    public static void main(String[] args) {
        int [] arrayorigen = {1,2,3,4,5};
        int longitud = calcular_longitud(arrayorigen);
        imprimirArray(arrayorigen,longitud);
    }


    private static void imprimirArray(int [] arrayorigen, int longitud){
        System.out.println("El array "+ Arrays.toString(arrayorigen)+" tiene una longitud de "+longitud);
    }

    public static int calcular_longitud(int[] a) {
        int resultado=0;
        resultado = a.length;
        return resultado;
    }
}
