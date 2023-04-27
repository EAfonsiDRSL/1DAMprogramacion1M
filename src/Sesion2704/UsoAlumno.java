package Sesion2704;

import java.util.ArrayList;
import java.util.Comparator;

public class UsoAlumno {
    public static void main(String[] args) {

        //arraylist
        ArrayList<alumnos>listado_alumnos = new ArrayList<>();

        //Crear alumnos
        alumnos alumno1 = new alumnos("Eliot",5.8);
        alumnos alumno2 = new alumnos("Pepe",10);


        listado_alumnos.add(alumno1);
        listado_alumnos.add(alumno2);
        listado_alumnos.add(new alumnos("Moha",7));
        listado_alumnos.add(new alumnos("Carasa",8));
        listado_alumnos.add(new alumnos("Gallego",2));

        System.out.println("Ordenacion por orden alfabetico del nombre ascendente");
        listado_alumnos.sort(Comparator.comparing(alumnos::getNombre));
        System.out.println(listado_alumnos.toString());
        System.out.println("Ordenacion por orden alfabetico del nombre descendente");
        listado_alumnos.sort(Comparator.comparing(alumnos::getNombre).reversed());
        System.out.println(listado_alumnos.toString());
        System.out.println("Ordenacion por méritos de forma ascendente");
        listado_alumnos.sort(Comparator.comparing(alumnos::getNota));
        System.out.println(listado_alumnos.toString());
        System.out.println("Ordenacion por méritos de forma descendente");
        listado_alumnos.sort(Comparator.comparing(alumnos::getNota).reversed());
        System.out.println(listado_alumnos.toString());
        System.out.println("Ordenacion por nombre y notas de forma ascendente");
        listado_alumnos.sort(Comparator.comparing(alumnos::getNombre).thenComparing(alumnos::getNota));
        System.out.println(listado_alumnos.toString());
        System.out.println("Ordenacion por nombre ascendente y notas de forma descendente");
        listado_alumnos.sort(Comparator.comparing(alumnos::getNombre).reversed().thenComparing(alumnos::getNota));
        System.out.println(listado_alumnos.toString());

    }
}
