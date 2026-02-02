package tema5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class appCompra {
    public static void main(String[] args) {
        Set<String> listaCompra = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce el objeto que quieres añadir a la lista de compras");
            String objeto = sc.nextLine();
            listaCompra.add(objeto);

        }

    }
}
