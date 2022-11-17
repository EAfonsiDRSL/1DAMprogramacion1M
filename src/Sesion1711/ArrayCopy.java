package Sesion1711;

public class ArrayCopy {
    public static void main(String[] args) {
        String [] arrayorigen = {"pepe","juan","eric","pedro","javier"};

        String [] arraydestino1 = new String[5];
        System.arraycopy(arrayorigen,0,arraydestino1,0,5);
        System.out.println(java.util.Arrays.toString(arraydestino1));

        String [] arraydestino2 = new String[5];
        System.arraycopy(arrayorigen,0,arraydestino2,0,4);
        System.out.println(java.util.Arrays.toString(arraydestino2));
    }
}
