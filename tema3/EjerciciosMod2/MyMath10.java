package tema3.EjerciciosMod2;

import java.util.Scanner;

import static tema3.EjerciciosMod2.MyMath.*;


public class MyMath10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que quieres que haga\n1-Calcular areas y perimetros de un cuadrado, rectangulo, y circulo\n2-Decirte si un numero es primo o no\n3-Decirte el numero de digitos que tiene un numero\n4-Decirte la cantidad de digitos pares\n5-Decirte la cantidad de digitos impares\n6-Calcularte el factorial de un  numero\n7-Calcularte el factorial de otra forma\n8-Calcularte el resultado de una ecuacion de segundo grado\n9-Sumar los digitos de un numero entero");
        int eleccion = sc.nextInt();
        while(eleccion != 1 && eleccion != 2 && eleccion!= 3 && eleccion!= 4 && eleccion!= 5 && eleccion!= 6 && eleccion!= 7 && eleccion!= 8 && eleccion != 9) {
            System.out.println("No me has dado una caracter valido, vuelve a intentarlo");
            eleccion = sc.nextInt();
        }
        switch(eleccion) {
            case 1:
                System.out.println("Dime el valor del lado de un cuadrado y yo te dire el perimetro y el area de un cuadrado");
                double lado = sc.nextDouble();
                System.out.println("El perimetro del cuadrado  de lado " + lado + " es "+squarePerimeter(lado) +" y el area del cuadrado es "+squareArea(lado));
                System.out.println("Ahora dime los valores de un rectangulo y te dire su perimetro y su altura, empieza diciendo la base");
                double base = sc.nextDouble();
                System.out.println("Ahora dime la altura");
                double high = sc.nextDouble();
                System.out.println("El perimetro del rectangulo de base " + base+ " y altura " +high + " es " +  rectanglePerimeter(base, high) + " y el area del rectangulo es "+rectangleArea(base, high) );
                System.out.println("Ahora dime el radio de un circulo y te calculare el perimetro y el area");
                double r  = sc.nextDouble();
                while(r<=0){
                    System.out.println("El radio no puede ser 0 o negativo, dime un radio positivo");
                    r = sc.nextDouble();
                }
                System.out.println("El perimetro del circulo de radio " + r  +"es " +circlePerimeter(r) + "y el area del circulo es "+circleArea(r) );
                break;
            case 2:
                System.out.println("Dime un numero y te dire si es  primo");
                int num = sc.nextInt();
                while(num<=0){
                    System.out.println("Los numero negativos no son primos, dime un numero positivo");
                    num = sc.nextInt();
                }
                boolean primo = esPrimo(num);
                if (primo){
                    System.out.println(num + " Es primo");
                }else {
                    System.out.println(num + " No es primo");
                }
                break;
            case 3:
                System.out.println("Dime un numero entero y yo te dire la cantidad de digitos que tiene");
                int num1 = sc.nextInt();
                System.out.println(num1 + " tiene " + nDigitos(num1) +  " digitos");
                break;
            case 4:
                System.out.println("Dime un numero, y yo te dire los  digitos que tiene y los que son pares");
                int num2 = sc.nextInt();
                System.out.println(num2 + " tiene " + MyMath.nDigitos(num2) +  " digitos");
                System.out.print("Los digitos pares son el : ");
                pares(num2);
                break;
            case 5:
                System.out.println("Dime un numero, y yo te dire los  digitos que tiene y los que son pares");
                int num3 = sc.nextInt();
                int n= 1;
                System.out.println(num3 + " tiene " + MyMath.nDigitos(num3) +  " digitos");
                System.out.print("Los digitos pares son el : ");
                //TODO: la función devuelve un entero, que debes mostrar por pantalla
                noPares(num3);
                break;
            case 6:
                System.out.println("Dime un numero y te dire su factorial");
                int num4 = sc.nextInt();
                System.out.println("El factorial de " + num4 + " es " +factorialNoRecursivo(num4));
                break;
            case 7:
                //TODO: llamar al método factorialRecursivo
                System.out.println("Dime un numero y te dire su factorial");
                int num5 = sc.nextInt();
                System.out.println("El factorial de " + num5 + " es " +factorialRecursivo(num5));
                break;
            case 8:
                System.out.println("Este es un programa para calcular ecuaciones de segundo grado.");
                System.out.println("Dime el primer número");
                int a = sc.nextInt();
                System.out.println("Dime el segundo número");
                int b = sc.nextInt();
                System.out.println("Dime el tercer número");
                int c = sc.nextInt();
                int n1 = comprobacionEcuacion(a, b, c);
                System.out.println("La ecuación tiene " + n1 + " soluciones reales.");
                if (n1 > 0) {
                    System.out.println("Solución 1: " + solucion1(a, b, c));
                }
                if (n1 == 2) {
                    System.out.println("Solución 2: " + solucion2(a, b, c));
                }
                break;
            case 9:
                System.out.println("Dime un numero y yo sumare todos sus digitos");
                int n3 = sc.nextInt();
                System.out.println(sumaDigitos(n3));
                break;

        }
    }
}
