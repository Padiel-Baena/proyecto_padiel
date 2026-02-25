package Examen.Ejercicio3;


import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TiendaPokemonTPV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Articulo> ticket = new LinkedList<>();
        boolean salir = false;
        int opcion;
        String fraseSalida = "SALIENDO ...";


        System.out.println("BIENVENID@ AL GESTOR DE LIBROS");
        while (!salir) {
            showMenu();
            opcion = ComprobarOpcion(sc);
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido Añadir pocion");
                    anyadirPocion(sc, ticket);
                    break;
                case 2:
                        System.out.println("Has elegido Añadir Pokebola");
                        anyadirPocion(sc, ticket);
                    break;
                case 3:
                        System.out.println("Has elegido AñadirAccesorio");
                        anyadirAccesorio(sc, ticket);
                    break;
                case 4:
                    if (ticket.isEmpty()) {
                        System.out.println("PRIMERO TIENES QUE AÑADIR ALGO AL  TICKET");
                    } else {
                        System.out.println("Has elegido Borrar Articulo");
                        borrarItem(sc, ticket);
                    }
                    break;
                case 5:
                    if (ticket.isEmpty()) {
                        System.out.println("PRIMERO TIENES QUE AÑADIR ALGO AL  TICKET");
                    } else {
                        System.out.println("Has elegido Mostrar todos los articulos");
                        mostrarArticulos(ticket);
                    }
                    break;
                case 6:
                    if (ticket.isEmpty()) {
                        System.out.println("PRIMERO TIENES QUE AÑADIR ALGO AL  TICKET");
                    } else {
                        System.out.println("Has elegido Mostrar total");
                        mostrarTotal(ticket);
                    }
                    break;
                case 7:
                    System.out.println(fraseSalida);
                    salir = true;
                    break;
            }
        }
    }
    public static void showMenu(){
        System.out.println("1-Añadir pocion\n2-Añadir Pokebola\n3-AñadirAccesorio\n4-Borrar Articulo\n5-Mostrar todos los articulos\n6-Mostrar total\n7-Salir");
    }
    public static int ComprobarOpcion(Scanner sc) {
        int opcion = 0;
        boolean correcto = false;
        try {
            opcion = sc.nextInt();
            if(opcion >= 1 && opcion <= 7){
                correcto = true;
            }
            while(!correcto){
                System.out.println("Te he pedido un numero entre 1 y 5");
                opcion = sc.nextInt();
                if(opcion >= 1 && opcion <= 7){
                    correcto = true;
                }
            }
            sc.nextLine();
        }catch (InputMismatchException ex){
            System.err.println("ERROR : SOLO PUEDES ESCORGER NUMEROS ENTRE 1 Y 5 NADA DE CARACTERES O DECIMALES");
            sc.next();
        }
        return opcion;
    }

    public static void mostrarArticulos(List<Articulo> ticket){
        for(Articulo a : ticket){
            System.out.println(a);
        }
    }
    public static void mostrarTotal(List<Articulo> ticket){
        double precio = 0;
        for(Articulo a : ticket){
            precio += a.precio();
        }
    }
    public static void borrarItem(Scanner sc,List<Articulo> ticket){
        int nItem;
        boolean correcto = false;

        while(!correcto) {
            try {
                System.out.println("Dime la posicion del item que quieras borrar");
                nItem = sc.nextInt();
                correcto = true;
                ticket.remove(nItem);
            } catch (InputMismatchException ex) {
                System.err.println("ERROR : TIENE QUE SER UN NUMERO ENTERO");
                sc.next();
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("ERROR : NO PUEDES ESCOGER UN OBJETO QUE NO ESTA GURDADO EN LA LISTA");
                sc.next();
            }
        }
    }
    public static void anyadirPocion(Scanner sc,List<Articulo> ticket){
        String nombre = "Pocion";
        boolean esGratis = false;
        int nivel = 0;
        String[] efectos = new String[]{"curar quemadura","curar vida","curar paralisis"};
        boolean correcto = false;

        while(!correcto) {
            try {
                System.out.println("Dime el nivel de la pocion que quieres");
                nivel = sc.nextInt();

                correcto = true;
                Pocion p1 = new Pocion(nombre,esGratis,nivel,efectos);
                ticket.add(p1);
            } catch (InputMismatchException ex) {
                System.err.println("ERROR : TIENE QUE SER UN NUMERO ENTERO");
                sc.next();
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("ERROR : NO PUEDES ESCOGER UN OBJETO QUE NO ESTA GURDADO EN LA LISTA");
                sc.next();
            }
        }
        System.out.println("POCION AÑADIDA CORRECTAMENTE");
    }
    public static void anyadirPokeball(Scanner sc,List<Articulo> ticket){
        String nombre = "Pokeball";
        boolean esGratis = false;
        int nivel = 0;
        boolean correcto = false;
        String tipoPokeball = "";

        while(!correcto) {
            try {
                System.out.println("Dime el nivel de la pokeball que quieres");
                nivel = sc.nextInt();
                while(nivel !=1 &&nivel !=2 && nivel !=3){
                    System.out.println("Tienes que escoger entre 1 2 o 3");
                }
                switch (nivel){
                    case 1:
                        tipoPokeball ="POKE-BALL";
                        break;
                    case 2:
                        tipoPokeball ="GREAT-BALL";
                        break;
                    case 3:
                        tipoPokeball ="ULTRA-BALL";
                        break;
                }
                correcto = true;
                Pokebola po1 = new Pokebola(nombre,esGratis,tipoPokeball);
                ticket.add(po1);
            } catch (InputMismatchException ex) {
                System.err.println("ERROR : TIENE QUE SER UN NUMERO ENTERO");
                sc.next();
            }
        }
        System.out.println("POKEBOLA AÑADIDA CORRECTAMENTE");
    }
    public static void anyadirAccesorio(Scanner sc,List<Articulo> ticket){
        String nombre = "Accesorio";
        String nombre1 = "";
        boolean esGratis = false;
        boolean correcto = false;

        while(!correcto) {
            try {
                System.out.println("Dime el nombre que quieres poner a tu accesorio");
                nombre1 = sc.nextLine();

                correcto = true;
                Accesorio a1 = new Accesorio(nombre,esGratis,nombre1);
                ticket.add(a1);
            } catch (InputMismatchException ex) {
                System.err.println("ERROR : TIENE QUE SER UN NUMERO ENTERO");
                sc.next();
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("ERROR : NO PUEDES ESCOGER UN OBJETO QUE NO ESTA GURDADO EN LA LISTA");
                sc.next();
            }
        }
        System.out.println("ACCESORIO AÑADIDO CORRECTAMENTE");
    }
}
