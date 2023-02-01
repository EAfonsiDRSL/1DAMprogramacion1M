package Sesion0102;

public class Vehiculo {

    //atributos

    private Marca marca;
    private String referencia;
    private int modelo;
    private String placa;
    private String color;
    private int valor;
    private int velocidad;
    private int marcha;

    //constructores


    //1er constructor: El de defecto
    public Vehiculo() {


    }

    //2do constructor: el paremetrizado

    public Vehiculo (Marca marca, String referencia, int modelo, String placa, String color, int valor){
        this.marca=marca;
        this.referencia=referencia;
        this.modelo=modelo;
        this.placa=placa;
        this.color=color;
        this.valor=valor;
        this.velocidad=0;
        this.marcha=0;

    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getMarcha(){
        return marcha;
    }

    public void setMarcha(int marcha){
        this.marcha=marcha;
    }

    public void acelerar(int velocidad){
        System.out.println("El coche esta acelerando a "+velocidad+" km/h");
        this.velocidad=this.velocidad+velocidad;
    }
    public void frenar(int velocidad){
        System.out.println("El coche esta ralentizando la velocidad a "+velocidad+" km/h");
        this.velocidad=this.velocidad-velocidad;
    }
    public void cambiarmarcha(int marcha){
        if (this.marcha==marcha){
            System.out.println("Estás en esa marcha. No podemos cambiar");
        } else if (marcha>7) {
            System.out.println("No existe esa marcha en el coche");
        }else{
            System.out.println("cambiando de marcha a "+marcha);
            this.marcha=marcha;
        }

    }
    public void apagar(){
        System.out.println("Apagando el coche ......");
        this.velocidad=0;
        this.marcha=1;
    }
}
