package Examen.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Cartera {
       protected List<IDinero> cartera;

       public Cartera(List<IDinero> cartera){
           this.cartera = cartera;
       }

    public List<IDinero> getCartera() {
        return cartera;
    }
    public void setCartera(List<IDinero> cartera) {
        this.cartera = cartera;
    }

    public String toString(){
           String frase = "CARTERA";
           for(IDinero i : cartera){
               frase += "\n" + i.toString();
           }
           return frase;
    }
    public void anyadir(IDinero d){
           cartera.add(d);
    }
}
