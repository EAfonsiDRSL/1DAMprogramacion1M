package Sesion2004;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEjemplo {

    public static void main(String[] args) {
        ArrayList<Integer> collection_num = new ArrayList<>();
        collection_num.add(3);
        collection_num.add(3);
        collection_num.add(2);
        collection_num.add(1);
        collection_num.add(4);
        collection_num.add(5);

        Iterator<Integer> itr1 = collection_num.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
        System.out.println("Elemento situado en primer lugar "+
                collection_num.get(0));
        System.out.println("Posicion de la primera ocurrencia de 3 "+
                collection_num.indexOf(3));
        System.out.println("Posicion de la última ocurrencia de 3 "+collection_num.lastIndexOf(3));
        System.out.println("Tamañao de la lista "+collection_num.size());
        System.out.println("Sublista 0-2 "+collection_num.subList(0,2).toArray());
        System.out.println("Cambiar valor de la posicion última "+collection_num.set(collection_num.size()-1,6));
        System.out.println(collection_num.toString());
    }
}
