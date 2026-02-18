package tema6.Ejercicio3;

public abstract class Figura2D {
    protected double base;
    protected double altura;

    protected double BASE_DEFECTO = 5;
    protected double ALTURA_DEFECTO = 5;

    public Figura2D(){
        this.base = BASE_DEFECTO;
        this.altura = ALTURA_DEFECTO;
    }
    public Figura2D(double base){
        //para el circulo
        this.base = base;
    }
    public Figura2D(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public abstract double area();
    public abstract double perimetro();
    public abstract String toString();
}
