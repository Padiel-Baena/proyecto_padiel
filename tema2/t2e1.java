package tema2;

import java.util.Scanner;

public class t2e1 {
    public static void main (String[]args) {
        System.out.println("Dime un numero que equivaldra al lado de un cuadrado y asi te puedo calcular el area y perimetro "); //Le pedimos al usuario que nos de un valor
        Scanner in = new Scanner(System.in) ; //Leemos el valor que nos ha dado el usuario
        double lado = in.nextDouble(); //Almacenamos el valor en una variable llamada lado
        in.close(); //cerramos el escaner
        if (lado >= 0) { //hacemos una comprobacion de que el valor es positivo
            double area = lado * lado; //Variable para calcular el area
            double perimetro = lado * 4; // Variable para calcular el perimetro
            System.out.println("El area de un cuadrado de lado " + lado + " es igual a " + area + "Y el perimetro del mismo cuadrado es " + perimetro); //Decimos al usuario los valores
        } else { //Si no ha pasado la comprobacion previa, le decimos que el valor no es compatible
            System.out.println("Me has dado un valor que no es compatible con el lado de un cuadrado");
        }
    }
}
