package pruebas;

import java.util.Random;
import java.util.Scanner;

public class copia {
    public static void main(String[] args) {
        System.out.println("Este es un juego de pelea por turnos, voy a necesitar que me digas los atributos de cada personaje.");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String nombre1 = ".";
        String nombre2 = ".";
        String basura = ".";
        String continuar = ".";

        boolean ganaj1 = false;
        boolean ganaj2 = false;
        boolean J1primero = false;
        boolean J2primero = false;

        int randomj1 = random.nextInt(5);
        int randomj2 = random.nextInt(5);
        int randomvel = random.nextInt(20);
        int randomregen = random.nextInt(50);
        int randomnum = random.nextInt(10);
        int contador = 1; //turnos
        int atj1 = 0;
        int atj2 = 0 ;


        int eleccion =0;
        int Ps = 0;
        int Ps_max = 0;
        int ataque = 0;
        int defensa = 0;
        int velocidad = 0;
        int Ps1 = 0;
        int Ps1_max = 0;
        int ataque1 = 0;
        int defensa1 = 0;
        int velocidad1 = 0;
        int total = Ps + ataque + defensa + velocidad;
        int total1 = Ps1 + ataque1 + defensa1 + velocidad1;
        int pega = 0;
        int pega1 = 0;
        int personajes = 0;
        int criticoj1 = 0;
        int criticoj2 = 0;
        int eleccion_habilidades =0;

        //variables

        boolean alma_activaj1 =  false ;
        boolean sed_activaj1 = false ;
        boolean velocista_activoj1 = false ;
        boolean afilar_activoj1 = false;
        boolean expansion_activoj1 = false;
        boolean alma_activaj2 =  false ;
        boolean sed_activaj2 = false ;
        boolean velocista_activoj2 = false ;
        boolean afilar_activoj2 = false;
        boolean expansion_activoj2 = false;
        //habilidades

        System.out.println("Pulsa 1 si escoges las estadisticas, pulsa 2 si las escoge el sistema");
        personajes = sc.nextInt();
        while (personajes != 1 && personajes != 2) {
            System.out.println("Tienes que elegir el numero 1 o numero 2");
            personajes = sc.nextInt();
        }
        //comprobacion de que se ha elegido bien los numeros para el switch
        basura = sc.nextLine();
        //borron de lo que sobra en el buffer
        switch (personajes) {
            //eleccion para aplicar los atributos
            case 1: {
                //los while son una comprobacion de que el valor esta correcto

                System.out.println("Dime el nombre del jugador 1");
                nombre1 = sc.nextLine();
                System.out.println("Dime las caracteristicas de " + nombre1 + "\nLos atributos tienen que estar entre 1 y 200, y el total no puede superar los 500");
                while (total <= 0 || total > 500) {
                    System.out.println("Vida(PS):");
                    Ps = sc.nextInt();
                    while (0 >= Ps || Ps > 200) {
                        System.out.println("El atributo de vida no es correcto, vuelve a ponerlo");
                        Ps = sc.nextInt();
                    }
                    System.out.println("Ataque:");
                    ataque = sc.nextInt();
                    while (0 >= ataque || ataque > 200) {
                        System.out.println("El atributo de atque no es correcto, vuelve a ponerlo");
                        ataque = sc.nextInt();
                    }
                    System.out.println("Defensa:");
                    defensa = sc.nextInt();
                    while (0 >= defensa || defensa > 200) {
                        System.out.println("El atributo de defensa no es correcto, vuelve a ponerlo");
                        defensa = sc.nextInt();
                    }
                    System.out.println("Velocidad:");
                    velocidad = sc.nextInt();
                    while (0 >= velocidad || velocidad > 200) {
                        System.out.println("El atributo de velocidad no es correcto, vuelve a ponerlo");
                        velocidad = sc.nextInt();
                    }
                    total = Ps + ataque + defensa + velocidad;
                    if (total > 500) {
                        System.out.println("El total de las caracteristicas supera el maximo, vuelve a decirmelas de forma que no superen los 500 puntos en total");
                    }
                }

                System.out.println("Las caracteristicas de " + nombre1 + " son :\n\nPs: " + Ps + "\nAtaque: " + ataque + "\nDefensa: " + defensa + "\nVelocidad: " + velocidad + "\nY el total de atributos es " + total + "\n");
                //comprobacion estadisticas
                basura = sc.nextLine();
                System.out.println("Dime el nombre del jugador 2");
                nombre2 = sc.nextLine();
                System.out.println("Dime las caracteristicas de " + nombre2);
                while (total1 <= 0 || total1 > 500) {
                    System.out.println("Vida(PS):");
                    Ps1 = sc.nextInt();
                    while (0 >= Ps1 || Ps1 > 200) {
                        System.out.println("El atributo de vida no es correcto, vuelve a ponerlo");
                        Ps1 = sc.nextInt();
                    }
                    System.out.println("Ataque:");
                    ataque1 = sc.nextInt();
                    while (0 >= ataque1 || ataque1 > 200) {
                        System.out.println("El atributo de atque no es correcto, vuelve a ponerlo");
                        ataque1 = sc.nextInt();
                    }
                    System.out.println("Defensa:");
                    defensa1 = sc.nextInt();
                    while (0 >= defensa1 || defensa1 > 200) {
                        System.out.println("El atributo de defensa no es correcto, vuelve a ponerlo");
                        defensa1 = sc.nextInt();
                    }
                    System.out.println("Velocidad:");
                    velocidad1 = sc.nextInt();
                    while (0 >= velocidad1 || velocidad1 > 200) {
                        System.out.println("El atributo de velocidad no es correcto, vuelve a ponerlo");
                        velocidad1 = sc.nextInt();
                    }

                    pega1 = Math.max(1, ((((600 + (ataque1 - defensa)*4)*4000)/(4000+(defensa*4)))/40));
                    pega = Math.max(1, ((((600 + (ataque - defensa1)*4)*4000)/(4000+(defensa1*4)))/40));
                    total1 = Ps1 + ataque1 + defensa1 + velocidad1;
                    criticoj1 = pega + 10;
                    criticoj2 = pega1 + 10;
                    Ps_max =Ps;
                    Ps1_max =Ps1;

                    if (total1 > 500) {
                        System.out.println("El total de las caracteristicas supera el maximo, vuelve a decirmelas de forma que no superen los 500 puntos en total");
                    }
                }
                basura = sc.nextLine();
                System.out.println("Las caracteristicas de " + nombre2 + " son :\n\nPs: " + Ps1 + "\nAtaque: " + ataque1 + "\nDefensa: " + defensa1 + "\nVelocidad: " + velocidad1 + "\nY el total de atributos es " + total + "\n");
                break;
            }

            //comprobacion estadisticas
            case 2: {
                System.out.println("Dime el nombre del jugador 1");
                nombre1 = sc.nextLine();

                do {
                    Ps = random.nextInt(200);
                    ataque = random.nextInt(200);
                    defensa = random.nextInt(200);
                    velocidad = random.nextInt(200);
                    total = Ps + ataque + defensa + velocidad;
                    //estadisticas random

                } while ((total != 500));
                System.out.println("Las caracteristicas de " + nombre1 + " son :\n\nPs: " + Ps + "\nAtaque: " + ataque + "\nDefensa: " + defensa + "\nVelocidad: " + velocidad + "\nEl total es " + total);
                System.out.println("\nDime el nombre del jugador 2");
                nombre2 = sc.nextLine();
                //comprobacion estadisticas

                do {
                    Ps1 = random.nextInt(200);
                    ataque1 = random.nextInt(200);
                    defensa1 = random.nextInt(200);
                    velocidad1 = random.nextInt(200);
                    total1 = Ps1 + ataque1 + defensa1 + velocidad1;

                } while ((total1 != 500));
                //comprobacion estadisticas

                pega1 = Math.max(1, ((((600 + (ataque1 - defensa)*4)*4000)/(4000+(defensa*4)))/40));
                pega = Math.max(1, ((((600 + (ataque - defensa1)*4)*4000)/(4000+(defensa1*4)))/40));
                criticoj1 = pega + 10;
                criticoj2 = pega1 + 10;
                Ps_max= Ps;
                Ps1_max = Ps1;

                System.out.println("Las caracteristicas de " + nombre2 + " son :\n\nPs: " + Ps1 + "\nAtaque: " + ataque1 + "\nDefensa: " + defensa1 + "\nVelocidad: " + velocidad1 + "\nEl total es " + total1);
                break;
            }
        }

        System.out.println("\nPulsa cualquier tecla para continuar");
        continuar= sc.nextLine();

        if (velocidad > velocidad1){
            J1primero = true;
        }else {
            J2primero  = true;
        }

        //empieza el juego
        while (Ps > 0 && Ps1 > 0) {

            atj1 = pega + randomj1;
            atj2 = pega1 + randomj2;
            System.out.println("\n" + "*".repeat(300));
            System.out.println("TURNO " + contador);
            contador++;


            if (J1primero) {
                System.out.println(nombre1 + " ATACA PRIMERO");
                System.out.println(nombre1 + ":"+ Ps + " "+"-".repeat(Ps));
                System.out.println(nombre2 + ":"+ Ps1 + " "+"-".repeat(Ps1));
                System.out.println(nombre1 + " elige 1 para atacar, 2 para curarte, 3 para escoger habilidad");
                eleccion= sc.nextInt();

                while (eleccion!= 1 && eleccion!= 2  && eleccion != 3) {
                    System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte");
                    eleccion= sc.nextInt();
                }
                switch (eleccion){

                    case 1:
                        randomj1 = random.nextInt(5);
                        randomnum = random.nextInt(10);
                        if (randomnum == 5){

                            Ps1 = Ps1 - criticoj1;
                            System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN GOLPE CRITICO CON UN TOTAL DE: " + criticoj1 + " PUNTOS DE DAÑO");

                            if (Ps1 <= 0) {
                                Ps1 = 0;
                                ganaj1 = true;
                                break;
                            }
                            break;

                        }else {

                            Ps1 = Ps1 -atj1;
                            System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN TOTAL DE: " + atj1 + " PUNTOS DE DAÑO");

                            if (Ps1 <= 0) {
                                Ps1 = 0;
                                ganaj1 = true;
                                break;
                            }
                            break;
                        }

                    case 2 :
                        if (Ps >= Ps_max){
                            System.out.println("No te puedes curar mas");
                        }else {
                            Ps = Ps + randomregen;
                            if(Ps >= Ps_max) {
                                Ps = Ps_max;
                            }
                            System.out.println(nombre1 + " SE HA CURADO ");
                        }
                            break;

                    case 3:

                        System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                        eleccion_habilidades = sc.nextInt();
                        while (eleccion_habilidades != 1 && eleccion_habilidades != 2 && eleccion_habilidades != 3 && eleccion_habilidades != 4 && eleccion_habilidades != 5){
                            System.out.println("Ingrese un numero valido para las habilidades");
                            eleccion_habilidades = sc.nextInt();
                        }
                        switch (eleccion_habilidades){
                            case 1:

                                if (!alma_activaj1) {
                                    System.out.println(nombre1 + " ha activado alma de acero");
                                    defensa = defensa * 3;
                                    velocidad = 1;
                                    alma_activaj1 = true;

                                }else{
                                    System.out.println("Alma de acero ya estaba activa, " +nombre1 + " ha intentando activarla otra vez y ha fallado");
                                }

                                break;
                            case 2:

                                if (!sed_activaj1) {
                                    System.out.println(nombre1 + " ha activado sed de sangre");
                                    ataque = ataque * 2;
                                    defensa = defensa / 2;
                                    sed_activaj1 = true;
                                }else{
                                    System.out.println("Sed de sangre ya estaba activa, " +nombre1 + " ha intentando activarla otra vez y ha fallado");
                                }
                                break;
                            case 3:
                                if (!velocista_activoj1) {
                                    System.out.println(nombre1 + " ha activado velocista");
                                    velocidad = velocidad * 3;
                                    velocista_activoj1 = true;
                                }else {
                                    System.out.println("Velocista ya estaba activa" + nombre1 + " ha intentado activarla otra vez y ha fallado");
                                }
                                break;
                            case 4:
                                if (!expansion_activoj1) {
                                    System.out.println(nombre1 + " ha activado expansion de dominio");
                                    ataque = ataque * 2;
                                    defensa = defensa * 2;
                                    velocidad = velocidad * 2;
                                    Ps = Ps * 2;
                                    expansion_activoj1 = true;
                                }else {
                                    System.out.println("Expansión de dominio ya estaba activo" + nombre1 + " ha intentado activarlo otra vez y ha fallado");
                                }
                                break;
                            case 5:
                                if (!afilar_activoj1) {
                                    System.out.println(nombre1 +" ha activado afilar");
                                    criticoj1 = criticoj1 + 10;
                                    afilar_activoj1 = true;
                                }else{
                                    System.out.println("Afilar ya estaba activa" + nombre1 + " ha intentado activarla otra vez y ha fallado");

                                }
                                break;
                        }
                }

                System.out.println(nombre2 + "1 para atacar, 2 para curarte, 3 para elgir habilidad");
                eleccion= sc.nextInt();

                while (eleccion!= 1 && eleccion!= 2 && eleccion != 3){
                    System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte");
                    eleccion= sc.nextInt();
                }
                switch (eleccion){

                    case 1:{
                        randomj2 = random.nextInt(5);
                        randomnum =  random.nextInt(10);
                        if (randomnum == 3){
                            Ps = Ps - criticoj2;
                            System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + atj2 + " PUNTOS DE DAÑO");
                            if (Ps <= 0) {
                                Ps = 0;
                                ganaj2 = true;
                                break;
                            }
                            break;
                        }else {
                            Ps = Ps -atj2;
                            System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + atj2 + " PUNTOS DE DAÑO");
                            if (Ps <= 0) {
                                Ps = 0;
                                ganaj2 = true;

                                break;
                            }
                            break;
                        }
                    }

                    case 2 :
                        if (Ps1 >= Ps1_max){
                            System.out.println("No te puedes curar mas");
                        }
                        else {
                            Ps1 = Ps1 + randomregen;
                            if(Ps1 >= Ps1_max){
                                Ps1 = Ps1_max;
                            }
                            System.out.println(nombre2 + " SE HA CURADO ");
                        }
                        break;

                    case 3:

                        System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                        eleccion_habilidades = sc.nextInt();
                        while (eleccion_habilidades != 1 && eleccion_habilidades != 2 && eleccion_habilidades != 3 && eleccion_habilidades != 4 && eleccion_habilidades != 5){
                            System.out.println("Ingrese un numero valido para las habilidades");
                            eleccion_habilidades = sc.nextInt();
                        }
                        switch (eleccion_habilidades){
                            case 1:
                                if (!alma_activaj2) {
                                    System.out.println(nombre2 + " ha activado alma de acero");
                                    defensa1 = defensa1 * 3;
                                    velocidad1 = 1;
                                    alma_activaj2 = true;
                                    break;
                                }else{
                                    System.out.println("Alma de acero ya estaba activa, " +nombre2 + " ha intentando activarla otra vez y ha fallado");
                                }
                                break;
                            case 2:
                                if (!sed_activaj2) {
                                    System.out.println(nombre2 + " ha activado sed de sangre");
                                    ataque1 = ataque1 * 2;
                                    defensa1 = defensa1 / 2;
                                    sed_activaj2 = true;
                                }else{
                                    System.out.println("Sed de sangre ya estaba activa, " + nombre2 + " ha intentando activarla otra vez y ha fallado");
                                }
                                break;
                            case 3:
                                if (!velocista_activoj2) {
                                    System.out.println(nombre2 + " ha activado velocista");
                                    velocidad1 = velocidad1 * 3;
                                    velocista_activoj2 = true;
                                }else {
                                    System.out.println("Velocista ya estaba activa" + nombre2 + " ha intentado activarla otra vez y ha fallado");
                                }
                                break;
                            case 4:
                                if (!expansion_activoj2) {
                                    System.out.println(nombre2 + " ha activado expansion de dominio");
                                    ataque1 = ataque1 * 2;
                                    defensa1 = defensa1 * 2;
                                    velocidad1 = velocidad1 * 2;
                                    Ps1 = Ps1 * 2;
                                    expansion_activoj2 = true;
                                }else {
                                    System.out.println("Expansión de dominio ya estaba activo" + nombre2 + " ha intentado activarlo otra vez y ha fallado");
                                }
                                break;
                            case 5:
                                if (!afilar_activoj2) {
                                    System.out.println(nombre2 + " ha activado afilar");
                                    criticoj2 = criticoj2 + 10;
                                    afilar_activoj2 = true;
                                }else{
                                    System.out.println("Afilar ya estaba activa" + nombre2 + " ha intentado activarla otra vez y ha fallado");

                                }
                                break;
                        }
                }
                System.out.println(nombre1 + ":"+ Ps + " "+"-".repeat(Ps));
                System.out.println(nombre2 + ":"+ Ps1 + " " + "-".repeat(Ps1));

            } else if (J2primero) {

                System.out.println(nombre2 + " ES MAS RAPIDO");

                System.out.println(nombre1 + ":"+ Ps + " "+"-".repeat(Ps));
                System.out.println(nombre2 + ":"+ Ps1 + " " + "-".repeat(Ps1));

                System.out.println(nombre2 + " 1 para atacar, 2 para curarte, 3 para elegir habilidad");
                eleccion= sc.nextInt();

                while (eleccion!= 1 && eleccion!= 2 && eleccion!= 3){
                    System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte");
                    eleccion= sc.nextInt();
                }
                switch (eleccion){

                    case 1:{
                        randomj2 = random.nextInt(5);
                        randomnum = random.nextInt(10);
                        if (randomnum == 3){
                            Ps = Ps - criticoj2;
                            System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + atj2 + " PUNTOS DE DAÑO");
                            if (Ps <= 0) {
                                Ps = 0;
                                ganaj2 = true;
                            }
                        }else {
                            Ps = Ps -atj2;
                            System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + atj2 + " PUNTOS DE DAÑO");
                            if (Ps <= 0) {
                                Ps = 0;
                                ganaj2 = true;

                            }
                            System.out.println(nombre1 + ":"+ Ps + " "+"-".repeat(Ps));
                            break;
                        }
                    }

