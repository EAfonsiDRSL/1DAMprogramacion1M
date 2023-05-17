package EjercicioSimulacroExamen3;

import java.sql.*;
import java.util.Scanner;

public class MainEmisoraTradicional {

    public static Connection conn = null;
    public static Scanner sc = new Scanner(System.in);
    public static EmisoraTradicional[] array_estatico = null;

    public static void main(String[] args) throws SQLException, AccionInvalida {
        int opcion;
        do {
            System.out.println("1. Crear tabla emisora tradicional");
            System.out.println("2. Insertar array estatico");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Gracias por usar el programa");
                    break;
                case 1:
                    crearTabla();
                    break;
                case 2:
                    insertar_array_estatico();
                    break;
            }
        }while (opcion != 0);
    }

    private static void insertar_array_estatico() throws AccionInvalida, SQLException {
        establecerConexion();
        asignar_bd();
        System.out.println("Introduzca el numero de emisoras que quiere introducir");
        int dimension = sc.nextInt();
        array_estatico = new EmisoraTradicional[dimension];
        for (int i = 0 ; i < array_estatico.length; i++){
            System.out.println("Procedemos a la insercion en el array de la posicion "+i);


            System.out.println("Introduzcame el identificador de la emisora");
            int num_emisora = sc.nextInt();


            System.out.println("Introduzca el nombre de la emisora");
            String nombre = sc.next();


            System.out.println("Introduzca el numero de oyentes");
            int num_oyentes = sc.nextInt();





            System.out.println("Introduzca el numero de frecuencia");
            double num_frecuencia = sc.nextDouble();

            EmisoraTradicional e = new EmisoraTradicional(num_emisora,nombre,num_oyentes,num_frecuencia);
            array_estatico[i]=e;

        }
        for (int i = 0 ; i< array_estatico.length; i++){
            PreparedStatement ps = conn.prepareStatement("insert into emisoraTradicional values (?,?,?,?,?,?,?)");
            ps.setInt(1,array_estatico[i].getNum_emisora());
            ps.setString(2, array_estatico[i].getNombre_emisora());
            ps.setBoolean(3,array_estatico[i].isEmitiendo());
            ps.setDouble(4,array_estatico[i].getBeneficios());
            ps.setInt(5,array_estatico[i].getNum_oyentes());
            ps.setString(6,array_estatico[i].getFrecuencias().toString());
            ps.setDouble(7,array_estatico[i].getNum_frecuencia());
            ps.executeUpdate();
        }


    }


    public static void crearTabla() throws SQLException {

        establecerConexion();
        asignar_bd();
         Statement st = conn.createStatement();
         String query = "Create table emisoraTradicional (" +
                 "num_emisora int not null primary key,"+
                 "nombre varchar(50) not null," +
                 "emitiendo boolean," +
                 "beneficios double," +
                 "num_oyentes int," +
                 "frecuencia varchar (5)," +
                 "num_frecuencia double);";
         st.executeUpdate(query);

     }
     public static void establecerConexion() throws SQLException {
         String url = "jdbc:mysql://localhost:3306/simulacroexamen";
         String user ="root";
         String pwd="admin";
        conn = DriverManager.getConnection(url,user,pwd);
         System.out.println("Conexion establecida");


     }
     public static void asignar_bd() throws SQLException {
        String query = "Use simulacroexamen";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
     }

}
