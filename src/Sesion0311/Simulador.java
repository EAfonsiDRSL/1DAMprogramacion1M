package Sesion0311;

import java.util.Scanner;

public class Simulador {



    public static void main(String[] args) {
        String operacion=" ";
        Calculadora calc= new Calculadora();
        Scanner sc=new Scanner(System.in);
        System.out.println("¿que operacion desea realizar?");
        System.out.println("suma");
        System.out.println("resta");
        System.out.println("multiplicacion");
        System.out.println("division");

        operacion=sc.next();

        if (operacion.equals("suma")){
        //    calc.division();



        }else {
            System.out.println("j");}

    }
}
