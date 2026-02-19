package tema6.POO3.Ejercicio1;

public class VehiculosMain {
    public static void main(String[] args) {
        Turismos coche  = new Turismos(4,false,"chevrolet","camaro zl1", "negro","1234 KFC", 2024);
        System.out.println(coche.toString());

        Ciclomotor ciclomotor = new Ciclomotor(150,"Kawasaki","Ninja","Verde","2345-KFC",2024);

        System.out.println(ciclomotor.toString());

        Camiones camion = new Camiones(3000,true,"Mercedes","kh-7","Blanco","1111 KFC",2024);

        System.out.println(camion.toString());
    }
}
