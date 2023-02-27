package Practica2daEvaluacion.Apartado1;

import Practica2daEvaluacion.Apartado1.ProductoIncorrecto;
import Practica2daEvaluacion.Apartado1.Television;

import java.util.Scanner;

public class UsoElectrodomestico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] electrodomesticos = new String[5];



        try {
        for (int i =0; i< electrodomesticos.length ; i++){
            System.out.println("Introduzca el electrodomestico " + (i+1));
           electrodomesticos[i]=sc.next();
        }

        for (int i = 0 ; i < electrodomesticos.length ; i++){
            System.out.println("Introduzca el precio base de "+electrodomesticos[i]);
            sc.nextInt();






        }
            Television television1 = new Television();


            System.out.println(television1.toString());
            television1.comprobarColor("negro");
        }catch (ProductoIncorrecto p) {
            System.out.println(p.getMessage());
        }

    }
}
