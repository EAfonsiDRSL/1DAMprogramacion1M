package PreparacionExamen.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LongitudIncorrecta, ContraseñaIncorrecta {
        //preguntar el tamaño del array que almacenará los objetos de la clase password

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca el tamaño que quiere que tenga el array contraseña");
            int tamanyo = sc.nextInt();


            Password[] listado_contrasenya = new Password[tamanyo];
            boolean[] fortaleza_contrasenya = new boolean[tamanyo];

            for (int i = 0; i < listado_contrasenya.length; i++) {
                System.out.println("introduzca la longitud que tendra la contraseña");
                int longitud = sc.nextInt();
                listado_contrasenya[i] = new Password(longitud);
                fortaleza_contrasenya[i] = listado_contrasenya[i].esFuerte();
                System.out.println("contraseña " + listado_contrasenya[i].getContrasenya() + " fortaleza " + fortaleza_contrasenya[i]);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
