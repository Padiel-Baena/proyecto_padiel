package tema3.EjerciciosMod2;

import java.util.Scanner;

//Añade a MyMath una función que nos calcule el factorial de un número
//(de manera recursiva).
public class MyMath6 {
    public static int factorial(int num) {
        int var = num;
        int prod = 1;
        if (num >= 0) {
            while (num != 0) {
                prod = prod * num;
                num--;
            }
        }
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero y te dire su factorial");
        int num = sc.nextInt();
        System.out.println("El factorial de " + num + " es " +factorial(num));
    }
}
