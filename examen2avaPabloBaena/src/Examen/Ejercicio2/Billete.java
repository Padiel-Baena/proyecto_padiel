package Examen.Ejercicio2;

public class Billete implements IDinero{
    protected int valor;
    protected final int VALOR_DEFECTO = 5;

    public Billete() {
        this.valor = VALOR_DEFECTO;
    }
    public Billete(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public double valor() {
        return this.valor;
    }

    public String toString(){
        return "BILLETE\nValor : " + this.getValor();
    }
}
