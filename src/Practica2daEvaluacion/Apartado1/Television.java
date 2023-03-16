package Practica2daEvaluacion.Apartado1;

import Practica2daEvaluacion.Apartado1.Electrodomestico;

public class Television extends Electrodomestico {
    /**atributos de la clase hija Television*/
    private int resolucion;
    private boolean sintonizador_TDT;

    /** la clase hija tiene tres constuctores*/
    public Television() {
    }

    /**
     *
     * @param precio_base
     * @param peso
     * @param resolucion
     * @param sintonizador_TDT
     */


    public Television(double precio_base, double peso, int resolucion, boolean sintonizador_TDT) {
        super(precio_base, peso);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }

    public Television(double precio_base, double precio_final, String color, String consumo_energetico, double peso, int resolucion, boolean sintonizador_TDT) throws ProductoIncorrecto {
        super(precio_base, precio_final, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }

    public void setSintonizador_TDT(boolean sintonizador_TDT) {
        this.sintonizador_TDT = sintonizador_TDT;
    }

    @Override
    protected double precioFinal() {

        precio_final=super.precioFinal();

        if (resolucion > 40) {
            precio_final = precio_final + precio_final * 0.3;
        }
        if (isSintonizador_TDT()) {

            precio_final += 50;
        }

        return precio_final;
    }


}
