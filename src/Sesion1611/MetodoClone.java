package Sesion1611;

public class MetodoClone {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5};
        int [] listanumeros2 = new int [4];

        System.out.println("Array numeros "+java.util.Arrays.toString(numeros));
        listanumeros2=numeros.clone();
        System.out.println("Array listanumeros "+java.util.Arrays.toString(listanumeros2));




    }
}
