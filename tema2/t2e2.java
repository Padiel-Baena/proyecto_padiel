package tema2;

import java.util.Scanner;

public class t2e2 {
    public static void main(String[] args) {
        System.out.println("Dime un valor para que sea la base de un rectangulo");//le pedimos al usuario un valor para la base del recangulo
        Scanner num = new Scanner(System.in);// leemos el valor
        double base = num.nextDouble(); // guardamos el valor en una variable
        System.out.println("Ahora dime un segundo valor que sera la altura del rectangulo");//lepedimos un segundo valo
        double altura = num.nextDouble();//lo guardamos en otra variables
        num.close();
        if ((base > 0) && (altura > 0)) {//comprobacion previa de si es posible
            double area = base * altura;//calculamos area
            double perimetro = (base * 2) + (altura * 2);//calculamos perimetro
            System.out.println("El area de un rectangulo de base " + base + " y de altura " + altura + " es igual a " + area + " y el perimetro es igual a " + perimetro);//respuesta al usuario
        } else {//si no pasa la comprobacion previa
            System.out.println("Me has dado algun valor erroneo y no es posible calcular el el area y perimetro");
        }
    }
}