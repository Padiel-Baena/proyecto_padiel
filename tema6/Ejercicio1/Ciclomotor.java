package tema6.Ejercicio1;

public class Ciclomotor extends Vehiculo{
    protected int cilindrada;

    private final int CILINDRADA_DEFECTO = 450;

    public Ciclomotor() {
        super();
        this.cilindrada = CILINDRADA_DEFECTO;
    }

    public Ciclomotor(int cilindrada, String marca, String modelo, String color, String matricula,  int anio) {
        super(marca, modelo, color, matricula, anio);
        this.cilindrada = cilindrada;

    }


    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }

    public boolean necesitaCarnet(){
        if(getCilindrada() < 125){
            return false;
        }else{
            return true;
        }
    }


    @Override
    public String toString(){
        boolean carnet = necesitaCarnet();
        String frase = "----------------------------";
        frase += "\n|     VEHICULO TIPO CICLOMOTOR    | Cilindrada : " + getCilindrada();
        super.toString();
        if (carnet) {
            frase += "\nNecesitas carnet para conducir este ciclomotor";
            frase +="\n-------------------------------------------";
        }else{
            frase +="\n-------------------------------------------";
            frase += "\nNecesitas carnet para conducir este ciclomotor";
            frase +="\n-------------------------------------------";
        }
        return frase;
    }

}
