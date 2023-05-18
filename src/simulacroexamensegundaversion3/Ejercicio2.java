package simulacroexamensegundaversion3;

import java.util.Scanner;

public class Ejercicio2 {
    static Scanner sc = new Scanner(System.in);
    static double [][] notas = null;
    public static void main(String[] args) {
        int opcion = 0;


        do {
            System.out.println("0. Salir");
            System.out.println("1. Crear array de notas");
            System.out.println("2. Rellenar array de notas");
            System.out.println("3. Nota media por asignatura " +
                    "1. -Programacion " +
                    "2. -Base de datos" +
                    "3. -Entornos de Desarrollo");
            System.out.println("4. Nota media de todas las asignaturas");
            System.out.println("Introduzca una opción .....");

            opcion = sc.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar el programa");break;
                case 1:
                    crear_array();break;
            }

        }while (opcion != 0);
    }

    private static void crear_array() {

        notas = new double[3][2];

    }
}
