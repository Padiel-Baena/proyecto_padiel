package tema3.EjerciciosMod2;

import java.util.Scanner;

//Añade a MyMath una función que nos calcule el factorial de un número.
public class MyMath7 {
    public static int factorialRecursivo(int num) {
        if (num == 0) return 1;
        else {
            return num * factorialRecursivo(num - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero y te dire su factorial");
        int num = sc.nextInt();
        System.out.println("El factorial de " + num + " es " +factorialRecursivo(num));
    }
}
