package Sesion1711;


import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {

        String[] alumnos = {"Marta, Maria, Alex, David"};
        Scanner sc = new Scanner(System.in);
        int posicion = java.util.Arrays.binarySearch(alumnos, "Marta");
        if (posicion<0){
            System.out.println("No esta en la lista");
        }
        else {
            System.out.println("El alumno "+alumnos[posicion]+"esta en la posicion "+posicion);
        }
    }
}