package Sesion1304;

import java.util.*;

public class EjemplosSet {
    public static void main(String[] args) {


        HashSet<String> conjunto_HS_nombre = new HashSet<>();
        conjunto_HS_nombre.add("Juan");
        conjunto_HS_nombre.add("Pia");
        conjunto_HS_nombre.add(null);

        System.out.println("Conjunto HashSet");

        Iterator<String> itr1 = conjunto_HS_nombre.iterator();
         while (itr1.hasNext()){
             System.out.println(itr1.next());
         }

        LinkedHashSet<String> conjunto_LH_nombre = new LinkedHashSet<>();
         conjunto_LH_nombre.add("Juan");
         conjunto_LH_nombre.add("Pia");
         conjunto_LH_nombre.add(null);

        System.out.println("Conjunto LinkedHashSet");

        Iterator<String> itr2 = conjunto_LH_nombre.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }


        System.out.println("Conjunto TreeSet");
        TreeSet<Integer> conjunto_TS_numeros = new TreeSet<>();
        conjunto_TS_numeros.add(3);
        conjunto_TS_numeros.add(2);
        conjunto_TS_numeros.add(1);
        conjunto_TS_numeros.add(4);
        conjunto_TS_numeros.add(5);

        Iterator<Integer> itr3 = conjunto_TS_numeros.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }

        System.out.println("Sacar el menor: "+conjunto_TS_numeros.first());
        System.out.println("Sacar el mayor: "+conjunto_TS_numeros.last());
        System.out.println("Conjunto TreeSet menores a 3");
        SortedSet<Integer> conjuto_TS_menores = conjunto_TS_numeros.headSet(3);
        Iterator<Integer> itr4 = conjuto_TS_menores.iterator();

        while (itr4.hasNext()){
            System.out.println(itr4.next());
        }

        System.out.println("Conjunto TreeSet descendente");
        Iterator<Integer> conjunto_TS_descendente = conjunto_TS_numeros.descendingIterator();
        while (conjunto_TS_descendente.hasNext()){
            System.out.println(conjunto_TS_descendente.next());
        }


        TreeSet<Persona> conjunto_TS_persona = new TreeSet<>(Comparator.comparing(Persona::getEdad));
        conjunto_TS_persona.add(new Persona("Eliot","344433233k",19));
        conjunto_TS_persona.add(new Persona("Juan","1234567N",34));
        conjunto_TS_persona.add(new Persona("Pepe","8349237432u",98));
        System.out.println("TreeSet ascendente");
        Iterator<Persona> itr5 = conjunto_TS_persona.iterator();
        while(itr5.hasNext()){
            System.out.println(itr5.next().getEdad());
        }
        System.out.println("TreeSet descendente");
        Iterator<Persona> itr6 = conjunto_TS_persona.descendingIterator();
        while(itr6.hasNext()){
            System.out.println(itr6.next().getEdad());
        }

    }

}
