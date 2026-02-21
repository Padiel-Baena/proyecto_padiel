package tema5.Colecciones2.Ejercicio4;

public class Proceso {
    private String nombre;
    private double tRestante;

    public Proceso(String nombre, double tRestante){
        this.nombre = nombre;
        this.tRestante = tRestante;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double gettRestante() {
        return tRestante;
    }
    public void settRestante(double tRestante) {
        this.tRestante = tRestante;
    }
}
