package tema6.Ejercicio5;

public class PublicacionVideo implements IPublicacion,IAbrirPublicacion, IPublicaionReaccion{
    protected int cLikes;
    protected TipoPublicacion tipo;

    protected int C_LIKES_DEFECTO = 50;
    protected TipoPublicacion TIPO_DEFECTO = TipoPublicacion.Video;

    public PublicacionVideo(){
        this.cLikes = C_LIKES_DEFECTO;
        this.tipo = TIPO_DEFECTO;
    }
    public PublicacionVideo(int cLikes, TipoPublicacion tipo){
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
        System.out.println("Acabas de publicar un video");
    }
    @Override
    public void abrir() {
        System.out.println("Acabas de abrir un video");
    }
    @Override
    public void compartirContenido(){
        System.out.println("Compartiendo un video en formato contenido");
    }
    @Override
    public void comentar(){
        System.out.println("Comentando un video");
    }
    @Override
    public void compartir() {
        System.out.println("Compartiendo un video");
    }
}
