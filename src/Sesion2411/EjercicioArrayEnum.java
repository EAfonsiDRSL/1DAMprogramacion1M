package Sesion2411;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrayEnum {
    public static void main(String[] args) {

        int opciones =0;
        Scanner sc = new Scanner(System.in);
        Asignaturas asig = null;

        int [][]notas=new int [2][3];
        for (int I=0;I<notas.length;I++) {

            for (int J = 0; J < notas[I].length; J++) {

               if (I==0){

                   switch (J){
                       case 0: System.out.println("Pon la práctica primera de "+Asignaturas.PROGRAMACION);notas[I][J]=sc.nextInt();break;
                       case 1: System.out.println("Pon la práctica segunda de "+Asignaturas.PROGRAMACION);notas[I][J]=sc.nextInt();break;
                       case 2: System.out.println("Pon la nota del examen de "+Asignaturas.PROGRAMACION);  notas[I][J]=sc.nextInt();break;
                   }

               }


                if (I==1){

                    switch (J){
                        case 0: System.out.println("Pon la práctica primera de "+Asignaturas.BBDD);notas[I][J]=sc.nextInt();break;
                        case 1: System.out.println("Pon la práctica segunda de "+Asignaturas.BBDD);notas[I][J]=sc.nextInt();break;
                        case 2: System.out.println("Pon la nota del examen de "+Asignaturas.BBDD);notas[I][J]=sc.nextInt();break;
                    }

                }

            }
        }
        System.out.println("Que desea saber");
        System.out.println("1-Nota media de una asignatura");
        System.out.println("2-Nota media de ambas asignaturas");

        System.out.println("Introduzca una opcion");
        opciones = sc.nextInt();

        if (opciones == 1){
            System.out.println("¿De que asignatura desea saber la nota media?");
            System.out.println("1-"+Asignaturas.PROGRAMACION);
            System.out.println("2-"+Asignaturas.BBDD);

            opciones = sc.nextInt();
            Notas not = null;

            if (opciones == 1){
                double media_practicas;
                media_practicas = (notas [0][0] + notas [0][1])*0.5;
                double media;
                media= (media_practicas + notas [0][2])/2;
                System.out.println("Su media de "+Asignaturas.PROGRAMACION+" es de "+media);
                    if (media >= 0 && media <=4.99){
                        System.out.println(not.INSUFICIENTE);
                    } else if (media >=5 && media <=5.99) {
                        System.out.println(not.SUFICIENTE);
                    } else if (media >=6 && media <=6.99) {
                        System.out.println(not.BIEN);
                    } else if (media >=7 && media <= 8.99) {
                        System.out.println(not.NOTABLE);
                    } else if (media >=9 && media<=10) {
                        System.out.println(not.SOBRESALIENTE);
                    }

            } else if (opciones == 2) {
                double media_practicas;
                media_practicas = (notas [1][0] + notas [1][1])*0.5;
                double media;
                media= (media_practicas + notas [1][2])/2;
                System.out.println("Su media de "+Asignaturas.BBDD+" es de "+media);
            }
        } else if (opciones == 2) {
            

        }


    }
}
