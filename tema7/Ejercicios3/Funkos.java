package tema7.Ejercicios3;

import java.io.Serializable;

public class Funkos implements Serializable {
    private String nombre;
    private String modelo;
    private double precio;
    private int anyo;

    public Funkos(String nombre, String modelo, double precio, int anyo) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.anyo = anyo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getAnyo() {
        return anyo;
    }
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "Funkos{" +
                "nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", anyo=" + anyo +
                '}';
    }
}
