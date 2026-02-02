package tema3.EjerciciosMod3;

import java.util.Scanner;

public class E5 {
    public static void getCoins (double monedas){
        int cCoin =0;
        while (monedas !=0){
            if (monedas % 2 == 0){
            while (monedas % 2 == 0){
                monedas -= 2;
                cCoin ++;
                System.out.println("Hacen falta " + cCoin + " de 2€");
            }}
             else if (monedas % 1 ==0){
                 cCoin =0;
                while (monedas %1 ==0){
                    monedas -= 1;
                    cCoin++;
                    System.out.println("Hacen falta " + cCoin + " de 1€");
                }
            }
            else if (monedas % 0.5 ==0){
                cCoin =0;
                while (monedas %0.5 ==0){
                    monedas -= 0.5;
                    cCoin++;
                    System.out.println("Hacen falta " + cCoin + " de 0.5€");
                }
            }
            else if (monedas % 0.2 ==0){
                cCoin =0;
                while (monedas %0.2 ==0){
                    monedas -= 0.2;
                    cCoin++;
                    System.out.println("Hacen falta " + cCoin + " de 0.2€");
                }
            }
            else if (monedas % 0.1 ==0){
                cCoin =0;
                while (monedas %0.1 ==0){
                    monedas -= 0.1;
                    cCoin++;
                    System.out.println("Hacen falta " + cCoin + " de 0.1€");
                }
            }
            else if (monedas % 0.05 ==0){
                cCoin =0;
                while (monedas %0.05 ==0){
                    monedas -= 0.05;
                    cCoin++;
                    System.out.println("Hacen falta " + cCoin + " de 0.05€");
                }
            }
            else if (monedas % 0.02 ==0){
                cCoin =0;
                while (monedas %0.02 ==0){
                    monedas -= 0.02;
                    cCoin++;
                    System.out.println("Hacen falta " + cCoin + " de 0.02€");
                }
            }
            else if (monedas % 0.01 ==0){
                cCoin =0;
                while (monedas %0.01 ==0){
                    monedas -= 0.01;
                    cCoin++;
                    System.out.println("Hacen falta " + cCoin + " de 0.01€");
                }
            }
            else{
                System.out.println("Me has dado cero, no hay monedas");

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una cantidad de euros, y yo te dire la cantidad de moas necesarias para tener dicha cantidad");
        double monedas = sc.nextDouble();
        getCoins(monedas);
    }
}
