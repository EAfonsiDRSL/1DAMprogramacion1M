package Sesion0202;

public class UsoLibro {
    public static void main(String[] args) {

        Libro libro1 = new Libro();
        Editorial editorial1 = new Editorial();
        System.out.println("El ISBN del libro es "+libro1.getIsbn());
        System.out.println("El titulo del libro es "+libro1.getTitulo()+" y su editorial es "+editorial1.getNombre());
        System.out.println("El año del libro es "+libro1.getAño()+" €");
        System.out.println("El precio del libro es "+libro1.getPrecio());
        System.out.println("El codigo de la  editorial es "+editorial1.getCodigo());
        System.out.println("El año de la editorial es "+editorial1.getAño());
        libro1.setEditorial(editorial1);
        System.out.println("La editorial del libro 1 es "+libro1.getEditorial());


        Editorial editorial2 = new Editorial(245342, "BebesitasBonitas", 2090);
        Libro libro2 = new Libro("5454856464bd", "Erik vogler",2089,1988972, editorial2);

        System.out.println("==============================================");
        System.out.println("El ISBN del libro es "+libro2.getIsbn());
        System.out.println("El titulo del libro es "+libro2.getTitulo()+" y su editorial es "+libro2.getEditorial());
        System.out.println("El año del libro es "+libro2.getAño());
        System.out.println("El precio del libro es "+libro2.getPrecio()+" €");
        System.out.println("El codigo de la  editorial es "+editorial2.getCodigo());
        System.out.println("El año de la editorial es "+editorial2.getAño());











    }


}
