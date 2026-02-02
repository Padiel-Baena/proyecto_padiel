package tema3;

import java.util.Scanner;

//Crea un programa que pida al usuario un radio válido por teclado (>0) y
//calcule la superficie y perímetro de un círculo. Necesitarás implementar
//y utilizar las siguientes funciones:
//boolean validRadius(radius)
//double calculateCirclePerimeter(radius)
//double calculateCircleArea(radius)
public class E3 {
    public static boolean validRadius(double radius) {
        if  (radius > 0) {
            return true;
        }else  {
            return false;
        }
    }
    public static double calculatePerimeter(double radius) {
        return Math.PI * radius ;
    }
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        boolean valido = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un valor para un radio");
        double radius = sc.nextDouble();
        valido =validRadius(radius);
        while (!valido){
            System.out.println("Dime un valor mayor a 0 para que sea un radio valido");
            radius = sc.nextDouble();
            valido = validRadius(radius);
        }

        System.out.println("El perimetro es : "+calculatePerimeter(radius));
        System.out.println("El area es : "+calculateArea(radius));
    }
}
