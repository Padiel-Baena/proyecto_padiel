package tema7.Ejercicios3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Gestion {
    private List<Funkos> listaFunkos;

    public Gestion() {
        this.listaFunkos = listaFunkos;
    }

    public void setListaFunkos(List<Funkos> lista) {
        this.listaFunkos = lista;
    }

    public List<Funkos> getListaFunkos() {
        return listaFunkos;
    }

    public void addFunko(Funkos f) {
        listaFunkos.add(f);
    }

    public boolean borrarFunko(String nombre) {
        return listaFunkos.removeIf(f -> f.getNombre().equalsIgnoreCase(nombre));
    }

    public Funkos obtenerMasCaro() {
        return listaFunkos.stream()
                .max(Comparator.comparingDouble(Funkos::getPrecio))
                .orElse(null);
    }

    public double calcularMediaPrecio() {
        return listaFunkos.stream()
                .mapToDouble(Funkos::getPrecio)
                .average()
                .orElse(0.0);
    }

    public List<Funkos> filtrar2023() {
        return listaFunkos.stream()
                .filter(f -> f.getAnyo() == 2023)
                .collect(Collectors.toList());
    }

    public Map<String, List<Funkos>> agruparPorModelo() {
        return listaFunkos.stream()
                .collect(Collectors.groupingBy(Funkos::getModelo));
    }
}
