package tema3;

import java.util.Scanner;

//Escribe un programa que lea por consola un día (1-31), un mes (1-12) y
// un año y nos indique si la fecha es correcta o no.
public class E8 {
    public static boolean prove(int YY, int MM, int DD){
        boolean bisiesto = false;
        if ((YY % 4 ==0 && YY % 100 !=0) || (YY % 400 ==0)){
            bisiesto = true;
        }
        if((MM == 1 || MM == 12 || MM == 3 || MM == 5 || MM == 7 || MM == 8 || MM == 10) && (DD < 1 || DD > 31)){
            return false;

        }
        if ((MM == 4 || MM == 6 || MM == 9 || MM == 11) && (DD <1 || DD > 30)){
            return false;
        }
        if (MM == 2) {
            if (bisiesto) {
                if (DD < 1 || DD > 29) {
                    return false;
                }
            } else {
                if  (DD < 1 || DD > 28) {
                    return false;
                }
            }
        }
            return true;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Te voy a pedir un dia, mes y año, y te dire si la fecha es correcta o no.\nEmpieza por el dia");
        int DD = sc.nextInt();
        System.out.println("Ahora el mes");
        int MM = sc.nextInt();
        System.out.println("Por ultimo el año");
        int YY = sc.nextInt();
        boolean result = prove(YY,MM,DD);
        if (result){
            System.out.println("La fecha es correcta");
        }else{
            System.out.println("La fecha no es correcta");
        }
    }
}
