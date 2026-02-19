package tema6.POO3.Ejercicio4;

public class FichaMain {
    public static void main(String[] args) {
        Libros libros = new Libros("Sarah J Maas","Planeta",1,"Trono de Cristal");
        System.out.println(libros.toString());
        libros.Prestamo(1,false);
        Dvd dvd = new Dvd("Steven Spielberg",2025,Tipo.Accion,2, "Avatar 3");
        System.out.println(dvd.toString());
        dvd.Prestamo(2,false);
        System.out.println("\notro prestamo del libro");
        libros.Prestamo(1,true);
    }
}
