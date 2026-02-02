package tema2;
/*Haz un programa que pida un número entero por consola e indica si es
primo o no. Un número primo sólo es divisible por él mismo y por la
unidad.*/
import java.util.Scanner;

public class t2e26 {
    public static void main(String[] args){
        System.out.println("Dime un numero entero, y yo te dire si es primo o no");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean primo = true;
        sc.close();
        if (num <= 1){
            primo = false;
        } else {
            for (int a = 2; a <= Math.sqrt(num); a++) {
                if (num % a == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo){
            System.out.println("El numero que me has dicho es primo");
        } else {
            System.out.println("El numero que me has dicho no es primo");
        }
    }
}

