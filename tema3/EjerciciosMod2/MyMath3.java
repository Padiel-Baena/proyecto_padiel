package tema3;

import java.util.Scanner;

//Añade a MyMath una función que nos indique el número de dígitos de un
//número entero
public class MyMath3 {
    public static int nDigitos(int num) {
        int digito = 1;
        while (num >= 10) {
            num /= 10;
            digito++;
        }
        return digito;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero y yo te dire la cantidad de digitos que tiene");
        int num = sc.nextInt();
        System.out.println(num + " tiene " + nDigitos(num) +  " digitos");
    }
}
