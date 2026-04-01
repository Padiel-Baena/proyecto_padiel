package tema7.Ejercicios2.CuentaPalabras;

import utils.Colores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class B3 {
    public static void main(String[] args) {
        //He usado el de frases porque habia bastante escrito
        Path ruta = Paths.get("resources/Documentos/frases.txt");
        File archivo = new File(ruta.toAbsolutePath().toUri());
        motor(archivo);
    }
    public static void motor(File f){
        int contador = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(f))){
            String line;
            String linea[];
            while((line = br.readLine()) != null){
                linea = line.split(" ");
                System.out.println(Colores.colorText(line,Colores.RED));
                for (int i = 0; i < linea.length; i++) {
                    contador++;
                }
            }
            System.out.println(Colores.colorText("El documento tiene un total de : " + contador + " palabras", Colores.GOLD));
        }catch (IOException ex){
            Colores.logError("Algo no tira");
        }
    }
}
