package Examen.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Tragaperras {
    public static void main(String[] args) {
        List<IDinero> c1 = new ArrayList<>(10);
        Cartera cartera = new Cartera(c1);
        Billete b1 = new Billete(50);
        cartera.anyadir(b1);
        Billete b2 = new Billete(500);
        cartera.anyadir(b2);
        Billete b3 = new Billete(100);
        cartera.anyadir(b3);

        Tarjeta t1 = new Tarjeta("N1",100,50);
        cartera.anyadir(t1);
        Tarjeta t2 = new Tarjeta("N2",1000,750);
        cartera.anyadir(t2);

        System.out.println(cartera);
    }
}
