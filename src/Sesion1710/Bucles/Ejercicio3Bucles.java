package Sesion1710.Bucles;
/*
Mostrar multiplos de 5 de 0 a 100
usar 'do while'
 */

public class Ejercicio3Bucles {
    public static void main(String[] args) {
        final int NUM=100;
        int numero=0;
        do{
            System.out.println(numero);
            numero +=5;
        }while(numero<=NUM);

    }
}
