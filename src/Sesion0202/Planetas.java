package Sesion0202;

public class Planetas {


    private String nombre;
    private int satelites;
    private double masa; //en kilogramos
    private double volumen; //en kilometros cubicos
    private int diametro; //en kilometros
    private int distancia_al_sol;
    private TipoPlaneta tipo;
    private boolean observable=false;

    public Planetas (String nombre,int satelites, double masa, double volumen, int diametro, int distancia_al_sol,TipoPlaneta tipo, boolean observable){


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


}
