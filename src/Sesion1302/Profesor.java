package Sesion1302;

public class Profesor extends Persona{

    private int salario;

    public Profesor(int salario) {
        this.salario = salario;
    }

    public Profesor(String dni, String nombre, int edad, int salario) {
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return " Profesor-> DNI: "+dni+" ->nombre "+nombre+" ->edad "+edad+ "->salario "+salario;
    }

    public double calcularRetencion(){
        double retencion;
        retencion=salario*0.20;
        return retencion;
    }


}
