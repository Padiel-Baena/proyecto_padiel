package tema3.arrays;

import java.util.Random;
import java.util.Scanner;

public class AtrapaMosca {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Este es el juego de Atrapa la mosca, consiste en que vas a tener que que decirme un numero entre el 1 y el 15, y yo te dire si has atrapado a la mosca o no");
        int[] juego= new int[15];
        int numJ;
        int result;
        boolean necesidadMosca = true;
        boolean jGana= false;
        while (!jGana) {
            System.out.println("GENERANDO MOSCA...");
            generadorDeMossca(juego, necesidadMosca);
            necesidadMosca = false;
            System.out.println("JUEGO CARGADO\nPulsa cualquier tecla para continuar");
            sc.nextLine();
            System.out.println("Elige un numero entre 0 y 14\nReglas\n1-Si dices el numero donde esta la mosca, ganas\n2-Si dices un numero contiguo a donde esta la mosca, la mosca se mueve de ubicacion\n3-Si la posicion que dices es no esta cerca de la mosca, esta no se mueve\n");
            numJ = sc.nextInt();
            while (numJ < 0 || numJ > 14){
                System.out.println("Dime otro valor, recuerda que tiene que estar entre 0 y 14, ambos incluidos");
                numJ = sc.nextInt();;
            }
            result = comprobacion(juego, numJ);
            if (result == 0) {
                System.out.println("HAS GANADO!!!!!");
                jGana = true;
            } else if (result == 1) {
                System.out.println("Has estado cerca, ahora la mosca se va a mover\nPulsa cualquier tecla para continuar");
                sc.nextLine();
                necesidadMosca = true;
            } else {
                System.out.println("No has estado ni cerca\nPulsa cualquier tecla para continuar");
                sc.nextLine();
            }
        }
    }
    public static int[] generadorDeMossca(int[] juego,boolean necesidadMosca){
        Random numr= new Random();
        if(necesidadMosca){
            for(int i =0; i < juego.length;i++){
                if (juego[i] == 1){
                    juego[i] = 0;
                }
            }
        int posicionMosca = numr.nextInt(15);
        while(posicionMosca < 0){
            posicionMosca = numr.nextInt(15);
        }
        juego[posicionMosca]=1;
        }
        return juego;
    }
    public static int comprobacion(int[] juego, int numJ){
        int mosca = -1;
        int acierto ;
        for(int i =0; i < juego.length;i++){
            if (juego[i] == 1){
                mosca = i;
            }
        }
        if (mosca == numJ){
            acierto = 0;
        } else if (mosca == (numJ -1) || mosca == (numJ + 1)) {
            acierto = 1;
        }
        else {
            acierto=2;
        }
        return acierto;
    }
}
