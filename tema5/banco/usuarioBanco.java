package tema5.banco;

public class usuarioBanco {
    String dni;
    String nombre;
    int edad;


    String DNI_DEFECTO = "11111111A";
    String NOMBRE_DEFECTO = "Pabit";
    int EDAD_DEFECTO = 23;

    public usuarioBanco(){
        this.dni = DNI_DEFECTO;
        this.nombre = NOMBRE_DEFECTO;
        this.edad = EDAD_DEFECTO;
    }
    public usuarioBanco(String dni, String nombre, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if(edad > 0 && edad <= 99) {
            this.edad = edad;
        }
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public String toString(){
        return "Dni: " + this.dni + "\nNombre: " + this.nombre + "\nEdad: " + this.edad;
    }
}
