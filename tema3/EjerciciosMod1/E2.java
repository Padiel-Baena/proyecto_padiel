package tema3;

import java.util.Scanner;

import static tema3.E1.numberSign;

//Utiliza la función anterior y una función nueva que crearás llamada
//isAdult para hacer un programa que reciba una edad e indica si se es
//mayor de edad o no.
//boolean isAdult(age)
public class E2 {
    public static boolean  isAdult(int edad){
        if (edad >= 18){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        numberSign(3);

        boolean age =false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ahora dime una edad");
        int edad = sc.nextInt();
        age =isAdult(edad);
        if (age){
            System.out.println("Es mayor de edad");
        }else  {
            System.out.println("Es menor de edad");
        }
    }
}
