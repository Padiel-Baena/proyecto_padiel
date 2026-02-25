package Examen.Ejercicio3;

public class Pokebola extends Articulo{
    protected String tipoPokebola;
    protected tipo TipoArticulo = tipo.pokebola;

    protected final String TIPO_POKEBOLA_DEFECTO = "ULTRA-BALL";

    public Pokebola() {
        super();
        this.tipoPokebola = TIPO_POKEBOLA_DEFECTO;
    }

    public Pokebola(String nombre, boolean esGratis, String tipoPokebola) {
        super(nombre, esGratis);
        this.tipoPokebola = tipoPokebola;
    }

    public String getTipoPokebola() {
        return tipoPokebola;
    }
    public void setTipoPokebola(String tipoPokebola) {
        this.tipoPokebola = tipoPokebola;
    }
    public String getTipoArticulo() {
        return nombre;
    }

    @Override
    double precio() {
        double price ;
        if (getTipoPokebola().equals("POKE-BALL")){
            price = 2;
        } else if (getTipoPokebola().equals("GREAT-BALL")) {
            price = 5;
        }else {
            price = 10;
        }
        return price;
    }

    @Override
    String mostrarTipo() {
        return getTipoArticulo();
    }

    @Override
    public String toString() {
        return "Pokebola\ntipoPokebola='" + tipoPokebola+ "\nTipoArticulo=" + TipoArticulo + "\nnombre=" + nombre + "\nesGratis=" + esGratis;
    }
}
