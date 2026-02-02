package tema2;
/* Escribe un programa que calcula la suma de todos los números pares
entre 1 y 1000 y la muestra por consola.*/
public class t2e21 {
    public static void main(String[]args) {
        int num = 1;
        int s = 1;
        int suma = 0;
        boolean par;
        while (num <= 1000) {
            par = num % 2 == 0;
            if (par == true) {
                suma = num + suma;
            }
            num++;
        }
        System.out.println("La suma de todos los numeros pares entre 1 y 1000 es " + suma);
    }
}
