package Sesion2202.Cuenta;

import Sesion2202.Cuenta.Cuenta;

import java.util.Scanner;

public class UsoCuenta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double dinero=0;
        try{

        Cuenta cuenta1 = new Cuenta("Eliot","ES3293424248",98.32);

        System.out.println(cuenta1.toString());

            System.out.println("¿Cual es la cantidad que desea ingresar?");
            dinero = sc.nextDouble();
            cuenta1.ingresar(dinero);

            System.out.println("¿Cuanto dinero va a retirar?");
            dinero = sc.nextDouble();
            cuenta1.retirar(dinero);
        }
        catch (CantidadIncorrecta e){
            System.out.println(e.getMessage());
        }

    }
}
