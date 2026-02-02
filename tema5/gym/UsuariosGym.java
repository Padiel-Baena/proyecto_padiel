package tema5.gym;

import java.util.HashMap;
import java.util.Map;

public class UsuariosGym {
      private  Map<String,Integer> usuarios = new HashMap<>();


    public void darAlta(String nombre, int edad){
        usuarios.put(nombre, edad);
    }
    public void darBaja(String nombre, int edad){
        usuarios.remove(nombre);
    }
    public void showInfo(String nombre, int edad, String dni){
        System.out.println("Nombre : " + nombre + "\nEdad : " + edad + "\nDNI : " + dni);
    }
    public void modificarUsuarios(String nombre, String nombre2){
        nombre = nombre2;
    }
    public void modificarUsuarios(int edad, int edad2){
        edad = edad2;
    }
}
