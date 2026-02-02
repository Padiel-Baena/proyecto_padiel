package tema2;

import java.util.Scanner;

public class t2e14 {
    public static void main (String[]args){
        System.out.println("Te voy a calcular el precio de estancia en un camping.Empieza diciendome la cantidad de personas, si sois mas de 5  y os quedais mas de 1 semana se os hace un decuento");//explicar codigo y pedir datos
        Scanner valor = new Scanner(System.in) ;//leer dato
        int persona = valor.nextInt();//almacenar dato
        System.out.println("Ahora dime la cantidad de noches que vais a estar, cada noche son 15€ por persona");//pedir dato
        int noches = valor.nextInt();//guardar dato
        valor.close();//cerrar escaner
        if ((persona >= 5) && (noches>= 7)){//comprobaciones
            System.out.println("Tienes un decuento del 25%");
            double precio = (15*persona*noches*0.75);
            System.out.println("El precio total contando el descuento seria un total de " + precio + "€");
        }else {
            int precio1 = 15*persona*noches ;
            System.out.println("El precio total seria de " + precio1 + "€");
        }
    }
}
