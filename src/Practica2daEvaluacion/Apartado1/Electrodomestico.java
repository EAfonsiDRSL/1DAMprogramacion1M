package Practica2daEvaluacion.Apartado1;

public abstract class Electrodomestico {

    //atributos
    protected double precio_base = 100;
    protected double precio_final = 0;
    protected Color color = Color.blancos;
    protected char consumo_energetico = 'F';
    protected double peso = 5;


    //constructores
    public Electrodomestico() {
    }

    public Electrodomestico(double precio_final, double peso) {
        this.peso = peso;
        this.precio_final = precio_final;
    }

    public Electrodomestico(double precio_base, double precio_final, String color, char consumo_energetico, double peso) {
        this.precio_base = precio_base;
        this.precio_final = precio_final;
        this.color = Color.blancos;
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

    public void comprobarConsumoEnergetico() throws ProductoIncorrecto {
        switch (consumo_energetico) {
            case 'A':
                if (!(precio_final >= 100)) {
                    throw new ProductoIncorrecto("No es correcto la letra con precio");
                }
                break;
            case 'B':
                if (!(precio_final >= 80 && precio_final < 100)) {
                    throw new ProductoIncorrecto("No es correcto la letra con precio");
                }
                break;
            case 'C':
                if (!(precio_final >= 60 && precio_final < 80)) {
                    throw new ProductoIncorrecto("No es correcto la letra con precio");
                }
                break;
            case 'D':
                if (!(precio_final >= 50 && precio_final < 60)) {
                    throw new ProductoIncorrecto("No es correcto la letra con precio");
                }
                break;
            case 'E':
                if (!(precio_final >= 30 && precio_final < 50)) {
                    throw new ProductoIncorrecto("No es correcto la letra con precio");
                }
                break;
            case 'F':
                if (!(precio_final >= 10 && precio_final < 30)) {
                    throw new ProductoIncorrecto("No es correcto la letra con precio");
                }
                break;
        }


    }

    public boolean comprobarColor(String color) throws ProductoIncorrecto {
        boolean dentro_de_la_gama = false;
        if (Color.blancos.toString().equals(color) || Color.negro.toString().equals(color) || Color.azul.toString().equals(color) || Color.rojo.toString().equals(color) || Color.gris.toString().equals(color)) {
            dentro_de_la_gama = true;
        } else {
            throw new ProductoIncorrecto("Este color no esta dentro de la gama");
        }
        return dentro_de_la_gama;
    }

    protected abstract double precioFinal();

    @Override
    public String toString(){
        return "El precio base es "+precio_base+
                "\n precio final es "+precio_final+
                "\n El color es "+color+
                "\n El consumo energetico es "+consumo_energetico+
                "\n El peso es "+peso;
    }

}
