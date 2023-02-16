package Sesion1502;

public class UsoVehiculo {
    public static void main(String[] args) {

        Moto moto1 = new Moto(35536,"324fgd",34);
        System.out.println("Introduzca una cantidad de kilometros para la primera moto");
        System.out.println("su cantidad de km es: "+moto1.run()+" km");
        System.out.println(moto1.toString());

        System.out.println("=============================================");

        Camion camion1 = new Camion(737828,"88a7ss",5);
        System.out.println("Introduzca una cantidad de kilometros para el primer camion");
        System.out.println("su cantidad de km es: "+camion1.run()+" km");
        System.out.println(camion1.toString());

        System.out.println("=============================================");

        Coche coche1 = new Coche(723873, "898asf", 4,78);
        System.out.println("Introduzca una cantidad de kilometros para el primer coche");
        System.out.println("su cantidad de km es: "+coche1.run()+" km");
        System.out.println(coche1.toString());




    }
}
