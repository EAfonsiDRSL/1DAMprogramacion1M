package a.b;

import java.util.Scanner;

public class conversionimplicita {

    public static void main(String[] args) {
        float nota=0;
       System.out.println("Introduzca una nota numérica");

        Scanner sc = new Scanner(System.in);
        nota=sc.nextFloat();
        System.out.println("el usuario ha introducido este valor "+nota);

    }
}
