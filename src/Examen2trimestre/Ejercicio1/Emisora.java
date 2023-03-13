package Examen2trimestre.Ejercicio1;

public abstract class Emisora implements Emitible{

    //atributos

    protected int num_emisoras=0;
    protected int identificador;
    protected String nombre;
    protected int anyo_creacion;
    protected boolean emitiendo=false;
    protected int num_oyentes;

    protected static int cuenta_emisoras;

    //constructor
    public Emisora(){


    }

    public Emisora(String nombre, int anyo_creacion, int num_oyentes) throws CreacionInvalida{
        this.nombre = nombre.toUpperCase();
        this.identificador = cuenta_emisoras++;

        if (anyo_creacion<1879){
            throw new CreacionInvalida("El año de creacion de la radio debe ser igual o superior a 1879");
        }
        this.anyo_creacion = anyo_creacion;
        this.num_oyentes = num_oyentes;

        System.out.println("Se ha creado la emisora numero "+identificador);

    }

    public abstract double ganancias();

    public boolean estaEmitiendo(){
        return emitiendo;
    }

    public int getNum_emisoras() {
        return num_emisoras;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public int getAnyo_creacion() {
        return anyo_creacion;
    }

    public void setAnyo_creacion(int anyo_creacion) throws CreacionInvalida {
        if (anyo_creacion<1879){
            throw new CreacionInvalida("El año de creacion de la radio debe ser igual o superior a 1879");
        }
        this.anyo_creacion = anyo_creacion;
    }

    public int getNum_oyentes() {
        return num_oyentes;
    }

    public void setNum_oyentes(int num_oyentes) {
        this.num_oyentes = num_oyentes;
    }
}
