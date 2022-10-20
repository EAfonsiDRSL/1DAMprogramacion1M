package Sesion1710.Bucles;
/*
Mostrar multiplos de 5 de 0 a 100
usar 'while'
 */

public class Ejercicio2Bucles {
    public static void main(String[] args) {
        int numero=0;
        if (numero>100){
            System.out.println("Numero mayor que 100");}
        while (numero<=100){
            System.out.println(numero);
            numero +=5;
        }
    }
}
