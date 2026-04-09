package tema7.Ejercicios3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import static utils.Colores.*;

public class C2 {
    private static Scanner sc = new Scanner(System.in);
    private static Gestion gestion = new Gestion();

    public static void main(String[] args) {
        gestion.setListaFunkos(Logica.cargarSerial());

        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero(colorText("Selecciona una opción (Modo Serialización): ", VIOLET));

            switch (opcion) {
                case 1:
                    addFunko();
                    break;
                case 2:
                    borrarFunko();
                    break;
                case 3:
                    mostrarTodos();
                    break;
                case 4:
                    mostrarMasCaro();
                    break;
                case 5:
                    mostrarMedia();
                    break;
                case 6:
                    mostrarAgrupados();
                    break;
                case 7:
                    mostrarFunkos2023();
                    break;
                case 0:
                    System.out.println(colorText("Guardando en archivo binario y saliendo...", SALMON));
                    break;
                default:
                    System.out.println(colorText("Opción no válida.", RED));
                    break;
            }
        } while (opcion != 0);

        Logica.guardarSerial(gestion.getListaFunkos());
    }

    private static void mostrarMenu() {
        System.out.println("\n" + colorText("╔═══════════════════════════════════════╗", VIOLET));
        System.out.println(colorText("║       GESTIÓN FUNKOS (BINARY)         ║", BOLD + LAVENDER));
        System.out.println(colorText("╚═══════════════════════════════════════╝", VIOLET));
        System.out.println(colorText(" 1.", SKY_BLUE) + " Añadir Funko");
        System.out.println(colorText(" 2.", SKY_BLUE) + " Borrar Funko");
        System.out.println(colorText(" 3.", SKY_BLUE) + " Mostrar todos");
        System.out.println(colorText(" 4.", SKY_BLUE) + " El más caro");
        System.out.println(colorText(" 5.", SKY_BLUE) + " Media de precios");
        System.out.println(colorText(" 6.", SKY_BLUE) + " Agrupar por modelo");
        System.out.println(colorText(" 7.", SKY_BLUE) + " Funkos de 2023");
        System.out.println(colorText(" 0. Salir", RED_BRIGHT));
        System.out.println(colorText("═════════════════════════════════════════", GRAY_DARK));
    }

    private static void addFunko() {
        System.out.println(colorText("\n--- NUEVO FUNKO (BINARIO) ---", MINT));
        System.out.print("Introduce Código: ");
        String cod = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        double precio = leerDouble("Precio: ");
        System.out.print("Fecha Lanzamiento (AAAA-MM-DD): ");
        String fecha = sc.nextLine();

        gestion.addFunko(new Funkos(cod, nombre, modelo, precio, fecha));
        System.out.println(colorText("¡Funko añadido a la lista binaria!", GREEN));
    }

    private static void borrarFunko() {
        System.out.print(colorText("Nombre a borrar: ", ORANGE));
        String nombre = sc.nextLine();
        if (gestion.borrarFunko(nombre)) {
            System.out.println(colorText("Borrado con éxito.", GREEN));
        } else {
            System.out.println(colorText("No encontrado.", RED));
        }
    }

    private static void mostrarTodos() {
        List<Funkos> lista = gestion.getListaFunkos();
        if (lista.isEmpty()) {
            System.out.println(colorText("El archivo binario está vacío o no existe.", RED));
        } else {
            for (Funkos f : lista) {
                System.out.println(f.toString());
            }
        }
    }

    private static void mostrarMasCaro() {
        Funkos caro = gestion.obtenerMasCaro();
        if (caro != null) System.out.println(colorText("Más caro: ", GOLD) + caro);
    }

    private static void mostrarMedia() {
        double media = gestion.calcularMediaPrecio();
        System.out.println("Media: " + colorText(media + "€", GREEN_BRIGHT));
    }

    private static void mostrarAgrupados() {
        List<Funkos> lista = gestion.getListaFunkos();
        List<String> yaVistos = new ArrayList<>();
        for (Funkos f : lista) {
            String m = f.getModelo();
            if (!yaVistos.contains(m)) {
                System.out.println("\n" + colorText("MODELO: " + m, PURPLE_BRIGHT));
                for (Funkos f2 : lista) {
                    if (f2.getModelo().equals(m)) System.out.println("  - " + f2.getNombre());
                }
                yaVistos.add(m);
            }
        }
    }

    private static void mostrarFunkos2023() {
        List<Funkos> lista2023 = gestion.filtrar2023();
        for (Funkos f : lista2023) System.out.println(f);
    }

    private static int leerEntero(String msg) {
        System.out.print(msg);
        while (!sc.hasNextInt()) { sc.next(); System.out.print("Error: "); }
        int n = sc.nextInt(); sc.nextLine();
        return n;
    }

    private static double leerDouble(String msg) {
        System.out.print(msg);
        while (!sc.hasNextDouble()) { sc.next(); System.out.print("Error: "); }
        double d = sc.nextDouble(); sc.nextLine();
        return d;
    }
}