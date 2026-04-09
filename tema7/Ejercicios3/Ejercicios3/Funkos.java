package tema7.Ejercicios3;

import java.io.Serializable;
import static utils.Colores.*; // Importamos tus colores

public class Funkos implements Serializable {

    private String cod;
    private String nombre;
    private String modelo;
    private double precio;
    private String fecha; // Formato AAAA-MM-DD

    public Funkos(String cod, String nombre, String modelo, double precio, String fecha) {
        this.cod = cod;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getCod() { return cod; }
    public String getNombre() { return nombre; }
    public String getModelo() { return modelo; }
    public double getPrecio() { return precio; }
    public String getFecha() { return fecha; }

    public int obtenerAño() {
        // La fecha es "2023-01-01", cortamos por el guion y pillamos lo primero
        String[] partes = this.fecha.split("-");
        return Integer.parseInt(partes[0]);
    }

    @Override
    public String toString() {
        return colorText(cod.substring(0, 8), GRAY_LIGHT) + " | " +
                colorText(nombre, GOLD) + " | " +
                colorText(modelo, CYAN) + " | " +
                colorText(precio + "€", GREEN_BRIGHT) + " | " +
                colorText(fecha, SKY_BLUE);
    }
}