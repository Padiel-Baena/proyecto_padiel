package tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int opcion =0;


        while (opcion != 2){

            System.out.println("#####################################################################################");
            System.out.println("==================BIENVENIDO/A A MI PRIMER EJERCICIO DE EXCEPCIONES==================");
            System.out.println("#####################################################################################");

            showMenu();
            opcion = filtroOpcion(sc);
            switch (opcion){
                case 1:
                    try {
                        System.out.println("=====================");
                        System.out.println("Dime un numero entero");
                        System.out.println("=====================");
                        num = sc.nextInt();
                        System.out.println("==========================");
                        System.out.println("Valor introducido : " + num);
                        System.out.println("==========================");
                    }catch (InputMismatchException ex){
                        num = 0;
                        System.out.println("============================");
                        System.out.println("Valor introducido incorrecto");
                        System.out.println("============================");
                        System.out.println("ERROR : " + ex.getMessage());
                        System.out.println("============================");
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
