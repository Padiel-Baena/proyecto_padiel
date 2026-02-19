package tema6.POO3.Ejercicio2;

enum TipoEscamas {Lisa, Rugosa, Diamantes};
public class Serpiente extends Animal {

    protected TipoEscamas typeE;

    protected TipoEscamas ESCAMAS_DEFECTO = TipoEscamas.Diamantes;

    public  Serpiente() {
        super();
        this.typeE = ESCAMAS_DEFECTO;
    }

    public Serpiente(TipoEscamas tipoE, String nombre, int edad, String especie, double peso, TipoAnimal tipo) {
        super(nombre, edad, especie, peso, tipo);
        this.typeE = tipoE;
    }

    public TipoEscamas getTypeE() {
        return typeE;
    }
    public void setTypeE(TipoEscamas typeE) {
        this.typeE = typeE;
    }

    public void enroscarse(){
        System.out.println(getNombre() + " se esta enroscando");
    }
    public void Dormir(){
        System.out.println(getNombre() + " se ha ido a dormir");
    }
    public void Comer(){
        System.out.println(getNombre() + " esta comiendo");
    }
    @Override
    public void HacerRuido(){
        System.out.println(getNombre() + " siseando");
    }
    @Override
    public String toString(){
        String frase ="CLASE SERPIENTE | TIPO DE ESCAMA : " + getTypeE() + "\n";
        frase += super.toString();
        return frase;
    }
}
