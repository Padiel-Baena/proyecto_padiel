package tema5.Excepciones;

import java.util.*;

public class E6 {
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

        while (opcion != 3) {
            opcion = comprobarOpcion(sc);
            switch (opcion) {
                case 1:
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
                    while (!edadCorrecta) {
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
                    break;
                case 2 :
                    if (gateria.isEmpty()){
                        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                        System.out.println("PARA PODER VER A LOS GATOS, PRIMERO TIENES QUE AÑADIRLOS");
                        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    }
                    for (Gato g : gateria){
                        System.out.println("=====================================================================");
                        System.out.println(g.toString(g.getNombre(),g.getEdad()));
                        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                        g.hacerRuida();
                        System.out.println("=====================================================================");
                    }
                    break;
                case 3:
                    System.out.println("##################################################");
                    System.out.println("===============SALIENDO DEL SISTEMA===============");
                    System.out.println("###################################################");
                    break;
            }
        }



    }public static void showMenu(){
        System.out.print("1-AÑADIR GATOS\n2-MOSTRAR GATOS\n3-SALIR\nDime que quieres hacer : ");
    }
    public static int comprobarOpcion(Scanner sc) {
        int num = 0;
        while (num <= 0 || num > 3) {
            try {
                showMenu();
                num = sc.nextInt();
                sc.nextLine();
            }catch (InputMismatchException ex){
                System.out.println("ERROR : VALOR NO VALIDO");
                System.out.println(ex.getMessage());
            }
        }
        return num;
    }

}
