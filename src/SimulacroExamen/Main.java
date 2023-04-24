package SimulacroExamen;

public class Main {
    public static void main(String[] args) {

        Mujer m1 = new Mujer("12345678x","Sofia","Bermejo",38,1.60,54,false);
        Mujer m2 = new Mujer("12345678x","elena","afffar",38,1.78,100,false);

        Hombre h1 = new Hombre("12345678x","Eliot","Arias",38,1.99,89,false);
        Hombre h2 = new Hombre("12345678x","Pepe","Arias",38,1.70,60,true);

        Filtrados.add(m1);
        Filtrados.add(m2);
        Filtrados.add(h1);
        Filtrados.add(h2);
        System.out.println("Imprimir las personas insertadas en lista");
        Filtrados.printArray(Filtrados.lista);
        System.out.println("Imprimir de mayor a menor icm");
        Filtrados.OrderByHigherToLowerICM();
        System.out.println("Imprimir de menor a mayor icm");
        Filtrados.OrderByLowerToHigherICM();

        System.out.println("Filtrar los chicos con icm menor a 25");
        Filtrados.printArray(Filtrados.filterbygenderICMLower(25,'H'));
    }
}
