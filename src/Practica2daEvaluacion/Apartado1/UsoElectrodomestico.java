package Practica2daEvaluacion.Apartado1;

import Practica2daEvaluacion.Apartado1.ProductoIncorrecto;
import Practica2daEvaluacion.Apartado1.Television;

import java.util.Scanner;

public class UsoElectrodomestico {
    public static void main(String[] args) {


        Electrodomestico [] lista_electrodomesticos = new Electrodomestico[5];


        Television television1=new Television(200,5,50,true);
        Television television2=new Television(35,25,50,true);
        Television television3=new Television(15,60,50,true);

        Lavadora lavadora1=new Lavadora(55,60,35);
        Lavadora lavadora2=new Lavadora(300,85,50);

        lista_electrodomesticos[0]=television1;
        lista_electrodomesticos[1]=television2;
        lista_electrodomesticos[2]=television3;
        lista_electrodomesticos[3]=lavadora1;
        lista_electrodomesticos[4]=lavadora2;


        double precio_televisiones=0;
        double precio_lavadoras=0;
        double precio_total=0;

        for (int i = 0; i< lista_electrodomesticos.length ; i++){
            System.out.println("El electrodomestico "+lista_electrodomesticos[i].getClass().getSimpleName()+
                    " tiene un precio final "+lista_electrodomesticos[i].getPrecio_final()+" €");
            if (lista_electrodomesticos[i] instanceof Lavadora){
                precio_lavadoras+=lista_electrodomesticos[i].getPrecio_final();
            } else if (lista_electrodomesticos[i] instanceof Television) {
                precio_televisiones+=lista_electrodomesticos[i].getPrecio_final();
            }
            precio_total=precio_lavadoras+precio_televisiones;
        }
        System.out.println("El precio final de todas las lavadoras es "+precio_lavadoras);
        System.out.println("El precio final de todas la televiones es "+precio_televisiones);
        System.out.println("El precio final es de "+precio_total);


    }
}
