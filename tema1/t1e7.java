package tema1;

import java.util.Scanner;

public class t1e7 {
    public static void main (String[]args){
        System.out.println("Dime el valor de una cara de un dado") ;
        Scanner in = new Scanner(System.in) ;
        int cara = in.nextInt() ;
        if (0 < cara && cara < 7) {
            int resultado = 7 - cara ;
            System.out.println("La cara contraria al lado que me has dicho es "+ resultado);
            } else {
            System.out.println("No me has dicho un numero compatible con la cara de un dado");

        }
        }
    }