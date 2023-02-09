package Persona.Viajero;

import java.util.Scanner;

public class UsoViajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Viajero viajero1 = new Viajero();
        Viajero viajero2 = new Viajero("12345678X","Elena","lopez","española","loranca");
        System.out.println("Introduzcame su dni");
        String dni = sc.nextLine();
        System.out.println("Introduzcame su nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduzcame sus apellidos");
        String apellido = sc.nextLine();
        System.out.println("Introduzcame su nacionalidad");
        String nacionalidad = sc.nextLine();
        System.out.println("Introduzcame su direccion");
        String direccion = sc.nextLine();

        Viajero viajero3 = new Viajero(dni,nombre,apellido,nacionalidad,direccion);
        Viajero viajero4 = new Viajero();
        System.out.println("Introduzcame su dni");
        System.out.println(viajero4.getDNI());
        System.out.println("Introduzcame su nombre");
        System.out.println(viajero4.getNombre());
        System.out.println("Introduzcame sus apellidos");
        System.out.println(viajero4.getApellidos());
        System.out.println("Introduzcame su nacionalidad");
        System.out.println(viajero4.getNacionalidad());
        System.out.println("Introduzcame su direccion");
        System.out.println(viajero4.getDireccion());

        System.out.println("Informacion del viajero 1");
        System.out.println("DNI: "+viajero1.getDNI());
        System.out.println("Nombre: "+viajero1.getNombre());
        System.out.println("Apellidos: "+viajero1.getApellidos());
        System.out.println("Nacionalidad: "+viajero1.getNacionalidad());
        System.out.println("Direccion: "+viajero1.getDireccion());

        System.out.println("Cuál es el formato de impresion para el viajero 2");
        Formato formato = Formato.valueOf(sc.next().toLowerCase());
        viajero2.getInfo(formato);

        System.out.println("Cuál es el formato de impresion para el viajero 3");
        Formato formato2 = Formato.valueOf(sc.next().toLowerCase());
        viajero3.getInfo(formato2);

        System.out.println("Cuál es el formato de impresion para el viajero 4");
        Formato formato3 = Formato.valueOf(sc.next().toLowerCase());
        viajero4.getInfo(formato3);

    }
}
