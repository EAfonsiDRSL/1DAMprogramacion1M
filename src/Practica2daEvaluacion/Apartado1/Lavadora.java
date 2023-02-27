package Practica2daEvaluacion.Apartado1;

import Practica2daEvaluacion.Apartado1.Electrodomestico;

public class Lavadora extends Electrodomestico {

    protected double carga=5;

    public Lavadora() {
    }

    public Lavadora(double precio_base, double precio_final, String color, char consumo_energetico, double peso, double carga) {
        super(precio_base, precio_final, color, consumo_energetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
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

        if (carga > 30){
            precio_final += 50;
        }


        return precio_final;
    }
}
