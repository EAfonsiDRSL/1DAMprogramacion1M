package PreparacionExamen.Ejercicio1;

public class Persona {

    public static final int IDEAL=-1;
    public static final int DEBAJO_PESO_IDEAL=0;
    public static final int SOBREPESO = 1;
    /**atributos de la clase persona*/
    private String nombre=null;
    private int edad=0;
    private int dni;
    private String dni_completo;
    private Sexo sexo=Sexo.h;
    private double peso=0.0;
    private double altura=0.0;

    /**constructores de la clase persona: en total son 3*/



    public Persona (){

    }

    public Persona(String nombre, int edad, String sexo) throws EdadIncorrecta, SexoIncorrecto {
        this.nombre = nombre;
        if (edad < 0 ){
            throw new EdadIncorrecta("No se puede introducir una edad negativa");
        }
        this.edad = edad;
        if (!Sexo.valueOf(sexo).equals(Sexo.h) || !Sexo.valueOf(sexo).equals(Sexo.m)){
            throw new SexoIncorrecto("El sexo introducido no es válido");
        }
        this.sexo = Sexo.valueOf(sexo.toLowerCase());
    }

    public Persona(String nombre, int edad, int dni, String sexo, double peso, double altura) throws EdadIncorrecta, SexoIncorrecto {
        this.nombre = nombre;
        if (edad < 0 ){
            throw new EdadIncorrecta("No se puede introducir una edad negativa");
        }
        this.edad = edad;
        this.dni = dni;
        this.dni_completo = generarDNI();
        if (!(Sexo.valueOf(sexo).equals(Sexo.h) || Sexo.valueOf(sexo).equals(Sexo.m))){
            throw new SexoIncorrecto("El sexo introducido no es válido");
        }
        this.sexo = Sexo.valueOf(sexo.toLowerCase());
        this.peso = peso;
        this.altura = altura;
    }

    /**
     *
     * @return el dni de manera aleatoria
     */
    private String generarDNI() {
        String dni_con_letra=null;
        char letra_supuesta = 0;
        int dni_sin_letra=dni;
        int resto = dni_sin_letra%23;
        switch (resto){
            case 0: letra_supuesta='T';break;
            case 1:letra_supuesta='R';break;
            case 2:letra_supuesta='W';break;
            case 3:letra_supuesta='A';break;
            case 4:letra_supuesta='G';break;
            case 5:letra_supuesta='M';break;
            case 6:letra_supuesta='Y';break;
            case 7:letra_supuesta='F';break;
            case 8:letra_supuesta='P';break;
            case 9:letra_supuesta='D';break;
            case 10:letra_supuesta='X';break;
            case 11:letra_supuesta='B';break;
            case 12:letra_supuesta='N';break;
            case 13:letra_supuesta='J';break;
            case 14:letra_supuesta='Z';break;
            case 15:letra_supuesta='S';break;
            case 16:letra_supuesta='Q';break;
            case 17:letra_supuesta='V';break;
            case 18:letra_supuesta='H';break;
            case 19:letra_supuesta='L';break;
            case 20:letra_supuesta='C';break;
            case 21:letra_supuesta='K';break;
            case 22:letra_supuesta='E';break;
        }

        return String.valueOf(dni_sin_letra)+letra_supuesta;
    }

    /**
     *
     * @return si el usuario esta en peso ideal, infrapeso o sobrepeso
     */
    public int calcularIMC(){

        double calc_peso = peso /(Math.pow(altura,2));
        if (calc_peso < 20){
            return IDEAL;
        } else if (calc_peso >= 20 && calc_peso <= 25) {
            return  DEBAJO_PESO_IDEAL;
        }else {
            return SOBREPESO;
        }
    }

    /**
     *
     * @return si alguien es o no mayor de edad
     */
    public boolean esMayorDeEdad(){
        boolean mayoria_edad=false;
        if (edad >= 18){
            mayoria_edad = true;
        }
        return mayoria_edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", dni_completo='" + dni_completo + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadIncorrecta {
        if (edad < 0 ){
            throw new EdadIncorrecta("No se puede introducir una edad negativa");
        }
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
        this.dni_completo=generarDNI();
    }

    public String getDni_completo() {
        return dni_completo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(String sexo)throws SexoIncorrecto {
        if (!(Sexo.valueOf(sexo).equals(Sexo.h) || Sexo.valueOf(sexo).equals(Sexo.m))){
            throw new SexoIncorrecto("El sexo introducido no es válido");
        }
        this.sexo = Sexo.valueOf(sexo.toLowerCase());
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
