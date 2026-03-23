package tema7.Ejercicios1.Estadisticas;

import utils.Colores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class B7 {
    public static void main(String[] args) {
        Hashtable<String,Integer> masUsadas = new Hashtable<String, Integer>();
        Path ruta = Paths.get("resources/Documentos/Libros/coplas_manrique.txt");
        File archivo = ruta.toAbsolutePath().toFile();
        creaStats(masUsadas,archivo);
    }
    public static void creaStats(Hashtable<String,Integer> l, File a){
        try(BufferedReader br = new BufferedReader(new FileReader(a))){
            String line;
            int cLineas = 0;
            int cPalabras = 0;
            long cCaracteres = 0;
            while((line = br.readLine()) != null){
                String[] palabras = line.trim().split("\\s+");
                cPalabras += palabras.length;
                for (int i = 0; i < palabras.length; i++) {
                    cCaracteres += palabras[i].length();
                }
                for (int i = 0; i < palabras.length; i++) {
                    if (!palabras[i].isEmpty()) {
                        if (l.containsKey(palabras[i])) {
                            l.put(palabras[i], l.getOrDefault(palabras[i], 0) + 1);
                        } else {
                            l.put(palabras[i], 1);
                        }
                    }
                }
                cLineas++;
            }

            List<Map.Entry<String, Integer>> lista = new ArrayList<>(l.entrySet());
            lista.sort((p1, p2) -> p2.getValue().compareTo(p1.getValue()));

            l.clear();
            for (int i = 0; i < 10; i++) {
                l.put(lista.get(i).getKey(), lista.get(i).getValue());
            }

            System.out.println(Colores.colorText("Cantidad de lineas : " + cLineas, Colores.GOLD));
            System.out.println(Colores.colorText("Cantidad de palabras : " + cPalabras,Colores.CYAN));
            System.out.println(Colores.colorText("Cantidad de caracteres : " + cCaracteres,Colores.ORANGE));
            System.out.println(Colores.colorText("Palabras mas usadas",Colores.YELLOW));
            for (int i = 0; i < l.size(); i++) {
                Map.Entry<String, Integer> entrada = lista.get(i);
                System.out.println(Colores.colorText(((i + 1) + ". " + entrada.getKey() + " aparece " + entrada.getValue() + " veces."),Colores.PURPLE));
            }
        } catch (IOException e) {
            Colores.logError("No tira");
        }
    }
}
