package tema6.POO3.Ejercicio5;

public class PublicaionTexto implements IPublicacion, tema6.POO3.Ejercicio5.IPublicaionReaccion {
    protected int cLikes;
    protected TipoPublicacion tipo;

    protected int C_LIKES_DEFECTO = 50;
    protected TipoPublicacion TIPO_DEFECTO = TipoPublicacion.Texto;

    public PublicaionTexto(){
        this.cLikes = C_LIKES_DEFECTO;
        this.tipo = TIPO_DEFECTO;
    }
    public PublicaionTexto(int cLikes, TipoPublicacion tipo){
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
        System.out.println("Acabas de publicar un mensaje");
    }
    @Override
    public void compartirContenido(){
        System.out.println("Compartiendo un mensaje");
    }
    @Override
    public void comentar(){
        System.out.println("Comentando un mensaje");
    }
    @Override
    public void compartir() {
        System.out.println("Compartiendo un mensaje");
    }
}
