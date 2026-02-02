package tema4;

import java.util.Random;
import java.util.Scanner;

public class HeroMainHorda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random numr = new Random();
        System.out.println("Dime el nombre de tu personaje");
        String name = sc.nextLine();
        System.out.print("Dime el nivel : ");
        int level = sc.nextInt();
        System.out.print("Dime la vida maxima: ");
        int psMax = sc.nextInt();
        System.out.print("Dime la vida actual de tu personaje : ");
        //comprobacion de que no tenga mas vida actual que vida maxima
        int ps = sc.nextInt();
        System.out.print("Dime la experiencia : ");
        int xp = sc.nextInt();
        System.out.print("Dime el ataque : ");
        int atq = sc.nextInt();
        System.out.print("Dime la defensa : ");
        int def = sc.nextInt();
        Hero hero1 = new Hero(name, level, ps, psMax, xp, atq, def);
        Hero[] horda = generadorEnemigos(numr);
        boolean vicoria = false;
        while(!vicoria){
            System.out.println(hero1.getName() + " ha sido emboscado por " + horda.length + " goblins");
        }
    }
    public static Hero[] generadorEnemigos(Random numr){
        int cGoblins = numr.nextInt(3);
        Hero[] horda = new Hero[cGoblins];
        String nameGoblin = "Goblin";
        switch (cGoblins) {
            case 1:
                Hero goblin = new Hero(nameGoblin, 5, 15, 15, 250, 20, 15);
                horda[0] = goblin;
                break;
            case 2 :
                Hero goblin1 = new Hero(nameGoblin, 5, 15, 15, 250, 20, 15);
                Hero goblin2 = new Hero(nameGoblin, 5, 15, 15, 250, 20, 15);
                horda[0] = goblin1;
                horda[1] = goblin2;
                break;
            case 3 :
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
    public static void eleccion(Random rn,Hero hero1, Scanner sc, Hero[] horda, Hero goblin,Hero goblin1, Hero goblin2, Hero goblin3, Hero goblin4, Hero goblin5){
        int eleeccion ;
        boolean fin = false;
        boolean huye = false;
        boolean huye1 = false;
        boolean huye2 = false;
        boolean huye3 = false;
        boolean huye4 = false;
        boolean huye5 = false;
        while(!fin){
            System.out.println(hero1.getName() + " decide que vas a hacer\n1-Atacar\n2-Beber una pocion\n3-Descansar");
                eleeccion = sc.nextInt();
            switch (eleeccion){
                case 1:
                    if (horda.length == 1) {
                        huye = huida(rn, goblin);
                        if (huye ) {
                            fin = true;
                        } else {
                            System.out.println(hero1.getName() + " ha decidido atacar");
                            hero1.attack(goblin);

                            if (goblin.getPs() <= 0) {
                                fin = true;
                            } else {
                                goblin.attack(hero1);
                                if (hero1.getPs() <= 0) {
                                    fin = true;
                                }
                            }
                        }
                    }
                    if (horda.length == 2) {
                        huye1 = huida(rn, goblin1);
                        huye2 = huida(rn, goblin);
                        if (huye1 && huye2) {
                            fin = true;
                        } else if (huye1 || huye2) {
                            Hero horda2[] = new Hero[1];
                            horda2[0] = horda[0];
                            System.out.println(hero1.getName() + " ha decidido atacar");
                            hero1.attack(goblin);

                            if (goblin.getPs() <= 0) {
                                fin = true;
                            } else {
                                goblin.attack(hero1);
                                if (hero1.getPs() <= 0) {
                                    fin = true;
                                }
                            }
                        } else {
                            System.out.println(hero1.getName() + " ha decidido atacar");
                            hero1.attack(goblin);

                            if (goblin1.getPs() <= 0) {
                                fin = true;
                            } else {
                                goblin1.attack(hero1);
                                if (hero1.getPs() <= 0) {
                                    fin = true;
                                }
                                goblin2.attack(hero1);
                                if (hero1.getPs() <= 0) {
                                    fin = true;
                                }
                            }
                        }
                    }
                    else{
                            huye3 = huida(rn, goblin3);
                            huye4 = huida(rn, goblin4);
                            huye5 = huida(rn, goblin5);
                        if (huye3 && huye4 && huye5) {
                            fin = true;
                        } else if (huye1 || huye2) {
                            Hero horda2[] = new Hero[1];
                            horda2[0] = horda[0];
                            System.out.println(hero1.getName() + " ha decidido atacar");
                            hero1.attack(goblin);

                            if (goblin.getPs() <= 0) {
                                fin = true;
                            } else {
                                goblin.attack(hero1);
                                if (hero1.getPs() <= 0) {
                                    fin = true;
                                }
                            }
                        } else {
                            System.out.println(hero1.getName() + " ha decidido atacar");
                            hero1.attack(goblin);

                            if (goblin1.getPs() <= 0) {
                                fin = true;
                            } else {
                                goblin1.attack(hero1);
                                if (hero1.getPs() <= 0) {
                                    fin = true;
                                }
                                goblin2.attack(hero1);
                                if (hero1.getPs() <= 0) {
                                    fin = true;
                                }
                            }
                        }
                        }

                    break;
                case 2:
            }
        }
    }
    public static boolean huida(Random rn, Hero goblin){
        boolean huye= false;
        int numr = rn.nextInt(10);
        if (numr == 1){
            huye = true;
            System.out.println(goblin + " ha huido");
        }
        return huye;
    }
}
