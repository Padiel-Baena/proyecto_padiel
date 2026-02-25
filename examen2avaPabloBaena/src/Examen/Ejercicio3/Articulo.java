package Examen.Ejercicio3;

public abstract class Articulo {
    protected String nombre;
    protected boolean esGratis;

    protected final String NOMBRE_DEFECTO = "Pokebola";
    protected final boolean ES_GRATIS_DEFECTO = true;

    public Articulo() {
        this.nombre = NOMBRE_DEFECTO;
        this.esGratis = ES_GRATIS_DEFECTO;
    }

    public Articulo(String nombre, boolean esGratis) {
        this.nombre = nombre;
        this.esGratis = esGratis;
    }

    abstract String mostrarTipo();
    abstract double precio();

}
