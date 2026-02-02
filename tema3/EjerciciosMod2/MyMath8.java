package tema3;

import java.util.Scanner;

public class MyMath8 {

    public static int comprobacionEcuacion(int a, int b, int c){
        int prove = b*b - 4*a*c;
        if(prove>0) {return 2;}
        else if(prove == 0){return 1;}
        else{return 0;}
    }


    public static double solucion1(int a, int b, int c) {
        return (-b - Math.sqrt(b*b - 4*a*c)) / (2.0 * a);
    }

    public static double solucion2(int a, int b, int c) {
        return (-b + Math.sqrt(b*b - 4*a*c)) / (2.0 * a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Este es un programa para calcular ecuaciones de segundo grado.");
        System.out.println("Dime el primer número");
        int a = sc.nextInt();
        System.out.println("Dime el segundo número");
        int b = sc.nextInt();
        System.out.println("Dime el tercer número");
        int c = sc.nextInt();
        int n = comprobacionEcuacion(a, b, c);
        System.out.println("La ecuación tiene " + n + " soluciones reales.");
        if (n > 0) {
            System.out.println("Solución 1: " + solucion1(a, b, c));
        }
        if (n == 2) {
            System.out.println("Solución 2: " + solucion2(a, b, c));
        }
        }
    }

