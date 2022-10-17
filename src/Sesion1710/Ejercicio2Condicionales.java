package Sesion1710;

import java.util.Scanner;

/*
lunes= BBDD
Martes= LMS
Miercoles= SI
Jueves= Programacion
Viernes= Fol
 */
public class Ejercicio2Condicionales {
    public static void main(String[] args) {
        String dia="";

        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca un dia de la semana");
        dia=sc.next();
        switch (dia){
            case "lunes":
                System.out.println("Hoy toca BBDD a primera hora");break;
            case "martes":
                System.out.println("Hoy toca LMS a primera hora");break;
            case "miercoles":
                System.out.println("Hoy toca Programacion a primera hora");break;
            case "jueves":
                System.out.println("Hoy toca SI a primera hora");break;
            case "viernes":
                System.out.println("Hoy toca FOL a primera hora");break;
            case "sabado":
                System.out.println("Hoy es fin de semana!!!!, descansa que no hay clases");break;
            case "domingo":
                System.out.println("Hoy es fin de semana!!!!, descansa que no hay clases");break;

        }
    }
}
