package tema7.Ejercicios1.BuscaPi;

import utils.Colores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado = 0;
        do {
            Path ruta = Paths.get("resources/Documentos/pi-million.txt");
            File pi = ruta.toAbsolutePath().toFile();
            long num = elegirNumero(sc);
            while(num < 0){
                Colores.logError("Vuelve a probar, que sea un numero positivo");
                num = elegirNumero(sc);
            }
            resultado = comparaPi(pi, num);
            if (resultado == 1) {
                Colores.logSuccess("El numero elegido esta dentro del primer millon de pi");
            } else if (resultado == 2) {
                Colores.logError("El numero elegido no esta dentro del primer millon de pi");
            }
        }while (resultado == 0);
        sc.close();
    }
    public static int comparaPi(File p, long num) {
        try (BufferedReader br = new BufferedReader(new FileReader(p))){
            String line = br.readLine();
            if (String.valueOf(line).contains(String.valueOf(num))){
                return 1;
            }else{
                return 2;
            }
        }catch(IOException ex){
            Colores.logError("No tira");
            return 0;
        }
    }
    public static long elegirNumero(Scanner sc) {
        long nElegido = -1;
        try {
            Colores.logHeader("Elige un numero entero y yo buscare si esa combinacion esta en el primer millon de pi, puede ser de la longitud que quieras");
            Colores.logWarning("Recuerda que no puede ser un numero negativo");
            nElegido = sc.nextLong();
            return nElegido;
        } catch (InputMismatchException ex) {
            sc.nextLine();
            Colores.logError("Te he pedido un numero");
            return nElegido;
        }
    }
}
