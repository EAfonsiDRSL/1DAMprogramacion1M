package Practica2daEvaluacion.Apartado2;

public class Cuadrado extends Figura{

    //atributo
    private int lado;

    //constructor
    public Cuadrado(int lado) {
        this.lado=lado;

    }
    //Getter and Setter
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    //Métodos

    //Metodo de control de excepciones
    public void ExepcionCuadrado () throws ExcepcionCuadrado{
        if (lado <=0 ){
            throw new ExcepcionCuadrado("Un lado no puede ser menor o igual a 0");
        }
    }

    //Metodos para calcular el area y volumen
    public double area() {
        double area = Math.pow(lado,2);

        return area;
    }

    public double volumen() {
        double volumen = Math.pow(lado,3);

        return volumen;
    }


    //Metodo implementado de la clases "interface"
    public void dibujar() {
        System.out.println("Dibujando un cuadrado de lado "+lado);
        System.out.println("Porfavor espere ....");
        System.out.println("Listo!!!");

    }
}
