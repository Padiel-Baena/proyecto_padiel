package tema3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class myArray {
    public static void showMenu(){
        System.out.println("Dime que quieres que haga.\na-Imprimir un array\nb-Decirte el numero maximo del array\nc-Decirte el valor minimo\nd-Decirte la media de los valores\ne-Decirte si el numero que me dices existe en el array o no\nf-Hacer la suma de dos vectores\ng-Hacer la resta de dos vectores\nh-El producto escalar de dos vectores\ni-Invertir el orden del array\nj-invertir con otra funcion el orden del array\nk-Decirte si el array es capicua\nl-Hacer todo lo anterior");
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char eleccion;
        int cArray;
        System.out.println("Dime el tamaño que quieres que tenga el array");
        cArray= sc.nextInt();
        int[] tabla = new int[cArray];
        int[] tabla2 = new int[cArray];
        int[] tabla3 = new int[cArray];
        int result;
        System.out.println("Ahora ves diciendome los numeros que quieres que vayan en el array, tienes que poner 1 a 1 todos los espacios que me has dicho");
        for (int i = 0; i != cArray; i++){
            tabla[i] = sc.nextInt();
        }
        System.out.println("Ahora dame los valores para una segunda tabla del mismo tamaño");
        for (int i = 0; i != cArray; i++){
            tabla2[i] = sc.nextInt();
        }
        showMenu();
        eleccion = sc.next().charAt(0);
        while(eleccion != 'a' && eleccion != 'b' && eleccion != 'c' && eleccion != 'd' && eleccion != 'e' && eleccion != 'f' && eleccion != 'g' && eleccion != 'h' && eleccion != 'i' && eleccion != 'j' && eleccion != 'k' && eleccion != 'l'){
            System.out.println("Me has dado un caracter incorrecto, dame otro caracter");
            eleccion = sc.next().charAt(0);

        }
        switch (eleccion) {
            case 'a':
            printArray(tabla);
            break;
            case 'b':
                result =maxArray(tabla);
                System.out.println("El numero maximo del array es" + result);
                break;
            case 'c':
                result = minArray(tabla);
                System.out.println("El numero mas pequeño es " + result);
                break;
            case 'd':
                result = mediaArray(tabla);
                System.out.println("La media del array es " + result);
                break;
            case 'e':
                System.out.println("Dime un numero y yo te dire si esta en el array o no");
                int num = sc.nextInt();
                boolean result2 = elementArray(tabla, num);
                if (result2){
                    System.out.println("El numero " + num + " esta en el array");
                }else{
                    System.out.println("El numero " + num + " no esta en el array");
                }
                break;
            case 'f':
                System.out.println("Te voy a sumar dos arrays");
                tabla3=sumaVectores(tabla,tabla2,tabla3);
                System.out.println("La suma de los dos arrays da : " );
                printArray(tabla3);
                break;
            case 'g':
                System.out.println("Te voy a restar dos arrays");
                tabla3=restaVectores(tabla,tabla2,tabla3);
                System.out.println("La resta de los dos arrays da : " );
                printArray(tabla3);
                break;
            case 'h':
                System.out.println("Te voy a calcular el producto escalar");
                tabla3= productoArrays(tabla,tabla2,tabla3);
                System.out.println("EL producto escalar de las dos arrays es " + tabla3.toString());
                break;
            case 'i':
                int[] arrayinvertido =cambioOrden(tabla);
                printArray(arrayinvertido);
                break;
            case 'j':
                System.out.println("Te voy a invertir el orden de otra forma");
                invertirOrden(tabla);
                break;
            case'k':
                System.out.println("Te voy a decir si el array es capicua");
                result2 = capicua(tabla);
                System.out.println("Calculando ...");
                if (result2){
                    System.out.println("El array es capicua");
                }
                else{
                    System.out.println("El array no es capicua");
                }
                break;
            case 'l':
                System.out.println("Ahora voy a hacer todo lo anterior");

        }
    }
    public static void printArray(int[] tabla) {
        int num;
        for (num = 0; num < tabla.length; num++) {
            System.out.println(tabla[num]);
        }
    }
    public static int maxArray(int[] tabla){
        int cont;
        int nmax=0;
        for (cont = 0; cont < tabla.length; cont++) {
            if (nmax < tabla[cont]){
                nmax=tabla[cont];
            }
        }
        return nmax;
    }
    public static int minArray(int[] tabla){
        int cont;
        int nmin=0;
        for (cont = 0; cont < tabla.length; cont++) {
            if (nmin > tabla[cont]){
                nmin=tabla[cont];
            }
        }
        return nmin;
    }
    public static int mediaArray(int[] tabla){
        int cont;
        int media=0;
        int suma =0;
        for (cont = 0; cont < tabla.length; cont++) {
            suma += tabla[cont];
        }
        media = suma / tabla.length;
        return media;
    }
    public static boolean elementArray(int[] tabla, int num){
        int cont;
        boolean confirmacion = false;
        for (cont = 0; cont < tabla.length; cont++){
            if (num == tabla[cont]){
                confirmacion = true;
            }
        }
        return confirmacion;
    }
    public static int[] sumaVectores(int[] tabla, int[] tabla2, int[]tabla3){
        int cont;
        for (cont = 0; cont < tabla.length; cont++){
            tabla3[cont] = tabla[cont] + tabla2[cont];
        }
        return tabla3;
    }
    public static int[] restaVectores(int[] tabla, int[] tabla2,int[] tabla3){
        int cont;
        for (cont = 0; cont < tabla.length; cont++){
            tabla3[cont] = tabla[cont] - tabla2[cont];
        }
        return tabla3;
    }
    public static int[] productoArrays(int[] tabla, int[]tabla2, int[] tabla3){
        int cont;
        int suma =0;
        for (cont = 0; cont < tabla.length; cont++){
            tabla3[cont] = tabla[cont] * tabla2[cont];
        }/*
        for (cont = 0; cont < tabla3.length; cont++){
            suma +=tabla3[cont];
        }
        */
        return tabla3;
    }
    public static int[] cambioOrden(int[] array){
        int cont;
        int pasar=0;
        int[] array2= new int[array.length];
        for (cont = array.length -1; cont >= 0; cont--){
            array2[pasar]=array[cont];
            pasar ++;
        }
        return array2;
    }
    public static void invertirOrden(int[] array){
        int cont;
        int pasar=0;
        int[] array2= new int[array.length];
        for (cont = array.length -1; cont >= 0; cont--){
            array2[pasar]=array[cont];
            pasar ++;
        }
    }
    public static boolean capicua(int[] tabla) {
        for (int i = 0; i < tabla.length / 2; i++) {
            if (tabla[i] != tabla[tabla.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    }