package Sesion0510;

public class OperadorIntanceof {
    public static void main(String[] args) {
        Integer i=5;
        String nombre="eliot";
        System.out.println("la variable i es instancia de clase envoltorio (wrapper) Interger");
        System.out.println(i instanceof Integer);
        //System.out.println(i.getClass());
        System.out.println("la variable nombre es instancia de clase String");
        System.out.println(nombre instanceof String);
        //nombre.getclass();
        System.out.println("Hola");
        System.out.print("hola\n");
    }
}
