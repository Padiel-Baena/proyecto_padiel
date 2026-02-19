package tema6.Ejercicio4;

public class Revistas extends Ficha{
    protected int numPublicacion;
    protected int anio;

    protected int NUM_PUBLICACION_DEFECTO = 1;
    protected int ANIO_DEFECTO = 2005;

    public Revistas(){
        super();
        this.numPublicacion = NUM_PUBLICACION_DEFECTO;
        this.anio = ANIO_DEFECTO;
    }
    public Revistas(int numPublicacion, int anio, int numero, String titulo) {
        super(numero, titulo);
        this.numPublicacion = numPublicacion;
        this.anio = anio;
    }

    public int getNumPublicacion() {
        return numPublicacion;
    }
    public void setNumPublicacion(int numPublicacion) {
        this.numPublicacion = numPublicacion;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
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
        frase += "\nNumero de Publicacion : " + getNumPublicacion();
        frase += "\nAño : " + getAnio();
        return frase;
    }
}
