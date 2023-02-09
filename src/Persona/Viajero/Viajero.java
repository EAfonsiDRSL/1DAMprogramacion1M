package Persona.Viajero;

import java.util.Scanner;

public class Viajero {


    public static int contador;
    private String DNI;
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private String direccion;


    public Viajero(){
        contador++;
    }

    public Viajero(String DNI, String nombre, String apellidos, String nacionalidad, String direccion){
        this.DNI=DNI;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.nacionalidad=nacionalidad;
        this.direccion=direccion;

    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void getInfo(Formato modo){
        String entrada="";
        Scanner sc = new Scanner(System.in);
        switch (modo){
            case normal:
                System.out.println("El dni del pasajero es "+DNI);
                System.out.println("El nombre y apellido del pasajero es "+nombre+apellidos);
                System.out.println("El pasajero tiene la nacionalidad: "+nacionalidad);
                System.out.println("La direccion del pasajero es: "+direccion);
                break;
            case pausado:
                System.out.println("El dni del pasajero es "+DNI);
                entrada = sc.nextLine();
                System.out.println("El nombre y apellido del pasajero es "+nombre+" "+apellidos);
                entrada = sc.nextLine();
                System.out.println("El pasajero tiene la nacionalidad: "+nacionalidad);
                entrada = sc.nextLine();
                System.out.println("La direccion del pasajero es: "+direccion);
                entrada = sc.nextLine();
                break;


        }
    }
}
