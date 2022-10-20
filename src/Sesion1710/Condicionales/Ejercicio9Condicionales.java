package Sesion1710.Condicionales;
/*
Programa que resuelva ec de 2do grado
ax2+bx+c=0
formula = (-b+-raiz2(b2 - 4 *a*c))/2

 */

import java.util.Scanner;

public class Ejercicio9Condicionales {
    public static void main(String[] args) {
        //declaracion e inicializacion de variables
        double a=0,b=0,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Para resolver ecuaciones de segundo grado necesitamos los valores de \'a\', \'b\' y \'c\'");
        System.out.println("Introduzca el valor de \'a\'");
        a=sc.nextFloat();
        System.out.println("Introduzca el valor de \'b\'");
        b=sc.nextFloat();
        System.out.println("Introduzca el valor de \'c\'");
        c=sc.nextFloat();
        double d= Math.pow(b,2)-(4*a*c);
        double x1= -b+d;
        double x2= -b-d;
        double denominador= 2*a;
        if (a==0){
            System.out.println("\033[91mError, el denominador no puede ser igual a 0");}
        else if (d<0) {
            System.out.println("\033[91mError, las raices cuadradas no pueden ser negativas");
        }else {
            System.out.println("El primer resultado es "+x1/denominador);
            System.out.println("El segundo resultado es "+x2/denominador);}

    }
}
