package Sesion1710.Condicionales;

import java.util.Scanner;

/*
tramos 6 a 12= buenos dias
tramos 13 a 20= buenas tardes
tramos 21 a 5= buenas noches
 */
public class Ejercicio3Condicional {
    public static void main(String[] args) {
        int hora=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("introduzca la hora (solo horas, no minutos) en formato 24H");
        hora=sc.nextInt();
        if(hora>=6&&hora<=12){
            System.out.println("buenos dias!!!");
        } else if (hora>=13&&hora<=20) {
            System.out.println("buenas tardes!!!");
        } else if (hora>=21&&hora<=24) {
            System.out.println("buenas noches!!!");
        } else if (hora>=1&&hora<=5) {
            System.out.println("buenas noches!!!");
        }else {
            System.out.println("Hora incorrecta, porfavor introzducalo de nuevo");
        }
    }
}
