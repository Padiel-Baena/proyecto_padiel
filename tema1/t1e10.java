package tema1;

import java.util.Scanner;

public class t1e10 {
    public static void main(String[]args) {
        System.out.println("Dime un valor de un numero") ;
        Scanner in = new Scanner(System.in) ;
        double numero1 = in.nextDouble();
        System.out.println("Dime un segundo valor");
        Scanner in2 = new Scanner(System.in) ;
        double numero2 = in2.nextDouble();
        double suma = numero1 + numero2 ;
        double resta = numero1 - numero2 ;
        double multiplicacion = numero1 * numero2 ;
        double division = numero1 / numero2 ;
        double resto = numero1 % numero2 ;
        System.out.println("El resultado de las operaciones con los valores que me has dicho son:");
        System.out.println("Suma=" + suma);
        System.out.println("Resta=" + resta);
        System.out.println("Multiplicación=" + multiplicacion);
        System.out.println("Division=" + division);
        System.out.println("Resto=" + resto);
    }
}
