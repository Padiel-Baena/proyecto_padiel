package tema7.Ejercicios2.SerializarLista;

import tema7.Ejercicios2.SerializarObjeto.Persona;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class B6Lectura {
    public static void main(String[] args) {
        File archivo = new File("src/tema7/Ejercicios2/SerializarLista/personas.dat");

        if (!archivo.exists()) {
            System.out.println("El archivo no existe.");
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            @SuppressWarnings("unchecked")
            ArrayList<Persona> listaRecuperada = (ArrayList<Persona>) ois.readObject();

            System.out.println("--- LISTA DE PERSONAS RECUPERADA ---");
            for (Persona p : listaRecuperada) {
                System.out.println(p);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }
}
