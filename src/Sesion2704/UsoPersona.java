package Sesion2704;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class UsoPersona {
    public static ArrayList<Persona>listado_personas=new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int opcion= 0;


        do {

            System.out.println("0. Salir del menú");
            System.out.println("1. Registrar una persona en el listado");
            System.out.println("2. Buscar una persona ya registrada por dni");
            System.out.println("3. Eliminar una persona del listado");
            System.out.println("4. Ordenar po apellidos y mostrar los datos de la persona");
            System.out.println("5. Mostrar todas las personas");

            opcion=sc.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar el programa");break;
                case 1:
                    add();break;
                case 2:
                    System.out.println("Introducir el dni del usuario");
                    String dni = sc.next();
                    buscar(dni);break;
                case 3:
                    dni = sc.next();
                    eliminar(dni);break;
                case 4:
                    ordenar_apellido();break;
                case 5:
                    ordenar_apellido_sexo();break;
                case 6:
                    imprimir();break;
                default:
                    System.out.println("Te has equivocado de opcion");
            }
        }while (opcion !=0);

    }

    private static void ordenar_apellido_sexo() {
        System.out.println("Ordenacion por apellidos y sexo");
        listado_personas.sort(Comparator.comparing(Persona::getApellidos).thenComparing(Persona::getSexo));
        imprimir();
    }

    private static void ordenar_apellido() {
        System.out.println("Ordenacion por apellidos");
        listado_personas.sort(Comparator.comparing(Persona :: getApellidos));
        imprimir();
    }

    private static void eliminar(String dni) {
        for (Persona p: listado_personas)
            if (p.getDni().equals(dni)){
                listado_personas.remove(p);
            }
    }

    private static void imprimir() {
        for (Persona p: listado_personas)
            System.out.println(p.toString());
    }

    private static void add() {
        System.out.println("Introduzca el dni de la persona ");
        String dni = sc.next();
        System.out.println("Introduzca el nombre de la persona");
        String nombre = sc.next();
        System.out.println("Introduzca el apellido de la persona ");
        String apellido = sc.next();
        System.out.println("Introduzca el sexo con H o M ");
        char sexo = sc.next().toUpperCase().charAt(0);
        System.out.println("Introduzca la edad de la persona");
        int edad = sc.nextInt();
        System.out.println("Introduzca el peso de la persona");
        double peso = sc.nextDouble();

        Persona p1 = new Persona(dni,apellido,nombre,sexo,edad,peso);
        listado_personas.add(p1);

    }


    private static void buscar(String dni) {
        boolean esta = false;
        for (Persona p : listado_personas){
            if (p.getDni().equals(dni)){
                esta=true;
                System.out.println("La persona esta");
                break;
            }else {
                System.out.println("El dni introducido no esta en la lista");
            }
        }
    }
}
