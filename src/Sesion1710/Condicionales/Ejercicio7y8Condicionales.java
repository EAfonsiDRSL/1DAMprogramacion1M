package Sesion1710.Condicionales;

import java.util.Scanner;

public class Ejercicio7y8Condicionales {
    public static void main(String[] args) {
        //declarar e inicializar variables
        float nota1=0, nota2=0, nota3=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la primera nota");
        nota1 = sc.nextFloat();
        System.out.println("Introduzca la segunda nota");
        nota2 = sc.nextFloat();
        System.out.println("Introduzca la tercera nota");
        nota3 = sc.nextFloat();
        float media = (nota1+nota2+nota3)/3;
        if (nota1<0|nota2<0|nota3<0) {
            System.out.println("Porfavor introduzca un valor correcto");
        }else if (nota1>10|nota2>10|nota3>10){
            System.out.println("Introduzca un valor entre el 0 y el 10");
        }else {
            System.out.print("Su nota media es "+media );}
        if (media>=0&&media<=4.99){
            System.out.print(" insuficiente");}
        else if (media>=5&&media<=5.99){
            System.out.print(" suficiente");}
        else if (media>=6&&media<=6.99){
            System.out.print(" bien");}
        else if (media>=7&&media<=8.99){
            System.out.print(" notable");}
        else if (media>=9&&media<=10){
            System.out.print(" sobresaliente");}
    }

    }

