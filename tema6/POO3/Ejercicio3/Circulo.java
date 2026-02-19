package tema6.POO3.Ejercicio3;

public class Circulo extends Figura2D{
    public Circulo(){
        super();
    }
    public Circulo(int base){
        super(base);
    }

    @Override
    public double area() {
        double radio = getBase() / 2;
        double num = Math.PI * Math.pow(radio, 2);
        return num;
    }
    @Override
    public double perimetro() {
        double num = Math.PI * getBase();;
        return num;
    }
    @Override
    public String toString(){
        String frase = "CLASE TIPO CIRCULO";
        frase += "\nBase : "  + getBase();
        frase += "\nAltura : " + getAltura();
        frase += "\nArea : " + area();
        frase += "\nPerimetro : " + perimetro();
        return frase;
    }
}
