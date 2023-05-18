package EjercicioSimulacroExamen3;

public class EmisoraTradicional extends Emisora {

    public static final double GANANCIA_TRADICIONAL = 0.023;

    private double num_frecuencia;
    private Frecuencias frecuencias;

    public EmisoraTradicional(int num_emisora, String nombre_emisora, int num_oyentes, double num_frecuencia) throws AccionInvalida {
        super(num_emisora, nombre_emisora, num_oyentes);
        this.num_frecuencia = num_frecuencia;
        if (num_frecuencia >= 540 && num_frecuencia <= 1600){
            this.frecuencias = Frecuencias.AM;
        } else if (num_frecuencia >= 88.1 && num_frecuencia <= 108.1) {
            this.frecuencias = Frecuencias.FM;
        }

    }

    public double getNum_frecuencia() {
        return num_frecuencia;
    }

    public void setNum_frecuencia(double num_frecuencia) {
        this.num_frecuencia = num_frecuencia;
    }

    public Frecuencias getFrecuencias() {

        return frecuencias;
    }
    double ganancias() {
        return num_oyentes * GANANCIA_TRADICIONAL;
    }

    @Override
    public String toString() {
        return "EmisoraTradicional{" +
                "num_frecuencia=" + num_frecuencia +
                ", frecuencias=" + frecuencias +
                ", num_emisora=" + num_emisora +
                ", nombre_emisora='" + nombre_emisora + '\'' +
                ", emitiendo=" + emitiendo +
                ", beneficios=" + beneficios +
                ", num_oyentes=" + num_oyentes +
                "} " + super.toString();
    }
}
