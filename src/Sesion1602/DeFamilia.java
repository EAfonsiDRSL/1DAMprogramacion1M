package Sesion1602;

import java.security.MessageDigest;

public class DeFamilia extends Medicos {

    private String nombre_centro_salud;

    public DeFamilia(String nombre, String apellido, int numero_colegiado, Paciente[] lista, String nombre_centro_salud) {
        super(nombre, apellido, numero_colegiado, lista);
        this.nombre_centro_salud = nombre_centro_salud;
    }

    public String getNombre_centro_salud() {
        return nombre_centro_salud;
    }

    public void setNombre_centro_salud(String nombre_centro_salud) {
        this.nombre_centro_salud = nombre_centro_salud;
    }
}
