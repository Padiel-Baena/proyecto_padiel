package tema3;

import java.util.Scanner;

// Escribe un procedimiento que muestre por pantalla un triángulo como el
// que hay a continuación. Recibirá 2 parámetros: el carácter y el número
// de líneas del triángulo.
//a
// aaa
// aaaaa
// aaaaaaa
public class E9 {
    public static void formacion(int line, char sign) {
        for (int i = 1; i <= line; i++) {
            int numSimbolos = 2 * i - 1;
            int espacios = line - i;
            System.out.println(" ".repeat(espacios) + String.valueOf(sign).repeat(numSimbolos));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una cantidad de lineas, y un caracter, y yo te hare una piramide, con los paremetros que me digas\nEmpieza diciendome un numero de lineas");
        int line = sc.nextInt();
        while (line <= 0) {
            System.out.println("No puedo hacer una piramide con 0 lineas o menos, dime un numero positivo");
            line = sc.nextInt();
        }
        int contador = line;
        System.out.println("Dime el simbolo o caracter que quieras");
        char sign = sc.next().charAt(0);

        formacion(line, sign);
    }
}