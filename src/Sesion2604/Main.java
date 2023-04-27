package Sesion2604;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Double> lista_reales = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion=0;
        double numero = 0;
        double numero_antiguo,numero_nuevo=0;
        int posicion=0;






        do {

            System.out.println("0. Salir del programa");
            System.out.println("1. Agregar un número al arraylist");
            System.out.println("2. Buscar un número en el arrylist");
            System.out.println("3. Modificar un número");
            System.out.println("4. Eliminar un número");
            System.out.println("5. Insertar un número en una posicion dada");
            System.out.println("6. Imprimir array");
            System.out.println(".............................");

            opcion = sc.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar el programa");break;
                case 1:
                    System.out.println("Introduzca el numero que quiere añadir al arraylist");
                    numero = sc.nextDouble();
                    add(numero);
                    break;
                case 2:
                    System.out.println("Introduzca el numero a buscar en el arraylist");
                    numero = sc.nextDouble();
                    buscar(numero);
                    break;
                case 3:
                    System.out.println("Introduzca el numero que quiere modificar en el arrylist");
                    numero_antiguo = sc.nextInt();
                    System.out.println("Introduzca el nuevo valor");
                    numero_nuevo = sc.nextInt();
                    modificar(numero_antiguo, numero_nuevo);
                    break;
                case 4:
                    System.out.println("Introduzca el numero que quiere eliminar del arraylist");
                    numero = sc.nextDouble();
                    eliminar(numero);
                    break;
                case 5:
                    System.out.println("Introduzca el numero a insertar");
                    numero = sc.nextDouble();
                    System.out.println("Indique la posicion en la que quiere insertarlo");
                    posicion = sc.nextInt();
                    add_specific(numero,posicion);
                    break;
                case 6:
                    imprimir_array(lista_reales);
                    break;

            }


        }while (opcion!=0);
    }

    private static void imprimir_array(ArrayList<Double> lista_reales) {

            System.out.println(lista_reales.toString());

    }

    private static void add_specific(double numero, int posicion) {

        lista_reales.set(posicion,numero);


    }

    private static void eliminar(double numero) {

        lista_reales.remove(numero);
        //lista_reales.remove(lista_reales.indexOf(numero));
    }

    private static void modificar(double numero_antiguo, double numero_nuevo) {

        if(lista_reales.contains(numero_antiguo)){
            int posicion = lista_reales.indexOf(numero_antiguo);
            lista_reales.set(posicion,numero_nuevo);
        }
    }

    private static void buscar (double numero) {

            int posicion = lista_reales.indexOf(numero);
            if (posicion != -1){
                System.out.println("Está");
            }else {
                System.out.println("No está");
            }

    }

    private static void add(double numero) {
        lista_reales.add(numero);
    }
}
