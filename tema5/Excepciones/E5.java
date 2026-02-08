package tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        int p ;

        System.out.println("##################################################################################################");
        System.out.println("==================BIENVENIDO/A A UN PROGRAMA PARA IMPRIMIR POSITIVOS Y NEGATIVOS==================");
        System.out.println("##################################################################################################");

        while (opcion != 3){
            showMenu();
            opcion = filtroOpcion(sc);
            switch (opcion){
                case 1:
                    try {
                        System.out.println("Dime el numero entero positivo que quieres que imprima");
                        p = sc.nextInt();
                        imprimePositivo(p);
                    }catch (InputMismatchException ex){
                        System.out.println("ERROR: TE HE PEDIDO UN NUMERO ENTERO");
                        sc.nextLine();
                    }catch (Exception ex){
                        System.out.println("ERROR : " + ex.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Dime el numero entero negativo que quieres que imprima");
                        p = sc.nextInt();
                        imprimeNegativo(p);
                    }catch (InputMismatchException ex){
                        System.out.println("ERROR: TE HE PEDIDO UN NUMERO ENTERO");
                        sc.nextLine();
                    }catch (Exception ex){
                        System.out.println("ERROR : " + ex.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("##################################################");
                    System.out.println("===============SALIENDO DEL SISTEMA===============");
                    System.out.println("###################################################");
                    break;
            }
        }
    }
    public static void showMenu(){
        System.out.println("########################################################################################");
        System.out.println("1-Imprimir positivos\n2-Imprimir negativos\n3-Salir\nDime que es lo que quieres hacer : ");
        System.out.println("########################################################################################");
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
                showMenu();
            }
        }
        return num;
    }
    public static void imprimePositivo(int p) throws Exception{
        if (p < 0){
            throw new Exception("El numero " + p + " es negativo, y esta funcion solo imprime positivos");
        }else {
            System.out.println("VALOR : " + p);
        }
    }
    public static void imprimeNegativo(int p)throws Exception{
        if (p >= 0){
            throw new Exception("El numero " + p + " es positivo, y esta funcion solo imprime negativos");
        }else {
            System.out.println("VALOR : " + p);
        }
    }
}
