package Examen.Ejercicio1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GestorDeLibros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Libro> gestorDeLibros = new ArrayList<>();

        boolean salir = false;
        int opcion ;
        String fraseSalida = "SALIENDO ...";


        System.out.println("BIENVENID@ AL GESTOR DE LIBROS");
        while(!salir){
            showMenu();
            opcion = ComprobarOpcion(sc);
            switch (opcion){
                case 1 :
                    System.out.println("Has elegido añadir un Libro");
                    AnyadirLibro(sc,gestorDeLibros);
                    break;
                case 2 :
                    if(gestorDeLibros.isEmpty()){
                        System.out.println("PRIMERO TIENES QUE AÑADIR UN LIBRO");
                    }else {
                        System.out.println("Has elegido ver la informacion de un libro,dime su ISBN");
                        mostrarLibro(sc, gestorDeLibros);
                    }
                    break;
                case 3:
                    if(gestorDeLibros.isEmpty()){
                        System.out.println("PRIMERO TIENES QUE AÑADIR UN LIBRO");
                    }else {
                        System.out.println("Has elegido modificar la informacion de un libro,dime su ISBN");
                        modificarGeneroLibro(sc,gestorDeLibros);
                    }
                    break;
                case 4:
                    if(gestorDeLibros.isEmpty()){
                        System.out.println("PRIMERO TIENES QUE AÑADIR UN LIBRO");
                    }else {
                        System.out.println("Has elegido buscar todos los Libros de un autor\nDime cual es el autor que quieres que te muestre");
                        mostrarLibrosAutor(sc,gestorDeLibros);
                    }
                    break;
                case 5:
                    System.out.println(fraseSalida);
                    salir = true;
                    break;
            }

        }
    }
    public static void showMenu(){
        String frase ;
        System.out.println("(1) Introducir Libro\n(2) Mostrar informacion de un Libro(por ISBN)\n(3) Modificar genero de un Libro(por ISBN)\n(4)Buscar todos los libros de un autor\n(5)Salir\nDime que es lo que quieres hacer : ");
    }
    public static int ComprobarOpcion(Scanner sc) {
        int opcion = 0;
        boolean correcto = false;
        try {
            opcion = sc.nextInt();
            if(opcion >= 1 && opcion <= 5){
                correcto = true;
            }
            while(!correcto){
                System.out.println("Te he pedido un numero entre 1 y 5");
                opcion = sc.nextInt();
                if(opcion >= 1 && opcion <= 5){
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
    public static void AnyadirLibro(Scanner sc,List<Libro> gestorDeLibros) {
        String isbn = " ";
        String nombre = "";
        String autor = "";
        int nPaginas = 1;
        String genero = "";
        int opcionFormato;
        tipo formato = tipo.tapaDura;
        boolean correcto = false;

        while(!correcto) {

            //PIDO ATRIBUTOS PARA CREAR EL LIBRO

            try {
                System.out.println("Dime el ISBN");
                isbn = sc.nextLine().toUpperCase();
                System.out.println("Dime el nombre del Libro");
                nombre = sc.nextLine().toUpperCase();
                System.out.println("Dime el autor del Libro");
                autor = sc.nextLine().toUpperCase();
                System.out.println("Dime la cantidad de paginas del Libro");
                nPaginas = sc.nextInt();
                sc.nextLine();
                while (nPaginas < 1) {
                    System.out.println("Un libro no puede tener menos de 1 pagina\nDimela cantidad de paginas");
                    nPaginas = sc.nextInt();
                }
                System.out.println("Dime el genero del Libro");
                genero = sc.nextLine().toUpperCase();
                System.out.println("Dime el formato del Libro\n(1-Tapa dura\n2-Tapa blanda\n3-Bolsillo)");
                opcionFormato = sc.nextInt();
                while (opcionFormato != 1 && opcionFormato != 2 && opcionFormato != 3) {
                    System.out.println("Dime el formato del Libro\n(1-Tapa dura\n2-Tapa blanda\n3-Bolsillo)");
                    opcionFormato = sc.nextInt();
                }
                switch (opcionFormato) {
                    case 1:
                        formato = tipo.tapaDura;
                        break;
                    case 2:
                        formato = tipo.tapaBlanda;
                        break;
                    case 3:
                        formato = tipo.bolsillo;
                        break;
                }
                correcto = true;
            } catch (InputMismatchException ex) {
                System.err.println("No me has dado el valor correcto");
                sc.next();
                sc.nextLine();
            }
        }
        Libro l1 = new Libro(isbn, nombre, autor, nPaginas, genero, formato);
        gestorDeLibros.add(l1);
        System.out.println("Se ha añadido correctamente el libro");
    }
    public static void mostrarLibro(Scanner sc, List<Libro> gestorDeLibros){
        String isbnBusqueda = sc.nextLine().toUpperCase();
        for(Libro l : gestorDeLibros){

            //COMPRUEBO SI EL ISBN QUE ME HA DADO EXISTE

            if(isbnBusqueda.equals(l.getIsbn())){
                System.out.println(l);
            }else{
                System.out.println("No existe un libro con ese isbn");
            }
        }
    }
    public static void modificarGeneroLibro(Scanner sc, List<Libro> gestorDeLibros){
        String isbnBusqueda = sc.nextLine().toUpperCase();
        String generoCambio ;
        System.out.println("Ahora dime que genero quieres poner");
        generoCambio = sc.nextLine().toUpperCase();
        for(Libro l : gestorDeLibros){

            //COMPRUEBO SI EL ISBN QUE ME HA DADO EXISTE

            if(isbnBusqueda.equals(l.getIsbn())){
                if (generoCambio.equals(l.getGenero())){

                    //COMPRUEBO SI EL GENERO ES DISTINTO AL QUE YA TIENE

                    System.out.println("El libro con isbn " + isbnBusqueda + " ya tiene ese genero");
                }else{
                    l.setGenero(generoCambio);
                    System.out.println("Genero cambiado");
                }
            }else{
                System.out.println("No existe un libro con ese isbn");
            }
        }
    }
    public static void mostrarLibrosAutor(Scanner sc, List<Libro> gestorDeLibros){
        String autorBusqueda = sc.nextLine().toUpperCase();

        for(Libro l : gestorDeLibros){

            //COMPRUEBO SI EL Autor QUE ME HA DADO tiene libros y los muestro

            if(autorBusqueda.equals(l.getAutor())){
                System.out.println(l);
            }else{
                System.out.println("No se han encontrado libros de ese autor");
            }
        }
    }

}
