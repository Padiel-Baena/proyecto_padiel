package tema5.Colecciones2.Ejercicio3;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NidoSerpientes {
    public static void main(String[] args) {
        List<Serpiente> nido = new LinkedList<>();
        Random rn = new Random();

        for (int tiempo = 1; tiempo <= 300; tiempo++) {

            for (int i = 0; i < nido.size(); i++) {
                Serpiente s = nido.get(i);

                s.pasarAño();

                if (!s.getViva()) {
                    nido.remove(i);
                    i--;
                }
            }

            if (tiempo % 5 == 0 && nido.size() < 20) {
                int nacen = rn.nextInt(3) + 1;
                for (int i = 0; i < nacen && nido.size() < 20; i++) {
                    nido.add(new Serpiente());
                }
                System.out.println(">>> Han nacido " + nacen + " serpientes.");
            }

            if (tiempo % 10 == 0) {
                if (rn.nextInt(100) < 20) {
                    int victimas = rn.nextInt(5);
                    for (int i = 0; i < victimas && !nido.isEmpty(); i++) {
                        nido.remove(rn.nextInt(nido.size()));
                    }
                    System.out.println("!!! ATAQUE DE MANGOSTA: Se ha comido a " + victimas + " serpientes.");
                }
            }


            System.out.println("Segundo " + tiempo + " | Serpientes en nido: " + nido.size());
            for (Serpiente s : nido) {
                System.out.println("  " + s.getApariencia());
            }

            try { Thread.sleep(1000); } catch (Exception e) {}
        }
    }
}
