package Practica2daEvaluacion.Apartado1;

import Practica2daEvaluacion.Apartado1.Electrodomestico;

public class Lavadora extends Electrodomestico {
    /**atributos*/
    private double carga=5;

    /**Contuctores (son 3)*/
    public Lavadora() {
    }

    public Lavadora(double precio_base, double peso, double carga) {
        super(precio_base, peso);
        this.carga = carga;
    }

    public Lavadora(double precio_base, double precio_final, String color, String consumo_energetico, double peso, double carga) throws ProductoIncorrecto {
        super(precio_base, precio_final, color, consumo_energetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    protected double precioFinal() {
       precio_final=super.precioFinal();

        if (carga > 30){
            precio_final += 50;
        }
        return precio_final;
    }
}
