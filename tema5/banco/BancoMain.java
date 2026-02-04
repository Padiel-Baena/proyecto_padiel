package tema5.banco;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BancoMain {

    public static void main(String[] args) {
        List<usuarioBanco> clientes = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("======ABRE EL BANCO======");
        System.out.println("====En la recepcion te piden el DNI====");
        String dni = sc.nextLine();
        String nombre ;
        int edad ;
        String nombrePrueba = "alfredo";
        String dniPrueba = "55555555l";
        int edadPrueba = 75;

        System.out.println("TE DAN UN FORMULARIO PARA RELLENAR");
        System.out.print("NOMBRE : ");
        nombre = sc.nextLine();
        System.out.print("EDAD : ");
        edad = sc.nextInt();

        usuarioBanco persona1 = new usuarioBanco(dni, nombre, edad);
        añadirCola(persona1, clientes);

        usuarioBanco persona2 = new usuarioBanco();
        System.out.println("Ha llegado un nuevo cliente al banco");
        añadirCola(persona2, clientes);
        usuarioBanco persona3 = new usuarioBanco(dniPrueba, nombrePrueba, edadPrueba);
        System.out.println("Ha llegado un nuevo cliente al banco");
        añadirCola(persona3, clientes);
        quitarUsuario(persona3, clientes);
        cambiarPrimero(persona1, clientes);


    }
    public static void añadirCola(usuarioBanco  persona, List<usuarioBanco> clientes) {
        clientes.add(persona);
        System.out.println("El formulario ha sido procesado y recibiras un aviso cuando te toque");
    }
    public static void cambiarPrimero(usuarioBanco  persona, List<usuarioBanco> clientes) {
        clientes.remove(persona);
        System.out.println(persona.getNombre() + " ha terminado sus tramites, que pase el siguiente");
    }
    public static void quitarUsuario(usuarioBanco  persona, List<usuarioBanco> clientes) {
        clientes.remove(persona);
        System.out.println(persona.getNombre() + " se ha cansado de esperar y ha decidido irse");
    }
}
