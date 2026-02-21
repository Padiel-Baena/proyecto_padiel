package tema5.Colecciones2.Ejercicio1;

public class Pajaros extends Animal {
    protected double peso;
    protected String especie;
    protected int horaAvistamiento;


    protected final double PESO_DEFECTO = 3;
    protected final String ESPECIE_DEFECTO = "GORRION";
    protected int HORA_AVISTAMIENTO_DEFECTO = 5;


    public Pajaros() {
        this.peso = PESO_DEFECTO;
        this.especie = ESPECIE_DEFECTO;
        this.horaAvistamiento = HORA_AVISTAMIENTO_DEFECTO;

    }
    public Pajaros(double peso, String especie, int  horaAvistamiento) {
        this.peso = peso;
        this.especie = especie;
        this.horaAvistamiento = horaAvistamiento;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public double getPeso() {
        return peso;
    }
    public String getEspecie() {
        return especie;
    }

    @Override
    public String toString(){
        return "Pajaro | Peso : " + this.peso + " || Especie : " + this.especie;
    }
}
