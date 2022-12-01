package Sesion2811;

import java.util.Scanner;

public class Metodos4 {
    public static void main(String[] args) {
        double radio = 0;
        double base = 0;
        double altura = 0;
        double lado = 0;
        double area = 0;
        String opcion="";
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que area desea calcular?");

        System.out.println("1- circulo");
        System.out.println("2- triangulo");
        System.out.println("3- cuadrado");

        System.out.println("Introduzca su opcion");

        opcion = sc.next().toLowerCase();

        if (opcion.equals("circulo")){
            System.out.println("Introduzca el radio del "+opcion);
            radio = sc.nextDouble();

            System.out.println("El área del "+opcion+" es "+circulo(radio)+" metros cuadrados");
        } else if (opcion.equals("triangulo")) {
            System.out.println("Introduzca la base del "+opcion);
            base = sc.nextDouble();
            System.out.println("Introduzca la altura del "+opcion);
            altura = sc.nextDouble();
            System.out.println("El área del "+opcion+" es "+triangulo(base,altura)+" metros cuadrados");


        } else if (opcion.equals("cuadrado")) {
            System.out.println("Introduzca el lado del "+opcion);
            lado = sc.nextDouble();
            System.out.println("El área del "+opcion+" es "+cuadrado(lado)+" metros cuadrados");

        }


    }
    private static double circulo(double radio){
        double circulo=0;




        circulo = Math.pow(radio,2)*Math.PI;


        return circulo;


    }
    private static double triangulo(double base, double altura){
        double triangulo = 0;





        triangulo = (base*altura)/2;

        return triangulo;



    }
    private static double cuadrado(double lado){
        double cuadrado =0;

        cuadrado = lado*lado;

        return cuadrado;

    }
}
