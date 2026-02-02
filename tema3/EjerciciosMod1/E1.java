package tema3;

import java.util.Scanner;

public class E1 {
    public static int numberSign(int num) {
        int isPositive;
        if (num == 0){
            isPositive = 0;
        } else if (num >0) {
            isPositive = 1;
        }else {
            isPositive = -1;
        }
        return isPositive;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num = sc.nextInt();
        int result = numberSign(num);
        if (result == 0 ){
            System.out.println("El numero es 0");
        } else if (result == 1) {
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negatico");
        }
    }
}