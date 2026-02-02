package tema3.EjerciciosMod3;

import java.util.Scanner;

import static tema3.EjerciciosMod3.Utils.miles2kilometers;

public class E2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Te voy a convertir de millas a kilometros");
        double num = sc.nextDouble();
        double result = miles2kilometers(num);
        System.out.println("El cambio de " + num + " millas a kilometros es " + result);
    }
}
