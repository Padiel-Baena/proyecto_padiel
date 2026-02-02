package tema2;

import java.util.Scanner;

public class t2e17 {
    public static void main (String[]args){
        System.out.println("Dime un valor entre 0, 1 y 2, y dependiendo de cual sea hare una operacion o otra");//explicamos codigo
        Scanner valor = new Scanner(System.in) ;//leemos valor
        int respuesta = valor.nextInt();//guardamos valor
         if (respuesta == 0) {//primera opcion
            System.out.println("Dime el valor del lado y yo te calculare el area y perimetro del cuadrado");
            double lado = valor.nextDouble();
            double area = lado*lado ;
            double perimetro = lado*4 ;
            System.out.println("El perimetro de un cuadrado de lado " + lado + " es " + perimetro + " y el area es " + area);
        } else if (respuesta == 1) {//segunda opcion
            System.out.println("Dime la base de un retangulo, despues te pedire la altura y te calculare el area y el perimetro");
            double base = valor.nextDouble();
            System.out.println("Ahora dime la altura");
            double altura = valor.nextDouble();
            double perimetro = (base * 2) + (altura * 2);
            double area = base * altura ;
            System.out.println("El perimetro de un rectangulo de base " + base + " y de altura " + altura + " es igual a " + perimetro + " y el area es " + area);
        } else if (respuesta == 2) {//tercera opcion
            System.out.println("Dime la base de un retangulo, despues te pedire la altura y te calculare el area");
            double base = valor.nextDouble();
            System.out.println("Ahora dime la altura");
            double altura = valor.nextDouble();
            double area = (base * altura) / 2 ;
            System.out.println("El area de un triangulo de base " + base + " y altura " + altura + " es igual a " + area);
        }else{//por si nos da un numero equivocado
            System.out.println("No me has dado un valor correcto");
        }
         valor.close();
    }
}
