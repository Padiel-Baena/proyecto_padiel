package tema5.banco;

import tema5.gym.Usuario;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BancoMain {

    public static void main(String[] args) {
        List<UsuarioBanco> clientes = new LinkedList<>();
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
        System.out.println("====================BIENVENIDO/A AL BANCO===================");
        System.out.println("############################################################");

        while (opcion != 5){
            showMenu();
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("\n=======================================");
                    System.out.println("HAS LLEGADO AL BANCO");

                    System.out.println("=================================");
                    System.out.println("Dime el Dni(UNICAMENTE EL NUMERO)");
                    dni = sc.nextInt();
                    dniComprobado = UsuarioBanco.checkDni(dni);
                    System.out.println("===========================\nDNI : " + dniComprobado);

                    System.out.println("===========================\nAhora dime tu nombre");
                    sc.nextLine();
                    nombre = sc.nextLine();
                    nombre2 = nombre.toUpperCase();
                    System.out.println("============================\nPerfecto " + nombre2 + " Ahora tu edad");
                    edad = sc.nextInt();
                    UsuarioBanco persona1 = new UsuarioBanco(dniComprobado,nombre2, edad);

                    añadirCola(persona1, clientes);
                    break;
                case 2:
                    cambiarPrimero(clientes);
                    break;
                case 3:
                    System.out.println("\n================================");
                    System.out.println("HAS ELEGIDO LA OPCION DE IRTE DE LA COLA");
                    System.out.println("=================================");
                    System.out.println("Dime el DNI de la persona que se ha cansado de esperar(UNICAMENTE EL NUMERO)");
                    dni = sc.nextInt();
                    dniComprobado = UsuarioBanco.checkDni(dni);

                    quitarUsuario(clientes, dniComprobado);
                    break;
                case 4:
                    System.out.println("\n================================");
                    System.out.println("HAS ELEGIDO LA OPCION DE VER LISTA");
                    if(!clientes.isEmpty()){
                        System.out.println(toStringBanco(clientes));
                    }
                    else{
                        System.out.println("No hay nadie en la cola.Para poder ver la cola, primero tendra que llegar gente\n:)");
                    }
                    break;
                case 5:
                    System.out.println("##################################################");
                    System.out.println("===============SALIENDO DEL SISTEMA===============");
                    System.out.println("###################################################");
                    break;
            }
        }

    }
    public static void añadirCola(UsuarioBanco persona, List<UsuarioBanco> clientes) {
        clientes.add(persona);
        System.out.println("El formulario ha sido procesado y recibiras un aviso cuando te toque");
    }
    public static void cambiarPrimero(List<UsuarioBanco> clientes) {
       if(!clientes.isEmpty()){
           UsuarioBanco persona = clientes.get(0);
           System.out.println(persona.getNombre() + " HA TERMINADO SUS GESTIONES");
           clientes.remove(0);
           if(!clientes.isEmpty()) {
               persona = clientes.get(0);
               System.out.println("AHORA ES TURNO DE " + persona.getNombre());
           }else{
               System.out.println("No hay mas personas haciendo cola");
           }
       }
       else {
           System.out.println("NO HAY PERSONAS EN EL BANCO");
       }
    }
    public static void quitarUsuario(List<UsuarioBanco> clientes, String dniBusqueda) {
        if(!clientes.isEmpty()){
            UsuarioBanco encontrado = null;
            for (UsuarioBanco u : clientes) {
                if (u.getDni().equals(dniBusqueda)) {
                    encontrado = u;
                    break;
                }
            }
            if (encontrado != null) {
                clientes.remove(encontrado);
                System.out.println(encontrado.getNombre() + " HA DECIDIDO IRSE DE LA COLA");
            }
            else{
                System.out.println("NO HAY NADIE EN LA COLA QUE TENGA ESE DNI");
            }
        }
        else {
            System.out.println("NO HAY PERSONAS EN EL BANCO");
        }
    }
    public static void showMenu(){
        System.out.print("==================================\n1-Añadir alguien a la cola\n2-Quitar primera persona\n3-Quitar cualquier persona\n4-Mostrar cola\n5-Salir\nDime que es lo que quieres hacer : ");

    }
    public static String toStringBanco(List<UsuarioBanco> clientes){
        String cola = "#########################################\n" + "=============Lista de Usuarios=============\n" + "#########################################\n";
        for (UsuarioBanco u : clientes) {
            cola += "\n" + u.toString() + "\n=========================================";
        }
        return cola;
    }




}
