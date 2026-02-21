package tema5.Colecciones2.Ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Acortador {
        public static void main(String[] args) {
            Map<String,String> Diccionario = new HashMap<>();
            Scanner sc = new Scanner(System.in);

            int opcion =0;
            String clave="";
            String url ="";
            String borrar="";
            String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            String mostrar = "";


            System.out.println("############################################################");
            System.out.println("==================Diccionario de enlaces==================");
            System.out.println("############################################################");

            while (opcion != 5){
                showMenu();
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion){
                    case 1:
                        System.out.println("\n===================");
                        System.out.println("AÑADIR REGISTRO");
                        System.out.println("Dime la url que quieres añadir");
                        url = sc.nextLine();

                        AnyadirUrl(Diccionario,caracteres,url);
                        break;
                    case 2:
                        System.out.println("\n=====================");
                        System.out.println("Resolver direccion");
                        System.out.println("Dime el codigo de la URL que quieres que te muestre");
                        mostrar = sc.nextLine();

                        DevolverDireccion(Diccionario,mostrar);
                        break;
                    case 3:
                        System.out.println("\n===================");
                        System.out.println("BORRAR REGISTRO");
                        System.out.println("Dime el codigo que de la url que quieres borrar");
                        borrar= sc.nextLine();

                        deleteUrl(Diccionario,borrar);
                        break;
                    case 4:
                        System.out.println("\n=====================");
                        System.out.println("Mostrando registro");

                       MostrarDiccionario(Diccionario);
                        break;
                    case 5:
                        System.out.println("##################################################");
                        System.out.println("===============SALIENDO DEL SISTEMA===============");
                        System.out.println("###################################################");
                        break;

                }
            }
        }
        public static void AnyadirUrl(Map<String,String> Diccionario, String caracteres, String url){
            String clave ="";
            Random rn = new Random();
            boolean sigue = false;
            int numr = rn.nextInt(caracteres.length());
            while(!sigue) {
                for (int i = 0; i < 5; i++) {
                    numr = rn.nextInt(caracteres.length());
                    clave += caracteres.charAt(numr);
                }
                if (Diccionario.containsKey(clave)){
                    System.out.println("Se ha generado una clave ya existente, procesando nueva clave");
                    clave = "";
                }else{
                    System.out.println("Clave generada correctamente");
                    sigue = true;
                }
            }

            Diccionario.put(clave,url);
        }
        public static void DevolverDireccion(Map<String,String> Diccionario, String mostrar){
            if(Diccionario.containsKey(mostrar)) {
                System.out.println("La URL guardada con el codigo : " + mostrar + " es : " + Diccionario.get(mostrar));
            }else{
                System.out.println("No se ha encontrado un registro con : " + mostrar);
            }
        }
        public static void MostrarDiccionario(Map<String,String> Diccionario){
            String frase = "";

            if (Diccionario.isEmpty()) {
                System.out.println("No hay urls registradas todavía.");
            }else {
                System.out.println("#############################\nREGISTROS\n############################");
                    for (Map.Entry<String,String> enlace : Diccionario.entrySet()) {
                        System.out.println("Codigo : " + enlace.getKey());
                        System.out.println("URL : " + enlace.getValue());
                    }
            }
            System.out.println(frase);
        }
        public static void deleteUrl(Map<String,String> Diccionario ,String borrado){
            if(Diccionario.containsKey(borrado)) {
                System.out.println("Se ha borrado el registro de la url : " + borrado);
                Diccionario.remove(borrado);
            }else{
                System.out.println("No se ha encontrado un registro con : " + borrado);
            }
        }



        public static void showMenu(){
            System.out.print("==================================\n1-Crear registro\n2-Resolver direccion\n3-Borrar registro\n4-Mostrar registro\n5-Salir\nDime que es lo que quieres hacer : ");
        }
    }