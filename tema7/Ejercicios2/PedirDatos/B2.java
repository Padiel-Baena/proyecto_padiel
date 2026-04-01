package tema7.Ejercicios2.PedirDatos;

import utils.Colores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class B2 {
    public static void main(String[] args) {
        Path archivo = Paths.get("src/tema7/Ejercicios2/SerializarPersona/personas.txt");
        File personas = new File(archivo.toAbsolutePath().toUri());
        revisar(personas);
    }
    public static void revisar(File f){
        try(BufferedReader br = new BufferedReader(new FileReader(f))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(Colores.colorText(line,Colores.CYAN));
            }
        }catch (IOException ex){
            Colores.logError("Algo ha ido mal");
        }
    }
}
