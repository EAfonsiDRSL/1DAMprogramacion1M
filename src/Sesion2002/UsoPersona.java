package Sesion2002;

public class UsoPersona {
    public static void main(String[] args) {


        try {
            Persona persona1 = new Persona("",19);

        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());

        }
    }
}
