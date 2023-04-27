package Sesion2704;

import java.util.ArrayList;

public class alumnos {


    protected String nombre;
    protected double nota;

    public alumnos(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "alumnos{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}
