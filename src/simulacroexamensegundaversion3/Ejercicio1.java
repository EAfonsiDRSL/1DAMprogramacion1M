package simulacroexamensegundaversion3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int opcion = 0;
        String [] array = null;

        do {
            System.out.println("0. Salir");
            System.out.println("1. Crear array de Strings");
            System.out.println("2. Rellenar array de elementos");
            System.out.println("3. Imprimir array por pantalla");
            System.out.println("4. Ver número de consonantes");
            System.out.println("5. Ver número de vocales");
            System.out.println("Introduzca una opción");

            opcion = sc.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar el programa");break;
                case 1:
                    System.out.println("Introduzca el tamaño que quiere dimensionar el array");
                    int dimension = sc.nextInt();
                      array = crear_array (array , dimension);break;
                case 2:
                    array = rellenar_array(array);break;
                case 3:
                    String resultado = imprimir_array(array);
                    System.out.println(resultado);break;
                case 4:
                    System.out.println("¿Cual posicion quieres consultar? de 0 a "+(array.length-1));
                    int posicion = sc.nextInt();
                    int consonantes = num_consonantes(posicion, array);
                    System.out.println("La palabra "+array[posicion]+" tiene "+consonantes+" consonantes");break;
                case 5:
                    System.out.println("¿Cual posicion quieres consultar? de 0 a "+(array.length-1));
                    posicion = sc.nextInt();
                    int vocales = num_vocales(posicion, array);
                    System.out.println("La palabra "+array[posicion]+" tiene "+vocales+" vocales");break;
            }

        }while (opcion != 0);
    }

    private static int num_vocales(int posicion, String[] array) {
        String palabra = array[posicion];
        int num_vocales = 0;
        for (int i = 0; i< palabra.length();i++){
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u'){
                num_vocales++;
            }
        }
        return num_vocales;
    }

    private static int num_consonantes(int posicion, String[] array) {
        String palabra = array[posicion];
        int num_consonates = 0;
        for (int i = 0; i< palabra.length();i++){
            if (palabra.charAt(i) != 'a' && palabra.charAt(i) != 'e' && palabra.charAt(i) != 'i' && palabra.charAt(i) != 'o' && palabra.charAt(i) != 'u'){
                num_consonates++;
            }
        }

        return num_consonates;
    }

    private static String imprimir_array(String[] array) {

        return Arrays.toString(array);
    }


    private static String[] rellenar_array(String[] array) {

        for (int i = 0; i< array.length; i++){
            System.out.println("Introduzca una palabra en la posicion "+i);
            array [i] = sc.next();
        }
        return array;
    }

    private static String[] crear_array(String[] array, int dimension) {
        array = new String[dimension];
        return array;
    }

}
