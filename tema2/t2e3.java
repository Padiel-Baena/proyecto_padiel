package tema2;

import java.util.Scanner;

public class t2e3 {
    public static void main(String[]args){
        System.out.println("Dime un valor para la base de un triangualo y te calculare el area");//pedir el valor de la base
        Scanner num = new Scanner(System.in) ;//leer el valor
        double base = num.nextDouble();//variable para la base
        System.out.println("Ahora dime un valor para la altura");//pedir el valor de la altura
        double altura = num.nextDouble() ;//variable para la altura
        num.close();
        if ((base > 0) && (altura > 0) ) {//comprobacion previa
            double area = (base * altura) / 2 ;//variable para que calcule el area
            System.out.println("El area del triangulo de base " + base + " y altura " + altura + " es igual a " + area);//respuesta al usuario
        } else {//si no funciona la comprobacion
            System.out.println("Me has dado algun valor incorrecto");
        }
    }
}
