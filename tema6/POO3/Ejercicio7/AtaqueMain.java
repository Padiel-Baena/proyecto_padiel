package tema6.POO3.Ejercicio7;

public class AtaqueMain {
    public static void main(String[] args) {
        AtaqueMagico hechizo = new AtaqueMagico(100,100,100,100);

        hechizo.Lanzar();
        double coste = hechizo.Coste();
        double damage= hechizo.DanioInfligido();

        double mana = hechizo.getMana() - coste;
        System.out.println("Coste: " + coste);
        System.out.println("Damage: "+damage);
        double hp = hechizo.getVida() - damage;
        System.out.println("HP: "+hp);
        System.out.println("Mana: "+mana);
    }
}
