package Sesion1602;

public class Paciente {

    protected String dni;
    protected String nombre;

    public Paciente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    public Paciente(){

    }



    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
