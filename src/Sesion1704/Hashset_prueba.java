package Sesion1704;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_prueba {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<>();
        nombres.add("juan");
        nombres.add("Kevin");
        nombres.add(null);
        Iterator<String> itr = nombres.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("El numero de elementos es "+nombres.size());
        nombres.clear();
        System.out.println("El numero de elementos es "+nombres.size());

    }
}
