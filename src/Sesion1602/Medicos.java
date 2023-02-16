package Sesion1602;

public class Medicos {
    //atributos
    protected String nombre;
    protected String apellido;
    protected int numero_colegiado;
    protected Paciente [] lista;

    public Medicos(String nombre, String apellido, int numero_colegiado, Paciente[] lista) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_colegiado = numero_colegiado;
        this.lista = lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumero_colegiado() {
        return numero_colegiado;
    }

    public void setNumero_colegiado(int numero_colegiado) {
        this.numero_colegiado = numero_colegiado;
    }

    public Paciente[] getLista() {
        return lista;
    }

    public void setLista(Paciente[] lista) {
        this.lista = lista;
    }
}
