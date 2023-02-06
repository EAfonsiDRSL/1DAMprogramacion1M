package Persona.Viajero;

public class Viajero {

    private String DNI;
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private String direccion;


    public Viajero(){

    }

    public Viajero(String DNI, String nombre, String apellidos, String nacionalidad, String direccion){
        this.DNI=DNI;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.nacionalidad=nacionalidad;
        this.direccion=direccion;

    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
