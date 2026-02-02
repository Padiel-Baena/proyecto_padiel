package tema4;

public class RelojMain {
    public static void main(String[] args) {
        Reloj reloj1 = new Reloj(1, 23, 59, true);
        reloj1.mostrarHora(13,23,59,false);
        System.out.println(reloj1);
    }
}
