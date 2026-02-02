package tema2;

import java.util.Scanner;

public class t2e10 {
    public static void main (String[]args){
        System.out.println("Dime un valor, despues te pedire otros dos y te dire si estan ordenados de mayor a menor o no");//pedimos valor y explicamos el codigo
        Scanner valor = new Scanner(System.in) ;//lo leemos
        double n1 = valor.nextDouble();//lo almacenamos
        System.out.println("Dime el segundo valor");//pedimos otro valor
        double n2 = valor.nextDouble();//lo almacenamos
        System.out.println("Ahora dime el ultimo valor");//pedimos el ultimo valor
        double n3 = valor.nextDouble();//lo almacenamos
        valor.close();//cerramos el escaner
        if ((n1 >= n2 ) && (n2 >= n3)){//comprobaciones
            System.out.println("Me has dicho los numeros ordenador de mayor a menor");
        }else{
            System.out.println("No me has dado los valores ordenados de mayor a menor");
        }
    }
}
