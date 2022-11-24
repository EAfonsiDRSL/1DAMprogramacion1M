package Sesion2411;

import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {


        int valor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un valor del 1 al 7");
        valor = sc.nextInt();
        UsoDiasSemana dia = null;
        switch (valor){
            case 1:
                System.out.println("Es "+dia.LUNES);break;
            case 2:
                System.out.println("Es "+dia.MARTES);break;
            case 3:
                System.out.println("Es "+dia.MIERCOLES);break;
            case 4:
                System.out.println("Es "+dia.JUEVES);break;
            case 5:
                System.out.println("Es "+dia.VIERNES);break;
            case 6:
                System.out.println("Es "+dia.SABADO);break;
            case 7:
                System.out.println("Es "+dia.DOMINGO);break;
            default:
                System.out.println("El valor introuducido no es correcto");
        }


    }
}
