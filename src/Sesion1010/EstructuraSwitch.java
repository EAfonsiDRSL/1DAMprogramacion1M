package Sesion1010;

import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {

        //declaramos e inicializamos las variables

        int dia=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un valor entre el 1 y el 7");
        dia = sc.nextInt();
        switch (dia){
            case 1: {
                System.out.println("Es lunes");break;}
            case 2: {
                System.out.println("Es martes");break;}
            case 3: {
                System.out.println("Es miercoles");break;}
            case 4: {
                System.out.println("Es jueves");break;}
            case 5: {
                System.out.println("Es viernes");break;}
            case 6: {
                System.out.println("Es sabado");break;}
            case 7: {
                System.out.println("Es domingo");break;}
            default:
                System.out.println("Has introducido un valor invalido");

        }

    }
}
