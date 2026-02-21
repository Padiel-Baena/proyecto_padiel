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
        int hora = 0;
        String tipoAnimal;
        int cont = 0;

        int cLobos;
        String desc;
        double longi;


        System.out.println("############################################################");
        System.out.println("==================REGISTRO DEL GUARDABOSQUES==================");
        System.out.println("############################################################");

        while (opcion != 7){
            showMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("\n===================");
                    System.out.println("AÑADIR AVISTAMIENTOS");
                    System.out.println("Dime el tipo de animal");
                    tipoAnimal = sc.nextLine();

                    if(tipoAnimal.equalsIgnoreCase("Lobo") || tipoAnimal.equalsIgnoreCase("Lobos")) {
                        System.out.print("Dime cuantos lobos eran : ");
                        cLobos = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Dime una pequeña descripcion");
                        desc = sc.nextLine();
                        System.out.println("Dime la hora del avistamiento(Unicamente la hora)");
                        hora = sc.nextInt();
                        sc.nextLine();


                        Manadas a = new Manadas(cLobos, desc, hora);
                        AnyadirAvistamiento(cont, a, registro);
                        cont++;
                    } else if (tipoAnimal.equalsIgnoreCase("Serpiente") || tipoAnimal.equalsIgnoreCase("Serpientes")) {

                        System.out.print("Dime la longitud que tenia : ");
                        longi = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Dime su especie");
                        desc = sc.nextLine();
                        System.out.println("Dime la hora del avistamiento(Unicamente la hora)");
                        hora = sc.nextInt();
                        sc.nextLine();

                        Serpientes a = new Serpientes(longi,desc,hora);
                        AnyadirAvistamiento(cont,a,registro);
                        cont++;
                    } else if (tipoAnimal.equalsIgnoreCase("Pajaro") || tipoAnimal.equalsIgnoreCase("Pajaros")) {
                        System.out.print("Dime el peso que tenia : ");
                        longi = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Dime su especie");
                        desc = sc.nextLine();
                        System.out.println("Dime la hora del avistamiento(Unicamente la hora)");
                        hora = sc.nextInt();
                        sc.nextLine();


                        Pajaros a = new Pajaros(longi,desc,hora);
                        AnyadirAvistamiento(cont,a,registro);
                        cont++;
                    }

                    break;
                case 2:
                    System.out.println("\n=====================");
                    System.out.println("AVISTAMIENTOS NOCTURNOS");
                    nocturno = true;
                    MostrarAvistamiento(registro,nocturno);
                    nocturno=false;
                    break;
                case 3:
                    System.out.println("\n===================");
                    System.out.println("AVISTAMIENTOS DIURNOS");
                    MostrarAvistamiento(registro,nocturno);
                    break;
                case 4:
                    System.out.println("\n=====================");
                    System.out.println("Mostrando registro de lobos");

                    tipoAnimal = "Manada";
                    mostrar(tipoAnimal,registro);
                    break;
                case 5:
                    System.out.println("\n=====================");
                    System.out.println("Mostrando registro de serpientes");

                    tipoAnimal = "Serpientes";
                    mostrar(tipoAnimal,registro);
                    break;
                case 6:
                    System.out.println("\n=====================");
                    System.out.println("Mostrando registro de pajaros");

                    tipoAnimal = "Pajaros";
                    mostrar(tipoAnimal,registro);
                    break;
                case 7:
                    System.out.println("##################################################");
                    System.out.println("===============SALIENDO DEL SISTEMA===============");
                    System.out.println("###################################################");
                    break;

            }
        }
    }
    public static void AnyadirAvistamiento(int cont, Animal a,  Map<Integer,Animal> registro){
        registro.put(cont,a);
    }
    public static void MostrarAvistamiento(Map<Integer,Animal> registro, boolean nocturno){
        String frase = "";

        if (registro.isEmpty()) {
            System.out.println("No hay avistamientos registrados todavía.");
        }else {
            if (nocturno) {
                frase = "#############################\nAvistamientos Nocturnos\n############################";
                for (Animal a : registro.values()) {
                    if (a.horaAvistamiento >= 20 || a.horaAvistamiento < 8) {
                        frase += a.toString();
                    }
                }
            } else {
                frase = "#############################\nAvistamientos Diurnos\n############################";
                for (Animal a : registro.values()) {
                    if (a.horaAvistamiento >= 8 && a.horaAvistamiento < 20) {
                        frase += a.toString();

                    }
                }
            }
        }
        System.out.println(frase);
    }

    public static void mostrar(String tipo,Map<Integer,Animal> registro){
        String frase;
        if(tipo.equals("Manada")){
            for( Animal a : registro.values()){
                if(a instanceof Manadas){
                    System.out.println(a.toString() +"\n");
                }
            }
        } else if (tipo.equals("Serpientes")) {
            for( Animal a : registro.values()){
                if(a instanceof Serpientes){
                    System.out.println(a.toString() +"\n");
                }
            }
        }else{
            for( Animal a : registro.values()){
                if(a instanceof Pajaros){
                    System.out.println(a.toString() +"\n");
                }
            }
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
        System.out.print("==================================\n1-Añadir avistamiento\n2-Mostrar avistamientos nocturnos\n3-Mostrar avistamientos diurnos\n4-Mostrar manadas\n5-Mostrar serpientes\n6-Mostrar pajaros\n7-Salir\nDime que es lo que quieres hacer : ");
    }
}

