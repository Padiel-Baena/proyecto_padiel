package tema5.Excepciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class E7 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        List<Gato> gateria = new ArrayList<>();
        String nombre;
        int edad;
        int opcion = 0;
        boolean nombreCorrecto = false;
        boolean edadCorrecta = false;

        Gato gato = new Gato();

        System.out.println("#####################################################################################");
        System.out.println("==================BIENVENIDO/A A LA SIMULACION DE CREACION DE GATOS==================");
        System.out.println("#####################################################################################");


        for (int i = 0; i < 5; i++) {
                    nombreCorrecto = false;
                    edadCorrecta = false;
                    System.out.println("#######################################");
                    System.out.println("HAS ELEGIDO LA OPCION DE AÑADIR UN GATO");
                    System.out.println("#######################################");
                    while (!nombreCorrecto) {
                        try {
                            System.out.println("================");
                            System.out.print("NOMBRE DEL GATO : ");
                            nombre = sc.nextLine().toUpperCase();
                            System.out.println("================");

                            gato.setNombre(nombre);

                            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                            System.out.println("NOMBRE : " + nombre + " VALIDO");
                            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                            nombreCorrecto = true;
                        } catch (InputMismatchException ex) {
                            System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
                            System.out.println("ERROR : DATO NO VALIDO");
                            System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
                        } catch (Exception ex) {
                            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
                            System.out.println("ERROR : " + ex.getMessage());
                            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
                        }
                    }

            try {
                System.out.println("===========================");
                System.out.print(" EDAD DE " + gato.getNombre() + " : ");
                edad = sc.nextInt();
                System.out.println("===========================");

                gato.setEdad(edad);

                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                System.out.println(gato.getNombre() + " TIENE : " + edad);
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                edadCorrecta = true;
            } catch (InputMismatchException ex) {
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("ERROR : DATO NO VALIDO");
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
                sc.nextLine();
            } catch (Exception ex) {
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("ERROR : " + ex.getMessage());
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
                sc.nextLine();
            }

            gateria.add(new Gato(gato.getNombre(), gato.getEdad()));
            System.out.println("\nPROCESANDO...");
            Thread.sleep(1500);
            System.out.println(" \n. . . ");
            Thread.sleep(1500);
            System.out.println("\nINFORMACION PROCESADA CON EXITO");
            Thread.sleep(1500);
            System.out.println("\nGATO AÑADIDO\n");
            Thread.sleep(2000);
        }

                    for (Gato g : gateria){
                        System.out.println("=====================================================================");
                        System.out.println(g.toString(g.getNombre(),g.getEdad()));
                        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                        g.hacerRuida();
                        System.out.println("=====================================================================");
                    }

                    System.out.println("##################################################");
                    System.out.println("===============FINALIZANDO PROGRAMA===============");
                    System.out.println("##################################################");

            }
}
