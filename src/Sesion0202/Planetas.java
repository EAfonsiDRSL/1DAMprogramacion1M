package Sesion0202;

import java.util.Scanner;

public class Planetas {
    //variable de clase -compartida por todos los objetos

    public static int contador=0;

    //atributos de objetos
    private String nombre=null;
    private int satelites=0;
    private double masa=0; //en kilogramos
    private double volumen=0; //en kilometros cubicos
    private int diametro=0; //en kilometros
    private int distancia_al_sol=0;
    private TipoPlaneta tipo;
    private boolean observable=false;

    public Planetas (){

        contador++;

    }
    public Planetas(String nombre, int satelites,double masa,double volumen,int diametro,
                    int distancia_al_sol,TipoPlaneta tipo,  boolean observable){


        this.nombre=nombre;
        this.satelites=satelites;
        this.masa=masa;
        this.volumen=volumen;
        this.diametro=diametro;
        this.distancia_al_sol=distancia_al_sol;
        this.tipo=tipo;
        this.observable=observable;
        contador++;

    }


    public String getNombre() {



        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSatelites() {


        return satelites;
    }

    public void setSatelites(int satelites) {
        this.satelites = satelites;
    }

    public double getMasa() {


        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {


        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiametro() {


        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDistancia_al_sol() {


        return distancia_al_sol;
    }

    public void setDistancia_al_sol(int distancia_al_sol) {
        this.distancia_al_sol = distancia_al_sol;
    }

    public TipoPlaneta getTipo() {


        return tipo;
    }

    public void setTipo(TipoPlaneta tipo) {
        this.tipo = tipo;
    }

    public boolean isObservable() {

        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }

    @Override
    public String toString() {
        return "Planetas{" +
                "nombre='" + nombre + '\'' +
                ", satelites=" + satelites +
                ", masa=" + masa +
                ", volumen=" + volumen +
                ", diametro=" + diametro +
                ", distancia_al_sol=" + distancia_al_sol +
                ", tipo=" + tipo +
                ", observable=" + observable +
                '}';
    }

    public void imprimir(){
        System.out.println("El nombre del planeta es "+nombre);
        System.out.println("La cantidad de satelites que tienes es "+satelites);
        System.out.println("Tiene una masa de "+masa+ "kg");
        System.out.println("Tiene un diametro de "+diametro+ "km");
        System.out.println("La distancia que hay desde "+nombre+" hasta el sol es de "+distancia_al_sol+ "km");
        System.out.println("Es de tipo "+tipo);
        System.out.println("Es observable a simple vista? "+observable);
    }

    //método calcular densidad
    public double calculo_densidad(){
        double densidad=0;
        densidad= masa/volumen;
        return densidad;
    }

    //método
    public boolean exterior() {
        boolean esExterior=false;
        float limite = (float) (149597870*3.4);

        if (distancia_al_sol>limite){
            esExterior=true;
        }
        return esExterior;
    }
}
