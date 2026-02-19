package tema6.Ejercicio2;

public class AnimalesMain {
    public static void main(String[] args) {
        Gallina gallina = new Gallina(true,"PEPE",2,"K",15,TipoAnimal.AVE);
        System.out.println(gallina.toString());
        gallina.Comer();
        gallina.Dormir();
        gallina.HacerRuido();


        Perro perro = new Perro(TamañoAnimal.Grande,"BOBBY",5,"HUSKY",50,TipoAnimal.MAMIFERO);
        System.out.println(perro.toString());
        perro.Comer();
        perro.Dormir();
        perro.HacerRuido();
    }
}
