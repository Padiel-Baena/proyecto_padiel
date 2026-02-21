package tema5.Colecciones2.Ejercicio4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RoundRobin {
    public static void main(String[] args) {

        List<Proceso> cola = new LinkedList<>();
        int cont = 1;
        double tiempoSimulacion = 0;

        while(cont <= 10 || !cola.isEmpty()){
            if (tiempoSimulacion % 2.0 < 0.1 && cont <= 10) {
                addProceso(cola, cont);
                cont++;
            }
            if (!cola.isEmpty()) {
                restarTiempo(cola);
            } else {
                System.out.println("CPU ociosa... esperando procesos.");
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("La simulación ha sido interrumpida.");
            }

            tiempoSimulacion += 0.2;
        }
        System.out.println("Simulación terminada.");
    }
    public static void addProceso( List<Proceso> cola, int cont){
        Random rn = new Random();
        String nombre = "";
        double duracion =1 + rn.nextInt(4);
        nombre = "p" + cont;
        Proceso s1 = new Proceso(nombre,duracion);
        cola.add(s1);
        System.out.println("Se ha añadido un nuevo proceso");
    }

    public static void restarTiempo(List<Proceso> cola){
        Proceso p = cola.get(0);
        double tActual= p.gettRestante();
        tActual -=0.2;
        p.settRestante(tActual);

        if(tActual <= 0){
            cola.remove(0);
            System.out.println("Se ha terminado el proceso");
        }else{
            cola.remove(0);
            cola.add(p);
            System.out.println("El proceso ha avanzado, y se ha puesto en pausa");
        }
    }
}
