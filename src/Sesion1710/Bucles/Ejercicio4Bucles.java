package Sesion1710.Bucles;
/*
mostrar numero del 320 al 160 de 20 en 20 hacia atras
usar bucle 'for'
 */

public class Ejercicio4Bucles {
    public static void main(String[] args) {
        final int NUM1=320;
        final int NUM2=160;
        final int DECREMENTO=20;
        for(int i=NUM1;i>=NUM2;i-=DECREMENTO){
            System.out.println(i);
        }
    }
}
