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
        toStringLista(listaCompra);
        toStringCarro(carroCompra);
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce el objeto que quieres añadir al carro de la compra");
            objeto = sc.nextLine();
            addCarro(carroCompra, objeto);
        }

        productosFaltantes(carroCompra, listaCompra);
    }
    public static String toStringLista( Set<String> listaCompra){
        return "En la lista de la compra tienes : " + listaCompra;
    }
    public static String toStringCarro(Set<String> carroCompra){
        return "En el carro de la compra tienes : " + carroCompra;
    }
    public static void addCarro(Set<String> carroCompra, String objeto){
        carroCompra.add(objeto);
        System.out.println("Has añadido un objeto al carro de la compra");
    }
    public static String productosFaltantes(Set<String> carroCompra, Set<String> listaCompra){
        return "Te faltan los siguientes objetos : " + listaCompra.removeAll(carroCompra);
    }
}
