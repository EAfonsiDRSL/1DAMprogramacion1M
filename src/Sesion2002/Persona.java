package Sesion2002;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        if (edad<=0 || nombre.isEmpty()){
            throw new IllegalArgumentException("O la edad es menor o igual a 0 o el nombre lo ha indicado vacio");
        }

        this.nombre=nombre;
        this.edad=edad;
    }
}
