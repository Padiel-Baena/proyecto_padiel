package tema4;

import java.util.Scanner;

public class HeroMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        Hero hero1 = new Hero(name,level,ps,psMax,xp,atq,def);

        Hero hero2 = new Hero();
        hero1.drinkPotion(ps,psMax);
        hero1.rest(ps,psMax);
        hero1.attack(hero2);
        hero1.levelUp(xp,level, psMax,ps,atq,def);
    }
}
