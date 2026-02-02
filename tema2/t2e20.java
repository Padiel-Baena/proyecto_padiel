package tema2;
/* Realiza un programa que lee por consola dos números enteros (A y B).
Si B es mayor que A, muestra todos los números impares entre ellos.*/
import java.util.Scanner;

public class t2e20 {
    public static void main(String[]args){
        System.out.println("Te voy a pedir dos numeros enteros, y si el segundo es mayor que el primero, te dire todos los impares entre ellos, ahora dime el primero");
        Scanner num = new Scanner(System.in) ;
        int a = num.nextInt();
        System.out.println("Ahora dime el segundo numero");
        int b = num.nextInt();
        boolean impar;
        if (a > b) {
            System.out.println("El primer numero es mayor que el segundo");
        } else{
            while (b > a) {
                impar = a % 2 == 1;
                if (impar) {
                    System.out.println("Los numeros impares que hay entre los numeros que me has dicho son " + a);
                }
                a++;
            }
        } /*else {
            System.out.println("Los numeros que me has dicho son iguales");
        }*/
        num.close();
    }
}
