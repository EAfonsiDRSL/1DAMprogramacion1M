package Practica2daEvaluacion.Apartado2;

import java.util.Scanner;

public class UsoFiguras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    try {
             System.out.println("Inserte el lado del cuadrado");
             int lado = sc.nextInt();
             //Instancia de objetos

            //Declaramos el lado del cuadrado
             Cuadrado cuadrado1 = new Cuadrado(lado);

             cuadrado1.dibujar();


             //Calculo del area y volumen
        System.out.println("El cuadrado tiene el lado "+cuadrado1.getLado());
        System.out.println("El area del cuadrado es: "+cuadrado1.area()+" metros cuadrados");
        System.out.println("El volumen del cuadrado es: "+cuadrado1.volumen()+" metros cubicos");
        System.out.println("---------------------------------");
        System.out.println("Introduzca el nuevo lado del cuadrado");
        cuadrado1.setLado(sc.nextInt());
        System.out.println("El nuevo area es: "+cuadrado1.area()+" metros cuadrados");
        System.out.println("El nuevo volumen es: "+cuadrado1.volumen()+" metros cubicos");

            Cuadrado cuadrado2 = new Cuadrado(7);
            Cuadrado cuadrado3 = new Cuadrado(5);
            Cuadrado cuadrado4 = new Cuadrado(9);

            Cuadrado[] lista_cuadrados = {cuadrado2,cuadrado3,cuadrado4};

            for (int i = 0 ; i < lista_cuadrados.length ; i++ ){
                System.out.println("El área del cuadrado "+i+" es "+lista_cuadrados[i].area()+" m2, y el volumen es "+lista_cuadrados[i].volumen()+" m3");
            }

    }catch (Exception e){
    System.out.println(e.getMessage());
}

    }
}
