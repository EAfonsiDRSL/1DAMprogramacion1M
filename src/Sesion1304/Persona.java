package Sesion1304;

public class Persona {
    String dni;

    public Persona(String dni) {
        this.dni = dni;
    }

    public String getDni() {

        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                '}';
    }
}
