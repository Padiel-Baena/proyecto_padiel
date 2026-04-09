package tema7.Ejercicios3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static utils.Colores.*; // Importamos todos tus colores

public class C1 {
    private static Scanner sc = new Scanner(System.in);
    private static Gestion gestion = new Gestion();

    public static void main(String[] args) {
        gestion.setListaFunkos(Logica.cargarCSV());

        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero(colorText("Selecciona una opción: ", YELLOW));

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
                    System.out.println(colorText("Guardando y cerrando aplicación...", SALMON));
                    break;
                default:
                    System.out.println(colorText("Opción no válida.", RED));
                    break;
            }
        } while (opcion != 0);

        Logica.guardarCSV(gestion.getListaFunkos());
    }

    private static void mostrarMenu() {
        System.out.println("\n" + colorText("╔═══════════════════════════════════════╗", CYAN));
        System.out.println(colorText("║          GESTIÓN DE FUNKOS            ║", BOLD + GOLD));
        System.out.println(colorText("╚═══════════════════════════════════════╝", CYAN));
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
        System.out.println(colorText("\n--- NUEVO FUNKO ---", MINT));
        System.out.print("Introduce Código (UUID o manual): ");
        String cod = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Modelo (MARVEL, DISNEY, ANIME...): ");
        String modelo = sc.nextLine();
        double precio = leerDouble("Precio: ");
        System.out.print("Fecha Lanzamiento (AAAA-MM-DD): ");
        String fecha = sc.nextLine();

        Funkos nuevo = new Funkos(cod, nombre, modelo, precio, fecha);
        gestion.addFunko(nuevo);
        System.out.println(colorText("¡Funko guardado en la lista!", GREEN));
    }

    private static void borrarFunko() {
        System.out.print(colorText("Nombre del funko a borrar: ", ORANGE));
        String nombre = sc.nextLine();
        if (gestion.borrarFunko(nombre)) {
            System.out.println(colorText("Borrado correctamente.", GREEN));
        } else {
            System.out.println(colorText("No se encontró ese Funko.", RED));
        }
    }

    private static void mostrarTodos() {
        List<Funkos> lista = gestion.getListaFunkos();
        if (lista.isEmpty()) {
            System.out.println(colorText("No hay funkos cargados.", RED));
        } else {
            System.out.println(colorText("\nLISTADO COMPLETO:", UNDERLINE + WHITE));
            for (Funkos f : lista) {
                System.out.println(f.toString());
            }
        }
    }

    private static void mostrarMasCaro() {
        Funkos caro = gestion.obtenerMasCaro();
        if (caro != null) {
            System.out.println(colorText("EL FUNKO MÁS CARO ES:", GOLD));
            System.out.println(caro);
        }
    }

    private static void mostrarMedia() {
        double media = gestion.calcularMediaPrecio();
        System.out.println("La media de precio actual es: " + colorText(media + "€", GREEN_BRIGHT));
    }

    private static void mostrarAgrupados() {
        List<Funkos> lista = gestion.getListaFunkos();
        List<String> modelosYaMostrados = new ArrayList<>();

        for (Funkos f1 : lista) {
            String mod = f1.getModelo();
            if (!modelosYaMostrados.contains(mod)) {
                System.out.println("\n" + colorText("MODELO: " + mod, PURPLE_BRIGHT));
                for (Funkos f2 : lista) {
                    if (f2.getModelo().equals(mod)) {
                        System.out.println("  -> " + f2.getNombre());
                    }
                }
                modelosYaMostrados.add(mod);
            }
        }
    }

    private static void mostrarFunkos2023() {
        List<Funkos> lista2023 = gestion.filtrar2023();
        System.out.println(colorText("\nEDICIONES DE 2023:", AMBER));
        for (Funkos f : lista2023) {
            System.out.println(f);
        }
    }


    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextInt()) {
            System.out.print(colorText("Error. Pon un número: ", RED));
            sc.next();
        }
        int n = sc.nextInt();
        sc.nextLine();
        return n;
    }

    private static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextDouble()) {
            System.out.print(colorText("Error. Pon un precio (ej: 15,99): ", RED));
            sc.next();
        }
        double d = sc.nextDouble();
        sc.nextLine();
        return d;
    }
}