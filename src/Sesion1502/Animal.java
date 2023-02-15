package Sesion1502;

public abstract class Animal {


    protected int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void saySomething();

    @Override
    public String toString() {
        return "Animal{" +
                "edad=" + edad +
                '}';
    }


}
