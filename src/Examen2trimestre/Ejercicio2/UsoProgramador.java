package Ejercicio2;

public class UsoProgramador {

    public static void main(String[] args) {

        try {
            Programador programador1 = new Programador("Juan", "324243423x", 0, 20, 0, "java", Categoria.senior);

            programador1.rango_retencion();
            programador1.calculosalariobase();
            programador1.calcularsalarioneto(20);

        }catch (RetencionIncorrecta r){
            System.out.println(r.getMessage());
        }

    }
}
