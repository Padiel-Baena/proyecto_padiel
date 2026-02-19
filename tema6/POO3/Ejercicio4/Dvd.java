package tema6.Ejercicio4;

enum Tipo{Animacion, Accion, Documental, Ciencia_Ficcion}
public class Dvd extends Ficha{
    protected String director;
    protected int anio;
    protected Tipo tipo;

    protected String DIRECTOR_DEFECTO = "Steven Spielberg";
    protected int ANIO_DEFECTO = 2005;
    protected Tipo TIPO_DEFECTO = Tipo.Ciencia_Ficcion;

    public Dvd(){
        super();
        this.director = DIRECTOR_DEFECTO;
        this.anio = ANIO_DEFECTO;
        this.tipo = TIPO_DEFECTO;
    }
    public Dvd(String director, int anio, Tipo tipo, int numero, String titulo) {
        super(numero, titulo);
        this.director = director;
        this.anio = anio;
        this.tipo = tipo;
    }

    public String getDirector() {
        return director;
    }
    public void setNumPublicacion(String director) {
        this.director = director;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
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
        frase += "\nDirector : " + getDirector();
        frase += "\nAño : " + getAnio();
        frase += "\nTipo : " + getTipo();
        return frase;
    }
}
