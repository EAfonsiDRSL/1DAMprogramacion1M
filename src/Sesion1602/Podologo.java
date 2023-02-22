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
    public boolean trabaja (String hospital){
        boolean trabaja = false;
        if (hospital.toLowerCase().equals(this.hospital.toLowerCase())){
            trabaja = true;
        }
        return trabaja;
    }
    public void Pacientes (Paciente [] pacientes){
        for (int i = 0 ; i< pacientes.length; i ++){
            System.out.println(pacientes[i].toString());
        }
    }

    @Override
    public String toString() {
        return "Podologo{" +
                "hospital='" + hospital + '\'' +
                ", planta=" + planta +
                '}'+ super.toString();
    }
}
