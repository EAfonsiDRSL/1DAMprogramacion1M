package PracticaProg;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el tamaño de la lista");
        int tamanyo = sc.nextInt();

        String [] lista_compra = new String[tamanyo];
        int opcion;


        do {
            System.out.println("Introduzca una opción");
            System.out.println("0.-Salir");
            System.out.println("1.-Hacer lista de la compra");
            System.out.println("2.-Numero de items de la compra");
            System.out.println("3.-Imprimir lista de la compra");
            System.out.println("4.- Comprobar si existe elemento y en qué posición de la lista está");
            System.out.println("5.- Comprobar  número de veces que se repite un producto en la lista de la compra introducido por teclado");
            System.out.println("6.-Número de vocales en un producto introducido por teclado");
            System.out.println("7.Eliminar el producto introducido por teclado de la lista si está en lista");
            System.out.println("8.Insertar un nuevo producto en la lista");
            System.out.println(".......");
            opcion = sc.nextInt();

        switch (opcion) {
            case 1: lista_compra= hacer_lista(lista_compra);break;
            case 2: int numero_items = elementos_lista(lista_compra);
                     System.out.println("El número de elementos es"+numero_items);
                     break;
            case 3: imprimir_lista(lista_compra);break;
            case 4:  String elemento;
                     System.out.println("introduzca el elmento que quiere buscar");
                     elemento=sc.next();
                     comprobar_elemento(lista_compra,elemento);
                     break;
            case 5:System.out.println("introduzca el elmento que quiere buscar");
                    elemento=sc.next();
                    int numero_veces=0;
                    numero_veces=comprobar_numeroveces(lista_compra,elemento);break;
            case 6:   System.out.println("introduzca el elmento que quiere buscar");
                      elemento=sc.next();
                      comprobar_vocales(elemento,comprobar_numeroveces(lista_compra,elemento));
            case 7: System.out.println("introduzca el elmento que quiere borrar");
                    String producto_eliminar = sc.next();
                    String[] lista_compra_nueva_eliminado = new String[tamanyo--];
                    borrar(lista_compra,lista_compra_nueva_eliminado,producto_eliminar);
                    imprimir_lista(lista_compra_nueva_eliminado);
                    break;
            case 8: System.out.println("introduzca el elmento que quiere insertar");
                    String nuevo_producto = sc.next();
                    String[] lista_compra_nueva = new String[tamanyo++];
                    insertar(lista_compra,lista_compra_nueva,nuevo_producto);
                    imprimir_lista(lista_compra_nueva);
                    break;
        }
        } while (opcion!=0);



}

    private static void borrar(String[] lista_compra, String[] lista_compra_nueva_eliminado, String producto_eliminar) {

        int posicion=Arrays.binarySearch(lista_compra,producto_eliminar);
        if (posicion<-1){
            System.out.println("no hay ese producto en la lista. Por lo que no se puede eliminar");
        }
        else{
            System.arraycopy(lista_compra,0,lista_compra_nueva_eliminado,0,posicion--);
            System.arraycopy(lista_compra,posicion++,lista_compra_nueva_eliminado,posicion,lista_compra.length-(posicion+1));
        }


    }

    private static String[] insertar(String[] lista_compra, String[] lista_compra_nueva, String nuevo_producto) {

          System.arraycopy(lista_compra,0,lista_compra_nueva,0,lista_compra.length);
          lista_compra_nueva[lista_compra_nueva.length-1]= nuevo_producto;
          return lista_compra_nueva;
    }


    private static void comprobar_vocales(String elemento, int comprobar_numeroveces) {
        char[] array_char = elemento.toCharArray();
        int contadora=0,contadore=0,contadori=0,contadoro=0,contadoru=0;
        for (int i=0;i<array_char.length;i++){
            switch (array_char[i]){
                case 'a': contadora++;break;
                case 'e': contadore++;break;
                case 'i': contadori++;break;
                case 'o': contadoro++;break;
                case 'u': contadoru++;break;
            }
        }
        System.out.println("La palabra "+elemento+" tiene las siguientes vocales");
        System.out.println("a--> " + contadora);
        System.out.println("e--> " + contadore);
        System.out.println("i--> " + contadori);
        System.out.println("o--> " + contadoro);
        System.out.println("u--> " + contadoru);

    }

    private static int comprobar_numeroveces(String[] lista_compra, String elemento) {
        int numeroveces=0;
        for (int i=0;i<lista_compra.length;i++){
            if (lista_compra[i].equals(elemento)){
                numeroveces++;
            }
        }
        return numeroveces;
    }

    private static void comprobar_elemento(String[] lista_compra,String elemento) {
        int posicion=Arrays.binarySearch(lista_compra,elemento);
        if (posicion<-1){
          System.out.println("no hay ese producto en la lista");
        }
        else{
            System.out.println("Elemento encontrado en posición"+posicion++);

        }


    }

    private static int elementos_lista(String[] lista_compra) {
        return lista_compra.length;
    }

    private static void imprimir_lista(String[] lista_compra) {
       System.out.print(Arrays.toString(lista_compra));
    }

    private static String[] hacer_lista(String[] lista_compra) {
        String [] lista = new String[lista_compra.length];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<lista.length;i++){
            System.out.println("Introduzca el elemento");
             lista[i]=sc.next();
        }
        return lista;
    }
}
