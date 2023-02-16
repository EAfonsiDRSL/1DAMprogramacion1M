package Sesion1602;

public class Cirujano extends Medicos {

    private String hospital;
    private int numero_de_box;

    public Cirujano(String nombre, String apellido, int numero_colegiado, Paciente[] lista, String hospital, int numero_de_box) {
        super(nombre, apellido, numero_colegiado, lista);
        this.hospital = hospital;
        this.numero_de_box = numero_de_box;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getNumero_de_box() {
        return numero_de_box;
    }

    public void setNumero_de_box(int numero_de_box) {
        this.numero_de_box = numero_de_box;
    }
}
