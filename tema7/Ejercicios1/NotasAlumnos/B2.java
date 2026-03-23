package tema7.Ejercicios1.NotasAlumnos;

import utils.Colores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B2 {
    public static void main(String[] args) {
        Path ruta = Paths.get("resources/Documentos/alumnos_notas.txt");
        File notas = ruta.toAbsolutePath().toFile();
        calcularMedia(notas);
    }
    public static int calcularMedia(File n){
        try(BufferedReader br = new BufferedReader(new FileReader(n))){
            List<Alumnos> listaAlumnos = new ArrayList<>();
            int[] notas ;
            int cont = 0;
            String nombre = "";
            String apellido = "";
            String line;
            while ((line = br.readLine()) != null) {
                String[] dividido =  line.split(" ");
                notas = new int[dividido.length - 2];
                nombre = dividido[cont];
                cont ++;
                apellido = dividido[cont];
                cont ++;
                for (int i = 0; i < dividido.length - 2; i++) {
                    notas[i] = Integer.parseInt(dividido[cont]);
                    cont++;
                }
                nombre = nombre + " " + apellido;
                Alumnos a = new Alumnos(nombre,notas);
                listaAlumnos.add(a);
                cont = 0;
            }
            Collections.sort(listaAlumnos);
            for (Alumnos a : listaAlumnos) {
                System.out.println(Colores.colorText(a.toString(),Colores.GOLD));
            }
        }catch(IOException e){
            System.out.println("Error E/S");
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
