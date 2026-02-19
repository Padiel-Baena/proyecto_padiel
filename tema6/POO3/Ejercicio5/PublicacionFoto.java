package tema6.POO3.Ejercicio5;

public class PublicacionFoto implements IPublicacion,IAbrirPublicacion, IPublicaionReaccion{

    protected int cLikes;
    protected TipoPublicacion tipo;

    protected int C_LIKES_DEFECTO = 50;
    protected TipoPublicacion TIPO_DEFECTO = TipoPublicacion.Foto;

    public PublicacionFoto(){
        this.cLikes = C_LIKES_DEFECTO;
        this.tipo = TIPO_DEFECTO;
    }
    public PublicacionFoto(int cLikes, TipoPublicacion tipo){
        this.cLikes = cLikes;
        this.tipo = tipo;
    }

    public int getcLikes() {
        return cLikes;
    }
    public void setcLikes(int cLikes) {
        this.cLikes = cLikes;
    }
    public TipoPublicacion getTipo() {
        return tipo;
    }
    public void setTipo(TipoPublicacion tipo) {
        this.tipo = tipo;
    }

    @Override
    public void publicar() {
        System.out.println("Acabas de publicar una foto");
    }
    @Override
    public void abrir() {
        System.out.println("Acabas de abrir una foto");
    }
    @Override
    public void compartirContenido(){
        System.out.println("Compartiendo una foto en modo contenido");
    }
    @Override
    public void comentar(){
        System.out.println("Comentando una foto");
    }
    @Override
    public void compartir() {
        System.out.println("Compartiendo una foto");
    }
}
