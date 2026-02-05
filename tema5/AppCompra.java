package tema5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AppCompra {
    public static void main(String[] args) {
        Set<String> listaCompra = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        String objeto = " ";
        boolean finalizar = false;

        while(!finalizar) {
            System.out.println("############################################################");
            System.out.println("DIME EL PRODUCTO QUE QUIERES AÑADIR A LA LISTA DE LA COMPRA");
            System.out.println("############################################################");
            objeto = sc.nextLine().toUpperCase();
            finalizar = comprobarObjeto(objeto);
            if(!finalizar) {
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
            }else{
                System.out.println("##################################################");
                System.out.println("===============SALIENDO DEL SISTEMA===============");
                System.out.println("###################################################");
            }
        }
        System.out.println(toString(listaCompra));
    }
    public static String toString(Set<String> listaCompra){
        return "La lista de la compra es : " + listaCompra + "\nTienes " +  listaCompra.size() + " productos";
    }
    public static boolean comprobarObjeto(String objeto){
        boolean terminar = false;
        if (objeto.equalsIgnoreCase("fin") || objeto.equalsIgnoreCase("salir")){
            terminar = true;
        }
        return terminar;
    }
}