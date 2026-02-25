package Examen.Ejercicio2;

public class Tarjeta implements IDinero{
    protected String nTarjerta;
    protected double saldo;
    protected double credito;

    protected final String N_TARJETA_DEFECTO = "T1";
    protected final double SALDO_DEFECTO = 500;
    protected final double CREDITO_DEFECTO = 500;

    public Tarjeta() {
        this.nTarjerta = N_TARJETA_DEFECTO;
        this.saldo = SALDO_DEFECTO;
        this.credito = CREDITO_DEFECTO;
    }
    public Tarjeta(String nTarjerta, double saldo, double credito) {
        this.nTarjerta = nTarjerta;
        this.saldo = saldo;
        this.credito = credito;
    }

    public String getnTarjerta() {
        return nTarjerta;
    }
    public void setnTarjerta(String nTarjerta) {
        this.nTarjerta = nTarjerta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getCredito() {
        return credito;
    }
    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public double valor() {
        return this.credito + this.saldo;
    }

    public String toString(){
        return "Tarjeta\nSaldo : " + saldo + "\nCredito : " + credito + "\nValor Total : " + valor();
    }
}
