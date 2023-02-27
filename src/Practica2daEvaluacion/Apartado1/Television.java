package Practica2daEvaluacion.Apartado1;

import Practica2daEvaluacion.Apartado1.Electrodomestico;

public class Television extends Electrodomestico {

    protected int resolucion = 20;
    protected boolean sintonizador_TDT = false;


    public Television() {
    }

    public Television(double precio_base, double precio_final, String color, char consumo_energetico, double peso, int resolucion, boolean sintonizador_TDT) {
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

    protected void setSintonizador_TDT(boolean sintonizador_TDT) {
        this.sintonizador_TDT = sintonizador_TDT;
    }

    protected double precioFinal() {

        switch (consumo_energetico) {
            case 'A':
                precio_final = precio_base + 100;
                break;
            case 'B':
                precio_final = precio_base + 80;
                break;
            case 'C':
                precio_final = precio_base + 60;
                break;
            case 'D':
                precio_final = precio_base + 50;
                break;
            case 'E':
                precio_final = precio_base + 30;
                break;
            case 'F':
                precio_final = precio_base + 10;
                break;
        }
        if (peso > 0 && peso < 19) {
            precio_final += 10;
        } else if (peso >= 20 && peso < 50) {
            precio_final += 50;
        } else if (peso >= 50 && peso < 80) {
            precio_final += 80;
        } else if (peso >= 80) {
            precio_final += 100;
        }

        if (resolucion > 40) {
            precio_final = precio_final + precio_final * 0.3;
        }
        if (sintonizador_TDT == true) {

            precio_final = precio_final + 50;
        }

        return precio_final;
    }
    @Override
    public String toString() {
        return super.toString() + " la resolucion es " + resolucion +
                "\n contiene sintotizador tdt: " + sintonizador_TDT;
    }

}
