package tema6.POO3.Ejercicio3;

public class Figura2dMain {
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado(5);
        System.out.println(c.toString());



        Circulo cir = new Circulo(5);
        cir.area();
        cir.perimetro();
        System.out.println(cir.toString());



        Triangulo triangulo = new Triangulo(5,5);
        triangulo.area();
        triangulo.perimetro();
        System.out.println(triangulo.toString());
    }
}
