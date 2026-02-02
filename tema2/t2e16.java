package tema2;

import java.util.Scanner;

public class t2e16 {
    public static void main (String[]args) {
        System.out.println("Dime el valor que quieres que te pase a euros o dolares");//explicacion de programa
        Scanner valor = new Scanner(System.in);
        double cantidad = valor.nextDouble();
        System.out.println("Ahora dime con una " + "D" + " o una " + "E" + " si quieres que te pase el valor a euros o dolares");
        char letra = valor.next().charAt(0);//guardamos la opcion en una variable
        switch (letra) {
            case 'E':
                double oper = cantidad * 1.1704811;
                System.out.println("Los dolares que me has dicho en euros serian un total de " + oper);
                break;
            case 'D':
                double oper2 = cantidad * 0.854041;
                System.out.println("Los euros que me has dicho en dolares serian un total de " + oper2);
                break;
            default:
                System.out.println("No me has dado un valor correcto para la conversion");
                break;

        }
        valor.close();
    }
}