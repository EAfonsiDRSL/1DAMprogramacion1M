package Sesion1711;

import java.util.Arrays;
import java.util.Scanner;

public class SimuladorElim {
    public static void main(String[] args) {
       int [] array1 = {1,2,3,4};
       int [] simulacion = new int[3];
        System.out.println("El array es "+ Arrays.toString(array1));
        System.out.println("indique el numero que desea eliminar");
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        int posicion = Arrays.binarySearch(array1,item);

        if (posicion<0){
            System.out.println("El elemento no se encuentra en el array, no se eliminara nada");
        }
        else {
             int remaningElements = array1.length - ( posicion+ 1);
             System.arraycopy(array1,0 , simulacion,0, posicion);
             System.arraycopy(array1,posicion + 1,simulacion,posicion, remaningElements);
            System.out.println("Elemento borrado");
            System.out.println("el array actualizado es "+Arrays.toString(simulacion));

        }


    }
}
