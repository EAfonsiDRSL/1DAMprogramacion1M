package Sesion1302;

public class Alumno extends Persona{

    private int beca;


    public Alumno(int beca) {
        this.beca=beca;
    }

    public Alumno(String dni, String nombre, int edad, int beca) {
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
        this.beca = beca;
    }

    public int getBeca() {
        return beca;
    }

    public void setBeca(int beca) {
        this.beca = beca;
    }

    @Override
    public String toString() {
        return super.toString()+ "beca "+beca;
    }
    public double calcularRetencion(){
        double retencion;
        retencion=beca*0.20;
        return retencion;
    }
}
