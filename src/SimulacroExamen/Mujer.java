package SimulacroExamen;

public class Mujer extends Persona{
    protected boolean luz;


    public Mujer(String dni, String nombre, String apellido1, int edad, double altura, double peso, boolean luz) {
        super(dni, nombre, apellido1, edad, altura, peso);
        this.luz = luz;
    }

    public Categoria calcularCategoria() {
        Categoria cat = null;
        if (icm < 18.5) {
            cat = Categoria.ANOREXIA;
        }
        else if (icm >= 18.5 && icm < 24.9){
            cat = Categoria.IDEAL;
        }else {
            cat = Categoria.SOBREPESO;
        }
        return cat;
    }

    public boolean isLuz() {
        return luz;
    }

    public void setLuz(boolean luz) {
        this.luz = luz;
    }
}
