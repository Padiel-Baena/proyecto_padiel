package tema5.Colecciones2.Ejercicio1;

public class Manadas extends Animal {
    protected int cLobos;
    protected String descripcion;
    protected int horaAvistamiento;


    protected int LOBOS_DEFECTO = 6;
    protected String DESCRIPCON_DEFECTO = "Muy peligrosos";
    protected int HORA_AVISTAMIENTO_DEFECTO = 5;

    public Manadas() {
        this.cLobos = LOBOS_DEFECTO;
        this.descripcion = DESCRIPCON_DEFECTO;
        this.horaAvistamiento = HORA_AVISTAMIENTO_DEFECTO;
    }
    public Manadas(int cLobos, String descripcion,int horaAvistamiento) {
        this.cLobos = cLobos;
        this.descripcion = descripcion;
        this.horaAvistamiento = horaAvistamiento;
    }

    public int getcLobos() {
        return cLobos;
    }
    public void setcLobos(int cLobos) {
        this.cLobos = cLobos;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        return "Manada | Cantidad de Lobos : " + this.cLobos + " || Descripcion : " + this.descripcion;
    }
}
