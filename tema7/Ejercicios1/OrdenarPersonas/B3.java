package tema7.Ejercicios1.OrdenarPersonas;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B3 {
    public static void main(String[] args) {
        Path ruta = Paths.get("resources/Documentos/usa_personas.txt");
        File personas = ruta.toAbsolutePath().toFile();
        List<String> listaPersonas = new ArrayList<>();
        ordenar(personas, listaPersonas);
    }
    public static void ordenar(File personas, List<String> listaPersonas){
        try {
            File ordenado = new File("usa_personas_sorted.txt");
            try (BufferedReader br = new BufferedReader(new FileReader(personas))) {
                String line;
                BufferedWriter outputAppend = new BufferedWriter(new FileWriter(ordenado));
                while ((line = br.readLine()) != null) {
                    listaPersonas.add(line);
                }
                Collections.sort(listaPersonas);
                for (String p : listaPersonas) {
                    outputAppend.write(p);
                    outputAppend.newLine();
                }
                outputAppend.close();
                BufferedReader br2 = new BufferedReader(new FileReader(ordenado));
                String line2;
                while ((line2 = br2.readLine()) != null) {
                    System.out.println(line2);
                }
                br2.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
