package tema6.Ejercicio2;

public class Gallina extends Animal{
    protected boolean esPonedora;

    protected boolean PONEDORA_DEFECTO = true;

    public Gallina() {
        super();
        this.esPonedora = PONEDORA_DEFECTO;
    }

    public Gallina(boolean esPonedora, String nombre, int edad, String especie, double peso, TipoAnimal tipo) {
        super(nombre, edad, especie, peso, tipo);
        this.esPonedora = esPonedora ;
    }

    public boolean getEsPonedora() {
        return esPonedora;
    }
    public void setEsPonedora(boolean esPonedora) {
        this.esPonedora = esPonedora;
    }

    public void ponerHuevos(){
        System.out.println(getNombre() + " ha puesto un huevo");
    }
    public void Dormir(){
        System.out.println(getNombre() + " se ha ido a dormir");
    }
    public void Comer(){
        System.out.println(getNombre() + " esta comiendo");
    }
    @Override
    public void HacerRuido(){
        System.out.println(getNombre() + " cacareando");
    }
    @Override
    public String toString(){
        String frase ="CLASE GALLINA | ES PONEDORA? : " + getEsPonedora() + "\n";
        frase += super.toString();
        return frase;
    }
}
