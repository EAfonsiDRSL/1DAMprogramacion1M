package Sesion2411;

import java.util.Scanner;

public class EjercicioArrayEnum {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Asignaturas asig = null;

        int [][]notas=new int [2][3];
        for (int I=0;I<notas.length;I++){
            for (int J=0;J<notas[I].length;J++){
                System.out.println("Introduzca un numero");
                notas[I][J]=sc.nextInt();
            }
        }



    }
}
