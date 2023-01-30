package Sesion3001;

public class Pelota {

    float peso;
    String tipo;
    int presion;
    String color;
    String marca;

    Pelota(){
        marca="Adidas";
        tipo="Futbol";
        color="Blanco";
        presion=3;
        peso=1;
    }




    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return presion;
    }

    public void setPrecio(int precio) {
        this.presion = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
