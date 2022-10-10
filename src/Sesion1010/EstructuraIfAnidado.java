package Sesion1010;

import java.util.Scanner;

/*programa que dado una edad nos indica en que etapa educativa estamos
* Educacion Infantil 0-5 años
* Educacion Primaria 6-12 años
* Educacion Secundaria 13-17 años
* Educacion Universitaria y FP de 18 en adelante
* */
public class EstructuraIfAnidado {
    public static void main(String[] args) {
        //declaracion e inicializacion de variables

        int edad=0;

        //solicitud y lectura de la edad
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la edad, porfavor");
        edad = sc.nextInt();


        // determinar a que etapa educativa estoy mediante el uso de if anidados

        if (edad>=0 && edad<=5){
            System.out.println("Educacion infantil");
        }
        else if (edad>=6 && edad<=12) {
            System.out.println("Educacion primaria");
        }
        else if (edad>=13 && edad<=17) {
            System.out.println("Educacion secundaria");

        } else if (edad>=18) {
            System.out.println("Educacion universitaria y FP");

        }

    }
}
