package tema5.gym;

import java.util.Scanner;

public class gymMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Esta es una version prototipo de una aplicacion para el gimnasio\nDime el Dni");
        String dni = sc.nextLine();
        System.out.println("Ahora dime el nombre");
        String nombre = sc.nextLine();
        System.out.println("Ahora la edad");
        int edad = sc.nextInt();

        Usuario usuario1 = new Usuario(nombre, edad,nombre);
        Usuario usuario2 = new Usuario();

        UsuariosGym.darAlta();


    }
}
