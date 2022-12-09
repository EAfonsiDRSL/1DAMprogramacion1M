package Sesion2811;

import java.util.Scanner;

public class Metodos5 {
    public static void main(String[] args) {


        double euro = 0;
        String opcion = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de euros a cambiar");
        euro = sc.nextDouble();

        System.out.println("Elija a que moneda desea cambiar");
        System.out.println("Libras");
        System.out.println("Dolares");
        System.out.println("Yenes");



            opcion = sc.next().toUpperCase();
        conversor(euro,opcion);




    }
    private static void conversor (double euros,String opcion) {
        final double YEN = 129.852;
        final double LIBRAS = 0.86;
        final double DOLAR = 1.28611;




         double resultado;

        if (opcion.equals("LIBRAS")){
            resultado = euros * LIBRAS;
            System.out.println("La cantidad de "+opcion+" es " + resultado);
        } else if (opcion.equals("DOLARES")) {
            resultado = euros * DOLAR;

            System.out.println("La cantidad de " +opcion+" es " + resultado);

        } else if (opcion.equals("YENES")) {
            resultado = euros * YEN;

            System.out.println("La cantidad de "+opcion+" es " + resultado);

        }





    }
}
