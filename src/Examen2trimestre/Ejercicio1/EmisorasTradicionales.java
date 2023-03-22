package Examen2trimestre.Ejercicio1;

public class EmisorasTradicionales extends Emisora implements Emitible{

    //atributos

    private double numero_frecuencia;
    private Frecuencia frecuencia; //AM, FM
    private static final double GANANCIAS_POR_OYENTE=0.023;

    public EmisorasTradicionales(String nombre, int anyo_creacion, int num_oyentes, double numero_frecuencia) throws CreacionInvalida, IllegalArgumentException {
        super(nombre, anyo_creacion, num_oyentes);

        if (numero_frecuencia>=540 && numero_frecuencia<1600){
            this.frecuencia=Frecuencia.AM;
        } else if (numero_frecuencia>88.1 && numero_frecuencia<108.1) {
            this.frecuencia=Frecuencia.FM;
        }else {
            throw new IllegalArgumentException("El numero de frecuencia introducido es incorrecto");
        }

        this.numero_frecuencia = numero_frecuencia;



    }

    public void setNumero_frecuencia(double numero_frecuencia) {
        if (numero_frecuencia>=540 && numero_frecuencia<1600){
            this.frecuencia=Frecuencia.AM;
        } else if (numero_frecuencia>88.1 && numero_frecuencia<108.1) {
            this.frecuencia=Frecuencia.FM;
        }else {
            throw new IllegalArgumentException("El numero de frecuencia introducido es incorrecto");
        }
        this.numero_frecuencia = numero_frecuencia;
    }

    public double getNumero_frecuencia() throws IllegalArgumentException {

        return numero_frecuencia;
    }


    public Frecuencia getFrecuencia() {
        return frecuencia;
    }



    public double ganancias() {
        return num_oyentes * GANANCIAS_POR_OYENTE;
    }


    public void iniciarEmision() throws OpcionInvalida {
        if (emitiendo){
            throw new OpcionInvalida("No se puede iniciar una emision ya iniciada");

        }
        System.out.println("Iniciando la emision "+nombre+" en "+numero_frecuencia);
        emitiendo=true;
    }

    public void finalizarEmision() throws OpcionInvalida {
        if (!emitiendo){
            throw new OpcionInvalida("No se puede finalizar una emision ya finalizada");

        }
        System.out.println("Finalizando la emision "+nombre+" en "+numero_frecuencia);
        emitiendo=false;
    }
}
