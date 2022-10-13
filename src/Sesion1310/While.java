package Sesion1310;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        int numero=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzaca un numero el cual queremos contar hasta 100");
        numero=sc.nextInt();

        if (numero>100) {
            System.out.println("introdujo un numero superior a 100");
        }
        while (numero<=100) {
            System.out.println(numero);
            numero++;
        }
        }

}
