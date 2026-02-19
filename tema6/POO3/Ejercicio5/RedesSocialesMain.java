package tema6.Ejercicio5;

public class RedesSocialesMain {
    public static void main(String[] args) {
        PublicacionFoto foto = new PublicacionFoto(50, TipoPublicacion.Foto);

        foto.abrir();
        foto.comentar();
        foto.compartir();
        foto.compartirContenido();
        foto.publicar();

    }
}
