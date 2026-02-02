package tema2;

import java.util.Scanner;

/* Haz una calculadora. La calculadora permitirá hacer varias operaciones.
//Pedirá un número real, pedirá una operación (+, -, *, / o %), pedirá otro
//número real y mostrará el resultado por consola. A continuación pedirá
//los datos para una nueva operación. Piensa en un modo para que se
pueda salir de la calculadora en cualquier momento.*/
public class t2e30 {
    public static void main(String[] args) {
        System.out.println("Este es un programa de una calculador, dime el primer numero, puedes salir del programa con el simbolo _");
        Scanner valor = new Scanner(System.in);
        double num = valor.nextDouble();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Dime la operacion que quieres hacer");
            char sim = valor.next().charAt(0);
            switch (sim) {
                case '+':
                    System.out.println("Dime el numero que quieres sumar");
                    //
                    double num1 = valor.nextDouble();
                    double oper = num + num1;
                    System.out.println("El resultado de la opercaion es " + oper);
                    break;
                case '-':
                    System.out.println("Dime el numero que quieres restar");
                    num1 = valor.nextDouble();
                    oper = num - num1;
                    System.out.println("El resultado de la opercaion es " + oper);
                    break;
                case '*':
                    System.out.println("Dime el numero que quieres multiplicar");
                    num1 = valor.nextDouble();
                    oper = num * num1;
                    System.out.println("El resultado de la opercaion es " + oper);
                    break;
                case '/':
                    System.out.println("Dime el numero que quieres dividir");
                    num1 = valor.nextDouble();
                    if (num1 == 0) {
                        System.out.println("No se puede dividir por cero");
                    } else {
                        oper = num / num1;
                        System.out.println("El resultado de la opercaion es " + oper);
                    }
                    break;
                case '%':
                    System.out.println("Dime el numero que quieres dividir");
                    num1 = valor.nextDouble();
                    if (num1 == 0) {
                        System.out.println("No se puede dividir por cero");
                    } else {
                        oper = num / num1;
                        System.out.println("El resultado de la opercaion es " + oper);
                    }
                    break;
                case '_':
                    System.exit(0);
                    break;
            }
            System.out.println("Quieres continuar haciendo operaciones?Si quieres seguir tienes que poner true, y si no tienes que poner false");
             continuar = valor.nextBoolean();
        }
    }
}