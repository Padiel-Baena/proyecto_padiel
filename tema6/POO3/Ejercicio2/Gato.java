package tema6.POO3.Ejercicio2;

public class Gato extends Animal {
    protected String color;

    protected String COLOR_DEFECTO = "Negro";

    public Gato() {
        super();
        this.color = COLOR_DEFECTO;
    }

    public Gato(String color, String nombre, int edad, String especie, double peso, TipoAnimal tipo) {
        super(nombre, edad, especie, peso, tipo);
        this.color = color ;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void ronronear(){
        System.out.println(getNombre() + " esta ronroneando");
    }
    public void Dormir(){
        System.out.println(getNombre() + " se ha ido a dormir");
    }
    public void Comer(){
        System.out.println(getNombre() + " esta comiendo");
    }
    @Override
    public void HacerRuido(){
        System.out.println(getNombre() + " esta maullando");
    }
    @Override
    public String toString(){
        String frase ="CLASE GATO | COLOR : " + getColor() + "\n";
        frase += super.toString();
        return frase;
    }
}
