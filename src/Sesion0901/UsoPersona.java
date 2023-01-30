package Sesion0901;

public class UsoPersona {

    public static void main(String[] args) {

        Persona p1 = new Persona();

        System.out.println("El nombre de la primera persona es: "+p1.getNombre());
        System.out.println("El apellido de la primera persona es: "+p1.getApellidos());
        System.out.println("El dni de la primera persona es: "+p1.getDni());
        System.out.println("La edad de la persona es: "+p1.getEdad());

        p1.setDni("12345678D");
        p1.setNombre("Eliot");
        p1.setApellidos("Arias");
        p1.setEdad(19);


        Persona p2 = new Persona("Eliot","08736542c","Arias",19);
        System.out.println("El nombre de la primera es "+p2.getNombre());
        System.out.println("El apellido de la primera es "+p2.getApellidos());
        System.out.println("El dni de la primera es "+p2.getDni());
        System.out.println("la edad de la primera es "+p2.getEdad());
        System.out.println("el numero de objetos de la clase persona creados es "+ Persona.contador);


    }


}
