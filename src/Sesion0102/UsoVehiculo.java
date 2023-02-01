package Sesion0102;

public class UsoVehiculo {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo();
        System.out.println("El vehículo 1 es de la marca "+vehiculo1.getMarca());
        System.out.println("La referencia del vehículo 1 es "+vehiculo1.getReferencia());
        System.out.println("El vehículo 1 es del modelo "+vehiculo1.getModelo());
        System.out.println("La placa del vehículo 1 es "+vehiculo1.getPlaca());
        System.out.println("El color del vehículo 1 es "+vehiculo1.getColor());
        System.out.println("El vehículo 1 tiene una velocidad de "+vehiculo1.getVelocidad());
        System.out.println("El vehículo 1 esta en la marcha "+vehiculo1.getMarcha());
        vehiculo1.apagar();

        System.out.println("--------------------------------------");

        Vehiculo vehiculo2= new Vehiculo(Marca.AUDI, "AUDI A3",1,"1234LCB","Gris",2700);
        System.out.println("El vehículo 2 es de la marca "+vehiculo2.getMarca());
        System.out.println("La referencia del vehículo 2 es "+vehiculo2.getReferencia());
        System.out.println("El vehículo 2 es del modelo "+vehiculo2.getModelo());
        System.out.println("La placa del vehículo 2 es "+vehiculo2.getPlaca());
        System.out.println("El color del vehículo 2 es "+vehiculo2.getColor());
        System.out.println("El vehículo 2 tiene una velocidad de "+vehiculo2.getVelocidad());
        System.out.println("El vehículo 2 esta en la marcha "+vehiculo2.getMarcha());
        vehiculo2.acelerar(20);
        vehiculo2.cambiarmarcha(2);
        vehiculo2.cambiarmarcha(9);
        vehiculo2.frenar(10);
        vehiculo2.cambiarmarcha(1);
        vehiculo2.apagar();
    }
}
