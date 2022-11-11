package Sesion1011;

import java.util.Scanner;

public class EjercicioArray {
    public static void main(String[] args) {

        System.out.println("Array primera forma");
        int [][]bidimensional1;
        bidimensional1=new int[2][2];
        bidimensional1[0][0]=2;
        bidimensional1[0][1]=0;
        bidimensional1[1][0]=6;
        bidimensional1[1][1]=8;

        for (int i=0;i< bidimensional1.length;i++){
            for (int j=0;j< bidimensional1.length;j++){
                System.out.print(bidimensional1[i][j]+" , ");
            }
        }

        int[][]bidimensional2={{1,8},{9,10}};

        for (int i=0;i<bidimensional2.length;i++){
            for (int j=0;j< bidimensional2.length;j++){
                System.out.print(bidimensional2[i][j]+" , ");
            }
        }
        System.out.println("\nArray tercera forma");
        int[][]bidimensional3 = new int [2][2];
        Scanner sc= new Scanner(System.in);
        for (int i=0;i<bidimensional3.length;i++){
            for (int j=0;j<bidimensional3.length;j++){
                System.out.println("Introduce un numero");
                bidimensional3[i][j]=sc.nextInt();
            }
        }System.out.println("Sus numeros son:");
        for (int i=0;i<bidimensional3.length;i++){
            for (int j=0;j<bidimensional3.length;j++){

                System.out.print(bidimensional3[i][j]+" , ");
            }
        }


        System.out.println("\nPrimera forma");
        int [][]matriz2x3;
        matriz2x3=new int[2][3];
        matriz2x3[0][0]=2;
        matriz2x3[0][1]=4;
        matriz2x3[0][2]=3;
        matriz2x3[1][0]=8;
        matriz2x3[1][1]=9;
        matriz2x3[1][2]=210;

        for (int i=0;i< matriz2x3.length;i++){
            for (int j=0;j< matriz2x3[i].length;j++){
                System.out.print(matriz2x3[i][j]+" , ");
            }
        }


        System.out.println("\nSegunda forma");
        int [][]matriz2x3v2={{5,6,8},{3,7,9}};

        for (int i=0;i< matriz2x3v2.length;i++){
            for (int j=0;j< matriz2x3v2[i].length;j++){
                System.out.print(matriz2x3v2[i][j]+" , ");
            }
        }


        System.out.println("\nTercera forma");
        int [][]matriz2x3v3=new int [2][3];
        for (int I=0;I<matriz2x3v3.length;I++){
            for (int J=0;J<matriz2x3v3[I].length;J++){
                System.out.println("Introduzca un numero");
                matriz2x3v3[I][J]=sc.nextInt();
            }
        }System.out.println("Sus numeros son:");
        for (int I=0;I<matriz2x3v3.length;I++){
            System.out.print("\n");
            for (int J=0;J<matriz2x3v3[I].length;J++){
                System.out.print(matriz2x3v3[I][J]+" , ");
            }
        }


    }
}
