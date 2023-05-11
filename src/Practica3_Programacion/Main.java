package Practica3_Programacion;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {

        Peliculas peliculas = new Peliculas();

        Pelicula p = null;

        ArrayList<Pelicula> listado_peliculas= new ArrayList<>();

        int opcion = 0;
        do {

            System.out.println("0. Salir del programa");
            System.out.println("1. Crear tabla Película");
            System.out.println("2. Eliminar tabla Película");
            System.out.println("3. Crear Película");
            System.out.println("4. Eliminar Película por id");
            System.out.println("5. Buscar Película por id e imprimir información");
            System.out.println("6. Buscar todas las peliculas e imprimir todas las películas");
            System.out.println("7. Buscar por género y por orden descendente de estreno e imprimir");
            System.out.println("......");
            opcion = sc.nextInt();

                switch (opcion){
                    case 0:
                        System.out.println("Gracias por usar el programa");break;
                    case 1:
                        peliculas.crearTabla();break;
                    case 2:
                        peliculas.eliminarTabla();break;
                    case 3:
                        System.out.println("Indicame el id");
                        int id = sc.nextInt();
                        System.out.println("Indicame el titulo");
                        String titulo = sc.next();
                        System.out.println("Indicame el estreno");
                        int estreno = sc.nextInt();
                        System.out.println("Indicame el genero: ROMANTICA, MIEDO, COMEDIA");
                        String genero = sc.next();
                        p = new Pelicula (id, titulo, genero, estreno);
                        peliculas.crearPelicula(p);break;
                    case 4:
                        System.out.println("Introduzca el id de la pelicula a eliminar");
                        id = sc.nextInt();
                        peliculas.eliminarPelicula(id);break;
                    case 5:
                        System.out.println("Introduzca el id de la pelicula a buscar");
                        id = sc.nextInt();
                        p = peliculas.buscarPelicula(id);
                        System.out.println(p.toString());break;
                    case 6:
                        listado_peliculas = peliculas.buscarTodo();
                        System.out.println(listado_peliculas.toString());break;
                    case 7:
                        System.out.println("Introduzca el genero a buscar");
                        genero = sc.next();
                        listado_peliculas = peliculas.buscarPorGeneroyEstreno(genero);
                        for (Pelicula pel : listado_peliculas){
                            System.out.println(pel.toString());
                        }

                        break;
                }

        } while (opcion != 0);


    }
}
