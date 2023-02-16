package Sesion1602;

public class Podologo extends Medicos{

    private String hospital;
    private int planta;

    public Podologo(String nombre, String apellido, int numero_colegiado, Paciente[] lista, String hospital, int planta) {
        super(nombre, apellido, numero_colegiado, lista);
        this.hospital = hospital;
        this.planta = planta;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }
}
