package tema3;

import java.util.Scanner;

//Crea una clase MyMath que tendrá funciones para calcular el perímetro y
//el área de un círculo, cuadrado y rectángulo. Los nombres de las
//funciones serán:
//squarePerimeter
//squareArea
//rectanglePerimeter
//rectangleArea
//circlePerimeter
//circleArea
public class MyMath1 {
    public static double squarePerimeter(double l) {
        return 4*l;
    }
    public static double squareArea(double l) {
        return l*l;
    }
    public static double rectanglePerimeter(double b, double h) {
        return (b*2) +  (h*2);
    }
    public static double rectangleArea(double b, double h) {
        return b*h;
    }
    public static double circlePerimeter(double r) {
        return Math.PI*2*r;
    }
    public static double circleArea(double r) {
        return Math.PI*r*r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el valor del lado de un cuadrado y yo te dire el perimetro y el area de un cuadrado");
        double l = sc.nextDouble();
        System.out.println("El perimetro del cuadrado  de lado " + l + " es "+squarePerimeter(l) +" y el area del cuadrado es "+squareArea(l));
        System.out.println("Ahora dime los valores de un rectangulo y te dire su perimetro y su altura, empieza diciendo la base");
        double b = sc.nextDouble();
        System.out.println("Ahora dime la altura");
        double h = sc.nextDouble();
        System.out.println("El perimetro del rectangulo de base " + b + " y altura " +h + " es " +  rectanglePerimeter(b, h) + " y el area del rectangulo es "+rectangleArea(b, h) );
        System.out.println("Ahora dime el radio de un circulo y te calculare el perimetro y el area");
        double r  = sc.nextDouble();
        while(r<=0){
            System.out.println("El radio no puede ser 0 o negativo, dime un radio positivo");
            r = sc.nextDouble();
        }
        System.out.println("El perimetro del circulo de radio " + r  +"es " +circlePerimeter(r) + "y el area del circulo es "+circleArea(r) );

    }
}
