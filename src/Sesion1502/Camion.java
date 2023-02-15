package Sesion1502;

public class Camion extends Vehiculos{

    private int numeros_ejes;

    public Camion() {

    }

    public Camion(int km_realizados, String matrícula, int numeros_ejes) {
        super(km_realizados, matrícula);
        this.numeros_ejes = numeros_ejes;
    }

    public int getNumeros_ejes() {
        return numeros_ejes;
    }

    public void setNumeros_ejes(int numeros_ejes) {
        this.numeros_ejes = numeros_ejes;
    }
}
