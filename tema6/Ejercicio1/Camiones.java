package tema6.Ejercicio1;

public class Camiones extends Vehiculo{
    protected int pesoMax;
    protected boolean mercanciaPeligrosa;

    private final int  PESO_MAX_DEFECTO = 3000;
    private final boolean MERCANCIA_PELIGROSA_DEFECTO = false;

    public Camiones(){
        super();
        this.pesoMax = PESO_MAX_DEFECTO;
        this.mercanciaPeligrosa = MERCANCIA_PELIGROSA_DEFECTO;
    }

    public Camiones(int cPlazas, boolean esProfesional, String marca, String modelo, String color, String matricula,  int anio) {
        super(marca, modelo, color, matricula, anio);
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
