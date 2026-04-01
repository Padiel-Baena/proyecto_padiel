package tema7.Ejercicios2.SerializarPersona;

import utils.Colores;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eleccion;
        boolean salir = false;
        Map<String, Integer> personas = new HashMap<>();

        Colores.logHeader("Aplicacion para añadir personas a un txt");
        while (!salir) {
            System.out.println(Colores.colorText("Elige que es lo que quieres hacer : ", Colores.PURPLE));
            showMenu();
            eleccion = eleccion(sc);
            salir = menu(eleccion, sc, salir, personas);
        }
    }

    public static void pedirDatos(Scanner sc, Map<String, Integer> personas) {
        try {
            String nombre;
            int edad;

            System.out.println(Colores.colorText("Dime el nombre que quieres añadir", Colores.ORANGE));
            nombre = sc.nextLine();
            System.out.println(Colores.colorText("Dime la edad de " + nombre, Colores.ORANGE));
            edad = sc.nextInt();

            personas.put(nombre, edad);
        } catch (InputMismatchException ex) {
            sc.nextLine();
            Colores.logError("Me has dado datos no validos, asegurate de darme los datos que te pida");
        }
    }

    public static void showMenu() {
        System.out.println(Colores.colorText("1.Añadir persona\n2.Salir", Colores.GOLD));
        System.out.println(Colores.colorText("Una vez que salgas, se mostrara toda la informacion, y se creara el archivo", Colores.CRIMSON));
    }

    public static int eleccion(Scanner sc) {
        try {
            int numEleccion;
            numEleccion = sc.nextInt();
            while (numEleccion != 1 && numEleccion != 2) {
                Colores.logError("Tienes que elegir un numero que sea 1 o 2");
                numEleccion = sc.nextInt();
            }
            sc.nextLine();
            return numEleccion;
        } catch (InputMismatchException ex) {
            sc.nextLine();
            Colores.logError("Dime 1 o 2");
            return 0;
        }
    }

    public static boolean menu(int e, Scanner sc, boolean salir, Map<String, Integer> personas) {
        File archivo = new File("personas.txt");
        switch (e) {
            case 1:
                pedirDatos(sc, personas);
                break;
            case 2:
                System.out.println(Colores.colorText("Saliendo ...", Colores.INDIGO));
                System.out.println(Colores.colorText("Creando documento ...", Colores.ELECTRIC_BLUE));
                salir = true;
                if (archivo.exists()) {
                    try (PrintWriter writer = new PrintWriter(archivo)) {
                        writer.print("");
                    } catch (IOException ex) {
                        Colores.logError("No se ha podido crear el archivo");
                    }
                } else {
                    crearArchivo();
                }
                for (Map.Entry<String, Integer> entrada : personas.entrySet()){
                    System.out.println(Colores.colorText(entrada.getKey() + " ",Colores.EMERALD) + Colores.colorText(entrada.getValue().toString(),Colores.APRICOT));
                }
                pasarDocumento(personas);
                break;
        }
        return salir;
    }

    public static void crearArchivo() {
        try {
            Path ruta = Paths.get("src/tema7/Ejercicios2/SerializarPersona");
            Path archivoPath = ruta.resolve("personas.txt");
            Files.createFile(archivoPath);
            System.out.println(Colores.colorText("Documento creado con exito", Colores.EMERALD));
        } catch (IOException ex) {
            Colores.logError("Algo ha ido mal");
        }
    }

    public static void pasarDocumento(Map<String,Integer> personas) {
        File archivo = new File("src/tema7/Ejercicios2/SerializarPersona/personas.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, false))) {

            for (Map.Entry<String, Integer> entrada : personas.entrySet()) {
                writer.write(entrada.getKey() + "=" + entrada.getValue());
                writer.newLine();
            }
        } catch (IOException ex) {
            System.err.println("Hubo un error al escribir: " + ex.getMessage());
        }
    }
}
