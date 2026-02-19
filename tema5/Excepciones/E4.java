package tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int rnArray = rn.nextInt(100) + 1;
        int[] vector = new int[rnArray];
        int rnNum = rn.nextInt(10) + 1;
        int numUsuario =1;
        boolean salir = false;

        for (int i = 0; i < vector.length; i++) {
            rnNum = rn.nextInt(10) + 1;
            vector[i] = rnNum;
        }

        System.out.println("############################################################################################################################");
        System.out.println("DIME UN NUMERO ENTRE 1 Y " + vector.length + " Y YO TE ENSEÑARE EL NUMERO GUARDADO EN ESA POSICION O UNO NEGATIVO PARA SALIR");
        System.out.println("############################################################################################################################");
        while (!salir){
            try{
                numUsuario = sc.nextInt();
                if(numUsuario < 0){
                    salir = true;
                    continue;
                }
                System.out.println("====================================================================================================");
                System.out.println("HAS ELEGIDO LA POSICION " + numUsuario + " Y EL NUMERO QUE TIENE GUARDADO ES : " + vector[numUsuario -1]);
                System.out.println("====================================================================================================");
            }catch (InputMismatchException ex){
                System.out.println("==========================================================");
                System.out.println("VALOR INTRODUCIDO INCORRECTO, TE HE PEDIDO NUMEROS ENTEROS");
                System.out.println("==========================================================");
                System.out.println("ERROR : " + ex.getMessage());
                System.out.println("==========================================================");
                sc.nextLine();
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("#############################################################");
                System.out.println("NO PUEDO ENSEÑARTE LA POSICION " + numUsuario + " SI EL ARRAY TIENE SOLO " + vector.length);
                System.out.println("#############################################################");
                System.out.println("ERROR : " + ex.getMessage());
                System.out.println("#############################################################");
                sc.nextLine();
            }
            System.out.println("Numero entero para mostrarte la posicion, y numero negativo para salir");
        }
        System.out.println("##################################################");
        System.out.println("===============FINALIZANDO PROGRAMA===============");
        System.out.println("##################################################");
    }
}
