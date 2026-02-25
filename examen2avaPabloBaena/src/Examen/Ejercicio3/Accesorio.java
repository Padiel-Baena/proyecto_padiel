package Examen.Ejercicio3;

public class Accesorio extends Articulo{
    protected String nombre;
    protected tipo tipoArticulo = tipo.accesorio;

    protected final String NOMBRE_DEFECTO = "GORRO";

    public Accesorio() {
        super();
        this.nombre = NOMBRE_DEFECTO;
    }

    public Accesorio(String nombre, boolean esGratis, String nombre1) {
        super(nombre, esGratis);
        this.nombre = nombre1;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoArticulo() {
        return nombre;
    }

    @Override
    String mostrarTipo() {
        return  getTipoArticulo();
    }
    @Override
    double precio() {
        return 7;
    }

    @Override
    public String toString() {
        return "Accesorio\nnombre=" + nombre + "\ntipoArticulo=" + tipoArticulo + "\nnombre='" + nombre + "\nesGratis=" + esGratis ;
    }
}
