package tema6.Ejercicio3;

public class Rectangulo extends Figura2D{
    public Rectangulo(){
        super();
    }
    public Rectangulo(int base, int altura){
        super(base, altura);
    }

    @Override
    public double area() {
        double num = getBase() * getAltura();
        return num;
    }
    @Override
    public double perimetro() {
        double num = getBase() * 2;
        num += getAltura() * 2;
        return num;
    }
    @Override
    public String toString(){
        String frase = "CLASE TIPO RECTANGULO";
        frase += "\nBase : "  + getBase();
        frase += "\nAltura : " + getAltura();
        return frase;
    }
}
