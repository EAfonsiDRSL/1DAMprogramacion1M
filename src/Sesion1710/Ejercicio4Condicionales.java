package Sesion1710;

import java.util.Scanner;

/*
salario
*hasta 40 horas son 12 la hora
*>40 horas son 16 la hora
 */
public class Ejercicio4Condicionales {
    public static void main(String[] args) {

        float horas=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Porfavor introduzca el numero de horas trabajadas semanalmente");
        horas=sc.nextFloat();
        if (horas <= 40.00) {
            System.out.println(horas*12+"€");
        }else System.out.println(horas*16+"€");
    }
}
