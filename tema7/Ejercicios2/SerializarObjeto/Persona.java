package tema7.Ejercicios2.SerializarObjeto;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private int edad;

    private final String NOMBRE_DEFECTO = "Paco";
    private final int EDAD_DEFECTO = 36;

    public Persona(){
        this.edad = EDAD_DEFECTO;
        this.nombre = NOMBRE_DEFECTO;
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
