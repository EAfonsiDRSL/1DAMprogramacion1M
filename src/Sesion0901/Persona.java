package Sesion0901;

import java.lang.ref.SoftReference;

public class Persona {

    //atributos
    public static int contador = 0;
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    //metodos

     Persona(){
        contador ++;
    }
    Persona (String nombre, String dni, String apellidos, int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.edad=edad;
        //contador=contador+1;
    }
    public int getContador(){
        return contador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {

        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}

