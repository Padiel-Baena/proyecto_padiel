package tema6.POO3.Ejercicio5;

public class RedesSocialesMain {
    public static void main(String[] args) {
        tema6.POO3.Ejercicio5.PublicacionFoto foto = new tema6.POO3.Ejercicio5.PublicacionFoto(50, TipoPublicacion.Foto);

        foto.abrir();
        foto.comentar();
        foto.compartir();
        foto.compartirContenido();
        foto.publicar();

    }
}
