package Sesion0202;

import java.util.Scanner;

public class UsoPlaneta {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del planeta");
        String nombre = sc.next();
        System.out.println("Diga el numero de satelites que tiene ");
        int satelite = sc.nextInt();
        System.out.println("Indique la masa del planeta");
        double masa = sc.nextDouble();
        System.out.println("Indique el volumen del planeta");
        double volumen = sc.nextDouble();
        System.out.println("Indique el diametro");
        int diametro = sc.nextInt();
        System.out.println("Indique la distancia del planeta al sol");
        int distancia = sc.nextInt();
        System.out.println("Indique el tipo de planeta");
        System.out.println("--Gaseoso");
        System.out.println("--Enano");
        System.out.println("--Terrestre");
        TipoPlaneta tipo = TipoPlaneta.valueOf(sc.next().toUpperCase());
        System.out.println("Indique si es observable a simple vista o no: s-n");
        char opcion = sc.next().toUpperCase().charAt(0);
            boolean observable=false;
            if (opcion=='s'){
                observable=true;
            }

        Planetas planeta1 = new Planetas(nombre, satelite,masa,volumen,diametro,distancia,tipo,observable);

        planeta1.imprimir();
        System.out.println(planeta1.toString());
        System.out.println("La densidad del planeta es "+planeta1.calculo_densidad());
        planeta1.exterior();





        System.out.println("Introduzca el nombre del planeta 2");
        String nom2 = sc.next();
        System.out.println("Diga el numero de satelites que tiene ");
        int sat2 = sc.nextInt();
        System.out.println("Indique la masa del planeta");
        double mas2= sc.nextDouble();
        System.out.println("Indique el volumen del planeta");
        double vol2 = sc.nextDouble();
        System.out.println("Indique el diametro");
        int dia2 = sc.nextInt();
        System.out.println("Indique la distancia del planeta al sol");
        int dis2 = sc.nextInt();
        System.out.println("Indique el tipo de planeta");
        System.out.println("--Gaseoso");
        System.out.println("--Enano");
        System.out.println("--Terrestre");
        TipoPlaneta tip2 = TipoPlaneta.valueOf(sc.next().toUpperCase());
        System.out.println("Indique si es observable a simple vista o no");
        boolean obs2 = sc.nextBoolean();

        Planetas planeta2 = new Planetas(nom2,sat2,mas2,vol2,dia2,dis2,tip2,obs2);

        planeta2.imprimir();
        System.out.println("La densidad del planeta es "+planeta2.calculo_densidad());
        planeta2.exterior();
    }

}
