package Sesion0211;

public class PasoValorObjeto {
    public static void main(String... hazloMejor) {
        Persona p1 = new Persona();
        p1.nombre="Eliot";
        System.out.println(p1.nombre);
        transformarNombre(p1);
        System.out.println("despues de pasarle el método transformarNombre.....");
        System.out.println("el nombre es "+p1.nombre);


    }
    static void transformarNombre (Persona p){
        p.nombre="Pedro";
    }
}
