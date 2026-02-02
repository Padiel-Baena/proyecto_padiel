package tema1;

import java.util.Scanner;

public class t1e9 {
    public static void main (String[]args){
        System.out.println("Dime un valor de un numero") ;
        Scanner in = new Scanner(System.in) ;
        int numero1 = in.nextInt();
        System.out.println("Dime un segundo valor");
        Scanner in2 = new Scanner(System.in) ;
        int numero2 = in2.nextInt();
        int suma = numero1 + numero2 ;
        int resta = numero1 - numero2 ;
        int multiplicacion = numero1 * numero2 ;
        int division = numero1 / numero2 ;
        int resto = numero1 % numero2 ;
        System.out.println("El resultado de las operaciones con los valores que me has dicho son:");
        System.out.println("Suma=" + suma);
        System.out.println("Resta=" + resta);
        System.out.println("Multiplicación=" + multiplicacion);
        System.out.println("Division=" + division);
        System.out.println("Resto=" + resto);

    }
}
