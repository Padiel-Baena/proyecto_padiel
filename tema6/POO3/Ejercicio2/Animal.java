package tema6.POO3.Ejercicio2;

enum TipoAnimal {MAMIFERO, AVE, REPTIL, ANFIBIO, PEZ, INVERTEBRADO}
public class Animal {
    protected String nombre;
    protected int edad;
    protected String especie;
    protected double peso;
    protected TipoAnimal tipo;

    protected String NOMBRE_DEFECTO = "Halfonsa";
    protected int EDAD_DEFECTO = 3;
    protected String ESPECIE_DEFECTO = "Felino";
    protected double PESO_DEFECTO = 450;
    protected TipoAnimal TIPO_DEFECTO = TipoAnimal.MAMIFERO;

    public Animal(){
        this.nombre = NOMBRE_DEFECTO;
        this.edad = EDAD_DEFECTO;
        this.especie = ESPECIE_DEFECTO;
        this.peso = PESO_DEFECTO;
        this.tipo = TIPO_DEFECTO;
    }
    public Animal(String nombre, int edad, String especie, double peso, TipoAnimal tipo){
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.peso = peso;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public TipoAnimal getTipo() {
        return tipo;
    }
    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public void Dormir(){
        System.out.println(getNombre() + " se ha ido a dormir");
    }
    public void Comer(){
        System.out.println(getNombre() + " esta comiendo");
    }
    public void HacerRuido(){
        System.out.println(getNombre() + " esta haciendo ruido");
    }

    public String toString(){
        String frase = "Nombre: " + getNombre() + "\nEdad: " + getEdad() + "\nEspecie: " +  getEspecie() +  "\nPeso: " + getPeso() + "\nTipo: " + getTipo();
        return frase;
    }
}
