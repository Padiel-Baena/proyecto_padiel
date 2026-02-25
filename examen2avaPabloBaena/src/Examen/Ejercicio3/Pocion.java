package Examen.Ejercicio3;

import java.util.Arrays;

public class Pocion extends Articulo{
    protected int nivel;
    protected String[] efectos;
    protected tipo tipoArticulo = tipo.pocion;

    protected final int NIVEL_DEFECTO = 1;
    protected final String[] EFECTOS_DEFECTO = new String[]{"curar quemadura","curar vida"};

    public Pocion() {
        super();
        this.nivel = NIVEL_DEFECTO;
        this.efectos = EFECTOS_DEFECTO;

    }
    public Pocion(String nombre, boolean esGratis, int nivel, String[] efectos) {
        super(nombre, esGratis);
        this.nivel = nivel;
        this.efectos = efectos;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public String[] getEfectos() {
        return efectos;
    }
    public void setEfectos(String[] efectos) {
        this.efectos = efectos;
    }
    public String getTipoArticulo() {
        return nombre;
    }

    @Override
    String mostrarTipo() {
        return getTipoArticulo();
    }

    @Override
    double precio() {
        return getNivel() * 5;
    }

    @Override
    public String toString() {
        return "Pocion\ntipoArticulo=" + tipoArticulo + "\nefectos=" + Arrays.toString(efectos) + "\nnivel=" + nivel + "\nnombre='" + nombre + "\nesGratis=" + esGratis;
    }
}
