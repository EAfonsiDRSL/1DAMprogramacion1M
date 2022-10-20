package Sesion1710.Condicionales;

import java.util.Scanner;

/*
Usuario escoge un mes en un numero
Dar por pantalla el mes correspondiente a ese nuemero
 */
public class Ejercicio1Condicionales {
    public static void main(String[] args) {
        //declaramos las variables que necesitemos
        int mes=0;
        //introducimos la entrada de texto
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un numero entre el uno y el 12");
        mes=sc.nextInt();
        switch (mes){
            case 1:
                System.out.println("Enero");break;
            case 2:
                System.out.println("Febrero");break;
            case 3:
                System.out.println("Marzo");break;
            case 4:
                System.out.println("Abril");break;
            case 5:
                System.out.println("Mayo");break;
            case 6:
                System.out.println("Junio");break;
            case 7:
                System.out.println("Julio");break;
            case 8:
                System.out.println("Agosto");break;
            case 9:
                System.out.println("Septiembre");break;
            case 10:
                System.out.println("Octubre");break;
            case 11:
                System.out.println("Noviembre");break;
            case 12:
                System.out.println("Diciembre");break;
        }
    if (mes>=13){
        System.out.println("Ha introducido un numero mayor al solicitado");
    }
    }
}
