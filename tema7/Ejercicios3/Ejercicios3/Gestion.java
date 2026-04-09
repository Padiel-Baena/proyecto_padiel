package tema7.Ejercicios3;

import java.util.ArrayList;
import java.util.List;

public class Gestion {
    private List<Funkos> lista;

    public Gestion() {
        this.lista = new ArrayList<>();
    }

    public void setListaFunkos(List<Funkos> nuevaLista) {
        this.lista = nuevaLista;
    }

    public List<Funkos> getListaFunkos() {
        return lista;
    }

    public void addFunko(Funkos f) {
        lista.add(f);
    }

    public boolean borrarFunko(String nombreBorrar) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equalsIgnoreCase(nombreBorrar)) {
                lista.remove(i);
                return true;
            }
        }
        return false;
    }

    public Funkos obtenerMasCaro() {
        if (lista.isEmpty()) return null;

        Funkos masCaro = lista.get(0);
        for (Funkos f : lista) {
            if (f.getPrecio() > masCaro.getPrecio()) {
                masCaro = f;
            }
        }
        return masCaro;
    }

    public double calcularMediaPrecio() {
        if (lista.isEmpty()) return 0.0;

        double suma = 0;
        for (Funkos f : lista) {
            suma = suma + f.getPrecio();
        }
        return suma / lista.size();
    }

    public List<Funkos> filtrar2023() {
        List<Funkos> filtrados = new ArrayList<>();
        for (Funkos f : lista) {
            if (f.obtenerAño() == 2023) {
                filtrados.add(f);
            }
        }
        return filtrados;
    }
}