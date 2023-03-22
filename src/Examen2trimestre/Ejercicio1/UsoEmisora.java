package Examen2trimestre.Ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class UsoEmisora {
    public static void main(String[] args) throws CreacionInvalida, OpcionInvalida {

        try {
            EmisorasTradicionales emisoraTradicional1 = new EmisorasTradicionales("Los 40", 1993, 5000, 93.9);
            EmisorasTradicionales emisoraTradicional2 = new EmisorasTradicionales("Cadena Dial", 2000, 50000, 540);
            EmisorasTradicionales emisoraTradicional3 = new EmisorasTradicionales("Es Radio", 2005, 1000, 540);

            EmisorasOnline emisorasOnline1 = new EmisorasOnline("RN5 Todo noticias", 1985, 800000, "www.rn5.es");
            EmisorasOnline emisorasOnline2 = new EmisorasOnline("China FM", 2018, 60000, "www.chinafm.es");

            emisoraTradicional1.iniciarEmision();
            emisoraTradicional1.finalizarEmision();


            Emisora[] lista_emisoras = {emisoraTradicional1, emisoraTradicional2, emisoraTradicional3, emisorasOnline1, emisorasOnline2};
            for (int i = 0; i < lista_emisoras.length; i++) {
                System.out.println("La " + lista_emisoras[i].getClass().getSimpleName() + " tiene " + lista_emisoras[i].getNum_oyentes() + " con ganancias de " + lista_emisoras[i].ganancias());
            }

            //forzar las exepciones

            //1. iniciar una emision ya iniciada
            emisoraTradicional1.iniciarEmision();
            emisoraTradicional1.iniciarEmision();
            //2. finalizar una emision ya finalizada
            emisoraTradicional1.finalizarEmision();
            emisoraTradicional1.finalizarEmision();
            //3. El año de creacion de la emisora es menor a 1879
            EmisorasOnline emisorasOnline3 = new EmisorasOnline("China FM", 1500, 60000, "www.chinafm.es");
            //4. Elegir el numero de frecuencia que no esta en ese rango
            EmisorasTradicionales emisoraTradicional4 = new EmisorasTradicionales("Es Radio", 1500, 1000, 200);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}

