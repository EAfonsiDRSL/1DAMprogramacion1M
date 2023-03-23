package PreparacionExamen.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws EdadIncorrecta, SexoIncorrecto {
    try {
        /**Scanner sc = new Scanner(System.in);
        String nombre;
        ;
        String sexo;
        int edad;
        double peso;
        double altura;
        System.out.println("Introduzca el nombre de la primera persona");
        nombre = sc.next();
        System.out.println("Introduzca la edad de " + nombre);
        edad = sc.nextInt();
        System.out.println("Introduza el sexo de " + nombre + " entre h y m");
        sexo = sc.next().toLowerCase();
        System.out.println("Introduzca el peso de " + nombre);
        peso = sc.nextDouble();
        System.out.println("Introduzca la altura de " + nombre);
        altura = sc.nextDouble();

        Persona persona1 = new Persona(nombre, edad, 89543879, sexo, peso, altura);

        System.out.println("Introduzca el nombre de la segunda persona");
        nombre = sc.next();
        System.out.println("Introduzca la edad de " + nombre);
        edad = sc.nextInt();
        Persona persona2 = new Persona(nombre, edad, 23456543, "m", 78.4, 1.87);

        Persona persona3 = new Persona();
        persona3.setNombre("Eliot");
        persona3.setEdad(34);
        persona3.setDni(67584485);
        persona3.setSexo("m");
        persona3.setPeso(65.3);
        persona3.setAltura(1.76);

        Persona[] lista_personas = {persona1, persona2, persona3};

        for (int i = 0; i < lista_personas.length; i++) {
            int valor=lista_personas[i].calcularIMC();
            switch (valor){
                case -1 :
                    System.out.println("Estas anorexico");break;
                case 0 :
                    System.out.println("Estas en tu peso ideal");break;
                case 1 :
                    System.out.println("Estas en sobrepeso");break;
            }
            System.out.println(lista_personas[i].getNombre() + " es mayor de edad? : " + lista_personas[i].esMayorDeEdad());
            System.out.println(lista_personas[i].toString());
        }
         **/
        //forzar excepciones
        //EdadIncorrecta
        //Persona persona4 = new Persona("Juan", -2, "h");

        //SexoIncorrecto
        Persona persona = new Persona();
        persona.setSexo("g");

    }catch (Exception e){
        System.out.println(e.getMessage());
    }


    }
}
