package tema5.gym;

public class Usuario {
private String nombre ;
private int edad;
private String dni;

private static final String NOMBRE_DEFECTO = "Diepla";
private int EDAD_DEFECTO = 15;
private String DNI_DEFECTO = "11111111A";

public Usuario(){
    this.nombre = NOMBRE_DEFECTO;
    this.edad = EDAD_DEFECTO;
    this.dni = DNI_DEFECTO;
}
public Usuario(String nombre){
    this.nombre = nombre;
}
public Usuario(String nombre, int edad, String dni){
    this.nombre=nombre;
    this.edad=edad;
    this.dni=dni;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad > 0 && edad < 100) {
            this.edad = edad;
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String toString(String nombre, int edad, String dni){
        return "Nombre : " + nombre + "\nEdad : " + edad + "\nDNI : " + dni;
    }
}
