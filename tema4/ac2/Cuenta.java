package tema4.ac2;

import java.util.Scanner;

public class Cuenta {
    private int nCuenta;
    private double saldo;

    private static final int nCuentaDefecto = 0000000;
    private static final double saldoDefecto = 1 ;

    public Cuenta(){
        this.nCuenta = nCuentaDefecto;
        this.saldo = saldoDefecto;
    }

    public Cuenta(int nCuenta, double saldo){
        this.nCuenta = nCuenta;
        this.saldo = saldo;
    }

    public int getnCuenta(){
        return nCuenta;
    }
    public void setnCuenta(int nCuenta){
        this.nCuenta=nCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void recibirAbonos(double cAbono){
            this.saldo += cAbono;
            System.out.println("Has recibido un abono en tu cuenta : " + this.getnCuenta());
    }
    public void pagarRecibos(double cPagar){
            if (this.saldo < cPagar) {
                System.out.println("No tienes suficiente saldo para pagar");
            } else {
                this.saldo -= cPagar;
                System.out.println("Has pagado los recibos que tenias");
            }
    }
    public String toString(){
        String text1 = "nCuenta = " + this.nCuenta;
        String text2 = "saldo = " + this.saldo;
        return text1 + text2;
    }
}