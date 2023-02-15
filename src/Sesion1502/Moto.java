package Sesion1502;

public class Moto extends Vehiculos{

    private int cilindrada;

    public Moto(){}

    public Moto(int km_realizados, String matrícula, int cilindrada) {
        super(km_realizados, matrícula);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
