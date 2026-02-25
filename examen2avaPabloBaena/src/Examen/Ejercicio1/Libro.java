package Examen.Ejercicio1;

enum tipo{tapaDura, tapaBlanda,bolsillo}
public class Libro {

    //ATRIBUTOS NORMALES POR DEFECTO

    protected String isbn ;
    protected String nombre;
    protected String autor;
    protected int nPaginas;
    protected String genero;
    protected tipo formato;


    protected final String ISBN_DEFECTO = "A1";
    protected final String NOMBRE_DEFECTO = "El Quijote";
    protected final String AUTOR_DEFECTO = "Miguel de Cervantes";
    protected final int N_PAGINAS_DEFECTO = 1000;
    protected final String GENERO_DEFECTO = "Fantasia";
    protected final tipo FORMATO_DEFECTO = tipo.tapaDura;


    //CONSTRUCTOR VACIO

    public Libro(){
        this.isbn = ISBN_DEFECTO;
        this.nombre = NOMBRE_DEFECTO;
        this.autor = AUTOR_DEFECTO;
        this.nPaginas = N_PAGINAS_DEFECTO;
        this.genero = GENERO_DEFECTO;
        this.formato = FORMATO_DEFECTO;

    }

    //CONSTRUCTOR COMPLETO

    public Libro(String isbn, String nombre, String autor, int nPaginas, String genero, tipo formato) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
        this.nPaginas = nPaginas;
        this.genero = genero;
        this.formato = formato;

    }

    //CONSTRUCTOR CON 3 PARAMETROS

    public Libro(String isbn, String nombre,String autor ){
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
    }

    //GETTERS Y SETTERS

    public String getIsbn() {
        return isbn;
    }
    public String getNombre() {
        return nombre;
    }
    public String getAutor() {
        return autor;
    }
    public int getnPaginas() {
        return nPaginas;
    }
    public void setnPaginas(int nPaginas) {
        if (nPaginas > 0) {
            this.nPaginas = nPaginas;
        }else {
            System.err.println("ERROR : UN LIBRO NO PUEDE TENER MENOS DE 1 PAGINA");
        }
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public tipo getFormato() {
        return formato;
    }
    public void setFormato(tipo formato) {
        this.formato = formato;
    }



    //METODOS

    public double PesoLibro(){
        double peso = 0;
        if (getFormato().equals(formato.tapaDura)){
            peso = 50;
            peso += getnPaginas() * 2;
        } else if (getFormato().equals(formato.tapaBlanda)) {
            peso = 20;
            peso += getnPaginas() * 2;
        }else{
            peso = 10;
            peso += getnPaginas();
        }
        return peso;
    }

    //TO STRING

    public String toString() {
        return "Libro\n" + "ISBN = " + isbn + "\nNombre : " + nombre  + "\nAutor : " + autor  + "\nNumero de Paginas : " + nPaginas + "\nGenero : " + genero + "\nFormato : " + formato ;
    }
}
