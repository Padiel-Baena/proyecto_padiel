package tema6.Ejercicio1;

public class Camiones extends Vehiculo{
    protected int pesoMax;
    protected boolean mercanciaPeligrosa;

    private final int  PESO_MAX_DEFECTO = 3000;
    private final boolean MERCANCIA_PELIGROSA_DEFECTO = false;

    //TODO PREGUNTAR A ANA SI VA UN CONSTRUCTOR VACIO

    public Camiones(int cPlazas, boolean esProfesional) {
        super();
        this.pesoMax = cPlazas;
        this.mercanciaPeligrosa = esProfesional;
    }


    public int getPeso_Max() {
        return pesoMax;
    }
    public void setPesoMax(int pesoMax){
        this.pesoMax = pesoMax;
    }
    public boolean getMercanciaPeligrosa(){
        return mercanciaPeligrosa;
    }
    public void setMercanciaPeligrosa(boolean mercanciaPeligrosa){
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }

    @Override
    public String toString(){
        String frase = "----------------------------";
        frase += "\n|     VEHICULO TIPO CAMION    |";
        if (getMercanciaPeligrosa()) {
            frase += "\n CAMION ENFOCADO A MERCANCIA PELIGROSA | Peso maximo : " + getPeso_Max() + " |";
        }else{
            frase += "\n CAMION ENFOCADO A MERCANCIA NO PELIGROSA | Peso maximo : " + getPeso_Max() + " |";
        }
        super.toString();
        return frase;
    }
}
