package tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vector = new double[5];
        double num;
        boolean correcto;

        System.out.println("#################################################################################");
        System.out.println("==================BIENVENIDO/A A UN ARRAY DE DOUBLES(DECIMALES)==================");
        System.out.println("#################################################################################");

        for (int i = 0; i < vector.length ; i++) {
            correcto = false;
            while (!correcto) {
                try {
                    System.out.println("======================");
                    System.out.println("Dime un numero decimal");
                    System.out.println("======================");
                    num = sc.nextDouble();
                    vector[i] = num;
                    System.out.println("#####################################################");
                    System.out.println("SE HA GUARDADO EL NUMERO CORRECTAMENTE : " + vector[i] + " EN LA POSICION : " + (i+1));
                    System.out.println("######################################################");
                    correcto = true;
                } catch (InputMismatchException ex){
                    System.out.println("============================");
                    System.out.println("Valor introducido incorrecto");
                    System.out.println("============================");
                    System.out.println("ERROR : " + ex.getMessage());
                    System.out.println("============================");
                    sc.nextLine();
                }catch (ArrayIndexOutOfBoundsException ex){
                    System.out.println("============================");
                    System.out.println("Valor introducido incorrecto");
                    System.out.println("============================");
                    System.err.println("ERROR : " + ex.getMessage());
                    System.out.println("============================");
                    sc.nextLine();
                }
            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + " : " + (i + 1));
        }

        System.out.println("##################################################");
        System.out.println("===============FINALIZANDO PROGRAMA===============");
        System.out.println("##################################################");
    }
}
