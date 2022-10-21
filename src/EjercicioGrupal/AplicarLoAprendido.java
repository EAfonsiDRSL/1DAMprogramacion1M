package EjercicioGrupal;

import java.util.Scanner;

public class AplicarLoAprendido {
    public static void main(String[] args) {


    //declaramos las variables
    final String SALUDO = "Hola a todos";
    String acotacion = "*musica epica*";
    String respuesta = " ";
    Scanner sc = new Scanner(System.in);
        System.out.println(SALUDO);
        System.out.println("\t");
        System.out.println("\u001B[31m¿Como estamos clase?\u001B[37m");
        respuesta=sc.next();
        System.out.println("ok");
        System.out.println("\t");
        System.out.println("\u001B[34m");
        System.out.print("Hoy vamos a aprender las reglas basicas del ajedrez");
        System.out.println(", creeis que lo hemos logrado? ");
            respuesta=sc.next();
            if (respuesta.equals("si")) {

                System.out.print("Pues por su puesto, por algo estamos aqui, ");
                System.out.println("ahora estais a punto de presenciar nuestro arduo y duro trabajo que hemos conseguido");
                System.out.println("con el sudor de nuestra frente y sacrificio hacia nuestro ser.");
                System.out.println("Antes de que podais obserbar los resultados de nuestro asombroso trabajo, ");
                System.out.println("quiero deciros que tengais un muy buen y de provecho fin de semana y resto de dia, ");
                System.out.println("ahora si comenzemos. " + acotacion);
                System.out.println("\n");
                System.out.println("\u001B[37m");
                System.out.println("Escribe el nombre de una pieza para ver su descripcion grafica cuyo efimero fin es ingresar a nuestro organo visual y movimientos \n los cuales nos permitira saber lo interesante que es el ajedrez, ¿verdad?");
                respuesta=sc.next();
                switch (respuesta){
                    case "torre": System.out.println("Esta es una torre: \u2656 ==> sus movimientos se basan moverse en linea recta \n hacia los lados");break;
                    case "caballo": System.out.println("Esto es un caballo: \u2658 ==> cuyos movimientos estan inspirados en la letra \'l\'");break;
                    case "alfil": System.out.println("Esto es un alfil: \u2657  ==> son piezas que se mueven en diagonal");break;
                    case "peón": System.out.println("Esto es un peón: \u2659 ==> sus movimientos son unicament una casillas hacia delante aunque \n al comer otra ficha solo puede hacerlo en diagonal");break;
                    case "reina": System.out.println("Esta es la reina: \u2655 ==> es una pieza que se puede mover en cualquier direccion las \n casillas que quiera");break;
                    case "rey": System.out.println("Este es el rey: \u2656 ==> es la pieza más importante y se mueve en cualquier direccion \n solo una casilla");break;
                }
                System.out.println("\u001B[32m");
                System.out.println("\n");
                System.out.println("Muy bien clase, habeis aprendido como es jugar a uno de los deportes lleno de pura adrenalina en la que jugadores combaten para ver quien es el ultimo \n en pie. Ahora veremos el terreno de juego");
                System.out.println("Porvafor escriba \"elias\"");
                respuesta=sc.next();
                if (respuesta.equals("elias")) {
                    System.out.println("Este es el terreno de juego, donde se disputan numerosas batallas sangrientas entre las piezas \n para conquistar el tablero.");
                    System.out.println("\u001B[37m");
                    System.out.println("8    " + "███" + "   " + "███" + "   " + "███" + "   " + "███");
                    System.out.println("7 ███" + "   " + "███" + "   " + "███" + "   " + "███" + "   ");
                    System.out.println("6    " + "███" + "   " + "███" + "   " + "███" + "   " + "███");
                    System.out.println("5 ███" + "   " + "███" + "   " + "███" + "   " + "███" + "   ");
                    System.out.println("4    " + "███" + "   " + "███" + "   " + "███" + "   " + "███");
                    System.out.println("3 ███" + "   " + "███" + "   " + "███" + "   " + "███" + "   ");
                    System.out.println("2    " + "███" + "   " + "███" + "   " + "███" + "   " + "███");
                    System.out.println("1 ███" + "   " + "███" + "   " + "███" + "   " + "███" + "   ");
                    System.out.println("   A  " + "B" + "  C  " + "D" + "  E  " + "F" + "  G  " + "H");
                }
                System.out.println("\u001B[35m Muchas gracias por prestarnos estos minutos de atencion, estamos agradecidos de que podais invertir vuestro valioso tiempo en nostros.");
            }


}

}
