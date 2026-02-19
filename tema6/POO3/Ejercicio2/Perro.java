package tema6.Ejercicio2;

enum TamañoAnimal {Pequeño, Mediano, Grande}
public class Perro extends Animal {
    protected TamañoAnimal tamanio;

    protected TamañoAnimal TAMANIO_DEFECTO = TamañoAnimal.Mediano;

    public Perro() {
        super();
        this.tamanio = TAMANIO_DEFECTO;
    }

    public Perro(TamañoAnimal tamanio, String nombre, int edad, String especie, double peso, TipoAnimal tipo) {
        super(nombre, edad, especie, peso, tipo);
        this.tamanio = tamanio;
    }

    public TamañoAnimal getTamanio() {
        return tamanio;
    }
    public void setTamanio(TamañoAnimal tamanio) {
        this.tamanio = tamanio;
    }

    public void recogerPalo(){
        System.out.println(getNombre() + " ha ido a por el palo");
    }
    public void Dormir(){
        System.out.println(getNombre() + " se ha ido a dormir");
    }
    public void Comer(){
        System.out.println(getNombre() + " esta comiendo");
    }
    @Override
    public void HacerRuido(){
        System.out.println(getNombre() + " esta ladrando");
    }
    @Override
    public String toString(){
        String frase ="CLASE PERRO | TAMAÑO : " + getTamanio() + "\n";
        frase += super.toString();
        return frase;
    }
}
