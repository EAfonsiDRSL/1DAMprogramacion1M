package Sesion1711;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercico {
    public static void main(String[] args) {

        int [] array1 = {1,2};
        int [] arraysimulado = new int [3];
        System.out.println("El array es "+ Arrays.toString(array1));
        System.arraycopy(array1,0,arraysimulado,0,array1.length);
        System.out.println("El array es "+Arrays.toString(arraysimulado));
        System.out.println("¿quieres insertar un nuevo elemento?");
        Scanner sc = new Scanner(System.in);
        char opcion = sc.next().toLowerCase().charAt(0);

        if (opcion=='s'){
            System.out.println("¿dime el numero?");
            int valornuevo = sc.nextInt();
            arraysimulado[arraysimulado.length-1]=valornuevo;
            System.out.println("el array es "+Arrays.toString(arraysimulado));
        }
        else
        {
            System.out.println("pues nada");
        }
    }
}
