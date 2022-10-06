package a.b;

public class stringprueba {
    public static void main(String[] args) {
        String nombre= "eliot";
        String apellido= "ARIAS";

        System.out.println("voy a pasa a mayuscula el nombre "+nombre.toUpperCase());
        System.out.println("voy a pasar a minusculas el apellido "+apellido.toLowerCase());
        System.out.println("concatenar caracteres "+nombre.concat(" "+apellido));
        String napa = apellido.charAt(0)+"";
        System.out.println("mostrar la inicial de mi apellido "+napa.toLowerCase());
        System.out.println("El numero de caracteres de "+nombre+" es "+nombre.length());
        System.out.println("El numero de caracteres de "+apellido+" es "+apellido.length());
    }

}
