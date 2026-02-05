package tema5;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class appCompra {
    public static void main(String[] args) {
        Set<String> listaCompra = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        String objeto = " ";
        int cLista;
        System.out.println("Dime la cantidad de objetos que vas a añadir a la lista de la compra");
        cLista = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cLista; i++) {
            System.out.println("############################################################");
            System.out.println("DIME EL PRODUCTO QUE QUIERES AÑADIR A LA LISTA DE LA COMPRA");
            System.out.println("############################################################");
            objeto = sc.nextLine();
            if (!listaCompra.add(objeto)) {
                System.out.println("#####################################################");
                System.out.println("ERROR : " + objeto + " YA HA SIDO AÑADIDO PREVIAMENTE");
                System.out.println("#####################################################");
            } else {
                System.out.println("#####################################################");
                System.out.println("PERFECTO : " + objeto + " HA SIDO AÑADIDO");
                System.out.println("#####################################################");
                listaCompra.add(objeto);
            }
        }
    }
    public static String toString(Set<String> listaCompra){
        return "La lista de la compra es : " + listaCompra + "\nTienes " +  listaCompra.size() + " productos";
    }
}