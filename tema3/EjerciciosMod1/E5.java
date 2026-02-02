package tema3;

import java.util.Scanner;

//Escribe un programa que pida un número entero por consola de 1 a 10 y
//te muestre su tabla de multiplicar.
public class E5 {
   public static void tabla2(int num) {

        for (int n = 0; n < 11; n++) {
            int mult=num * n;
             System.out.println("El resultado es " + n + "*" + num + "=" + mult);
        }
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime un numero entero de 1 a 10 y yo te mostrare el resultado de su tabla de multiplicar");
            int num = sc.nextInt();
            while (num < 0 || num > 10) {
                System.out.println("Dime un numero del 1 al 10");
                num = sc.nextInt();
            }
                tabla2(num);
        }
}
