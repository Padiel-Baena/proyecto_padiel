package tema1;

import java.util.Scanner;

public class t1e6 {
    public static void main (String[]args){
        System.out.println("Dime una valor para el radio");
        Scanner in = new Scanner(System.in) ;
        double radio = in.nextDouble() ;
        double area = 3.14 * radio * radio ;
        System.out.println("Este es el valor del area con el radio que me has dado " + area) ;
    }
}
