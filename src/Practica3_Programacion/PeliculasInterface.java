package Practica3_Programacion;

import java.sql.SQLException;
import java.util.ArrayList;

public interface PeliculasInterface {

    void crearTabla() throws SQLException;
    void eliminarTabla() throws SQLException;

    void crearPelicula(Pelicula pelicula) throws SQLException;
    void eliminarPelicula(int id) throws SQLException;
    Pelicula buscarPelicula(int id) throws SQLException;

    ArrayList<Pelicula> buscarTodo() throws SQLException;
    ArrayList<Pelicula> buscarPorGeneroyEstreno(String genero) throws SQLException;

}
