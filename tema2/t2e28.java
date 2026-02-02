package tema2;
/*Haz un programa que calcule un número aleatorio de la lotería de
Navidad (de 0 a 99.999) y después pida al usuario por consola hasta 5
números indicando cada vez si ha ganado la lotería o no*/
import java.util.Random;
import java.util.Scanner;

public class t2e28 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomint = random.nextInt(99999);
        System.out.println("Dime un numero entre 0 y 99.999, si pones un numero de menos de 5 cifras, tienes que poner ceros delante");
        Scanner valor = new Scanner(System.in);
        int i;
        for (i = 4; i > 0; i--) {
            int num= valor.nextInt();
            if ((0 < num) && (num <= 99999)) {
                if (num == randomint) {
                    System.out.println("Ese es el numero correcto,");
                } else {
                    System.out.println("No es ese numero, vuelve a intentarlo, te quedan " + i + " intentos");
                }
            } else {
                System.out.println("Ese numero no es valido");
            }
        }
        valor.close();
    }
}
