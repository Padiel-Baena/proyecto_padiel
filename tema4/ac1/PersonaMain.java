package tema4.ac1;

import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre ;
        String apellido;
        String dni;
        int edad;
        System.out.println("Dime el nombre para una persona");
        nombre = sc.nextLine();
        System.out.println("Dime los apellido para una persona");
        apellido= sc.nextLine();
        System.out.println("Dime el DNI de la persona");
        dni = sc.nextLine();
        System.out.println("Dime la edad de la persona");
        edad=sc.nextInt();
        Persona persona1 = new Persona(dni,nombre,apellido, edad);
        Persona persona2 = new Persona();

        persona1.isAdult(edad);
        persona1.isRetired(edad);
        persona1.ageDifference(persona2);

    }
}
