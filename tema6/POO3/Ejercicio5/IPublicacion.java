package tema6.POO3.Ejercicio5;
//Para una red social, crea una interfaz Publicacion con métodos como
//publicar y compartir. Implementa esta interfaz en clases como
//PublicacionTexto, PublicacionFoto, y PublicacionVideo. Cada clase debe tener
//su propia forma de publicar y compartir contenido. Ahora crea la interfaz
//AbrirPublicacion, que sólo implementarán las clases PublicacionFoto y
//PublicacionVideo.
enum TipoPublicacion{Texto, Foto, Video}
public interface IPublicacion {
    void publicar();
    void compartirContenido();
}
