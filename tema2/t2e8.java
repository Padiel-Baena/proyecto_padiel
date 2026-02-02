package tema2;

import java.util.Scanner;
//CuANDO LO MIRE EL VALOR DEL EURO ESTABA EN 1.17 DOLARES
public class t2e8 {
    public static void main (String[]args){
        System.out.println("Dime una cantidad de euros y yo te lo dire en dolares");//expliamos el codigo y pedimos un valor
        Scanner euro = new Scanner(System.in) ;//lo leemos
        double n1 = euro.nextDouble();// lo almacenamos
        euro.close();//cerramos escaner
        double n2 = n1 * 1.1704811 ;//operacion
        System.out.println(n1 + " euros son " + n2 + " dolares");//decimos resultado
    }
}
