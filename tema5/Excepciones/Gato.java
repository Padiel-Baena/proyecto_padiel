package tema5.Excepciones;

public class Gato {
    private String nombre ;
    private int edad;

    private static final String NOMBRE_DEFECTO = "Nala";
    private static final int EDAD_DEFECTO = 5;

    public Gato(){
        this.nombre=NOMBRE_DEFECTO;
        this.edad = EDAD_DEFECTO;
    }
    public Gato(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) throws Exception{
        if (nombre.length() >= 3) {
            this.nombre = nombre;
        }else{
            throw new Exception("El nombre no puede tener menos de 3 caracteres");
        }
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) throws Exception {
        if (edad > 0) {
            this.edad = edad;
        }else {
            throw new Exception("Un gato no puede tener edad negativa");
        }
    }

    public String toString(String nombre, int edad){
        return "NOMBRE : " + nombre + " || EDAD : " + edad;
    }
    public void hacerRuida(){
        System.out.println(this.nombre + " esta maullando");
    }

}
