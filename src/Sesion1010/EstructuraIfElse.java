package Sesion1010;

import java.util.Scanner;

public class EstructuraIfElse {
    public static void main(String[] args) {
        // declaracion e inicializacion de variables
        int a, b, mayor, menor=0;
        Scanner sc = new Scanner(System.in);
        // introducir los valores por teclado
        System.out.println("Introduzca el valor de \'a\'");
        a= sc.nextInt();
        System.out.println("Introduzca el valor de \'b\'");
        b= sc.nextInt();
        // determinar cual es menor y mayor
        mayor=a;
        menor=b;

        if (a==b){
            System.out.println("Los numeros son iguales");
        }
        else {
            if (a>b) {
                mayor = a;
                menor = b;
            }

            else {
                mayor = b;
                menor = a;
            }

            System.out.println("El mayor es "+mayor+" y el menor es "+menor);

        }




    }
}
