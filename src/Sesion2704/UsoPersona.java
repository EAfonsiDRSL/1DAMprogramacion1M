package Sesion2704;

import java.util.ArrayList;
import java.util.Scanner;

public class UsoPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion= 0;


        ArrayList<Persona>listado_personas=new ArrayList<>();

        do {

            System.out.println("0. Salir del menú");
            System.out.println("1. Registrar una persona en el listado");
            System.out.println("2. Buscar una persona ya registrada por dni");
            System.out.println("3. Eliminar una persona del listado");
            System.out.println("4. Ordenar po apellidos y mostrar los datos de la persona");
            System.out.println("5. Mostrar todas las personas");
            opcion=sc.nextInt();
        }while (opcion !=0);

    }
}
