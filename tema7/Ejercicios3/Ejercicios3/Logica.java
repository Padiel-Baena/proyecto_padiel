package tema7.Ejercicios3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Logica {

    private static final String FICHERO_CSV = "funkos.csv";
    private static final String FICHERO_BIN = "funkos.dat";

    public static List<Funkos> cargarCSV() {
        List<Funkos> listaTemporal = new ArrayList<>();
        File archivo = new File(FICHERO_CSV);

        if (!archivo.exists()) {
            return listaTemporal;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            br.readLine();

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] trozos = linea.split(",");

                if (trozos.length == 5) {
                    String cod = trozos[0];
                    String nombre = trozos[1];
                    String modelo = trozos[2];
                    double precio = Double.parseDouble(trozos[3]);
                    String fecha = trozos[4];

                    Funkos f = new Funkos(cod, nombre, modelo, precio, fecha);
                    listaTemporal.add(f);
                }
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo CSV.");
        }
        return listaTemporal;
    }

    public static void guardarCSV(List<Funkos> lista) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FICHERO_CSV))) {
            pw.println("COD,NOMBRE,MODELO,PRECIO,FECHA_LANZAMIENTO");

            for (Funkos f : lista) {
                pw.println(f.getCod() + "," + f.getNombre() + "," + f.getModelo() + "," + f.getPrecio() + "," + f.getFecha());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar en CSV.");
        }
    }

    public static void guardarSerial(List<Funkos> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHERO_BIN))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo binario.");
        }
    }

    public static List<Funkos> cargarSerial() {
        File archivo = new File(FICHERO_BIN);
        if (!archivo.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (List<Funkos>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Error al cargar el archivo binario.");
            return new ArrayList<>();
        }
    }
}