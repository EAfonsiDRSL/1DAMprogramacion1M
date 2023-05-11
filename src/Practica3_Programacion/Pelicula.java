package Practica3_Programacion;

public class Pelicula extends Peliculas {


    protected int id;
    protected String titulo;
    protected Genero genero;
    protected int estreno;

    public Pelicula(int id, String titulo, String genero, int estreno) {
        this.titulo = titulo;
        this.estreno = estreno;
        this.id=id;
        this.genero=Genero.valueOf(genero.toUpperCase());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEstreno() {
        return estreno;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }

    public int getId() {
        return id;
    }


    public Genero getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = Genero.valueOf(genero.toUpperCase());
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", genero=" + genero +
                ", estreno=" + estreno +
                '}';
    }
}
