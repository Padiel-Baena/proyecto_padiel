package tema2;

import java.util.Scanner;

public class t2e15 {
    public static void main (String[]args){
        System.out.println("Dime el numero del mes");//pedimos valor
        Scanner valor = new Scanner(System.in) ; //lo leemos
        int mes = valor.nextInt() ; // lo almacenamos
        System.out.println("Ahora dime el año"); //pedimos otro valor
        int anyo =valor.nextInt() ; // lo almacenamos
        valor.close(); //cerramos escaner
        boolean bisiesto = false ; //comprobaciones
        if ((anyo % 400 == 0) || (anyo % 4 == 0) && (anyo % 100 != 0)){
            bisiesto = true;
        }
    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) {
        if (bisiesto == true){
            System.out.println("El mes " + mes + " del año " + anyo + " cuenta con 31 días y es bisiesto");
        }
        else {
            System.out.println("El mes " + mes + " del año " + anyo + " cuenta con 31 días y no es bisiesto");
        }

        } else if (mes == 4 || mes == 6 || mes == 9) {
            if (bisiesto == true){
                System.out.println("El mes " + mes + " del año " + anyo + " cuenta con 30 días y es bisiesto");
            }
            else {
                System.out.println("El mes " + mes + " del año " + anyo + " cuenta con 30 días y no es bisiesto");
            }
    } else if (mes == 2) {
        if (bisiesto == true) {
            System.out.println("El mes " + mes + " del año " + anyo + " cuenta con 29 días y no es bisiesto");
        } else {
            System.out.println("El mes " + mes + " del año " + anyo + " cuenta con 28 días y no es bisiesto");
        }
    } else {
        System.out.println("El mes que me has dado no es correcto");
    }

    }
}