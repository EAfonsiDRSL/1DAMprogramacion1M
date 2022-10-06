package a.b;

public class conversionexplicita {
    public static void main(String[] args) {
        byte b;
        int i=257;
        double d=323.142;
        System.out.println("convertir un integel a byte de manera explicita");
        b = (byte) i;
        System.out.println("la i= "+i+" b= "+b);
        System.out.println("convertir un double a byte de manera explicita");
        b = (byte) d;
        System.out.println("d= "+d+" b= "+b);

    }




}


