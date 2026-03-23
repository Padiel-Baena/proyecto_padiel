package tema7.Ejercicios1.GeneraNombres;

import utils.Colores;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class B4 {
    public static void main(String[] args) {
        Path ruta = Paths.get("resources/Documentos/usa_nombres.txt");
        File nombres = ruta.toAbsolutePath().toFile();
        Path ruta2 = Paths.get("resources/Documentos/usa_apellidos.txt");
        File apellidos = ruta2.toAbsolutePath().toFile();
        List<String> listaNombres = new ArrayList<>();
        List<String> listaApellidos = new ArrayList<>();
        gNombres(nombres, listaNombres);
        gApellidos(apellidos,listaApellidos);
        generar(listaNombres,listaApellidos,cGenerar());
    }
    public static int cGenerar() {
        int cc= 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(Colores.colorText("Dime cuantos nombres quieres que genere",Colores.PURPLE));
            cc = sc.nextInt();
            Colores.colorText("Has decidido crear de forma aleatoria un total de : " + cc ,Colores.GREEN);
        }catch (InputMismatchException ex){
            Colores.logError("Te he pedido un numero entero");
        }
        return cc;
    }
    public static void gNombres(File f, List<String> listaNombres){
       try(BufferedReader br = new BufferedReader(new FileReader(f))) {
           String line;
           while ((line = br.readLine()) != null) {
               listaNombres.add(line);
           }
       }catch (IOException ex){
           Colores.logError("Esto no tira");
       }
    }
    public static void gApellidos(File f, List<String> listaApellidos){
        try(BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                listaApellidos.add(line);
            }
        }catch (IOException ex){
            Colores.logError("Esto no tira");
        }
    }
    public static void generar( List<String> listaNombres,List<String> listaApellidos, int c){
        Random rn = new Random();
        int nRandomN ;
        int nRandomA ;
        try {
            BufferedWriter outputAppend = new BufferedWriter(new FileWriter("Nombres_Completos.txt"));
            for (int i = 0; i < c; i++) {
                String nombre;
                nRandomN = rn.nextInt(274);
                nombre = listaNombres.get(nRandomN);
                String apellido;
                nRandomA = rn.nextInt(245);
                apellido = listaApellidos.get(nRandomA);
                String nCompleto = nombre + " "+ apellido;
                outputAppend.write(nCompleto);
                outputAppend.newLine();
            }
            outputAppend.close();
            Colores.logHeader("Aqui tienes los nombres creados que has pedido");
            BufferedReader br = new BufferedReader(new FileReader("Nombres_Completos.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(Colores.colorText(line,Colores.ORANGE));
            }
            br.close();
        }catch (IOException ex){
            Colores.logError("Esto no tira");
        }
    }
}

