package BBDD;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Connection conn = null;
    public static Paciente p = null;
    public static ArrayList<Paciente> listado_paciente= new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        int opcion = 0;


        do {
            System.out.println("0. Salir del programa");
            System.out.println("1. Establecer conexión con el SGDB");
            System.out.println("2. Crear la base de datos ut14");
            System.out.println("3. Crear la tabla paciente");
            System.out.println("4. Vaciar la tabla paciente");
            System.out.println("5. Insertar registro en la tabla paciente");
            System.out.println("6. Borrar la tabla paciente");
            System.out.println("7. Borrar un registro ");
            System.out.println("8. Actualizar un campo mediante el dni");
            System.out.println("9. Imprimir datos de un paciente");
            System.out.println("10. Insetar en bbdd a partir de una clase");
            System.out.println("11. Almacernar los registros del al bbdd en un ArrayList");
            System.out.println("Introduzaca una opción");
            opcion = sc.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar el programa");break;
                case 1: establecer_conexion();break;
                case 2: crear_BD();break;
                case 3: crear_tabla();break;
                case 4: vaciar_tabla();break;
                case 5: insertar_registro();break;
                case 6: borrar_tabla();break;
                case 7: borrar_registro();break;
                case 8: actualizar_registro();break;
                case 9: consultar_datos();break;
                case 10: insertar_objeto(construir_objeto());break;
                case 11: insertar_array();break;
            }
        }while (opcion != 0);

    }

    private static void insertar_array() throws SQLException {

        asignar_bd();
        PreparedStatement ps = conn.prepareStatement("select * from paciente");

        ResultSet rs = ps.executeQuery();
        Paciente p = null;
        while (rs.next()) {
            p = new Paciente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            listado_paciente.add(p);
        }
        //System.out.println(listado_paciente.toString());

        for(Paciente pac : listado_paciente){
            System.out.println(pac.toString());
        }
    }

    private static void insertar_objeto(Paciente p) throws SQLException {
        asignar_bd();
         PreparedStatement ps = conn.prepareStatement("insert into paciente values (?,?,?,?)");
        ps.setString(1, p.getDni());
        ps.setString(2, p.getNombre());
        ps.setString(3, p.getApellidos());
        ps.setInt(4, p.getN_operaciones());
        ps.executeUpdate();
        System.out.println("Los datos se han insertado correctamente");
    }


    private static Paciente construir_objeto() throws SQLException {
        //Generar un objeto de la clase paciente a partir de datos introducidos
        asignar_bd();
        System.out.println("Introduzca el dni");
        String dni=sc.next();
        System.out.println("Intoduzca el nombre");
        String nombre = sc.next();
        System.out.println("Introduzca el apellido");
        String apellido = sc.next();
        System.out.println("Introduzca el numero de operaciones");
        int n_operaciones = sc.nextInt();
        p = new Paciente(dni, nombre,apellido,n_operaciones);



        return p;
    }


    private static void consultar_datos() throws SQLException {
        asignar_bd();
        PreparedStatement ps = conn.prepareStatement("select * from paciente");
        /*System.out.println("Introduzca el dni del paciente");
        String dni = sc.next();
        ps.setString(1,dni);*/
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            System.out.println("El paciente con dni: "+rs.getString(1)+"" +
                    " y nombre: "+rs.getString(2)+ " y apellidos: "+
                    rs.getString(3)+" tiene un total de "+rs.getInt(4)+" operaciones");
        }
    }

    private static void actualizar_registro() throws SQLException {
        asignar_bd();

        PreparedStatement ps = conn.prepareStatement("update paciente set n_operaciones =? where dni =?");
        System.out.println("Introduzca el dni del paciente");
        String dni = sc.next();
        System.out.println("Introduzca el nuevo valor del numero de operaciones");
        int n_operaciones = sc.nextInt();
        ps.setInt(1,n_operaciones);
        ps.setString(2, dni);
        ps.executeUpdate();
        System.out.println("Paciente acutalizado correctamente");
    }

    private static void borrar_registro() throws SQLException {
        String registro = "dni";
        System.out.println("Introduzca el dni del paciente a borrar");
        String dni = sc.next();
        PreparedStatement ps = conn.prepareStatement("delete from paciente where "+registro+" = ?");
        ps.setString(1,dni);
        ps.executeUpdate();
        System.out.println("registro borrado correctamente");
    }

    private static void borrar_tabla() throws SQLException {
        asignar_bd();
        String query = "drop table paciente";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
        System.out.println("tabla borrada correctamente");
    }

    private static void insertar_registro() throws SQLException {
        asignar_bd();
        PreparedStatement ps = conn.prepareStatement("insert into paciente values (?,?,?,?)");
        System.out.println("Introduzca el dni");
        String dni=sc.next();
        System.out.println("Intoduzca el nombre");
        String nombre = sc.next();
        System.out.println("Introduzca el apellido");
        String apellido = sc.next();
        System.out.println("Introduzca el numero de operaciones");
        int n_operaciones = sc.nextInt();
        ps.setString(1,dni);
        ps.setString(2,nombre);
        ps.setString(3,apellido);
        ps.setInt(4,n_operaciones);
        ps.executeUpdate();
        System.out.println("El registro se ha insertado correctamente");
    }

    private static void vaciar_tabla() throws SQLException {
        asignar_bd();
        Statement st = conn.createStatement();
        String query = "truncate paciente";
        st.executeUpdate(query);
        System.out.println("La tabla ha sigo vaciada correctamente");

    }

    private static void crear_tabla() throws SQLException{
        asignar_bd();
        //Crear la tabla
        String query = "create table paciente("+
                "dni varchar (9) primary key,"+
                "nombre varchar (30) not null,"+
                "apellidos varchar (100),"+
                "n_operaciones int )";
        Statement st = conn.createStatement();
        st.executeUpdate(query);

        System.out.println("Tabla creada correctamente");
    }
    private static void asignar_bd() throws SQLException {
        //Asignar la base de datos por default
        String query = "use ut14;";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
        System.out.println("Asignacion realizada correctamente");
    }

    private static void crear_BD() throws SQLException{
        String query = "create database ut14";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
        System.out.println("BD creada correctamente");

    }

    private static void establecer_conexion() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String passwd = "admin";

        conn = DriverManager.getConnection(url,user,passwd);
        System.out.println("Conexion establecida.");
    }



}