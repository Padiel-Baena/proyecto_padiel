package tema7.Ejercicios1.EjDiccionario;

import utils.Colores;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class B5 {
    public static void main(String[] args) {
        Path rutaDiccionario = Paths.get("src/tema7/Ejercicios1/EjDiccionario/resultado");
        Path rutaOrigen = Paths.get("resources/Documentos/diccionario.txt");
        limpiarCarpeta(rutaDiccionario);
        crearCarpeta(rutaDiccionario);
        crearArchivos(rutaDiccionario);
        List<String> listaPalabras = new ArrayList<>();
        palabras(listaPalabras,rutaOrigen.toFile());
        separar(listaPalabras,rutaDiccionario);
    }
    public static void crearCarpeta(Path ruta){
        try {
            Files.createDirectories(ruta);
            System.out.println(Colores.colorText("Carpeta creada con exito" , Colores.GOLD));
        }catch (Exception ex){
            Colores.logError("No se ha podido crear la carpeta");
        }
    }
    public static void crearArchivos(Path ruta){
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < letras.length(); i++) {
            char letra = letras.charAt(i);
            Path archivoPath = ruta.resolve(letra + ".txt");
            try{
                Files.createFile(archivoPath);
                System.out.println(Colores.colorText("ARCHIVO CREADO " + letra + ".txt" ,Colores.GOLD));
            }catch (IOException ex){
                Colores.logError("Algo ha ido mal");
            }
        }
    }
    public static void limpiarCarpeta(Path ruta) {
        File carpeta = ruta.toFile();

        if (carpeta.exists()) {
            File[] archivos = carpeta.listFiles();
            if (archivos != null) {
                for (File f : archivos) {
                    f.delete();
                }
            }
            if (carpeta.delete()) {
                System.out.println(Colores.colorText("Limpieza completada: Carpeta antigua eliminada.", Colores.RED));
            }
        }
    }
    public static void palabras(List<String> l,File f){
        try(BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                l.add(line);
            }
        }catch (IOException ex){
            Colores.logError("Esto no tira");
        }
    }
    public static void separar(List<String>l ,Path p){
        //mi idea inicial era ponerlo en un switch pero era muy largo
        for (String pa : l) {
            pa = pa.trim();
            if(pa.isEmpty()) continue;

            char inicial = Character.toUpperCase(pa.charAt(0));
            if (inicial == 'Á') inicial = 'A';
            else if (inicial == 'É') inicial = 'E';
            else if (inicial == 'Í') inicial = 'I';
            else if (inicial == 'Ó') inicial = 'O';
            else if (inicial == 'Ú') inicial = 'U';
            Path archivoDestino = p.resolve(inicial + ".txt");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoDestino.toFile(), true))) {
                bw.write(pa);
                bw.newLine();
            } catch (IOException e) {
                Colores.logError("No se pudo guardar la palabra: " + pa);
            }
        }
    }
}