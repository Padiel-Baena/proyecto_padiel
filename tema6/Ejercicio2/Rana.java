package tema6.Ejercicio2;

public class Rana extends Animal{
    protected boolean esVenenosa;

    protected boolean VENENSA_DEFECTO = true;

    public Rana() {
        super();
        this.esVenenosa = VENENSA_DEFECTO;
    }

    public Rana(boolean esVenenosa, String nombre, int edad, String especie, double peso, TipoAnimal tipo) {
        super(nombre, edad, especie, peso, tipo);
        this.esVenenosa = esVenenosa;
    }

    public boolean getEsVenenosa() {
        return esVenenosa;
    }
    public void setEsPonedora(boolean esVenenosa) {
        this.esVenenosa = esVenenosa;
    }

    public void atraparMosquitos(){
        System.out.println(getNombre() + " ha cazado un mosquito");
    }
    public void Dormir(){
        System.out.println(getNombre() + " se ha ido a dormir");
    }
    public void Comer(){
        System.out.println(getNombre() + " esta comiendo");
    }
    @Override
    public void HacerRuido(){
        System.out.println(getNombre() + " croando");
    }
    @Override
    public String toString(){
        String frase ="CLASE RANA | ES VENENOSA? : " + getEsVenenosa() + "\n";
        frase += super.toString();
        return frase;
    }
}
