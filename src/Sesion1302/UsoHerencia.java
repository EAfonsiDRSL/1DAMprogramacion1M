package Sesion1302;

public class UsoHerencia {
    public static void main(String[] args) {

        //Persona persona = new Persona("64537728g","Carlos")

        Alumno alu1 = new Alumno("12345678c","Carlos",13,45548);

        System.out.println("El alumno tiene el dni"+alu1.getDni()+" con nombre "
        +alu1.getNombre()+" con edad "+alu1.getEdad()+" y ha recibido una beca" +
                "de "+alu1.getBeca()+" euros");

        System.out.println("El 'toString' del alumno es "+alu1.toString());

        Profesor prof1 = new Profesor("0987654h","Erick",45,1200);
        System.out.println("El profesor tiene el dni"+prof1.getDni()+" con nombre "
                +prof1.getNombre()+" con edad "+prof1.getEdad()+" y ha recibido una beca" +
                "de "+prof1.getSalario()+" euros");
        System.out.println("El 'toString' del profesor es "+prof1.toString());
    }
}
