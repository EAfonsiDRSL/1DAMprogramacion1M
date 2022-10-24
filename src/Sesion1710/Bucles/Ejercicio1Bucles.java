package Sesion1710.Bucles;
/*
Mostrar multiplos de 5 de 0 a 100
usar 'for'
 */

public class Ejercicio1Bucles {
    public static void main(String[] args) {
        final int MAX=100;
        for (int i=0;i<=MAX;i++ ){

            if (i%5==0){
            System.out.println(i);
            }
        }

    }
}
