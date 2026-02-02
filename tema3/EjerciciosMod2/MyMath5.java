package tema3.EjerciciosMod2;

import java.util.Scanner;

//Añade a MyMath una función que devuelve el número de dígitos impares
//de un número entero.
public class MyMath5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero, y yo te dire los  digitos que tiene y los que son pares");
        int num = sc.nextInt();
        int n= 1;
        System.out.println(num + " tiene " + MyMath.nDigitos(num) +  " digitos");
        System.out.print("Los digitos pares son el : ");
        noPares(num);
    }
    public static void noPares ( int num){

        boolean noHayPares = false;
        String resultado = "";
        while (num > 0) {
            int digito = num % 10; // Último dígito
            if (digito % 2 == 1) {
                resultado = digito + " " + resultado; // Guardamos en orden correcto
                noHayPares = true;
            }
            num /= 10;
        }
        if (noHayPares) {
            System.out.println(resultado.trim());
        } else {
            System.out.println("Ninguno (no hay dígitos pares)");
        }

    }
}
