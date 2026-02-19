package tema5.Colecciones1.gym;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GymMain {
    public static void main(String[] args) {
        Map<String,Usuario> usuarios = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int dni;
        int edad;
        int opcion = 0;
        int edad2;

        String nombre;
        String nombreCambio;
        String dniComprobado;
        String nombre2;

        System.out.println("############################################################");
        System.out.println("==================BIENVENIDO/A AL GIMNASIO==================");
        System.out.println("############################################################");

        while (opcion != 6){
            showMenu();
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("\n=======================================");
                    System.out.println("HAS DECIDIDO DARTE DE ALTA EN EL GIMNASIO");

                    System.out.println("=================================");
                    System.out.println("Dime el Dni(UNICAMENTE EL NUMERO)");
                    dni = sc.nextInt();
                    dniComprobado = Usuario.checkDni(dni);
                    System.out.println("===========================\nDNI : " + dniComprobado);

                    System.out.println("===========================\nAhora dime tu nombre");
                    sc.nextLine();
                    nombre = sc.nextLine();
                    nombre2 = nombre.toUpperCase();
                    System.out.println("============================\nPerfecto " + nombre2 + " Ahora tu edad");
                    edad = sc.nextInt();
                    Usuario usuario1 = new Usuario(nombre2, edad,dniComprobado);

                    darAlta(dniComprobado,usuario1, usuarios);
                    break;
                case 2:
                    System.out.println("\n=======================================");
                    System.out.println("HAS DECIDIDO DARTE DE BAJA EN EL GIMNASIO");

                    System.out.println("=================================");
                    System.out.println("Dime el Dni(UNICAMENTE EL NUMERO)");
                    dni = sc.nextInt();
                    dniComprobado = Usuario.checkDni(dni);
                    darBaja(dniComprobado, usuarios);
                    //informar, si no existe el dni
                    break;
                case 3:
                    System.out.println("\n================================");
                    System.out.println("HAS ELEGIDO LA OPCION DE VER LISTA");
                    if(!usuarios.isEmpty()){
                        System.out.println(toStringGym(usuarios));
                    }
                    else{
                        System.out.println("No hay usuarios registrados, primero tienes que dar de alta minimo a 1 persona.\n:)");
                    }
                    break;
                case 4:
                    System.out.println("\n=====================================================");
                    System.out.println("HAS ELEGIDO LA OPCION DE MODIFICAR NOMBRE DE UN USUARIO");

                    System.out.println("Dime el Dni(UNICAMENTE EL NUMERO)");
                    dni = sc.nextInt();
                    dniComprobado = Usuario.checkDni(dni);
                    System.out.println("===========================\nDNI : " + dniComprobado);
                    sc.nextLine();
                    System.out.println("===========================\nDime el nombre para cambiarlo");
                    nombreCambio = sc.nextLine().toUpperCase();
                    modificarUsuariosNombre(dniComprobado, nombreCambio, usuarios);
                    break;
                case 5:
                    System.out.println("\n=====================================================");
                    System.out.println("HAS ELEGIDO LA OPCION DE MODIFICAR EDAD DE UN USUARIO");

                    System.out.println("Dime el Dni(UNICAMENTE EL NUMERO)");
                    dni = sc.nextInt();
                    dniComprobado = Usuario.checkDni(dni);
                    System.out.println("===========================\nDNI : " + dniComprobado);
                    System.out.println("===========================\nDime la edad para cambiarla");
                    edad2 = sc.nextInt();
                    modificarUsuariosEdad(dniComprobado, edad2, usuarios);
                    break;
                case 6:
                    System.out.println("##################################################");
                    System.out.println("===============SALIENDO DEL SISTEMA===============");
                    System.out.println("###################################################");
                    break;

            }
        }
    }
    public static void darAlta(String dni, Usuario usuario,  Map<String,Usuario> usuarios){
        usuarios.put(dni, usuario);
    }
    public static void darBaja(String dni, Map<String,Usuario> usuarios){
        if(dni == null){
            System.out.println("No existe el dni");
        }
        usuarios.remove(dni);
    }
    public static void modificarUsuariosNombre(String dniComprobado, String nombreCambio, Map<String,Usuario> usuarios){
        Usuario u = usuarios.get(dniComprobado);
        if (u != null ){
            u.setNombre(nombreCambio);
            System.out.println("#####################");
            System.out.println("Ya hemos actualizado la informacion que nos has dado.\nLa persona con DNI : " + dniComprobado + " ahora se llama : " + u.getNombre());
        }
        else {
            System.out.println("No existe en nuestra base de datos nadie registrado con el DNI : " + dniComprobado + " si quieres puedes darte de alta usando la opcion 1\n:)");
        }
    }
    public static void modificarUsuariosEdad(String dniComprobado, int edad2, Map<String,Usuario> usuarios){
        Usuario u = usuarios.get(dniComprobado);
        if (u != null ){
            u.setEdad(edad2);
            System.out.println("#####################");
            System.out.println("Ya hemos actualizado la informacion que nos has dado.\nLa persona con DNI : " + dniComprobado + " ahora tiene : " + u.getEdad());
        }
        else {
            System.out.println("No existe en nuestra base de datos nadie registrado con el DNI : " + dniComprobado + " si quieres puedes darte de alta usando la opcion 1\n:)");
        }
    }
    public static String toStringGym(Map<String,Usuario> usuarios){
        String listaUsuarios = "#########################################\n" + "=============Lista de Usuarios=============\n" + "#########################################\n";
        for (Usuario u : usuarios.values()) {
            listaUsuarios += "\n" + u.toString() + "\n=========================================";
        }
        return listaUsuarios;
    }
    public static void showMenu(){
        System.out.print("==================================\n1-Dar de alta\n2-Dar de baja\n3-Mostrar la lista de Usuarios\n4-Modificar el nombre de un usuario\n5-Modificar la edad de un usuario\n6-Salir\nDime que es lo que quieres hacer : ");
    }
}
