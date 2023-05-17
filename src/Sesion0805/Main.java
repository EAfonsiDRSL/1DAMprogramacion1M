package Sesion0805;

import BBDD.Paciente;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Connection conn = null;

    public static Jugador [] array_estatico_jugadores = null;

    public static Jugador j = null;

    public static ArrayList<Jugador> arrayList= new ArrayList<>();

    public static void main(String[] args) throws SQLException {
        int opcion = 0;


        do {
            System.out.println("0. Salir programa");
            System.out.println("1. Crear base de datos EjercicioPractico");
            System.out.println("2. Crear la tabla jugador");
            System.out.println("3. Vaciar tabla");
            System.out.println("4. Eliminar tabla");
            System.out.println("5. Insertar jugador");
            System.out.println("6. Buscar jugador por dorsal y lo almacenamos " +
                    "en un objeto jugador e imprimimos ese objeto");
            System.out.println("7. Almacenar jugadores de la bd en un array estatico");
            System.out.println("8. Almacenar jugadores de la bd en un arraylist");
            System.out.println("Introduzca una opcion por favor");
            System.out.println("9. Mostrar tabla de la base de datos EjercicioPractico");
            opcion=sc.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar el programa");break;
                case 1:crear_bd();break;
                case 2:crear_tabla_jugador();break;
                case 3:vaciar_tabla();break;
                case 4:eliminar_tabla();break;
                case 5:
                    System.out.println("Introduzca su dni");
                    String dni = sc.next();
                    System.out.println("Introduzca su nombre");
                    String nombre = sc.next();
                    System.out.println("Introduzca el dorsal de su camiseta");
                    int dorsal = sc.nextInt();
                    System.out.println("Introduzca su salario");
                    double salario = sc.nextDouble();
                    System.out.println("Introduzca su edad");
                    int edad = sc.nextInt();
                    Jugador j1 = new Jugador(dni,nombre,dorsal,salario,edad);
                    insertar_jugador(j1);break;
                case 6:
                    System.out.println("Introduzca el dorsal del jugador a buscar en la bd");
                    dorsal = sc.nextInt();
                    j = buscar_por_dorsal(dorsal);
                    System.out.println(j.toString());break;
                case 7:
                   array_estatico_jugadores = almacenar_array_estatico();
                    System.out.println(Arrays.toString(array_estatico_jugadores));
                   break;
                case 8:
                    arrayList = almacenar_array_dinamico();
                    for (Jugador jugador : arrayList){
                        System.out.println(jugador.toString());
                    }
                    break;
                case 9:
                    mostrar_tablas();break;
            }

        }while (opcion!=0);
    }

    private static void mostrar_tablas() throws SQLException {
asignar_bd();
        DatabaseMetaData databaseMetaData = conn.getMetaData();
        ResultSet rs = databaseMetaData.getTables("ejercicioPractico","ejercicioPractico",null,null);
        while (rs.next()){
            System.out.println(rs.getString(3));
            System.out.println("la url de mi bbdd es: "+databaseMetaData.getURL());
        }
    }

    private static ArrayList<Jugador> almacenar_array_dinamico() throws SQLException {
        establecer_conexion();
        asignar_bd();

        PreparedStatement ps = conn.prepareStatement("Select * from jugador");
        ResultSet rs = ps.executeQuery();

        while (rs.next()){

            j = new Jugador(rs.getString(1),rs.getString(2),rs.getInt(3),
                    rs.getDouble(4),rs.getInt(5));
            arrayList.add(j);

        }


        return arrayList;
    }

    private static Jugador[] almacenar_array_estatico() throws SQLException {
        establecer_conexion();
        asignar_bd();

        PreparedStatement ps = conn.prepareStatement("Select count(*) from jugador");
        ResultSet rs = ps.executeQuery();
        int dimension = 0;
        while (rs.next()){
            dimension = rs.getInt(1);
        }
        array_estatico_jugadores = new Jugador[dimension];
        ps = conn.prepareStatement("Select * from jugador");
        rs = ps.executeQuery();
        int i =0;
        while (rs.next()){
            j = new Jugador(rs.getString(1),rs.getString(2),rs.getInt(3),
                    rs.getDouble(4),rs.getInt(5));

            array_estatico_jugadores [i] = j;
            i++;
        }


        return array_estatico_jugadores;
    }

    private static void eliminar_tabla() throws SQLException {
        establecer_conexion();
        asignar_bd();
        String query = "drop table jugador";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
    }

    private static Jugador buscar_por_dorsal(int dorsal) throws SQLException {
        establecer_conexion();
        asignar_bd();
        Jugador j = null;
        PreparedStatement ps = conn.prepareStatement("select * from jugador where dorsal_camiseta = ?");
        ps.setInt(1,dorsal);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            j = new Jugador(rs.getString(1),rs.getString(2),
                    rs.getInt(3),rs.getDouble(4),rs.getInt(5));

        }

        return j;
    }

    private static void insertar_jugador(Jugador j1) throws SQLException {
        establecer_conexion();
        asignar_bd();
        PreparedStatement ps = conn.prepareStatement("insert into jugador values (?,?,?,?,?)");
        ps.setString(1,j1.getDni());
        ps.setString(2,j1.getNombre_jugador());
        ps.setInt(3,j1.getDorsal_camiseta());
        ps.setDouble(4,j1.getSalario());
        ps.setInt(5,j1.getEdad());
        ps.executeUpdate();

    }




    private static void vaciar_tabla() throws SQLException {
        establecer_conexion();
        asignar_bd();
        String query = "truncate table jugador";
        Statement st = conn.createStatement();
        st.executeUpdate(query);

    }

    private static void crear_tabla_jugador() throws SQLException {
        establecer_conexion();
        asignar_bd();
        String query = "create table jugador(" +
                "dni varchar(9) not null primary key," +
                "nombre_jugador varchar(55),"+
                "dorsal_camiseta int," +
                "salario float," +
                "edad int )";
        Statement st = conn.createStatement();
        st.executeUpdate(query);

    }

    private static void crear_bd() throws SQLException {
        establecer_conexion();
        String query = "create database EjercicioPractico";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
    }

    private static void establecer_conexion() throws SQLException {
        //conexión al sgbd

        String url = "jdbc:mysql://localhost:3306/";
        String user ="root";
        String pwd="admin";
        conn = DriverManager.getConnection(url,user,pwd);
        System.out.println("conexión establecida");
    }
    private static void asignar_bd() throws SQLException{
        String query = "use EjercicioPractico";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
    }
}
