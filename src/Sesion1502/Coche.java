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

    public int getNumero_puertas() {
        return numero_puertas;
    }

    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "numero_puertas=" + numero_puertas +
                ", caballos=" + caballos +
                ", km_realizados=" + km_realizados +
                ", matrícula='" + matrícula + '\'' +
                "} " + super.toString();
    }
}
