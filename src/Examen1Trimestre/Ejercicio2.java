package Examen1Trimestre;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String [][] comunidad = new String[3][2];
        String nombre="";
        Scanner sc = new Scanner(System.in);
        comunidad = inicializar(comunidad);
        imprimir(comunidad);
        cuotas_comunidad();

        System.out.println("Introduzcame el nombre que quieres buscar en el edificio");
        nombre= sc.next().toUpperCase();
        buscar_vecino(comunidad,nombre);





    }

    private static void buscar_vecino(String[][] comunidad, String nombre) {
        int contador = 0 ;
        for ( int i = 0 ; i < comunidad.length ; i++){
            for ( int j = 0 ; j < comunidad[i].length ; j++){

                if (comunidad[i][j].equals(nombre)){
                contador++;
                }
            }
        }
        if (contador==0){
            System.out.println("No hay ninguno vecino llamado "+nombre);
        }
        else {
            System.out.println("El numero de vecinos llamados "+nombre+" es "+contador);
        }




    }


    private static void cuotas_comunidad() {
        final double CUOTA_PRIMERO=50.25;
        final double CUOTA_SEGUNDO=78.15;
        final double CUOTA_TERCERO=96.4;

        double total = 2*CUOTA_PRIMERO + 2*CUOTA_SEGUNDO + 2*CUOTA_TERCERO;
        System.out.println("La comunidad paga en cuotal un total de "+total);
    }

    private static void imprimir (String[][] comunidad){

        for ( int i = 0 ; i < comunidad.length ; i++){
            for ( int j = 0 ; j < comunidad[i].length ; j++){

                if ( i == 0 ){
                    switch (j){
                        case 0:
                            System.out.println("El nombre del propietario "+Ordinales.primero+" A es "+comunidad[i][j]);break;
                        case 1:
                            System.out.println("El nombre del propietario "+Ordinales.primero+" B es "+comunidad[i][j]);break;
                    }

                }
                if ( i == 1 ){
                    switch (j){
                        case 0:
                            System.out.println("El nombre del propietario "+Ordinales.segundo+" A es "+comunidad[i][j]);break;

                        case 1:
                            System.out.println("El nombre del propietario "+Ordinales.segundo+" B es "+comunidad[i][j]);break;
                    }

                }
                if ( i == 2 ){
                    switch (j){
                        case 0:
                            System.out.println("El nombre del propietario "+Ordinales.tercero+" A es "+comunidad[i][j]);break;
                        case 1:
                            System.out.println("El nombre del propietario "+Ordinales.tercero+" B es "+comunidad[i][j]);break;
                    }

                }
            }
        }
    }

    private static String [][] inicializar (String [][] comunidad) {
        Scanner sc = new Scanner(System.in);
        for ( int i = 0 ; i < comunidad.length ; i++){
            for ( int j = 0 ; j < comunidad[i].length ; j++){

                if ( i == 0 ){
                    switch (j){
                        case 0:
                            System.out.println("El nombre del propietario "+Ordinales.primero+" A");
                            comunidad[i][j] = sc.next().toUpperCase(); break;
                        case 1:
                            System.out.println("El nombre del propietario "+Ordinales.primero+" B");
                            comunidad[i][j] = sc.next().toUpperCase(); break;
                    }

                }
                if ( i == 1 ){
                    switch (j){
                        case 0:
                            System.out.println("El nombre del propietario "+Ordinales.segundo+" A");
                            comunidad[i][j] = sc.next().toUpperCase(); break;

                        case 1:
                            System.out.println("El nombre del propietario "+Ordinales.segundo+" B");
                            comunidad[i][j] = sc.next().toUpperCase(); break;
                    }

                }
                if ( i == 2 ){
                    switch (j){
                        case 0:
                            System.out.println("El nombre del propietario "+Ordinales.tercero+" A");
                            comunidad[i][j] = sc.next().toUpperCase(); break;
                        case 1:
                            System.out.println("El nombre del propietario "+Ordinales.tercero+" B");
                            comunidad[i][j] = sc.next().toUpperCase(); break;
                    }

                }
            }
        }


        return comunidad;
    }
}
