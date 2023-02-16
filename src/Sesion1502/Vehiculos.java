package Sesion1502;

import java.util.Scanner;

public class Vehiculos {

    protected int km_realizados;
    protected String matrícula;

    public Vehiculos (){

    }
    public Vehiculos (int km_realizados, String matrícula){
        this.km_realizados=km_realizados;
        this.matrícula=matrícula;
    }

    public int getKm_realizados() {
        return km_realizados;
    }

    public void setKm_realizados(int km_realizados) {
        this.km_realizados = km_realizados;
    }

    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }


    public int run (){
        int km=0;

        Scanner sc = new Scanner(System.in);
        km = sc.nextInt();

        return km + this.km_realizados;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "km_realizados=" + km_realizados +
                ", matrícula='" + matrícula + '\'' +
                '}';
    }
}
