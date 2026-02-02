package tema4;

public class PersonaPrueba {
    String nombre;
    int edad;
    public static final int edadDefecto = 3;


    public PersonaPrueba(){
        nombre = "Anastasio";
        edad = edadDefecto;
    }
    public PersonaPrueba(String nombre){
        this.nombre = nombre;
        this.edad=edadDefecto;
    }
    public PersonaPrueba(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public void saludar(){
        System.out.println("¡Hola!");
    }
    public void presentarme(){
        System.out.println("Soy " + nombre + " y tengo " + edad + " años.");
    }
    public void saludarA(String nombre){
        System.out.println("¡Hola " + nombre + "!");
    }
    public void showInfo(){
        System.out.println("Mi nombre es : " + nombre + "\nMi edad es : " + edad);
    }
}
