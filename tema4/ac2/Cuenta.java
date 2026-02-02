package tema4;

import java.util.Scanner;

public class Cuenta {
    private int nCuenta;
    double saldo;

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

    public void recibirAbonos(int nCuenta, double saldo, double cAbono){
        if(this.nCuenta==nCuenta){
            this.saldo += cAbono;
            System.out.println("Has recibido un abono en tu cuenta : " + this.getnCuenta());
        }
    }
    public void pagarRecibos(int nCuenta, double saldo, double cPagar){
        if(this.nCuenta==nCuenta) {
            this.saldo -= cPagar;
            if (this.saldo < cPagar) {
                System.out.println("No tienes suficiente saldo para pagar");
            } else {
                System.out.println("Has pagado los recibos que tenias");
            }
        }
    }

}