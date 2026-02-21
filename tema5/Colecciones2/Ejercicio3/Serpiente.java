package tema5.Colecciones2.Ejercicio3;

import java.util.LinkedList;
import java.util.Random;

public class Serpiente {
    private LinkedList<Character> cuerpo;
    private int edad;
    private boolean viva;
    private Random rn = new Random();


    public Serpiente() {
        this.cuerpo = new LinkedList<>();
        this.edad = 0;
        this.viva = true;
        // Nace con una anilla al azar
        this.cuerpo.add(generarColorAleatorio());
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getViva() {
        return viva;
    }

    public void setViva(boolean viva) {
        this.viva = viva;
    }

    public LinkedList<Character> getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(LinkedList<Character> cuerpo) {
        this.cuerpo = cuerpo;
    }

    private char generarColorAleatorio() {
        char[] colores = {'r', 'v', 'a'};
        return colores[rn.nextInt(3)];
    }
    public void pasarAño() {
        this.edad++;
        int probabilidad = rn.nextInt(100);

        if (edad < 10) {
            if (probabilidad < 80) crecer();
            else mudarPiel();
        } else {
            if (probabilidad < 90) decrecer();
            else mudarPiel();
        }

        if (rn.nextInt(100) < 10) {
            this.viva = false;
        }

        if (cuerpo.isEmpty()) {
            this.viva = false;
        }
    }

    private void crecer() {
        cuerpo.addFirst(generarColorAleatorio());
    }

    private void decrecer() {
        if (!cuerpo.isEmpty()) cuerpo.removeLast();
    }

    private void mudarPiel() {
        int tamanyoActual = cuerpo.size();
        cuerpo.clear();
        for (int i = 0; i < tamanyoActual; i++) {
            cuerpo.add(generarColorAleatorio());
        }
    }
    public String getApariencia() {
        StringBuilder sb = new StringBuilder();
        for (Character anilla : cuerpo) {
            sb.append(anilla);
        }
        return sb.toString() + " (Edad: " + edad + ")";
    }
}
