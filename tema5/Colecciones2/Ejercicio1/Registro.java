package tema5.Colecciones2.Ejercicio1;

import tema5.Colecciones1.gym.Usuario;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        Map<Integer,Animal> registro = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        boolean nocturno = false;

        System.out.println("############################################################");
        System.out.println("==================REGISTRO DEL GUARDABOSQUES==================");
        System.out.println("############################################################");

        while (opcion != 6){
            showMenu();
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("\n===================");
                    System.out.println("AÑADIR AVISTAMIENTOS");

                    AnyadirAvistamiento(hora);

                    break;
                case 2:
                    System.out.println("\n=====================");
                    System.out.println("AVISTAMIENTOS NOCTURNOS");
                    nocturno = true;
                    MostrarAvistamiento(registro,nocturno);
                    break;
                case 3:
                    System.out.println("\n===================");
                    System.out.println("AVISTAMIENTOS DIURNOS");
                    MostrarAvistamiento(registro,nocturno);

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("##################################################");
                    System.out.println("===============SALIENDO DEL SISTEMA===============");
                    System.out.println("###################################################");
                    break;

            }
        }
    }
    public static void AnyadirAvistamiento(int hora, Animal a,  Map<Integer,Animal> registro){
        registro.put(hora,a);
    }
    public static void MostrarAvistamiento(Map<Integer,Animal> registro, boolean nocturno){
        if(nocturno){
            for (Animal a : registro.values()) {
                if (a.horaAvistamiento > 20 || a.horaAvistamiento < 8) {
                    String frase = "#############################\nAvistamientos Nocturnos\n############################";
                    frase += a.toString();
                }
            }
        }else{
            for (Animal a : registro.values()) {
                if (a.horaAvistamiento > 8) {
                    String frase = "#############################\nAvistamientos Diurnos\n############################";
                    frase += a.toString();
                }
            }
        }
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
    public static String toStringRegistro(Map<Integer,Animal> registro){
        String listaUsuarios = "#########################################\n" + "=============Lista de Avistamientos=============\n" + "#########################################\n";
        for (Animal a : registro.values()) {
            listaUsuarios += "\n" + a.toString() + "\n=========================================";
        }
        return listaUsuarios;
    }
    public static void showMenu(){
        System.out.print("==================================\n1-Añadir avistamiento\n2-Mostrar avistamientos a partir de las 8\n3-Mostrar avistamientos nocturnos\n4-Mostrar manadas\n5-Mostrar serpientes\n6-Mostrar pajaros\n7-Salir\nDime que es lo que quieres hacer : ");
    }
}

