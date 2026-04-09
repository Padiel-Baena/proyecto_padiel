package tema7.Ejercicios3;

import utils.Colores;

import java.util.List;
import java.util.Map;
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
            opcion = leerEntero("Selecciona una opción: ");

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
                    System.out.println("Saliendo y guardando datos...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);

        Logica.guardarSerial(gestion.getListaFunkos());
    }

    private static void mostrarMenu() {
        System.out.println("\n" + colorText("╔═══════════════════════════════════════╗", CYAN));
        System.out.println(colorText("║      " + BOLD + "   GESTIÓN DE FUNKOS   " + RESET + CYAN + "          ║", GOLD));
        System.out.println(colorText("╚═══════════════════════════════════════╝", CYAN));

        System.out.println(colorText("  1.", SKY_BLUE) + " Añadir funko");
        System.out.println(colorText("  2.", SKY_BLUE) + " Borrar funko");
        System.out.println(colorText("  3.", SKY_BLUE) + " Mostrar todos");
        System.out.println(colorText("  4.", SKY_BLUE) + " Mostrar el más caro");
        System.out.println(colorText("  5.", SKY_BLUE) + " Mostrar media de precios");
        System.out.println(colorText("  6.", SKY_BLUE) + " Mostrar agrupados por modelo");
        System.out.println(colorText("  7.", SKY_BLUE) + " Mostrar funkos de 2023");

        System.out.println(colorText("-----------------------------------------", GRAY_DARK));
        System.out.println(colorText("  0. Salir", RED_BRIGHT));
        System.out.println(colorText("-----------------------------------------", GRAY_DARK));
    }

    private static void addFunko() {
        System.out.print(colorText("Nombre: ",Colores.PURPLE));
        String nombre = sc.nextLine();
        System.out.print(colorText("Modelo: ",Colores.BUBBLEGUM));
        String modelo = sc.nextLine();
        double precio = leerDouble(colorText("Precio: ",Colores.APRICOT));
        int anyo = leerEntero("Año: ");

        gestion.addFunko(new Funkos(nombre, modelo, precio, anyo));
        Colores.logSuccess("Funko añadido correctamente.");
    }

    private static void borrarFunko() {
        System.out.print("Nombre del funko a borrar: ");
        String nombre = sc.nextLine();
        if (gestion.borrarFunko(nombre)) {
            System.out.println("Borrado con éxito.");
        } else {
            System.out.println("No se encontró ningún funko con ese nombre.");
        }
    }

    private static void mostrarTodos() {
        if (gestion.getListaFunkos().isEmpty()) {
            Colores.logWarning("La colección está vacía.");
        } else {
            gestion.getListaFunkos().forEach(System.out::println);
        }
    }

    private static void mostrarMasCaro() {
        Funkos caro = gestion.obtenerMasCaro();
        System.out.println(caro != null ? "El más caro es: " + caro : "No hay datos.");
    }

    private static void mostrarMedia() {
        double media = gestion.calcularMediaPrecio();
        System.out.println("La media de precio es: " + media + "€");
    }

    private static void mostrarAgrupados() {
        Map<String, List<Funkos>> agrupados = gestion.agruparPorModelo();
        agrupados.forEach((modelo, lista) -> {
            System.out.println("\nModelo: " + modelo);
            lista.forEach(f -> System.out.println("  - " + f.getNombre()));
        });
    }

    private static void mostrarFunkos2023() {
        List<Funkos> f2023 = gestion.filtrar2023();
        if (f2023.isEmpty()) {
            Colores.logError("No hay funkos del 2023.");
        } else {
            f2023.forEach(System.out::println);
        }
    }

    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextInt()) {
            Colores.logError("Algo ha ido mal, introduce un numero entero");
            sc.next();
        }
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    private static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextDouble()) {
            Colores.logError("Algo ha ido mal");
            sc.next();
        }
        double numero = sc.nextDouble();
        sc.nextLine();
        return numero;
    }
}
