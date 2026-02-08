package tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int opcion =0;
        int division =0;

        System.out.println("############################################################################");
        System.out.println("==================BIENVENIDO/A A UN PROGRAMA DE DIVISIONES==================");
        System.out.println("############################################################################");

        while (opcion != 2){

            showMenu();
            opcion = filtroOpcion(sc);
            switch (opcion){
                case 1:
                    try {
                        System.out.println("========================================");
                        System.out.println("Dime un numero entero, sera el numerador");
                        System.out.println("========================================");
                        num1 = sc.nextInt();
                        System.out.println("==========================================");
                        System.out.println("Dime un numero entero, sera el denominador");
                        System.out.println("==========================================");
                        num2 = sc.nextInt();
                        division = num1/num2;
                        System.out.println("==========================================");
                        System.out.println("El resultado de la division es " + division);
                        System.out.println("==========================================");
                    }catch (InputMismatchException ex){
                        num1 = 0;
                        num2 = 0;
                        System.out.println("============================");
                        System.out.println("Valor introducido incorrecto");
                        System.out.println("============================");
                        System.out.println("ERROR : " + ex.getMessage());
                        System.out.println("============================");
                        sc.nextLine();
                    }catch (ArithmeticException ex){
                        division = 0;
                        System.out.println("###########################");
                        System.out.println("No se puede dividir entre 0");
                        System.out.println("ERROR : " + ex.getMessage());
                        System.out.println("###########################");
                        sc.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("##################################################");
                    System.out.println("===============SALIENDO DEL SISTEMA===============");
                    System.out.println("###################################################");
                    break;
            }
        }
    }
    public static void showMenu(){
        System.out.println("1-Decir un numero\n2-Salir\nDime que es lo que quieres hacer");
    }
    public static int filtroOpcion(Scanner sc){
        boolean correcto = false;
        int num = 0;
        while (!correcto){
            try{
                num = sc.nextInt();
                correcto = true;
            }catch (InputMismatchException ex){
                System.out.println("=========================");
                System.out.println("ERROR :  VALOR INCORRECTO");
                System.out.println("=========================");
                sc.nextLine();
            }
        }
        return num;
    }
}

