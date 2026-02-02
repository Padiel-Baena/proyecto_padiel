package tema1;

import java.util.Scanner;

public class t1e12 {
    public static void main(String[]args){
        System.out.println("Dime un año");
        Scanner in = new Scanner(System.in) ;
        int anyo = in.nextInt() ;
        if (anyo % 400 == 0){
            System.out.println("El año que me has dicho es bisiesto");
        } else if ((anyo % 4 == 0) && (anyo % 100 != 0)) {
            System.out.println("El año que me has dicho es bisiesto");
        } else {
            System.out.println("El año que me has dicho no es bisiesto");
        }
    }
}
