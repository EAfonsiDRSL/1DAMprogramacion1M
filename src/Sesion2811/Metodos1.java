package Sesion2811;

import java.util.Scanner;

public class Metodos1 {
    public static void main(String[] args) {

        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número");
        num = sc.nextInt();
           boolean resultado = esprimo(num);
           if (resultado){
               System.out.println("Es primo");
           }else {
               System.out.println("No es primo");
           }

    }

    private static boolean esprimo(int numero) {
        int num =numero;

        int div = 2;
        boolean primo=false;
        if (num == 2){
            primo = true;
        }   else {

            while (num != 1) {

                if (num % div == 0) {

                    num = num / div;

                } else {

                    div++;

                    if (num == div) {
                        primo = true;
                    }
                }
            }
        }

        return primo;
    }




}
