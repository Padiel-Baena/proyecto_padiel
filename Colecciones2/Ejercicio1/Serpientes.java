package tema5.Colecciones2.Ejercicio1;

public class Serpientes extends Animal{
    protected double longitud;
    protected String especie;
    protected int horaAvistamiento;


    protected final double LONGITUD_DEFECTO = 50;
    protected final String ESPECIE_DEFECTO = "PITON RETICULADA";
    protected int HORA_AVISTAMIENTO_DEFECTO = 5;


    public Serpientes() {
        this.longitud = LONGITUD_DEFECTO;
        this.especie = ESPECIE_DEFECTO;
        this.horaAvistamiento = HORA_AVISTAMIENTO_DEFECTO;

    }
    public Serpientes(double longitud, String especie, int horaAvistamiento) {
        this.longitud = longitud;
        this.especie = especie;
        this.horaAvistamiento = horaAvistamiento;
    }

    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString(){
        return "Serpiente | Longitud : " + this.longitud + " || Especie : " + this.especie;
    }


}
