package tema6.POO3.Ejercicio4;
//Crea una clase Ficha diseñada para manipular elementos de una biblioteca:
//libros, revistas, DVD… Los atributos comunes serán número y título.
//Los libros: tendrán además autor y editorial.
//Las revistas: número de publicación y año.
//Los DVD: tendrán director, año y tipo (animación, acción, documental, ciencia
//ficción…).
//Define la clase base, las derivadas y los métodos que consideres interesantes.
public class Ficha {
    protected int numero;
    protected String titulo;
    protected boolean prestado;

    protected int NUM_DEFECTO = 1;
    protected String TITULO_DEFECTO = "El Quijote";
    protected boolean PRESTADO_DEFECTO = true;

    public Ficha() {
        this.numero = NUM_DEFECTO;
        this.titulo = TITULO_DEFECTO;
    }
    public Ficha(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public boolean getPrestado() {
        return prestado;
    }
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void Prestamo(int num, boolean prestado) {
        if(getPrestado()) {
            System.out.println("El objeto esta prestado");
        }
        else  {
            System.out.println("El objeto esta disponible");
        }
    }
    public String toString() {
        String frase = "Numero : " +  getNumero();
        frase += "\nTitulo : " + getTitulo();
        return frase;
    }
}
