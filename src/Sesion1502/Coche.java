package Sesion1502;

public class Coche extends Vehiculos{

    private int numero_puertas;
    private int caballos;

    public Coche(){

    }

    public Coche(int km_realizados, String matricula, int numero_puertas, int caballos) {
        super(km_realizados, matricula);
        this.numero_puertas = numero_puertas;
        this.caballos = caballos;
    }
}
