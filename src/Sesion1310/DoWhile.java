package Sesion1310;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int numero=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca el numero desde el cual quiere contar hasta 100");
        numero=sc.nextInt();
        do {
            System.out.println(numero);
            numero++;
        }while (numero<=100);
    }
}
