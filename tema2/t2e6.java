package tema2;

import java.util.Scanner;

public class t2e6 {
    public static void main (String[]args){
        System.out.println("Dime un numero y te dire si es negativo, positivo o zero");//explicamos el codigo
        Scanner scanner = new Scanner(System.in) ;//leemos valor
        double n1 = scanner.nextDouble();//almacenamos valor
        scanner.close();//cerramos escaner
        if (n1 > 0) {//comprobaciones
            System.out.println("El numero que me has dicho es positivo");
        } else if (n1 < 0) {
            System.out.println("El numero que me has dicho es negativo");
        }else {
            System.out.println("El numero que me has dicho es 0");
        }
    }
}
