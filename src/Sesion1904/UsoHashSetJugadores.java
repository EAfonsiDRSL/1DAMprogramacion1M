package Sesion1904;

import java.util.ArrayList;
import java.util.HashSet;

public class UsoHashSetJugadores {
    public static void main(String[] args) {

        HashsetJugadores obj = new HashsetJugadores();
        obj.initialize();

        Jugador jugador = new Jugador("Antonio",38,"defensa");
        obj.add(jugador);

        if (obj.contains(jugador)){
            System.out.println("El jugador está contenido");
        }else {
            System.out.println("El jugador no está contenido");
        }

        System.out.println("Añadir nuevo conjuno");
        obj.add2();
        System.out.println("Unir ambos conjuntos");
        obj.merge();
        System.out.println("Mostrar ambos conjuntos");
        obj.showBetis();
        obj.compare();

    }
}
