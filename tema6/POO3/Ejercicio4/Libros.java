package tema6.Ejercicio4;

public class Libros extends Ficha{
    protected String autor;
    protected String editorial;

    protected String AUTOR_DEFECTO = "Miguel de cervantes";
    protected String EDITORIAL_DEFECTO = "Santillana";

    public Libros(){
        super();
        this.autor = AUTOR_DEFECTO;
        this.editorial = EDITORIAL_DEFECTO;
    }
    public  Libros(String autor, String editorial, int numero, String titulo) {
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public void Prestamo(int num,boolean prestado) {
        if(getNumero() == num){
            if(prestado){
                System.out.println("El objeto esta prestado");
            }
            else{
                System.out.println("El objeto no estaba prestado, ahora lo tienes tu");
            }
        }else{
            System.out.println("El numero es incorrecto");
        }
    }

    @Override
    public String toString() {
        String frase =super.toString();
        frase += "\nAutor : " + getAutor();
        frase += "\nEditorial : " + getEditorial();
        return frase;
    }
}
