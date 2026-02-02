package tema3;

import java.util.Scanner;

//Escribe un programa que permita pasar de euros a dólares y de dólares
//a euros. Necesitarás implementar el procedimiento showMenu() y las
//funciones euro2dollar y dollar2euro.
public class E4 {
    public static boolean comprobar(double valor){
        if (valor <= 0){
            return false;
        }else{
            return true;
        }
    }
    public static void showMenu(){
        System.out.println("Menu Principal\n1.Pasar de euros a dolares\n2.Pasar de dolares a euros");
    }
    public static double euro2dollar(double valor){
        return valor * (1.15);
    }
    public static double dollar2euro(double valor) {
            return valor * 0.87;
    }

    public static void main(String[] args) {

        double valor;
        int eleccion;
        double result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el valor que quieres convertir");
        valor = sc.nextDouble();
        while(!comprobar(valor)){
            System.out.println("Dime un valor valido para poder convertirlo, no puedo convertir numeros negativos");
            valor = sc.nextDouble();
        }
        showMenu();
        eleccion = sc.nextInt();
        while (eleccion != 1 && eleccion != 2){
            System.out.println("Dame un valor valido, 1 o 2");
            eleccion = sc.nextInt();
        }
        switch (eleccion) {
            case 1:
                result =euro2dollar(valor);
                System.out.println(valor + " € son un total de "  + result + " $");
                break;
            case 2:
                result =dollar2euro(valor);
                System.out.println(valor + " $ son un total de "  + result + " €");
                break;
        }
    }
}