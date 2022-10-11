package Sesion1010;
/* Se le pide a un alumno que anote su nota
* suspenso 0-4,99
* aprovado 5-5,99
* bien 6-6,99
* notable 7-8,99
* sobresaliente 9-9,99
* matricula de honor 10
* */

import java.util.Scanner;

public class Ejercio {
    public static void main(String[] args) {
         //declaramos las variables

        float nota=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nota");
        nota = sc.nextFloat();
        if (nota>=0&&nota<=4.99){
            System.out.println("suspenso");
        } else if (nota>=5&&nota<=5.99) {
            System.out.println("aprovado");
        }else if (nota>=6&&nota<=6.99) {
            System.out.println("bien");
        }else if (nota>=7&&nota<=8.99) {
            System.out.println("notable");
        }else if (nota>=9&&nota<=9.99) {
            System.out.println("sobresaliente");
        }else if (nota==10) {
            System.out.println("En hora buena has conseguido un sobresaliente");
        }
    }
}
