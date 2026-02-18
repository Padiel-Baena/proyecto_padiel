package tema6.Ejercicio3;

public class Cuadrado extends Figura2D{
    public Cuadrado(){
        super();
    }
    public Cuadrado(int base, int altura){
        super(base, altura);
    }

    @Override
    public double area() {
        double num = getBase() * getAltura();
        return num;
    }
    @Override
    public double perimetro() {
        double num = getBase() * 4;
        return num;
    }
    @Override
    public String toString(){
        String frase = "CLASE TIPO CUADRADO";
        frase += "\nBase : "  + getBase();
        frase += "\nAltura : " + getAltura();
        return frase;
    }
}
