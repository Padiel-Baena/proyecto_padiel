package tema2;
/*Lee por teclado varios números enteros positivos hasta recibir un
número negativo. El programa mostrará la media de los números (sin
tener en cuenta el negativo).*/
import java.util.Scanner;

public class t2e23 {
    public static void main(String[] args){
        System.out.println("Te voy a ir pidiendo numeros , cuando me des un numero negativo parare");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = 0 ;
        int contador = 0 ;
        while (num > 0) {
            pos = pos + num;
            System.out.println("El numero que me has dicho es positivo");
            num = sc.nextInt();
            contador ++ ;
        }
        int media = pos / contador ;
        System.out.println("Me acabas de dar un numero negativo, la media de los numeros positivos es " + media);
        sc.close();
    }
}