                    case 2 :{
                        if (Ps1 >= Ps1_max){
                            System.out.println("No te puedes curar mas");
                        }
                        else {
                            Ps1 = Ps1 + randomregen;
                            if(Ps1 >= Ps1_max){
                                Ps1 = Ps1_max;
                            }
                            System.out.println(nombre2 + " SE HA CURADO ");
                        }
                        break;
                    }
                    case 3:
                        System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                        eleccion_habilidades = sc.nextInt();
                        while (eleccion_habilidades != 1 && eleccion_habilidades != 2 && eleccion_habilidades != 3 && eleccion_habilidades != 4 && eleccion_habilidades != 5){
                            System.out.println("Ingrese un numero valido para las habilidades");
                            eleccion_habilidades = sc.nextInt();
                        }
                        switch (eleccion_habilidades){
                            case 1:
                                if (!alma_activaj2) {
                                    System.out.println(nombre2 + " ha activado alma de acero");
                                    defensa1 = defensa1 * 3;
                                    velocidad1 = 1;
                                    alma_activaj2 = true;
                                }else{
                                    System.out.println("Alma de acero ya estaba activa, " +nombre2 + " ha intentando activarla otra vez y ha fallado");
                                }
                                break;
                            case 2:
                                if (!sed_activaj2) {
                                    System.out.println(nombre2 + " ha activado sed de sangre");
                                    ataque1 = ataque1 * 2;
                                    defensa1 = defensa1 / 2;
                                    sed_activaj2 = true;
                                }else{
                                    System.out.println("Sed de sangre ya estaba activa, " + nombre2 + " ha intentando activarla otra vez y ha fallado");
                                }
                                break;
                            case 3:
                                if (!velocista_activoj2) {
                                    System.out.println(nombre2 + " ha activado velocista");
                                    velocidad1 = velocidad1 * 3;
                                    velocista_activoj2 = true;
                                }else {
                                    System.out.println("Velocista ya estaba activa" + nombre2 + " ha intentado activarla otra vez y ha fallado");
                                }
                                break;
                            case 4:
                                if (!expansion_activoj2) {
                                    System.out.println(nombre2 + " ha activado expansion de dominio");
                                    ataque1 = ataque1 * 2;
                                    defensa1 = defensa1 * 2;
                                    velocidad1 = velocidad1 * 2;
                                    Ps1 = Ps1 * 2;
                                    expansion_activoj2 = true;
                                }else {
                                    System.out.println("Expansión de dominio ya estaba activo" + nombre2 + " ha intentado activarlo otra vez y ha fallado");
                                }
                                break;
                            case 5:
                                if (!afilar_activoj2) {
                                    System.out.println(nombre2 + " ha activado afilar");
                                    criticoj2 = criticoj2 + 10;
                                    afilar_activoj2 = true;
                                }else{
                                    System.out.println("Afilar ya estaba activa" + nombre2 + " ha intentado activarla otra vez y ha fallado");

                                }
                                break;
                        }
                }

                System.out.println("1 para atacar, 2 para curarte");
                eleccion= sc.nextInt();

                while (eleccion!= 1 && eleccion!= 2 && eleccion != 3){
                    System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte");
                    eleccion= sc.nextInt();
                }
                switch (eleccion){

                    case 1:{
                        randomj1 = random.nextInt(5);
                        randomnum = random.nextInt(10);;
                        if (randomnum == 5){
                            Ps1 = Ps1 - criticoj1;
                            System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN TOTAL DE: " + atj1 + " PUNTOS DE DAÑO");
                            if (Ps1 <= 0) {
                                Ps1 = 0;
                                ganaj1 = true;

                            }

                        }else {
                            Ps1 = Ps1 -atj1;
                            System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN TOTAL DE: " + atj1 + " PUNTOS DE DAÑO");
                            if (Ps1 <= 0) {
                                Ps1 = 0;
                                ganaj1 = true;

                            }
                        }
                        break;
                    }

                    case 2 :{
                        if (Ps >= Ps_max){
                            System.out.println("No te puedes curar mas");
                        }
                        else {
                            Ps = Ps + randomregen;
                            if (Ps >= Ps_max) {
                                Ps = Ps_max;
                            }
                            System.out.println(nombre1 + " SE HA CURADO " + randomregen + " PS");
                        }
                        break;
                    }
                    case 3:
                        System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                        eleccion_habilidades = sc.nextInt();
                        while (eleccion_habilidades != 1 && eleccion_habilidades != 2 && eleccion_habilidades != 3 && eleccion_habilidades != 4 && eleccion_habilidades != 5){
                            System.out.println("Ingrese un numero valido para las habilidades");
                            eleccion_habilidades = sc.nextInt();
                        }
                        switch (eleccion_habilidades){
                            case 1:
                                if (!alma_activaj1) {
                                    System.out.println(nombre1 + " ha activado alma de acero");
                                    defensa = defensa * 3;
                                    velocidad = 1;
                                    alma_activaj1 = true;
                                }else{
                                    System.out.println("Alma de acero ya estaba activa, " + nombre1 + " ha intentando activarla otra vez y ha fallado");
                                }
                                break;
                            case 2:
                                if (!sed_activaj1) {
                                    System.out.println(nombre1 + " ha activado sed de sangre");
                                    ataque = ataque * 2;
                                    defensa = defensa / 2;
                                    sed_activaj1 = true;
                                }else{
                                    System.out.println("Sed de sangre ya estaba activa, " + nombre1 + " ha intentando activarla otra vez y ha fallado");
                                }
                                break;
                            case 3:
                                if (!velocista_activoj1) {
                                    System.out.println(nombre1 + " ha activado velocista");
                                    velocidad = velocidad * 3;
                                    velocista_activoj1 = true;
                                }else {
                                    System.out.println("Velocista ya estaba activa" + nombre1 + " ha intentado activarla otra vez y ha fallado");
                                }
                                break;
                            case 4:
                                if (!expansion_activoj1) {
                                    System.out.println(nombre1 + " ha activado expansion de dominio");
                                    ataque = ataque * 2;
                                    defensa = defensa * 2;
                                    velocidad = velocidad * 2;
                                    Ps = Ps * 2;
                                    expansion_activoj1 = true;
                                }else {
                                    System.out.println("Expansión de dominio ya estaba activo" + nombre1 + " ha intentado activarlo otra vez y ha fallado");
                                }
                                break;
                            case 5:
                                if (!afilar_activoj1) {
                                    System.out.println(nombre1 + " ha activado afilar");
                                    criticoj1 = criticoj1 + 10;
                                    afilar_activoj1 = true;
                                }else{
                                    System.out.println("Afilar ya estaba activa" + nombre1 + " ha intentado activarla otra vez y ha fallado");

                                }
                                break;
                        }
                }
                System.out.println(nombre1 + ":"+ Ps + " "+"-".repeat(Ps));
                System.out.println(nombre2 + ":"+ Ps1 + " " + "-".repeat(Ps1));

            } else {

                System.out.println("LA VELOCIDAD DE " + nombre1 + " Y " + nombre2 + " ESTA IGUALADA");
                System.out.println(nombre1 + ":"+ Ps + " "+"-".repeat(Ps));
                System.out.println(nombre2 + ":"+ Ps1 + " " + "-".repeat(Ps1));

                randomvel = random.nextInt(20);
                if (randomvel % 2 == 0) {
                    System.out.println(nombre2 + " SE HA LANZADO PRIMERO AL ATAQUE");

                    System.out.println("1 para atacar, 2 para curarte,  3 para elegir habilidades");
                    eleccion= sc.nextInt();
                    while (eleccion!= 1 && eleccion!= 2 && eleccion != 3){
                        System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte, 3  para elegir habilidades");
                        eleccion= sc.nextInt();
                    }
                    switch (eleccion){

                        case 1:
                            randomj2 = random.nextInt(5);
                            randomnum = random.nextInt(10);
                            if (randomnum == 3){
                                Ps = Ps - criticoj2;
                                System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + atj2 + " PUNTOS DE DAÑO");
                                if (Ps <= 0) {
                                    Ps = 0;
                                    ganaj2 = true;

                                }
                            }else {
                                Ps = Ps -atj2;
                                System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + atj2 + " PUNTOS DE DAÑO");
                                if (Ps <= 0) {
                                    Ps = 0;
                                    ganaj2 = true;

                                }
                            }
                            break;
                        case 2 :
                            if (Ps1 >= Ps1_max){
                                System.out.println("No te puedes curar mas");
                            }
                            else {
                                Ps1 = Ps1 + randomregen;
                                if (Ps1 >= Ps1_max) {
                                    Ps1 = Ps1_max;
                                }
                                System.out.println(nombre2 + " SE HA CURADO ");
                            }
                            break;

                        case 3:
                            System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                            eleccion_habilidades = sc.nextInt();
                            while (eleccion_habilidades != 1 && eleccion_habilidades != 2 && eleccion_habilidades != 3 && eleccion_habilidades != 4 && eleccion_habilidades != 5){
                                System.out.println("Ingrese un numero valido para las habilidades");
                                eleccion_habilidades = sc.nextInt();
                            }
                            switch (eleccion_habilidades){
                                case 1:
                                    if (!alma_activaj2) {
                                        System.out.println(nombre2 + " ha activado alma de acero");
                                        defensa1 = defensa1 * 3;
                                        velocidad1 = 1;
                                        alma_activaj2 = true;
                                    }else{
                                        System.out.println("Alma de acero ya estaba activa, " + nombre2 + " ha intentando activarla otra vez y ha fallado");
                                    }
                                    break;
                                case 2:
                                    if (!sed_activaj2) {
                                        System.out.println(nombre2 + " ha activado sed de sangre");
                                        ataque1 = ataque1 * 2;
                                        defensa1 = defensa1 / 2;
                                        sed_activaj2 = true;
                                    }else{
                                        System.out.println("Sed de sangre ya estaba activa, " + nombre2 + " ha intentando activarla otra vez y ha fallado");
                                    }
                                    break;
                                case 3:
                                    if (!velocista_activoj2) {
                                        System.out.println(nombre2 + " ha activado velocista");
                                        velocidad1 = velocidad1 * 3;
                                        velocista_activoj2 = true;
                                    }else {
                                        System.out.println("Velocista ya estaba activa" + nombre2 + " ha intentado activarla otra vez y ha fallado");
                                    }
                                    break;
                                case 4:
                                    if (!expansion_activoj2) {
                                        System.out.println(nombre2 + " ha activado expansion de dominio");
                                        ataque1 = ataque1 * 2;
                                        defensa1 = defensa1 * 2;
                                        velocidad1 = velocidad1 * 2;
                                        Ps1 = Ps1 * 2;
                                        expansion_activoj2 = true;
                                    }else {
                                        System.out.println("Expansión de dominio ya estaba activo" + nombre2 + " ha intentado activarlo otra vez y ha fallado");
                                    }
                                    break;
                                case 5:
                                    if (!afilar_activoj2) {
                                        System.out.println(nombre2 + " ha activado afilar");
                                        criticoj2 = criticoj2 + 10;
                                        afilar_activoj2 = true;
                                    }else{
                                        System.out.println("Afilar ya estaba activa" + nombre2 + " ha intentado activarla otra vez y ha fallado");

                                    }
                                    break;
                            }
                    }
                    System.out.println("1 para atacar, 2 para curarte, 3 para elegir habilidades");
                    eleccion= sc.nextInt();

                    while (eleccion!= 1 && eleccion!= 2 && eleccion != 3){
                        System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte, 3 para elegir habilidades");
                        eleccion= sc.nextInt();
                    }
                    switch (eleccion){

                        case 1:{
                            randomj1 = random.nextInt(5);
                            randomnum = random.nextInt(10);
                            if (randomnum == 5){
                                Ps1 = Ps1 - criticoj1;
                                System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN TOTAL DE: " + atj1 + " PUNTOS DE DAÑO");
                                if (Ps1 <= 0) {
                                    Ps1 = 0;
                                    ganaj1 = true;

                                }
                            }else {
                                Ps1 = Ps1 -atj1;
                                System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN TOTAL DE: " + atj1 + " PUNTOS DE DAÑO");
                                if (Ps1 <= 0) {
                                    Ps1 = 0;
                                    ganaj1 = true;

                                }
                            }
                            break;
                        }

                        case 2 :{
                            if (Ps >= Ps_max){
                                System.out.println("No te puedes curar mas");
                            }
                            else {
                                Ps = Ps + randomregen;
                                if (Ps >= Ps_max) {
                                    Ps = Ps_max;
                                }
                                System.out.println(nombre1 + " SE HA CURADO " + randomregen + " PS");
                            }
                            break;
                        }
                        case 3:
                            System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                            eleccion_habilidades = sc.nextInt();
                            while (eleccion_habilidades != 1 && eleccion_habilidades != 2 && eleccion_habilidades != 3 && eleccion_habilidades != 4 && eleccion_habilidades != 5){
                                System.out.println("Ingrese un numero valido para las habilidades");
                                eleccion_habilidades = sc.nextInt();
                            }
                            switch (eleccion_habilidades){
                                case 1:
                                    if (!alma_activaj1) {
                                        System.out.println(nombre1 + " ha activado alma de acero");
                                        defensa = defensa * 3;
                                        velocidad = 1;
                                        alma_activaj1 = true;
                                    }else{
                                        System.out.println("Alma de acero ya estaba activa, " + nombre1 + " ha intentando activarla otra vez y ha fallado");
                                    }
                                    break;
                                case 2:
                                    if (!sed_activaj1) {
                                        System.out.println(nombre1 + " ha activado sed de sangre");
                                        ataque = ataque * 2;
                                        defensa = defensa / 2;
                                        sed_activaj1 = true;
                                    }else{
                                        System.out.println("Sed de sangre ya estaba activa, " + nombre1 + " ha intentando activarla otra vez y ha fallado");
                                    }
                                    break;
                                case 3:
                                    if (!velocista_activoj1) {
                                        System.out.println(nombre1 + " ha activado velocista");
                                        velocidad = velocidad * 3;
                                        velocista_activoj1 = true;
                                    }else {
                                        System.out.println("Velocista ya estaba activa" + nombre1 + " ha intentado activarla otra vez y ha fallado");
                                    }
                                    break;
                                case 4:
                                    if (!expansion_activoj1) {
                                        System.out.println(nombre1 + " ha activado expansion de dominio");
                                        ataque = ataque * 2;
                                        defensa = defensa * 2;
                                        velocidad = velocidad * 2;
                                        Ps = Ps * 2;
                                        expansion_activoj1 = true;
                                    }else {
                                        System.out.println("Expansión de dominio ya estaba activo" + nombre1 + " ha intentado activarlo otra vez y ha fallado");
                                    }
                                    break;
                                case 5:
                                    if (!afilar_activoj1) {
                                        System.out.println(nombre1 + " ha activado afilar");
                                        criticoj1 = criticoj1 + 10;
                                        afilar_activoj1 = true;
                                    }else{
                                        System.out.println("Afilar ya estaba activa" + nombre1 + " ha intentado activarla otra vez y ha fallado");

                                    }
                                    break;
                            }
                    }
                    System.out.println(nombre1 + ":"+ Ps + " "+"-".repeat(Ps));
                    System.out.println(nombre2 + ":"+ Ps1 + " " + "-".repeat(Ps1));

                } else {
                    System.out.println(nombre1 + " SE HA LANZADO AL ATAQUE PRIMERO");

                    System.out.println(nombre1 + ":"+ Ps + " "+"-".repeat(Ps));
                    System.out.println(nombre2 + ":"+ Ps1 + " " + "-".repeat(Ps1));

                    System.out.println("1 para atacar, 2 para curarte, 3 para elegir habilidades");
                    eleccion= sc.nextInt();

                    while (eleccion!= 1 && eleccion!= 2 && eleccion != 3){
                        System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte, 3  para elegir habilidades");
                        eleccion= sc.nextInt();
                    }
                    switch (eleccion){

                        case 1:{
                            randomj1 = random.nextInt(5);
                            randomnum = random.nextInt(10);
                            if (randomnum == 5){
                                Ps1 = Ps1 - criticoj1;
                                System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN TOTAL DE: " + atj1 + " PUNTOS DE DAÑO");
                                if (Ps1 <= 0) {
                                    Ps1 = 0;
                                    ganaj1 = true;

                                }
                            }else {
                                Ps1 = Ps1 -atj1;
                                System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN TOTAL DE: " + atj1 + " PUNTOS DE DAÑO");
                                if (Ps1 <= 0) {
                                    Ps1 = 0;
                                    ganaj1 = true;

                                }
                            }
                            break;
                        }

                        case 2 :{
                            if (Ps >= Ps_max){
                                System.out.println("No te puedes curar mas");
                            }
                            else {
                                Ps = Ps + randomregen;
                                if (Ps >= Ps_max) {
                                    Ps = Ps_max;
                                }
                                System.out.println(nombre1 + " SE HA CURADO " + randomregen + " PS");
                            }
                            break;
                        }
                        case 3:
                            System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                            eleccion_habilidades = sc.nextInt();
                            while (eleccion_habilidades != 1 && eleccion_habilidades != 2 && eleccion_habilidades != 3 && eleccion_habilidades != 4 && eleccion_habilidades != 5){
                                System.out.println("Ingrese un numero valido para las habilidades");
                                eleccion_habilidades = sc.nextInt();
                            }
                            switch (eleccion_habilidades){
                                case 1:
                                    if (!alma_activaj1) {
                                        System.out.println(nombre1 + " ha activado alma de acero");
                                        defensa = defensa * 3;
                                        velocidad = 1;
                                        alma_activaj1 = true;
                                    }else{
                                        System.out.println("Alma de acero ya estaba activa, " + nombre1 + " ha intentando activarla otra vez y ha fallado");
                                    }
                                    break;
                                case 2:
                                    if (!sed_activaj1) {
                                        System.out.println(nombre1 + " ha activado sed de sangre");
                                        ataque = ataque * 2;
                                        defensa = defensa / 2;
                                        sed_activaj1 = true;
                                    }else{
                                        System.out.println("Sed de sangre ya estaba activa, " + nombre1 + " ha intentando activarla otra vez y ha fallado");
                                    }
                                    break;
                                case 3:
                                    if (!velocista_activoj1) {
                                        System.out.println(nombre1 + " ha activado velocista");
                                        velocidad = velocidad * 3;
                                        velocista_activoj1 = true;
                                    }else {
                                        System.out.println("Velocista ya estaba activa" + nombre1 + " ha intentado activarla otra vez y ha fallado");
                                    }
                                    break;
                                case 4:
                                    if (!expansion_activoj1) {
                                        System.out.println(nombre1 + " ha activado expansion de dominio");
                                        ataque = ataque * 2;
                                        defensa = defensa * 2;
                                        velocidad = velocidad * 2;
                                        Ps = Ps * 2;
                                        expansion_activoj1 = true;
                                    }else {
                                        System.out.println("Expansión de dominio ya estaba activo" + nombre1 + " ha intentado activarlo otra vez y ha fallado");
                                    }
                                    break;
                                case 5:
                                    if (!afilar_activoj1) {
                                        System.out.println(nombre1 + " ha activado afilar");
                                        criticoj1 = criticoj1 + 10;
                                        afilar_activoj1 = true;
                                    }else{
                                        System.out.println("Afilar ya estaba activa" + nombre1 + " ha intentado activarla otra vez y ha fallado");

                                    }
                                    break;
                            }
                    }

                    System.out.println("1 para atacar, 2 para curarte, 3 para elegir habilidades");
                    eleccion= sc.nextInt();

                    while (eleccion!= 1 && eleccion!= 2 && eleccion != 3){
                        System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte, 3 para  elegir habilidades");
                        eleccion= sc.nextInt();
                    }
                    switch (eleccion) {

                        case 1:{
                            randomj2 = random.nextInt(5);
                            randomnum = random.nextInt(10);
                            if (randomnum == 3){
                                Ps = Ps - criticoj2;
                                System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + atj2 + " PUNTOS DE DAÑO");
                                if (Ps <= 0) {
                                    Ps = 0;
                                    ganaj2 = true;

                                }
                            }else {
                                Ps = Ps -atj2;
                                System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + atj2 + " PUNTOS DE DAÑO");
                                if (Ps <= 0) {
                                    Ps = 0;
                                    ganaj2 = true;

                                }
                            }
                            break;
                        }

                        case 2 :
                            if (Ps1 >= Ps1_max){
                                System.out.println("No te puedes curar mas");
                            }
                            else {
                                Ps1 = Ps1 + randomregen;
                                if (Ps1 >= Ps1_max) {
                                    Ps1 = Ps1_max;
                                }
                                System.out.println(nombre2 + " SE HA CURADO " + randomregen + " PS");
                            }
                            break;

                        case 3:
                            System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                            eleccion_habilidades = sc.nextInt();
                            while (eleccion_habilidades != 1 && eleccion_habilidades != 2 && eleccion_habilidades != 3 && eleccion_habilidades != 4 && eleccion_habilidades != 5){
                                System.out.println("Ingrese un numero valido para las habilidades");
                                eleccion_habilidades = sc.nextInt();
                            }
                            switch (eleccion_habilidades){
                                case 1:
                                    if (!alma_activaj2) {
                                        System.out.println(nombre2 + " ha activado alma de acero");
                                        defensa1 = defensa1 * 3;
                                        velocidad1 = 1;
                                        alma_activaj2 = true;
                                    }else{
                                        System.out.println("Alma de acero ya estaba activa, " + nombre2 + " ha intentando activarla otra vez y ha fallado");
                                    }
                                    break;
                                case 2:
                                    if (!sed_activaj2) {
                                        System.out.println(nombre2 + " ha activado sed de sangre");
                                        ataque1 = ataque1 * 2;
                                        defensa1 = defensa1 / 2;
                                        sed_activaj2 = true;
                                    }else{
                                        System.out.println("Sed de sangre ya estaba activa, " + nombre2 + " ha intentando activarla otra vez y ha fallado");
                                    }
                                    break;
                                case 3:
                                    if (!velocista_activoj2) {
                                        System.out.println(nombre2 + " ha activado velocista");
                                        velocidad1 = velocidad1 * 3;
                                        velocista_activoj2 = true;
                                    }else {
                                        System.out.println("Velocista ya estaba activa" + nombre2 + " ha intentado activarla otra vez y ha fallado");
                                    }
                                    break;
                                case 4:
                                    if (!expansion_activoj2) {
                                        System.out.println(nombre2 + " ha activado expansion de dominio");
                                        ataque1 = ataque1 * 2;
                                        defensa1 = defensa1 * 2;
                                        velocidad1 = velocidad1 * 2;
                                        Ps1 = Ps1 * 2;
                                        expansion_activoj2 = true;
                                    }else {
                                        System.out.println("Expansión de dominio ya estaba activo" + nombre2 + " ha intentado activarlo otra vez y ha fallado");
                                    }
                                    break;
                                case 5:
                                    if (!afilar_activoj2) {
                                        System.out.println(nombre2 + " ha activado afilar");
                                        criticoj2 = criticoj2 + 10;
                                        afilar_activoj2 = true;
                                    }else{
                                        System.out.println("Afilar ya estaba activa" + nombre2 + " ha intentado activarla otra vez y ha fallado");

                                    }
                                    break;
                            }
                    }
                    System.out.println(nombre1 + ":"+ Ps + " "+"-".repeat(Ps));
                    System.out.println(nombre2 + ":"+ Ps1 + " " + "-".repeat(Ps1));
                }
            }
        }

        if (ganaj1) {
            System.out.println("Y EL GANADOR ES: " + nombre1 + "!!!!!!!");
        }else {
            System.out.println("Y EL GANADOR ES: " + nombre2 + "!!!!!!!");
        }
    }
}