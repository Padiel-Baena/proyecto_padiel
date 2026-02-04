package tema5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class appCompra2 {
    public static void main(String[] args) {
        Set<String> listaCompra = new HashSet<String>();
        Set<String> carroCompra = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        String objeto = " ";
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce el objeto que quieres añadir a la lista de compras");
            objeto = sc.nextLine();
            listaCompra.add(objeto);
        }
        if(!listaCompra.add(objeto)){
            System.out.println("El producto que quieres añadir, ya ha sido añadido previamente");
        }
    }
    public static String toString( Set<String> listaCompra, Set<String> carroCompra){
        return "En la lista de la compra tienes : " + listaCompra + "\nEn el carro de la compra tienes : " + carroCompra;
    }
    public static void addCarro(Set<String> carroCompra, String objeto){
        carroCompra.add(objeto);
    }
}
