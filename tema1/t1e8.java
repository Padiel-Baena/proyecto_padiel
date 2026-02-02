package tema1;

import java.util.Scanner;

public class t1e8 {
    public static void main(String[]args){
        System.out.println("Dime un valor de un numero") ;
        Scanner in = new Scanner(System.in) ;
        int numero1 = in.nextInt();
        System.out.println("Dime un segundo valor");
        Scanner in2 = new Scanner(System.in) ;
        int numero2 = in2.nextInt();
        if (numero1 == numero2) {
             System.out.println("Los dos numeros son iguales");
        } else if (numero1 < numero2) {
            System.out.println("El primer numero es mas pequeño que el segundo");
        } else if (numero1 > numero2) {
            System.out.println("El primer numero es mas grande que el segundo");

        }

    }
}
