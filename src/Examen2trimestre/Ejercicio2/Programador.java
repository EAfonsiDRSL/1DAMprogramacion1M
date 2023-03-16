package Examen2trimestre.Ejercicio2;

public class Programador {

        protected String nombre;
        private String DNI;
        protected double salariobase;
        protected int retencion;
        protected double salarioneto;
        protected String lenguaje_de_programacion;
        protected Categoria categoria;

    public Programador() {
    }

    public Programador(String nombre, String DNI, double salariobase, int retencion, double salarioneto, String lenguaje_de_programacion, Categoria categoria) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.salariobase = salariobase;
        this.retencion = retencion;
        this.salarioneto = salarioneto;
        this.lenguaje_de_programacion = lenguaje_de_programacion;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    public int getRetencion() {
        return retencion;
    }

    public void setRetencion(int retencion) {
        this.retencion = retencion;
    }

    public double getSalarioneto() {
        return salarioneto;
    }

    public void setSalarioneto(double salarioneto) {
        this.salarioneto = salarioneto;
    }

    public String getLenguaje_de_programacion() {
        return lenguaje_de_programacion;
    }

    public void setLenguaje_de_programacion(String lenguaje_de_programacion) {
        this.lenguaje_de_programacion = lenguaje_de_programacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString(){
        return "El empleado "+nombre+ " con dni "+DNI+" con perfil" +
                categoria+" programando en "+lenguaje_de_programacion+
                " tiene un salario base de "+salariobase+" que al aplicarle" +
                "la retencion del "+retencion+" le supone un salario neto de "+salarioneto+
                " euros";
    }

    public void calculosalariobase(){
        if (categoria==Categoria.junior){
            salariobase=18000;
        } else if (categoria==Categoria.senior) {
            salariobase=27000;
        } else if (categoria==Categoria.jefe_proyecto) {
            salariobase=35000;
        }
        System.out.println(salariobase);
    }
    public void rango_retencion() throws RetencionIncorrecta{
        if (retencion <0 || retencion >50){
            throw new RetencionIncorrecta("la retencion tiene que estar comprendida entre 0 y 50");
        }
    }
    private void verificar_dni(){

    }

    public void calcularsalarioneto(int retencion){
        int division=(retencion/100);

        salarioneto = salariobase - salariobase*division;

        System.out.println(salarioneto);


    }

}
