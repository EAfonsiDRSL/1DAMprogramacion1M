package Sesion1710.Condicionales;
/*
realizar un programa que realize una ecuacion de primer grado
ax+b=0
 */

import java.util.Scanner;

public class Ejercicio5Condicionales {
    public static void main(String[] args) {
        String ecuacion = "ax+b=0";
        float a = 0;
        float b = 0;
        char ch = 'x';
        Scanner sc = new Scanner(System.in);
        System.out.println("Para resolver la ecuacion " + ecuacion + " , introduzca el valor de \'a\' y de \'b\'");
        System.out.println("Introduzca el valor de \'a\'");
        a = sc.nextFloat();
        System.out.println("Introduzca el valor de \'b\'");
        b = sc.nextFloat();

        if (a==0){
            System.out.printf("\033[91mError");
        }else {
            System.out.println("El valor de "+ch+" es igual a "+(-b/a));}



    }
}
