package Sesion1302;

public abstract class Instrumento {

    protected String tipo;

    public abstract void tocar();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
