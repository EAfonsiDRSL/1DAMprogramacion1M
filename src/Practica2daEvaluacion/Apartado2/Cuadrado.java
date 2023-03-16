package Practica2daEvaluacion.Apartado2;

public class Cuadrado extends Figura implements IAcciones{

    //atributo
    private int lado;

    //constructor

    public Cuadrado(){

    }
    public Cuadrado(int lado) throws ExcepcionCuadrado {
        if (lado <=0 ){
            throw new ExcepcionCuadrado("Un lado no puede ser menor o igual a 0");
        }
        this.lado=lado;

    }
    //Getter and Setter
    public int getLado(){
        return lado;
    }

    public void setLado(int lado) throws ExcepcionCuadrado {

        if (lado <=0 ){
            throw new ExcepcionCuadrado("Un lado no puede ser menor o igual a 0");
        }
        this.lado = lado;
    }

    //Métodos

    //Metodos para calcular el area y volumen
    public double area() {

        return Math.pow(lado,2);
    }

    public double volumen() {

        return Math.pow(lado,3);
    }


    //Metodo implementado de la clases "interface"
    public void dibujar() {
        System.out.println("Dibujando un cuadrado de lado "+lado);
        System.out.println("Porfavor espere ....");
        System.out.println("Listo!!!");
    }
}
