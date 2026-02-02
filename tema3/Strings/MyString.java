package tema3.Strings;

import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        String result;
        int resultado;
        System.out.println("Dime una frase");
        cadena= sc.nextLine();
        char eleccion ;
        System.out.println("Dime que quieres hacer : ");
        showMenu();
        eleccion = sc.next().charAt(0);
        switch (eleccion){
            case 'a':
                result=inversorMayus(cadena);
                System.out.println(result.toString());
                break;
            case 'b':
                resultado = cuentaVocales(cadena);
                System.out.println("El total de vocales que hay en la cadena que me has dicho, es : " + resultado);
                break;
            case 'c':
                String[] palabras=cadena.split(" ");
                int[] resultadoC=new int[2];
                int nPosicion=-1;
                for (int i = 0; i < 2; i++) {
                    resultadoC[i]=buscaLongitudes(cadena)[i];
                }
                nPosicion=resultadoC[0];
                System.out.println("La palabra mas larga que me has dicho es  '" + palabras[nPosicion] + "' con un total de " + resultadoC[1] + " caracteres");
                break;
            case 'd':
        }
    }
    public static String inversorMayus(String cadena){
       String cadenaMayus =cadena.toUpperCase();
       String cadenaInversa = "";
       int longitud = cadena.length();
        for (int i = longitud-1; i >= 0; i--) {
            char letra = cadenaMayus.charAt(i);
            cadenaInversa += letra;
        }
        return cadenaInversa;
    }
    public static void showMenu(){
        System.out.println("a-Invertir la frase y ponerla en mayusculas\nb-Me dices una frase y te digo la cantidad de vocales\nc-Me dices una frase y te digo la palabra mas larga\nd-Me dices dos frases y te digo la cantidad de veces que la segunda frase esta en la primera\ne-Me dices una frase y te digo el numero de palabras\nf-Me dices un numero de telefono y te lo cambio de formato\ng.Me dices una frase y te digo la cantidad de veces que se repiten las vocales");
    }
    public static int cuentaVocales(String cadena){
        int total =0;
        int longitud = cadena.length();
        for (int i = longitud-1; i >= 0; i--) {
            char letra=cadena.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                total++;
            }
        }
        return total;
    }
    public static int[] buscaLongitudes(String cadena){
        String[] longitud=new String[cadena.length()];
        longitud=cadena.split(" ");
        int caracteres =0;
        int caracterMax =0;
        int numCadena =-1;
        for (int i = 0; i < longitud.length; i++) {
            for (int j = 0; j < longitud[i].length(); j++) {
                caracteres++;
            }
            if (caracteres> caracterMax){
                caracterMax=caracteres;
                caracteres=0;
                numCadena=i;
            }else {
                caracteres=0;
            }
        }
        int[] resultado=new int[]{numCadena,caracterMax};
    return resultado;
    }

}
