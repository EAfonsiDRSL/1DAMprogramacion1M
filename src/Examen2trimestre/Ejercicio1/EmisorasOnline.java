package Examen2trimestre.Ejercicio1;

public class EmisorasOnline extends Emisora implements Emitible{


    private static final double GANANCIA_POR_OYENTE=0.015;
    private String url;


    public EmisorasOnline(String nombre, int anyo_creacion, int num_oyentes, String url) throws CreacionInvalida {
        super(nombre, anyo_creacion, num_oyentes);
        this.url = url;
    }

    public double ganancias() {
        return num_oyentes*GANANCIA_POR_OYENTE;

    }

    public void iniciarEmision() throws OpcionInvalida {
        if (emitiendo){
            throw new OpcionInvalida("No se puede iniciar una emision ya iniciada");

        }
        System.out.println("Iniciando la emision "+nombre+" en "+url);
        emitiendo=true;
    }

    public void finalizarEmision() throws OpcionInvalida {
        if (!emitiendo){
            throw new OpcionInvalida("No se puede finalizar una emision ya finalizada");

        }
        System.out.println("Finalizando la emision "+nombre+" en "+url);
        emitiendo=false;
    }
   
}
