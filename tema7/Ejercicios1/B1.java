package tema7.Ejercicios1;

import utils.Colores;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

//Implementa un programa que muestre por pantalla los valores máximos y mínimos del archivo
//‘numeros.txt’.
public class B1 {
    public static void main(String[] args) {
        Path ruta = Paths.get("resources/Documentos/numeros.txt");
        File numeros = ruta.toAbsolutePath().toFile();
        System.out.println(Colores.colorText("BUSQUEDA DEL NUMERO MAS PEQUEÑO",Colores.PURPLE));
        buscarMin(numeros);
        System.out.println(Colores.colorText("BUSQUEDA DEL NUMERO MAS GRANDE",Colores.PURPLE));
        buscarMax(numeros);
    }
    public static int buscarMax(File a){
        try(BufferedReader br = new BufferedReader(new FileReader(a))){
            int num = 0;
            String line;
            while ((line = br.readLine()) != null) {
                if (num < Integer.parseInt(line = br.readLine())) {//borrar este readline
                    num = Integer.parseInt(line);
                }
            }
            System.out.println(Colores.colorText("El numero mas grande es : " + num,Colores.CYAN));
        }catch(IOException e){
            System.out.println("Error E/S");
            System.out.println(e.getMessage());
        }
        return 0;
    }
    public static void buscarMin(File a){
        try(BufferedReader br = new BufferedReader(new FileReader(a))){
            int num = 999999999;
            String line;
            while ((line = br.readLine()) != null) {
                if (num > Integer.parseInt(line = br.readLine())) {//todo: borrar este readline
                    num = Integer.parseInt(line);
                }
            }
            System.out.println(Colores.colorText("El numero mas pequeño es : " + num,Colores.CYAN));
        }catch(IOException e){
            System.out.println("Error E/S");
            System.out.println(e.getMessage());
        }
    }
}