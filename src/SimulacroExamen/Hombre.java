package SimulacroExamen;

public class Hombre extends Persona{
    protected boolean barba;


    public Hombre(String dni, String nombre, String apellido1, int edad, double altura, double peso, boolean luz) {
        super(dni, nombre, apellido1, edad, altura, peso);
        this.barba = luz;
    }

    public Categoria calcularCategoria() {
        Categoria cat = null;
        if (icm < 20) {
            cat = Categoria.ANOREXIA;
        }
        else if (icm >= 20 && icm < 26.5){
            cat = Categoria.IDEAL;
        }else {
            cat = Categoria.SOBREPESO;
        }
        return cat;
    }

    public boolean isBarba() {
        return barba;
    }

    public void setBarba(boolean barba) {
        this.barba = barba;
    }
}
