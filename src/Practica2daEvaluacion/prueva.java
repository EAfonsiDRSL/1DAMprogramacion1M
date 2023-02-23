package Practica2daEvaluacion;

import java.util.Scanner;

public class prueva {

    public static void main(String[] args) throws ProductoIncorrecto {
        Electrodomestico e=new Electrodomestico(12,0,Color.blancos,'A',44);
        Scanner sc = new Scanner(System.in);
        System.out.println("color");
        Color color = Color.valueOf(sc.next());
        e.comprobarColor(color);
        e.comprobarConsumoEnergetico();
        System.out.println(e.precioFinal());
    }


}
