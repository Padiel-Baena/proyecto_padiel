package tema3;

import java.util.Scanner;

// Escribe un programa que pida números enteros positivos hasta que se
// introduzca el 0, para cada número nos dirá si es primo o no
public class E7 {
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
        int num;
        boolean primo;
        System.out.println("Dime numeros y yo te dire si es primo o no, en el caso de que me pongas el 0, se terminara el programa");
        num = sc.nextInt();
        while (num < 0) {
            System.out.println("Los numeros negativos no son primos, dame un numero positivo");
            num = sc.nextInt();
        }
        while (num > 0){
            primo = esPrimo(num);
            if (primo){
                System.out.println(num + " es Primo");
            }else {
                System.out.println(num + " no es primo");
            }
            System.out.println("Dime otro numero positivo o 0 para finalizar");
            num = sc.nextInt();
        }
        System.out.println("Finalizando programa...");
    }
}