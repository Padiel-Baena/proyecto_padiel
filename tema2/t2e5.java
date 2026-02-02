package tema2;

import java.util.Scanner;

public class t2e5 {
    public static void main (String[]args){
        System.out.println("Te pedire tres valores y voy a calcular la media de los tres valores.Ahora puedes darme el primer valor");//explicamos el programa
        Scanner num = new Scanner(System.in) ;//leemos el valor
        int n1 = num.nextInt();//lo almacenamos
        System.out.println("Dime el segundo valor");//pedimos otro valor
        int n2 = num.nextInt() ;//lo almacenamos
        System.out.println("Dime el ultimo valor");//pedimos el ultimo valor
        int n3 = num.nextInt() ;//lo almacenamos
        int oper = ((n1 + n2 +n3 )/3);//operamos
        double oper2 = ( (n1 + n2 + n3 )/3) ;
        System.out.println("La media de los numeros que me has dicho es " + oper + " y con decimales es " + oper2);//decimos el resultado
    num.close();
    }
}
