package tema7.Ejercicios3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Logica {
    private static final String FICHERO_CSV = "funkos.csv";
    private static final String FICHERO_BIN = "funkos.dat";

    // --- MÉTODOS PARA EL EJERCICIO 1 (CSV) ---

    public static void guardarCSV(List<Funkos> lista) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FICHERO_CSV))) {
            for (Funkos f : lista) {
                pw.println(f.getNombre() + "," + f.getModelo() + "," + f.getPrecio() + "," + f.getAnyo());
            }
        } catch (IOException e) {
            System.err.println("Error al guardar en CSV: " + e.getMessage());
        }
    }

    public static List<Funkos> cargarCSV() {
        List<Funkos> lista = new ArrayList<>();
        File file = new File(FICHERO_CSV);

        if (!file.exists()) return lista; // Si no existe el archivo, devolvemos la lista vacía

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 4) {
                    lista.add(new Funkos(
                            datos[0],
                            datos[1],
                            Double.parseDouble(datos[2]),
                            Integer.parseInt(datos[3])
                    ));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al cargar desde CSV: " + e.getMessage());
        }
        return lista;
    }

    public static void guardarSerial(List<Funkos> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHERO_BIN))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            System.err.println("Error al serializar: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Funkos> cargarSerial() {
        File file = new File(FICHERO_BIN);
        if (!file.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Funkos>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar binario: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
