package Sesion2202.Persona;

import Sesion1602.Paciente;

public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    private final Genero sexo = Genero.H;
    private double peso;
    private double altura;

    public Persona(){
    }
    public Persona(String nombre, int edad, final char sexo)
    {
        this.nombre=nombre;
        this.edad=edad;

    }

    public Persona(String nombre, int edad, String dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Genero getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
