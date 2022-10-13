package Sesion1310;

import java.util.Scanner;

public class ForIncrementarDecrementar {
    public static void main(String[] args) {
       int numero=0;
        System.out.println("introduzca el numero que desee incrementar");
        Scanner sc=new Scanner(System.in);
        numero=sc.nextInt();


        //bucle incremental
        for(int i=1;i<=numero;i++){
            System.out.println(i);
        }
        //bucle decremental
        for(int j=numero;j>0;j--){
           System.out.println(j);
       }
    }
}
