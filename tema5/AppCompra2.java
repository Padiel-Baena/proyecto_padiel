package tema5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AppCompra2 {
    public static void main(String[] args) {
        Set<String> listaCompra = new HashSet<String>();
        Set<String> carroCompra = new HashSet<String>();

        Scanner sc = new Scanner(System.in);
        String objeto = " ";
        int opcion = 0;

        System.out.println("############################################################");
        System.out.println("======================APP PARA COMPRAR======================");
        System.out.println("############################################################");

        while(opcion !=5) {
            showMenu();
            opcion = sc.nextInt();
            switch (opcion){
                case 1 :
                    System.out.println("################################################");
                    System.out.println("HAS ELEGIDO LA OPCION DE AÑADIR COSAS A LA LISTA");
                    System.out.println("################################################");
                    sc.nextLine();

                    System.out.println("############################################################");
                    System.out.println("DIME EL PRODUCTO QUE QUIERES AÑADIR A LA LISTA DE LA COMPRA");
                    System.out.println("############################################################");
                    objeto = sc.nextLine().toUpperCase();

                    addObjetos(listaCompra,objeto);

                    break;
                case 2:
                    System.out.println("################################################");
                    System.out.println("HAS ELEGIDO LA OPCION DE AÑADIR COSAS AL CARRO");
                    System.out.println("################################################");
                    sc.nextLine();

                    System.out.println("############################################################");
                    System.out.println("DIME EL PRODUCTO QUE QUIERES AÑADIR AL CARRO DE LA COMPRA");
                    System.out.println("############################################################");
                    objeto = sc.nextLine().toUpperCase();

                    addObjetos(carroCompra,objeto);
                    break;
                case 3:
                    System.out.println("################################################");
                    System.out.println("HAS ELEGIDO LA OPCION DE MOSTRAR LISTA Y CARRO");
                    System.out.println("################################################");

                    System.out.println("======Lista de la compra======");
                    System.out.println(toStringLista(listaCompra));
                    System.out.println("======Carro de la compra======");
                    System.out.println(toStringCarro(carroCompra));
                    break;
                case 4:
                    System.out.println("########################################################");
                    System.out.println("HAS ELEGIDO LA OPCION DE MOSTRAR LOS PRODUCTOS RESTANTES");
                    System.out.println("########################################################");
                    System.out.println(productosFaltantes(carroCompra,listaCompra));
                    break;
                case 5:
                    System.out.println("##################################################");
                    System.out.println("===============SALIENDO DEL SISTEMA===============");
                    System.out.println("###################################################");
                    break;
            }
        }
    }
    public static void showMenu(){
        System.out.print("==================================\n1-Añadir objetos a la lista\n2-Añadir objetos al carro\n3-Mostrar lista y carro\n4-Mostrar objetos restantes\n5-Salir\nDime que es lo que quieres hacer : ");
    }
    public static String toStringLista( Set<String> listaCompra){
        return "En la lista de la compra tienes : " + listaCompra;
    }
    public static String toStringCarro(Set<String> carroCompra){
        return "En el carro de la compra tienes : " + carroCompra;
    }
    public static String productosFaltantes(Set<String> carroCompra, Set<String> listaCompra) {
        Set<String> restantes = new HashSet<>(listaCompra);
        restantes.removeAll(carroCompra);
        if (restantes.isEmpty()) {
            return "Tienes todo lo que necesitabas, ya no te queda nada mas por guardar en el carro";
        } else {
            return "Te faltan los siguientes objetos : " + restantes + "\nEn total son : " + restantes.size() + " productos";
        }
    }
    public static void addObjetos(Set<String> productos, String objeto){
        if (!productos.add(objeto)) {
            System.out.println("#####################################################");
            System.out.println("ERROR : " + objeto + " YA HA SIDO AÑADIDO PREVIAMENTE");
            System.out.println("#####################################################");
        } else {
            System.out.println("#####################################################");
            System.out.println("PERFECTO : " + objeto + " HA SIDO AÑADIDO");
            System.out.println("#####################################################");
            productos.add(objeto);
        }
    }

}
