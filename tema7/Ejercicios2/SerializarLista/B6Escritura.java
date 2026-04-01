package tema7.Ejercicios2.SerializarLista;

import tema7.Ejercicios2.SerializarObjeto.Persona;
import utils.Colores;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class B6Escritura {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(new Persona(25, "Ana"));
        listaPersonas.add(new Persona(30, "Carlos"));
        listaPersonas.add(new Persona(22, "Elena"));

        File archivo = new File("src/tema7/Ejercicios2/SerializarLista/personas.dat");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {

            oos.writeObject(listaPersonas);

            System.out.println("Lista de personas guardada con éxito.");

        } catch (IOException e) {
            Colores.logError("Algo ha salido mal");
        }
    }
}
