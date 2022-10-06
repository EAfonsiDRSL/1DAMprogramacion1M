package Sesion0510;

public class OperadoresAritmetico {
    public static void main(String[] args) {

        //declaracion e inicializacion de variables
        int a=25, b=5, c=2;
        int suma, resta, multipicacion, division, resto=0;
        suma=a+b+c;
        resta=c-b;
        division=a/b;
        resto=a%b;
        multipicacion=a*b;
        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+resta);
        System.out.println("La multiplicacion es "+multipicacion);
        System.out.println("El cociente es "+division);
        System.out.println("El resto es "+resto);

        //cambiamos el valor de a y b con operadores unitarios (++)

        a++;
        System.out.println("El nuevo valor de a es "+a);
        b++;
        System.out.println("El nuevo valor de b es "+b);

    }
}
