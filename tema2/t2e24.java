package tema2;
/* Realiza un programa que permite a un profesor introducir la nota de un
número indefinido de alumnos y le indica cuántos suspendidos o
aprobados hay.*/
import java.util.Scanner;

public class t2e24 {
    public static void main(String[] args) {
        System.out.println("Programa para introducir notas. Para terminar, introduce cualquier numero negativo.Pero primero me debes dar el valor que usas para calificar, dime la nota minima");
        Scanner valor = new Scanner(System.in);
        double min = valor.nextInt();
        System.out.println("Dime el maximo");
        double max = valor.nextInt();
        System.out.println("Dime a partir de que nota esta aprobado");
        double mid = valor.nextInt();
        int suspendidos = 0;
        int aprobados = 0;
        System.out.println("Introduce todas las notas que quieras evaluar ");
        double nota = valor.nextDouble();
        while (nota > 0) {
            if (nota >= min && nota <= max) {
                if (nota < mid) {
                    suspendidos++;
                }   else {
                    aprobados++ ;
                }
            } else {
                System.out.println("Nota no válida. Debe estar entre los valores que me has dicho.");
            }
            nota = valor.nextDouble();
        }
        System.out.println("Han suspendido " + suspendidos + " y han aprobado " + aprobados);
        valor.close();
    }
}