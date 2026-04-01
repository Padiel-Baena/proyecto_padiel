package tema7.Ejercicios2.SerializarObjeto;

import tema7.Ejercicios2.SerializarObjeto.Persona;
import utils.Colores;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Path ruta = Paths.get("src/tema7/Ejercicios2/SerializarObjeto/personas.dat");
        File archivo = new File(ruta.toAbsolutePath().toUri());
        Persona p1 = creaPersonas(sc);
        guardar(p1,archivo);
    }
    public static Persona creaPersonas(Scanner sc) {
        String nombre;
        int edad;
        Persona p1;
        try {
            System.out.println(Colores.colorText("Dime el nombre que quieres para la persona", Colores.LIME));
            nombre = sc.nextLine();
            System.out.println(Colores.colorText("Dime la edad de " + nombre, Colores.ORANGE));
            edad = sc.nextInt();
            sc.nextLine();
            p1 = new Persona(edad,nombre);
            return p1;
        }catch (InputMismatchException ex){
            sc.nextLine();
            Colores.logError("Te he pedido un nombre y numero, no inventes");
            return p1 = new Persona();
        }
    }
    public static void guardar(Persona p1, File archivo){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))){
            oos.writeObject(p1);
        }catch (IOException ex){
            Colores.logError("Algo ha ido mal");
        }
    }
}
