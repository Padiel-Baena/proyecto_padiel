package tema3.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscaParejas {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Este es el juego de encontrar la pareja, tendras que elegir un numero de 0 a 19, en el caso de que encuentres las parejas, se quedaran visibles, en el caso de que no, deberas de tener una buena memoria");
        String[] parejas= new String[20];
        parejas=generador(parejas);
        int turnos =0;
        boolean aciertos;
        int cont =0;
        String[] mostrar= new String[20];
        for (int i=0;i<20;i++){
            mostrar[i] = "-";
        }
        while (cont != 10) {
            aciertos=jugada(mostrar,parejas,sc);
            turnos++;
            if (aciertos){
                cont++;
            }
        }
        System.out.println("HAS GANADO EL JUEGO!!!!!\nHas necesitado " + turnos + " turnos, vuelve a jugar y intenta batir tu marca");
    }
    public static String[] generador(String[] parejas){
        Random numr=new Random();
        String animal = "leon";
        int cont=0;
        while (cont !=20) {
            int posicion = numr.nextInt(20);
            while (parejas[posicion] != null) {
                posicion = numr.nextInt(20);
            }
            if (cont ==2){
                animal ="camaleon";
            } else if (cont==4) {
                animal ="gato";
            } else if (cont==6) {
                animal="delfin";
            } else if (cont==8) {
                animal ="perro";
            } else if (cont==10) {
                animal= "tigre";
            } else if (cont==12) {
                animal = "kiwi";
            } else if (cont==14) {
                animal="ballena";
            } else if (cont==16) {
                animal="aguila";
            } else if (cont==18) {
                animal="tortuga";
            }
            parejas[posicion] = animal;
            cont++;
        }
        return parejas;
    }
    public static boolean jugada(String[] mostrar,String[] parejas,Scanner sc){
        boolean ganador = false;
        System.out.println(Arrays.toString(mostrar));
        System.out.println("Dime un numero del 0 al 19");
        boolean borrado = false;
        int numJ = sc.nextInt();
        while (numJ <0 || numJ > 19 || !mostrar[numJ].equals("-")){
            System.out.println("Me has dado un valor incorrecto, dame otro valor");
            numJ = sc.nextInt();
        }
        mostrar[numJ]=parejas[numJ];
        System.out.println(Arrays.toString(mostrar));
        System.out.println("Ahora dime un segundo numero entre 0 y 19");
        int numJ2 = sc.nextInt();
        while (numJ2 <0 || numJ2 > 19 || numJ == numJ2 ||!mostrar[numJ2].equals("-")){
            System.out.println("Me has dado un valor incorrecto, dame otro valor");
            numJ2 = sc.nextInt();
        }
        mostrar[numJ2]=parejas[numJ2];
        System.out.println(Arrays.toString(mostrar));
        if (mostrar[numJ].equals(mostrar[numJ2])){
            System.out.println("!!!HAS ENCONTRADO UNA PAREJA!!!");
            ganador=true;
        }else{
            System.out.println("Memoriza las posiciones y suerte para la proxima");
            borrado = true;
        }
        if (borrado){
            mostrar[numJ] ="-";
            mostrar[numJ2]="-";
        }
        System.out.println("Pulsa cualquier tecla para continuar");
        sc.nextLine();
        sc.nextLine();
        System.out.println("\n*\n".repeat(400000));
        return ganador;
    }
}
