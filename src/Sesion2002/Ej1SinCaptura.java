package Sesion2002;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1SinCaptura {
    public static void main(String[] args) {

        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.println("Introduzca el dividendo");
            int dividendo = sc.nextInt();
            System.out.println("Introduzca el divisor");
            int divisor = sc.nextInt();
            System.out.println("El cociente es " + dividendo / divisor);
        } catch (InputMismatchException e) {
            System.out.println("El valor introducido por teclado no es acorde al tipo" +
                    "de datos");

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println(e.getClass());
            e.printStackTrace();
        } finally {
            sc.close();
        }

    }
}
