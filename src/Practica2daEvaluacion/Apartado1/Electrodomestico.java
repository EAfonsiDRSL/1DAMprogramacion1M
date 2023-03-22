package Practica2daEvaluacion.Apartado1;

public abstract class Electrodomestico {

    //atributos
    protected double precio_base = 100;
    protected double precio_final;
    protected Color color = Color.blancos;
    protected Consumo consumo_energetico= Consumo.F;
    protected double peso = 5;


    //constructores
    public Electrodomestico() {
    }

    public Electrodomestico(double precio_base, double peso) {
        this.precio_base = precio_base;
        this.peso = peso;
        this.precio_final=precioFinal();

    }

    public Electrodomestico(double precio_base, double precio_final, String color, String consumo_energetico, double peso) throws ProductoIncorrecto{

        if (comprobarConsumoEnergetico(consumo_energetico.toUpperCase().charAt(0))){
            this.precio_base = precio_base;
            this.consumo_energetico = Consumo.valueOf(consumo_energetico.toUpperCase());
        }


        this.precio_final = precioFinal();
        if (comprobarColor(color.toString())){
            this.color = Color.valueOf(color);
        }


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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color)throws ProductoIncorrecto {
        if (comprobarColor(color.toString())){
            this.color = color;
        }

    }



    public boolean comprobarConsumoEnergetico(char letra) throws ProductoIncorrecto {
        boolean resultado = false;
        if (Consumo.A.toString().equals(letra) && precio_base >=100
        || Consumo.B.toString().equals(letra) && precio_base>=80 && precio_base < 100
        || Consumo.C.toString().equals(letra) && precio_base >= 60 && precio_base < 80
        || Consumo.D.toString().equals(letra) && precio_base >= 50 && precio_base < 60
        ||Consumo.E.toString().equals(letra) && precio_base >=30 && precio_base < 50
        || Consumo.F.toString().equals(letra) && precio_base >=10 && precio_base < 30){
            resultado = true;
        }
        return resultado;
    }

    public boolean comprobarColor(String color) throws ProductoIncorrecto {
        if (Color.blancos.toString().equals(color) || Color.negro.toString().equals(color) || Color.azul.toString().equals(color) || Color.rojo.toString().equals(color) || Color.gris.toString().equals(color)) {
            return true;
        } else {
            throw new ProductoIncorrecto("Este color no esta dentro de la gama");
        }
    }

    protected double precioFinal(){
        switch (consumo_energetico){
            case A: precio_final = precio_base+100;break;
            case B: precio_final = precio_base+80;break;
            case C: precio_final = precio_base+60;break;
            case D: precio_final = precio_base+50;break;
            case E: precio_final = precio_base+30;break;
            case F: precio_final = precio_base+10;break;

        }
        if (peso > 0 && peso < 19) {
            precio_final += 10;
        } else if (peso >= 20 && peso < 50) {
            precio_final += 50;
        } else if (peso >= 50 && peso < 80) {
            precio_final += 80;
        } else {
            precio_final += 100;
        }

        return precio_final;
    }



}
