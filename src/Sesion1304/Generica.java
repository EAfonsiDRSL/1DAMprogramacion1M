package Sesion1304;

import java.util.ArrayList;

public class Generica {
    public static void main(String[] args) {
        ArrayList<String>arraydinamicoString=new ArrayList<>();
        ArrayList<Integer>arraydinamicoInteger=new ArrayList<>();
        ArrayList<Persona>arraydinamicoPersona=new ArrayList<>();


        arraydinamicoString.add("Eliot");
        arraydinamicoString.add("Miguel");
        arraydinamicoString.add("Sergio");
        arraydinamicoString.add("Alejandro");
        System.out.println(arraydinamicoString.toString());



        arraydinamicoInteger.add(4);
        arraydinamicoInteger.add(5);
        arraydinamicoInteger.add(7);
        arraydinamicoInteger.add(10);
        arraydinamicoInteger.add(20);
        System.out.println(arraydinamicoInteger.toString());

        arraydinamicoPersona.add(new Persona("43243443c"));
        arraydinamicoPersona.add(new Persona("18817727e"));
        arraydinamicoPersona.add(new Persona("12345678y"));
        Persona p1 = new Persona("34242342j");
        arraydinamicoPersona.add(p1);
        System.out.println(arraydinamicoPersona.toString());

    }

}
