package tema7.Ejercicios2.LeerObjetoBinario;

import tema7.Ejercicios2.SerializarObjeto.Persona;
import utils.Colores;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class B5 {
    public static void main(String[] args) {
        File archivo = new File("src/tema7/Ejercicios2/SerializarObjeto/personas.dat");
        Persona pLeida = leerPersona(archivo);

        if (pLeida != null) {
            System.out.println(Colores.colorText("Objeto recuperado con éxito:", Colores.LIME));
            System.out.println(pLeida);
        }
    }

    public static Persona leerPersona(File f) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {

            Persona p = (Persona) ois.readObject();
            return p;

        } catch (IOException e) {
            Colores.logError("Error al abrir o leer el archivo: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            Colores.logError("No se encontró la clase Persona al deserializar.");
        }
        return null;
    }
}
