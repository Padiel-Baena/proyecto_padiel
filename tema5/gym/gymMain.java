package tema5.gym;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class gymMain {
    public static void main(String[] args) {
        Map<String,Usuario> usuarios = new HashMap<>();
        gymMain app = new gymMain();
        Scanner sc = new Scanner(System.in);

        System.out.println("Esta es una version prototipo de una aplicacion para el gimnasio\nDime el Dni");
        String dni = sc.nextLine();
        System.out.println("Ahora dime el nombre");
        String nombre = sc.nextLine();
        System.out.println("Ahora la edad");
        int edad = sc.nextInt();

        Usuario usuario1 = new Usuario(nombre, edad,dni);
        Usuario usuario2 = new Usuario();
        String dni_prueba = "55555555z";
        int edad_prueba = 35;
        String nombre_prueba = "pedro";

        app.darAlta(nombre,usuario1, usuarios);
        System.out.println("Dime un nombre para cambiar al usuario 2");
        String nombre2 = sc.nextLine();
        app.modificarUsuarios(dni, usuario2,nombre2);
        app.darAlta(dni, usuario2);
        Usuario usuario3 = new Usuario(nombre_prueba,edad_prueba,dni_prueba);
        app.darAlta(usuario3.getDni(), usuario3);

        app.darBaja(usuario3.getDni(), usuario3);
    }
    public static void darAlta(String dni, Usuario usuario,  Map<String,Usuario> usuarios){
        usuarios.put(dni, usuario);
    }
    public void darBaja(String dni, Usuario usuario){
        usuarios.remove(dni);
    }
    public void modificarUsuarios(String dni, Usuario usuario, String nombre2){
        usuario.setNombre(nombre2);
    }
    public void modificarUsuarios(String dni, Usuario usuario, int edad2){
        usuario.setEdad(edad2);
    }
}
