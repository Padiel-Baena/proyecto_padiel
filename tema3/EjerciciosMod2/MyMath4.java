package tema3;

import java.util.Scanner;

//Añade a MyMath una función que devuelve el número de dígitos pares de
//un número entero.
public class MyMath4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero, y yo te dire los  digitos que tiene y los que son pares");
        int num = sc.nextInt();
        int result =pares(num);
        System.out.println("La cantidad de digitos pares es : " + result );
    }
        public static int pares ( int num){
            int cpares =0;
            boolean hayPares = false;
            String resultado = "";
            while (num > 0) {
                int digito = num % 10; // Último dígito
                if (digito % 2 == 0) {
                    resultado = digito + " " + resultado; // Guardamos en orden correcto
                    hayPares = true;
                    cpares ++;
                }
                num /= 10;
            }
            if (hayPares) {
                System.out.println(resultado.trim());
            } else {
                System.out.println("Ninguno (no hay dígitos pares)");
            }
                return cpares;
    }
}
