package tema2;

import java.util.Scanner;

public class t2e4 {
    public static void main (String[]args){
        System.out.println("Dime un valor");//pedir el primer valor al usuario
        Scanner num = new Scanner(System.in) ;//leer el valor
        double n1 = num.nextDouble() ;//guardarlo en una variable
        System.out.println("Dime un segundo valor");//pedir un segundo valor
        double n2 = num.nextDouble() ;//guardar el valor en otr avariable
        System.out.println("Ahora dime un ultimo valor y te dire cual es el mayor");//pedir el ultimo valor
        double n3 = num.nextDouble() ;//guardarlo en otra variable
        num.close();
        if (n1 == n2 && n2 == n3 ) {//comprobacion de que no sean iguales
            System.out.println("Todos los valores son iguales");//respuesta
        } else {//en el caso de que no sean iguales
            boolean op1 = n1 > n2 ;//comprobacion 1
            boolean op2 = n2 > n3 ;//comprobacion 2
            boolean op3 = n1 > n3 ;//comprobacion 3
            if ((op1 == true && op2 == true && op3 == true) || (op1 == true && op2==false && op3 == true)){//operaciones para comprobar si el primer numero es el mayor
                System.out.println("El numero mas grande es el primero " + n1);//respuesta
            } else if ((op1 == true && op2 == false && op3 == false) || (op1 == false && op2 == false && op3 == false)) {//operaciones para saber si el tercer numero es el mayor
                System.out.println("El mayor es el tercero " + n3);//respuesta
            } else {//sino es el segundo numero el mayor
                System.out.println("El numero mayor es el segundo" + n2);//respuesta
            }
        }
    }
}
