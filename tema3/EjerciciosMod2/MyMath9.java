package tema3.EjerciciosMod2;

import java.util.Scanner;

public class MyMath9 {
    public static int sumaDigitos(int n) {
        int suma = 0;
        int num = n;
            while (n >= 1) {
                num = n% 10;
                suma +=  num;
                n/=10;
            }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero y yo sumare todos sus digitos");
        int n = sc.nextInt();
        System.out.println(sumaDigitos(n));
    }
}