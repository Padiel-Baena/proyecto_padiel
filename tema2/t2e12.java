package tema2;

import java.util.Scanner;

public class t2e12 {
    public static void main (String[]args){
        System.out.println("Te voy a pedir tres valores y te los voy a ordenar de mayor a menor, puedes darme el primer valor");//explicamos codigo y pedimos valor
        Scanner num = new Scanner(System.in) ;//lo leemos
        double n1 = num.nextDouble();//almacenamos valor
        System.out.println("Dame el segundo valor");//pedimos valor
        double n2 = num.nextDouble();//almacenamos valor
        System.out.println("Dime el  ultimo valor");//pedimos valor
        double n3 = num.nextDouble();//almacenamos
        num.close();//cerramos escaner
        if (n1 >= n2 && n2 >= n3) {//comprobaciones
            System.out.println("Los numeros ordenados de mayor a menor son " + n1 + " " + n2 + " " + n3);
        } else if (n1 >= n3 && n3 >= n2) {
            System.out.println("Los numeros ordenados de mayor a menor son " + n1 + " " + n3 + " " + n2);
        } else if (n2 >= n1 && n1 >= n3) {
            System.out.println("Los numeros ordenados de mayor a menor son " + n2 + " " + n1 + " " + n3);
        } else if (n2 >= n3 && n3 >= n1) {
            System.out.println("Los numeros ordenados de mayor a menor son " + n2 + " " + n3 + " " + n1);
        } else if (n3 >= n1 && n1 >= n2) {
            System.out.println("Los numeros ordenados de mayor a menor son " + n3 + " " + n1 + " " + n2);
        } else if (n3 >= n2 && n2 >= n1) {
            System.out.println("Los numeros ordenados de mayor a menor son " + n3 + " " + n2 + " " + n1);
        } else {
            System.out.println("Los numeros son iguales o tienen valores iguales.");
        }
    }
}
