package Sesion0202;

public class Libro {

    private String isbn;
    private String titulo;
    private int año;
    private int precio;
    private Editorial editorial;


    //constructor de defecto

    public Libro(){

    }

    //constructor parametrizado

    public Libro(String isbn, String titulo, int año, int precio,Editorial editorial){

        this.isbn=isbn;
        this.titulo=titulo;
        this.año=año;
        this.precio=precio;
        this.editorial=editorial;



    }
    public void setEditorial(Editorial editorial){
        this.editorial=editorial;
    }
    public Editorial getEditorial(){
        return editorial;
    }

    public void setIsbn(String isbn){
        this.isbn=isbn;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setAño(int año){
        this.año=año;
    }
    public int getAño(){
        return año;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public int getPrecio(){
        return precio;
    }

}
