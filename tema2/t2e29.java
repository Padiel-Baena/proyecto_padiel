package tema2;
/* “El número secreto”. Programa un juego en el que se calcula
aleatoriamente un número de 1 a 100. El usuario debe adivinarlo. Cada
vez que el usuario pone un número el programa le indicará si lo ha
acertado, si el número secreto es mayor o si es menor. Termina cuando
el usuario acierta el número*/
import java.util.Random;
import java.util.Scanner;

public class t2e29 {
    public static void main(String[] args){
        Random random = new Random();
        int randomInt = random.nextInt(100);
        System.out.println("He elegido un numero entre el 1 y el 100, tienes que adivinarlo, yo te dire si el numero es mayor, menor o si has acertado");
        Scanner valor = new Scanner(System.in);
        int num = valor.nextInt();
        while (num != randomInt){
            if (num < randomInt){
                System.out.println("Mi numero es mas grande");
            } else {
                System.out.println("Mi numero es mas pequeño");
            }
            System.out.println("Dime otro numero, estas cerca");
            num = valor.nextInt();
        }
        valor.close();
        System.out.println("Has acertado");
    }
}
