package Sesion1710.Bucles;
/*
mostrar numero del 320 al 160 de 20 en 20 hacia atras
usar bucle 'do while'
 */
public class Ejercicio6Bucles {
    public static void main(String[] args) {
        int i=320;
        do {
            System.out.println(i);
            i -=20;
        }while (i>=160);
    }
}
