package tema2;
/* Haz un programa que pide un número entero por consola y calcula el
factorial. Por ejemplo el factorial de 5 es:
5! = 5 * 4 * 3 * 2 * 1*/
import java.util.Scanner;

public class t2e25 {
    public static void main(String[] args){
        System.out.println("Dime un numero y yo te calculare el factorial");
        Scanner valor = new Scanner(System.in);
        int var = valor.nextInt();
        int num = var ;
        int prod = 1;
        if (var >= 0){
            while(var != 0){
                prod = prod * var ;
                var -- ;
            }
            System.out.println("El factorial del numero " +  num + " es " + prod);
        }else {
            System.out.println("No hay factorial de un numero negativo");
        }
        valor.close();
    }
}