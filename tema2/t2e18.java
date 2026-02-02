package tema2;

import java.util.Scanner;

public class t2e18 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);// Pedimos un número al usuario
        System.out.println("Dime un numero y yo te dire la raiz ");
        double numero = num.nextDouble();
        if (numero < 0) {// Comprobamos que no sea negativo
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
        } else {
            double raiz = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es " + raiz);
        }
        num.close();
    }
}
