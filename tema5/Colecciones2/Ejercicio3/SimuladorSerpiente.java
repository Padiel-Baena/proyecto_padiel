package tema5.Colecciones2.Ejercicio3;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

enum color{r,v,a}
public class SimuladorSerpiente {
    public static void main(String[] args) {
            // 1. Creamos la serpiente (nace con 1 anilla y 0 años)
            Serpiente s1 = new Serpiente();
            int segundos = 0;

            System.out.println("--- COMIENZA LA VIDA DE LA SERPIENTE ---");


            while (s1.getViva()) {
                segundos++;
                s1.pasarAño();

                System.out.println("Año " + segundos + ": " + s1.getApariencia());

                // Un pequeño delay para que parezca una simulación real
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }

            System.out.println("La serpiente ha muerto a los " + segundos + " años.");
        }
        }