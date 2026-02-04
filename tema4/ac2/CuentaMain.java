package tema4.ac2;

import tema4.ac2.Cuenta;

import java.util.Scanner;

public class CuentaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero de cuenta");
        int nCuenta = sc.nextInt();
        System.out.println("Dime el saldo");
        int saldo = sc.nextInt();

        Cuenta cuenta1 = new Cuenta(nCuenta, saldo);
    }
}