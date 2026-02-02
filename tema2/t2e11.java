package tema2;

import java.util.Scanner;
//3,2,1 tb son consecutivos
public class t2e11 {
    public static void main (String[]args){
        System.out.println("Te voy a pedir tres valores y te voy a decir si son consecutivos o no");//pedimos valor y explicamos el codigo
        Scanner num = new Scanner(System.in);//lo leemos
        int n1 = num.nextInt();//lo almacenamos
        System.out.println("Dime el segundo numero");//pedimos otro valor
        int n2 = num.nextInt();//lo almacenamos
        System.out.println("Dime el ultimo numero");//pedimos otro valor
        int n3 = num.nextInt();//lo almacenamos
        num.close();//cerramos el escaner
        if ( ( n2 - n1  == 1) && ( n3 - n2 == 1 ) || ( n1 - n2  == 1) && ( n2 - n3 == 1 )) {//operaciones
            System.out.println("Me has dado los numeros consecutivos");
        }else {
            System.out.println("No me has dado los numeros consecutivos");
        }
    }
}
