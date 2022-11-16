package Sesion1611;

import java.util.Arrays;
import java.util.Scanner;

public class SimulacionBinarySearch {




    public static void main(String[] args) {


        String [] lista={"Mark", "Elias", "Yassin"};
        String [] lista2=new String[3];
        int posicion=-1;
        String busca;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué nombre quieres buscar?");
        busca = sc.next();
        posicion = buscar(lista, busca);
        imprimir(posicion,busca,lista);
        lista2=lista.clone();
        System.out.println("SimulacionBinarySearch.main");




    }

    private static void imprimir(int posicion, String nombre, String[] list) {
        System.out.println("El array introducido es "+ Arrays.toString(list));
        if (posicion==-1){
            System.out.println("el elemento que buscabas "+nombre+" no esta");
        }else {
            System.out.println("el elemento "+nombre+" que buscabas esta el la posicion "+posicion);
        }


    }

    private static int buscar(String[] lista, String busca) {
        int posicion=-1;
        for (int i = 0; i < lista.length; i++){
            if (busca.equals(lista[i]))
            {
                posicion=i;
            }

        }

        return posicion;
    }


}
