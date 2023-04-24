package SimulacroExamen;

public abstract class Persona {

    protected String dni;
    protected String nombre;
    protected String apellido1;
    protected int edad;
    protected double altura;
    protected double peso;
    protected double icm;
    protected Categoria estado;

    public Persona(String dni, String nombre, String apellido1, int edad, double altura, double peso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.icm = calcularICM();
        this.estado = calcularCategoria();

    }

    public abstract Categoria calcularCategoria();

    public double calcularICM(){
        return peso/Math.pow(altura,2);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        this.icm=calcularICM();
        this.estado=calcularCategoria();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.icm=calcularICM();
        this.estado=calcularCategoria();
    }

    public double getIcm() {
        return icm;
    }

    public Categoria getEstado() {
        return estado;
    }


}
