package tema3;

import java.util.Scanner;

//2. Añade una función a MyMath que nos diga si un número es primo. Añade
//otra función que nos diga si un número NO es primo (reutiliza código)
public class MyMath2 {
    public static boolean esPrimo(int num) {
        boolean primo = true;
        if (num <= 1) {
            return false;
        } else {
            for (int a = 2; a <= Math.sqrt(num); a++) {
                if (num % a == 0) {
                    primo = false;
                    break;
                }
            }
            return primo;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero y te dire si es  primo");
        int num = sc.nextInt();
        while(num<=0){
            System.out.println("Los numero negativos no son primos, dime un numero positivo");
            num = sc.nextInt();
        }
        boolean primo = esPrimo(num);
        if (primo){
            System.out.println(num + " Es primo");
        }else {
            System.out.println(num + " No es primo");
        }
    }
}
