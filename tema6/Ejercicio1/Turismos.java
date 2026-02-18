package tema6.Ejercicio1;

public class Turismos extends Vehiculo {
    protected int cPlazas;
    protected boolean esProfesional;

    private final int  C_PLAZAS_DEFECTO = 5;
    private final boolean ES_PROFESIONAL_DEFECTO = false;

    public Turismos(){
        super();
        this.cPlazas = C_PLAZAS_DEFECTO;
        this.esProfesional = ES_PROFESIONAL_DEFECTO;
    }

    public Turismos(int cPlazas, boolean esProfesional, String marca, String modelo, String color, String matricula,  int anio) {
        super(marca, modelo, color, matricula, anio);
        this.cPlazas = cPlazas;
        this.esProfesional = esProfesional;
    }


    public int getC_Plazas() {
        return cPlazas;
    }
    public void setcPlazas(int cPlazas){
        this.cPlazas = cPlazas;
    }
    public boolean getEsProfesional(){
        return esProfesional;
    }
    public void setEsProfesional(boolean esProfesional){
        this.esProfesional = esProfesional;
    }

    @Override
    public String toString(){
        String frase = "----------------------------";
              frase += "\n|     VEHICULO TIPO TURISMO    |";
        if (getEsProfesional()) {
            frase += "\n TURISMO ENFOCADO A USO PROFESIONAL | Numero de plazas : " + getC_Plazas() + " |";
        }else{
            frase += "\n TURISMO ENFOCADO A USO PERSONAL | Numero de plazas : " + getC_Plazas() + " |";
        }
        super.toString();
        return frase;
    }
}
