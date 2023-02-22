package Sesion2202.Cuenta;

import java.util.Scanner;

public class Cuenta {

    protected String titular;
    protected String num_cuenta;
    protected double cantidad;

    public Cuenta(){

    }

    public Cuenta(String titular, String num_cuenta, double cantidad){
        this.cantidad=cantidad;
        this.titular=titular;
        this.num_cuenta=num_cuenta;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString(){
        return "La cuenta con numero "+num_cuenta+
                " tiene como titular a "+titular+
                " con un saldo disponible de "+cantidad+" euros";
    }
    Scanner sc = new Scanner(System.in);
    public void ingresar(double dinero) throws CantidadIncorrecta {

        cantidad += dinero;
        if (dinero < 0 ){
            throw new CantidadIncorrecta("No se puede ingresar una cantidad negativa");
        }

    }
    public void retirar(double dinero) throws CantidadIncorrecta {



        if (cantidad<dinero){
            throw new CantidadIncorrecta("No tienes suficiente saldo en la cuenta");
        }
        cantidad -= dinero;

    }
}
