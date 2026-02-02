package tema3.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscaMinas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        boolean jugar = false;
        System.out.println("Este es el juego del buscaminas, tienes que elegir un numero del 0 al 19.\nHay 6 minas.\nSi aparece 0, no hay ninguna cerca, si aparece 1, hay 1 cerca, y si aparece 2 hay dos cerca");
        String[] juego = new String[20];
        juego = generar(juego);
        String[] mostrar = new String[20];
        for (int i = 0; i < 20; i++) {
            mostrar[i] = "-";
        }
        creaNum(juego);
        while (cont<14 && jugar == false){
            jugar = jugadas(mostrar, juego, sc);
            if (jugar == false){
            cont++;
            }
        }
        if (cont >=14){
        System.out.println("Has ganado");
        }
        else {
            System.out.println("Has perdido");
        }
    }
    public static String[] generar(String[] juego){
        Random rm = new Random();
        for (int i =0; i < 6;i++){
            int numr = rm.nextInt(20);
            while(juego[numr] != null){
                numr = rm.nextInt(20);
            }
            juego[numr]="*";
        }
        return juego;
    }
    public static String[] creaNum(String[] juego){
        for (int i = 0; i < juego.length; i++) {
            if ("*".equals(juego[i])) {
                continue;
            }
            int contadorMinas = 0;
            if (i > 0 && "*".equals(juego[i - 1])) {
                contadorMinas++;
            }
            if (i < juego.length - 1 && "*".equals(juego[i + 1])) {
                contadorMinas++;
            }
            juego[i] = String.valueOf(contadorMinas);
        }
        return juego;
    }
    public static boolean jugadas(String[] mostrar, String[] juego, Scanner sc){
        System.out.println(Arrays.toString(mostrar));
        System.out.println("Selecciona un numero entre el 0 y el 19, ambos incluidos");
        int numJ = sc.nextInt();
        while (numJ<0 || numJ>19 || !"-".equals(mostrar[numJ])){
            System.out.println("Me has dado un valor incorrecto");
            numJ= sc.nextInt();
        }
        boolean pierdes=false;
        mostrar[numJ]=juego[numJ];
        if("*".equals(juego[numJ])){
            pierdes=true;
        }
        return pierdes;
    }
}