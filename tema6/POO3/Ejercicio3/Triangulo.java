package tema6.Ejercicio3;

public class Triangulo extends Figura2D{
    public Triangulo(){
        super();
    }
    public Triangulo(int base, int altura){
        super(base, altura);
    }

    @Override
    public double area() {
        double num = (getBase() * getAltura())/2;
        return num;
    }
    @Override
    public double perimetro() {
        double ladoInclinado = Math.sqrt(Math.pow(getAltura(), 2) + Math.pow(getBase()/ 2, 2));
        double num = getBase() + (2 * ladoInclinado);
        return num;
    }
    @Override
    public String toString(){
        String frase = "CLASE TIPO TRIANGULO";
        frase += "\nBase : "  + getBase();
        frase += "\nAltura : " + getAltura();
        frase += "\nArea : " + area();
        frase += "\nPerimetro : " + perimetro();
        return frase;
    }
}
