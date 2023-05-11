package Practica3_Programacion;

import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Peliculas implements PeliculasInterface {


    public static Connection conn;


    static {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","admin");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }



    public void asignar_bd() throws SQLException {

        String query = "use practica3";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
    }
    public void crearTabla() throws SQLException {
        asignar_bd();
       String query = "create table Pelicula " +
               "(id int primary Key," +
               "Titulo varchar(55)," +
               "Genero varchar (15)," +
               "Estreno year)";
       Statement st = conn.createStatement();
       st.executeUpdate(query);
        System.out.println("La tabla \'Pelicula\' ha sido creada con éxito");
    }

    public void eliminarTabla() throws SQLException {
        asignar_bd();
        String query = "drop table Pelicula";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
        System.out.println("La tabla \'Pelicula\' ha sido eliminada correctamente");

    }

    public void crearPelicula(Pelicula pelicula) throws SQLException {
        asignar_bd();
        PreparedStatement ps = conn.prepareStatement("insert into Pelicula values (?,?,?,?)");
        ps.setInt(1,pelicula.getId());
        ps.setString(2, pelicula.getTitulo());
        ps.setString(3,pelicula.getGenero().toString());
        ps.setInt(4,pelicula.getEstreno());
        ps.executeUpdate();
        System.out.println("Los datos de la pelicula se ha insertado correctamente");
    }

    public void eliminarPelicula(int id) throws SQLException {
        asignar_bd();
        PreparedStatement ps = conn.prepareStatement("delete from Pelicula where id = ?");
        ps.setInt(1,id);
        ps.executeUpdate();
        System.out.println("La pelicula con id "+id+" ha sido borrada correctamente");
    }

    public Pelicula buscarPelicula(int id) throws SQLException {
        asignar_bd();
        Pelicula p = null;
        PreparedStatement ps = conn.prepareStatement("select * from Pelicula where id = ?");
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            p = new Pelicula(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
        }

        return p;
    }

    public ArrayList<Pelicula> buscarTodo() throws SQLException {
        asignar_bd();
        ArrayList<Pelicula> lista = new ArrayList<>();
        PreparedStatement ps = conn.prepareStatement("Select * from pelicula");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            Pelicula p = new Pelicula(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
            lista.add(p);
            }

        return lista;
    }

    public ArrayList<Pelicula> buscarPorGeneroyEstreno(String genero) throws SQLException {
        asignar_bd();
        ArrayList<Pelicula> lista = new ArrayList<>();

        PreparedStatement ps = conn.prepareStatement("Select * from pelicula where genero = ?");
        ps.setString(1,genero);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            Pelicula p = new Pelicula(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
            lista.add(p);
        }
        //la linea siguiente de codigo muestra los resulatados en una sola linea
        lista.sort(Comparator.comparing(Pelicula::getEstreno));
        //for(Pelicula pel : lista){
          //  System.out.println(pel.toString());
        //}
        return lista;
    }
}
