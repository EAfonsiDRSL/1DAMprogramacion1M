package Practica2daEvaluacion;

import java.net.PortUnreachableException;

public class Electrodomestico {

    //atributos
    protected double precio_base=100;
    protected double precio_final;
    protected Color color = Color.blancos;
    protected char consumo_energetico='F';
    protected double peso=5;


    //constructores
    public Electrodomestico(){}

    public Electrodomestico(double precio_final,double peso ){
        this.peso=peso;
        this.precio_final=precio_final;
    }

    public Electrodomestico(double precio_base, double precio_final, Color color, char consumo_energetico, double peso) {
        this.precio_base = precio_base;
        this.precio_final = precio_final;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public double getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_final(double precio_final) {
        this.precio_final = precio_final;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(char consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico () throws ProductoIncorrecto{
       switch (consumo_energetico){
           case 'A':
               if (!(precio_final >= 100)){
                   throw new ProductoIncorrecto("No es correcto la letra con precio");
               }break;
           case 'B':
               if (!(precio_final >= 80 && precio_final < 100)){
                   throw new ProductoIncorrecto("No es correcto la letra con precio");
               }
               break;
           case 'C':
               if (!(precio_final >= 60 && precio_final < 80)){
                   throw new ProductoIncorrecto("No es correcto la letra con precio");
               }
               break;
           case 'D':
               if (!(precio_final >= 50 && precio_final < 60)){
                   throw new ProductoIncorrecto("No es correcto la letra con precio");
               }
               break;
           case 'E':
               if (!(precio_final >= 30 && precio_final < 50)){
                   throw new ProductoIncorrecto("No es correcto la letra con precio");
               }
               break;
           case 'F':
               if (!(precio_final >= 10 && precio_final < 30)){
                   throw new ProductoIncorrecto("No es correcto la letra con precio");
               }
               break;
       }


        }
        public void comprobarColor(Color color) throws ProductoIncorrecto{
        if (color.equals(Color.values())){
            throw new ProductoIncorrecto("Este color no esta dentro de la gama");
        }
    }
}
