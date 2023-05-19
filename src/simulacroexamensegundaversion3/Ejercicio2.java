package simulacroexamensegundaversion3;

import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2 {
    static Scanner sc = new Scanner(System.in);
    static double [][] notas = null;
    static final double PORCENTAJE_PRACTICA = 0.4;
    static final double PORCENTAJE_EXAMEN = 0.6;
    static Connection conn = null;

    static {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","admin");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws SQLException {
        int opcion = 0;


        do {
            System.out.println("0. Salir");
            System.out.println("1. Crear array de notas");
            System.out.println("2. Rellenar array de notas");
            System.out.println("3. Nota media por asignatura " +
                    "1. -Programacion " +
                    "2. -Base de datos " +
                    "3. -Entornos de Desarrollo");
            System.out.println("4. Nota media de todas las asignaturas");
            System.out.println("5. Introducir array en una bbdd");
            System.out.println("Introduzca una opción .....");

            opcion = sc.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar el programa");break;
                case 1:
                    crear_array();break;
                case 2:
                    rellenar_notas();
                    System.out.println(Arrays.toString(notas));break;
                case 3:
                    System.out.println("Introduzca la asignatura");
                    int i = sc.nextInt();
                    double nota_media = calcular_nota_media(i);
                    switch (i){
                        case 1:
                            System.out.println("La nota media de Programacion es: "+nota_media);break;
                        case 2:
                            System.out.println("La nota media de BBDD es: "+nota_media);break;
                        case 3:
                            System.out.println("La nota media de Entornos es: "+nota_media);break;

                    }
                    break;
                case 4:
                    double nota_media_global = calular_nota_media_global();
                    System.out.println("La nota media global es: "+nota_media_global);break;
                case 5:
                    set_up();break;


            }

        }while (opcion != 0);
    }

    private static void set_up() throws SQLException {

        Statement st = conn.createStatement();
        st.executeUpdate("Create database if not exists notas;");
        asignar_bd();
        st = conn.createStatement();
        st.executeUpdate("create table calificaciones (" +
                "id int not null primary key," +
                "nombre varchar (50)," +
                "nota_examen double," +
                "nota_practica double);");

        PreparedStatement ps = conn.prepareStatement("insert into asignaturas values (?,?,?,?)");


    }
    private static void asignar_bd() throws SQLException {
        Statement st = conn.createStatement();
        String query = "use notas";
        st.executeUpdate(query);
    }

    private static double calular_nota_media_global() {

        double media1 = ((notas [0][0]*PORCENTAJE_EXAMEN) + (notas[0][1]*PORCENTAJE_PRACTICA))/2;


        double media2 = ((notas [1][0]*PORCENTAJE_EXAMEN) + (notas[1][1]*PORCENTAJE_PRACTICA))/2;


        double media3 = ((notas [2][0]*PORCENTAJE_EXAMEN) + (notas[2][1]*PORCENTAJE_PRACTICA))/2;

    return (media1+media2+media3)/3;

    }

    private static double calcular_nota_media(int i) {
        double media = 0;
        switch (i){
            case 1:
                media = ((notas [0][0]*PORCENTAJE_EXAMEN) + (notas[0][1]*PORCENTAJE_PRACTICA))/2;break;
            case 2:
                media = ((notas [1][0]*PORCENTAJE_EXAMEN) + (notas[1][1]*PORCENTAJE_PRACTICA))/2;break;
            case 3:
                media = ((notas [2][0]*PORCENTAJE_EXAMEN) + (notas[2][1]*PORCENTAJE_PRACTICA))/2;break;
        }

        return media;
    }

    private static void rellenar_notas() {

        for (int i = 0; i<notas.length;i++){

            for (int j = 0 ; j<notas[i].length;j++){
                if (i==0){
                    switch (j){
                        case 0:
                            System.out.println("Introduzca la nota de examen de programacion");
                            notas[i][j] = sc.nextInt();
                            break;
                        case 1:
                            System.out.println("Introduzca la nota de practica de programacion");
                            notas[i][j] = sc.nextInt();
                            break;
                }
                }
                if (i==1){
                    switch (j) {
                        case 0:
                            System.out.println("Introduzca la nota de examen de BBDD");
                            notas[i][j] = sc.nextInt();
                            break;
                        case 1:
                            System.out.println("Introduzca la nota de practica de BBDD");
                            notas[i][j] = sc.nextInt();
                            break;
                    }
                }
                if (i==2){
                    switch (j) {
                        case 0:
                            System.out.println("Introduzca la nota de examen de Entornos");
                            notas[i][j] = sc.nextInt();
                            break;
                        case 1:
                            System.out.println("Introduzca la nota de practica de Entornos");
                            notas[i][j] = sc.nextInt();
                            break;
                    }
                }

                }
            }
        }


    private static void crear_array() {
        System.out.println("Introduzca el numero de filas");
        int filas = sc.nextInt();
        System.out.println("Introduzaca el numero de columnas");
        int columnas = sc.nextInt();
        notas = new double[filas][columnas];

    }
}
