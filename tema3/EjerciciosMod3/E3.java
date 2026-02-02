package tema3.EjerciciosMod3;

import java.util.Scanner;

import static tema3.EjerciciosMod3.Utils.getTaxes;

public class E3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este es un programa que te calcula la cantidad de impuesto que tienes que devolver.\nEmpieza diciendome el dinero");
        double money = sc.nextDouble();
        System.out.println("Ahora dime el porcentaje del impuesto, dime solo el numero, no hace falta que me pongas el simbolo '%'");
        int taxes = sc.nextInt();
        double result = getTaxes(money, taxes);
        System.out.println("De " + money + " con un porcentage de impuesto de " + taxes + " es un total de " + result);
    }
}
