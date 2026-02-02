package tema2;

import java.util.Scanner;

public class t2e7 {
    public static void main (String[]args){
        System.out.println("Dime un valor");//pedimos valor
        Scanner num = new Scanner(System.in) ;//lo leemos
        double n1 = num.nextDouble();//lo almacenamos
        System.out.println("Ahora dime un segundo numero y al mas grande le restare el pequeño");//pedimos segundo valor y explicamos el codigo
        double n2 = num.nextDouble();//lo almacenamos
        num.close();//cerramos escaner
        if (n1 > n2){//comprobaciones
            double op1 = n1 - n2 ;
            System.out.println("El numero mayor es " + n1 + " el resultado de restarle el otro numero es " + op1);
        }else {
            double op2 = n2 - n1 ;
            System.out.println("El numero mayor es " + n2 + " El resultado de restarle el otro es " + op2);//decimos el resultado
        }
    }
}
