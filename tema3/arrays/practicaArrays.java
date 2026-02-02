package tema3.arrays;

import java.util.Arrays;

public class practicaArrays {
    public static void printTabla(int[] tabla) {
        int num;
        for (num = 0; num < 10; num++) {
            System.out.println(tabla[num]);
        }
    }
    public static void main(String[] args) {
        int[] tabla = new int[]{0,2,4,6,8,10,12,14,16,18};
        printTabla(tabla);
        int [] tabla2 = tabla.clone();
        Arrays.equals(tabla,tabla2);
        System.out.println(Arrays.equals(tabla,tabla2));
    }
}
