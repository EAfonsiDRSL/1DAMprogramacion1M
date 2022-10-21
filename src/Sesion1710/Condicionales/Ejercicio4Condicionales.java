package Sesion1710.Condicionales;

import java.util.Scanner;

/*
salario
*hasta 40 horas son 12 la hora
*>40 horas son 16 la hora
 */
public class Ejercicio4Condicionales {
    public static void main(String[] args) {

        float horas=0;
        float horas_extra=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Porfavor introduzca el numero de horas trabajadas semanalmente");
        horas=sc.nextFloat();
        if (horas <= 40.00) {
            System.out.println("Su salario semanal es de  "+horas*12+"€");

        } else
        horas_extra=horas -40;
        System.out.println("Su salario semanal es de  "+(40*12+horas_extra*16)+"€");
    }
}
