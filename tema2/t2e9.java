package tema2;

import java.util.Scanner;
//CuANDO LO MIRE EL VALOR DEL DOLAR ESTABA EN 0.85 EUROS
public class t2e9 {
    public static void main (String[]args){
        System.out.println("Dime una cantidad de dolares y yo te lo dire en euros");//explicamos el codigo y pedimos valor
        Scanner dolar = new Scanner(System.in) ;//lo leemos
        double n1 = dolar.nextDouble();//lo almacenamos
        dolar.close();//cerramos escaner
        double n2 = n1 * 0.854041 ;//operacion
        System.out.println(n1 + " dolares son " + n2 + " euros");//resultado
    }
}
