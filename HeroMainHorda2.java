package tema4;

import java.util.Random;
import java.util.Scanner;

public class HeroMainHorda2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random numr = new Random();
        System.out.println("Dime el nombre de tu personaje");
        String name = sc.nextLine();
        System.out.print("Dime el nivel : ");
        int level = sc.nextInt();
        System.out.print("Dime la vida maxima: ");
        int psMax = sc.nextInt();
        int ps = psMax;
        System.out.print("Dime la experiencia : ");
        int xp = sc.nextInt();
        System.out.print("Dime el ataque : ");
        int atq = sc.nextInt();
        System.out.print("Dime la defensa : ");
        int def = sc.nextInt();
        Hero hero1 = new Hero(name, level, ps, psMax, xp, atq, def);

        int hordasGanadas = 0;

        while (hero1.getPs()>0){
            System.out.println(hero1.getName() + " ha sido emboscado por una horda");
            Hero[] horda = generadorEnemigos(numr);

            while(hero1.getPs() > 0 && enemigosVivos(horda)){

                showInfo(hero1, horda, hordasGanadas);
                continuar(sc);

                huida(numr,horda);
                if(enemigosVivos(horda)) {
                    turnoHero(horda, hero1);
                }
                faseEnemigos(horda,hero1);
            }
            if (hero1.getPs() > 0) {
                hordasGanadas++;
                System.out.println("\n¡Horda numero " + hordasGanadas + " superada!");
            }
            if (numr.nextInt(1000) == 0) {
                hero1.setPs(hero1.rest(hero1.getPs(), hero1.getPsMax()));
            }

            if (numr.nextInt(10) == 0) {
                System.out.println("¡Has encontrado una poción!");
                hero1.setPs(hero1.drinkPotion(hero1.getPs(), hero1.getPsMax()));
            }
        }
        System.out.println("\n##############################################################");
        System.out.println(hero1.getName() + " ha caido noblemente en combate despues de sobrevivir a " + hordasGanadas + " hordas de enemigos");
        System.out.println("\n##############################################################");

    }

   /* public static Hero[] generadorEnemigos(Random numr) {
        int cGoblins = numr.nextInt(3) + 1;
        Hero[] horda = new Hero[cGoblins];
        String nameGoblin = "Goblin";
        switch (cGoblins) {
            case 1:
                Hero goblin = new Hero(nameGoblin, 5, 15, 15, 250, 20, 15);
                horda[0] = goblin;
                break;
            case 2:
                Hero goblin1 = new Hero(nameGoblin, 5, 15, 15, 250, 20, 15);
                Hero goblin2 = new Hero(nameGoblin, 5, 15, 15, 250, 20, 15);
                horda[0] = goblin1;
                horda[1] = goblin2;
                break;
            case 3:
                Hero goblin3 = new Hero(nameGoblin, 5, 15, 15, 250, 20, 15);
                Hero goblin4 = new Hero(nameGoblin, 5, 15, 15, 250, 20, 15);
                Hero goblin5 = new Hero(nameGoblin, 5, 15, 15, 250, 20, 15);
                horda[0] = goblin3;
                horda[1] = goblin4;
                horda[2] = goblin5;
                break;
        }
        return horda;
    }
*/
    public static void huida(Random rn, Hero[] horda) {
        for(Hero enemigo : horda){
            if(enemigo.getPs()>0){
                if(rn.nextInt(10) ==0){
                    enemigo.setPs(0);
                    System.out.println("El muy cobarde del " + enemigo.getName() + " ha decidido huir al notar tu poder");
                }
            }
        }
    }

    public static void turnoHero(Hero[] horda, Hero hero){
        for (Hero enemigo : horda) {
            if (enemigo.getPs() > 0) {
                hero.attack(enemigo);
                if (enemigo.getPs() <= 0) {
                    System.out.println("¡Has derrotado a " + enemigo.getName() + "!");
                }
                break;
            }
        }
    }
    public static void faseEnemigos(Hero[] horda, Hero hero) {
        for (Hero enemigo : horda) {
            if (enemigo.getPs() > 0 && hero.getPs() > 0) {
                enemigo.attack(hero);
            }
        }
    }
    public static boolean enemigosVivos(Hero[] horda){
        for (Hero e : horda) {
            if (e.getPs() > 0) return true;
        }
        return false;
    }
    public static void showInfo(Hero hero, Hero[] horda, int hordasGanadas) {
        System.out.println("\n=== ESTADO DE LA BATALLA ===");
        System.out.println("=====Horda numero " + hordasGanadas + "=====");
        System.out.println("[Héroe] " + hero.getName() + " PS: " + hero.getPs() + "/" + hero.getPsMax());
        System.out.print("[Horda] ");
        for (Hero e : horda) {
            if (e.getPs() > 0) {
                System.out.print(e.getName() + "(" + e.getPs() + " PS) ");
            }
        }
        System.out.println("\n=============================");
    }
    public static void continuar(Scanner sc) {
        System.out.println("\n> Pulsa ENTER para continuar...");
        sc.nextLine();
    }
    public static Hero[] generadorEnemigos(Random numr) {
        // Generamos un número de 1 a 3
        int cGoblins = numr.nextInt(3) + 1;
        Hero[] horda = new Hero[cGoblins];

        for (int i = 0; i < horda.length; i++) {
            // Creado con 'new' en cada vuelta, son independientes
            horda[i] = new Hero("Goblin " + (i + 1), 5, 15, 15, 250, 20, 15);
        }
        return horda;
    }
}