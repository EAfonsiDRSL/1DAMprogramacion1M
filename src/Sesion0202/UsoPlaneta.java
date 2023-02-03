package Sesion0202;

import java.util.Scanner;

public class UsoPlaneta {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del planeta");
        String nom = sc.next();
        System.out.println("Diga el numero de satelites que tiene ");
        int sat = sc.nextInt();
        System.out.println("Indique la masa del planeta");
        double mas = sc.nextDouble();
        System.out.println("Indique el volumen del planeta");
        double vol = sc.nextDouble();
        System.out.println("Indique el diametro");
        int dia = sc.nextInt();
        System.out.println("Indique la distancia del planeta al sol");
        int dis = sc.nextInt();
        System.out.println("Indique el tipo de planeta");
        System.out.println("--Gaseoso");
        System.out.println("--Enano");
        System.out.println("--Terrestre");
        TipoPlaneta tip = TipoPlaneta.valueOf(sc.next().toUpperCase());
        System.out.println("Indique si es observable a simple vista o no");
        boolean obs = sc.nextBoolean();


        Planetas planeta1 = new Planetas(nom,sat,mas,vol,dia,dis,tip,obs);



        planeta1.imprimir();
        System.out.println("La densidad del planeta es "+planeta1.calculo_densidad(mas,vol));
        planeta1.exterior(dis);



        Planetas planeta2 = new Planetas();





    }

}
