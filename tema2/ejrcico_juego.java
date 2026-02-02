package tema2;

import java.util.Random;
import java.util.Scanner;

public class ejrcico_juego {
    public static void main(String[] args) {
        System.out.println("Este es un juego de pelea por turnos, voy a necesitar que me digas los atributos de cada personaje.");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        /*
        #################################
        Ana no he puesto personajes predeterminados porque ya tengo lo del random, y la funcion es mas o menos la misma, ya que te permite no tener que poner los atributos a mano
        Ademas solo te he explicado las cosas al principio, porque el funcionamiento es el mismo, pero cambia el orden de los turnos
        #################################
        */

        String nombre1 = ".";
        String nombre2 = ".";
        String basura = ".";
        String continuar = ".";

        /*
        #################################
        Variables para cadenas
        #################################
         */
        boolean ganaj1 = false;
        boolean ganaj2 = false;
        boolean J1primero = false;
        boolean J2primero = false;
        boolean vel_iguales = false;
        boolean alma_activaj1 = false;
        boolean sed_activaj1 = false;
        boolean velocista_activoj1 = false;
        boolean afilar_activoj1 = false;
        boolean expansion_activoj1 = false;
        boolean alma_activaj2 = false;
        boolean sed_activaj2 = false;
        boolean velocista_activoj2 = false;
        boolean afilar_activoj2 = false;
        boolean expansion_activoj2 = false;
        boolean habilidad_activaj2 = false;
        boolean habilidad_activaj1 = false;
        int timer_almaj1 = 4;
        int coldown_almaj1 = 5;
        int timer_sedj1 = 4;
        int coldown_sedj1 = 5;
        int timer_velocistaj1 = 4;
        int coldown_velocistaj1 = 5;
        int timer_expansionj1 = 3;
        int coldown_expansionj1 = 8;
        int timer_afilarj1 = 3;
        int coldown_afilarj1 = 5;
        int timer_almaj2 = 4;
        int coldown_almaj2 = 5;
        int timer_sedj2 = 4;
        int coldown_sedj2 = 5;
        int timer_velocistaj2 = 4;
        int coldown_velocistaj2 = 5;
        int timer_expansionj2 = 3;
        int coldown_expansionj2 = 8;
        int timer_afilarj2 = 3;
        int coldown_afilarj2 = 5;

        /*
        ##################################
        Variables para definir prioridades
        ##################################
         */

        int randomj1 = random.nextInt(5);
        int randomj2 = random.nextInt(5);
        int randomvel = random.nextInt(20);
        int randomregen = random.nextInt(50) + 1 ;
        int randomnum = random.nextInt(10);
        int contador = 1; //turnos
        int atj1 = 0;
        int atj2 = 0;

        /*
        ###################################
        Variables para atributos posteriores
        ###################################
         */

        int eleccion = 0;
        int Ps = 0;
        int Ps_max = 0;
        int ataque = 0;
        int defensa = 0;
        int velocidad = 0;
        int velocidad_inicialj1 = 0;
        int Ps1 = 0;
        int Ps1_max = 0;
        int ataque1 = 0;
        int defensa1 = 0;
        int velocidad1 = 0;
        int velocidad_inicialj2 = 0;
        int total = Ps + ataque + defensa + velocidad;
        int total1 = Ps1 + ataque1 + defensa1 + velocidad1;
        int pega = 0;
        int pega1 = 0;
        int personaje1 = 0;
        int personaje2 = 0;
        int criticoj1 = 0;
        int criticoj2 = 0;
        int eleccion_habilidades = 0;

        /*
        ##################################
        variables para atributos principales
        ##################################
        */

        /*
        ###############################
        Definicion de atributos del jugador 1
        ################################
         */

        System.out.println("Pulsa 1 si escoges las estadisticas, pulsa 2 si las escoge el sistema");
        personaje1 = sc.nextInt();
        while (personaje1 != 1 && personaje1 != 2) {
            System.out.println("Tienes que elegir el numero 1 o numero 2");
            personaje1 = sc.nextInt();
        }
        switch (personaje1) {
            case 1:
                System.out.println("Dime el nombre del jugador 1");
                basura = sc.nextLine();
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
                break;
            case 2:
                System.out.println("Dime el nombre del jugador 1");
                basura = sc.nextLine();
                nombre1 = sc.nextLine();

                do {
                    Ps = random.nextInt(200) + 1;
                    ataque = random.nextInt(200) + 1;
                    defensa = random.nextInt(200) + 1;
                    velocidad = random.nextInt(200) + 1;
                    total = Ps + ataque + defensa + velocidad;
                    //estadisticas random

                } while ((total != 500));
                System.out.println("Las caracteristicas de " + nombre1 + " son :\n\nPs: " + Ps + "\nAtaque: " + ataque + "\nDefensa: " + defensa + "\nVelocidad: " + velocidad + "\nEl total es " + total);
                break;
        }

        //###################################
        //Eleccion de atributos del jugador 2
        //#################################

        System.out.println("\nPulsa 1 si escoges las estadisticas, pulsa 2 si las escoge el sistema");
        personaje2 = sc.nextInt();
        while (personaje2 != 1 && personaje2 != 2) {
            System.out.println("Tienes que elegir el numero 1 o numero 2");
            personaje2 = sc.nextInt();
        }
        switch (personaje2) {
            case 1:
                System.out.println("Dime el nombre del jugador 2");
                basura = sc.nextLine();
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
                    total1 = Ps1 + ataque1 + defensa1 + velocidad1;
                    if (total1 > 500) {
                        System.out.println("El total de las caracteristicas supera el maximo, vuelve a decirmelas de forma que no superen los 500 puntos en total");
                    }
                }
                basura = sc.nextLine();
                System.out.println("Las caracteristicas de " + nombre2 + " son :\n\nPs: " + Ps1 + "\nAtaque: " + ataque1 + "\nDefensa: " + defensa1 + "\nVelocidad: " + velocidad1 + "\nY el total de atributos es " + total1 + "\n");
                break;
            case 2:
                System.out.println("Dime el nombre del jugador 2");
                basura = sc.nextLine();
                nombre2 = sc.nextLine();
                do {
                    Ps1 = random.nextInt(200) + 1;
                    ataque1 = random.nextInt(200) + 1;
                    defensa1 = random.nextInt(200) + 1;
                    velocidad1 = random.nextInt(200) + 1;
                    total1 = Ps1 + ataque1 + defensa1 + velocidad1;
                }

                while ((total1 != 500));
                //comprobacion estadisticas


                System.out.println("Las caracteristicas de " + nombre2 + " son :\n\nPs: " + Ps1 + "\nAtaque: " + ataque1 + "\nDefensa: " + defensa1 + "\nVelocidad: " + velocidad1 + "\nEl total es " + total1);
                break;
        }

        //######################################################################
        //Definicion de las estadisticas que pueden cambiar durante la partida
        //#####################################################################

        pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
        pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
        criticoj1 = pega + 10;
        criticoj2 = pega1 + 10;
        Ps_max = Ps;
        Ps1_max = Ps1;
        System.out.println("\nPulsa cualquier tecla para continuar");
        continuar = sc.nextLine();
        velocidad_inicialj1 = velocidad;
        velocidad_inicialj2 = velocidad1;

        if (velocidad > velocidad1) {
            J1primero = true;
        } else if (velocidad1 > velocidad){
            J2primero = true;
        }else{
            vel_iguales = true;
        }
        /*
        ##########################
        Decision de comienzo de turno
        ##########################
         */
        /*
        ############################################
        EMPIEZA EL JUEGO
        #############################################
         */
        System.out.println("  /$$$$$$   /$$$$$$  /$$      /$$ /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$$  /$$$$$$        /$$$$$$$$ /$$                /$$$$$ /$$   /$$ /$$$$$$$$  /$$$$$$   /$$$$$$ \n" +
                " /$$__  $$ /$$__  $$| $$$    /$$$|_  $$_/| $$_____/| $$$ | $$|_____ $$  /$$__  $$      | $$_____/| $$               |__  $$| $$  | $$| $$_____/ /$$__  $$ /$$__  $$\n" +
                "| $$  \\__/| $$  \\ $$| $$$$  /$$$$  | $$  | $$      | $$$$| $$     /$$/ | $$  \\ $$      | $$      | $$                  | $$| $$  | $$| $$      | $$  \\__/| $$  \\ $$\n" +
                "| $$      | $$  | $$| $$ $$/$$ $$  | $$  | $$$$$   | $$ $$ $$    /$$/  | $$$$$$$$      | $$$$$   | $$                  | $$| $$  | $$| $$$$$   | $$ /$$$$| $$  | $$\n" +
                "| $$      | $$  | $$| $$  $$$| $$  | $$  | $$__/   | $$  $$$$   /$$/   | $$__  $$      | $$__/   | $$             /$$  | $$| $$  | $$| $$__/   | $$|_  $$| $$  | $$\n" +
                "| $$    $$| $$  | $$| $$\\  $ | $$  | $$  | $$      | $$\\  $$$  /$$/    | $$  | $$      | $$      | $$            | $$  | $$| $$  | $$| $$      | $$  \\ $$| $$  | $$\n" +
                "|  $$$$$$/|  $$$$$$/| $$ \\/  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$ /$$$$$$$$| $$  | $$      | $$$$$$$$| $$$$$$$$      |  $$$$$$/|  $$$$$$/| $$$$$$$$|  $$$$$$/|  $$$$$$/\n" +
                " \\______/  \\______/ |__/     |__/|______/|________/|__/  \\__/|________/|__/  |__/      |________/|________/       \\______/  \\______/ |________/ \\______/  \\______/ \n" +
                "                                                                                                                                                                   \n" +
                "                                                                                                                                                                   \n" +
                "                                                                                                                                                                   ");
        while (!ganaj1 && !ganaj2) {
            ganaj1 = false;
            ganaj2 = false;

            randomregen = random.nextInt(50) + 1 ;
            atj1 = pega + randomj1;
            atj2 = pega1 + randomj2;
            System.out.println("\n" + "*".repeat(300));
            System.out.println("TURNO " + contador);
            contador++;

            if (afilar_activoj1 || alma_activaj1 || sed_activaj1 || expansion_activoj1 || velocista_activoj1) {
                habilidad_activaj1 = true;
            } else {
                habilidad_activaj1 = false;
            }
            if (afilar_activoj2 || alma_activaj2 || sed_activaj2 || expansion_activoj2 || velocista_activoj2) {
                habilidad_activaj2 = true;
            } else {
                habilidad_activaj2 = false;
            }
            //###############################
            //El j1 es mas rapido
            //##############################

            if (J1primero) {
                System.out.println(nombre1 + " ATACA PRIMERO");
                System.out.println(nombre1 + ":" + Ps + " " + "⬤".repeat(Ps) + "◯".repeat(Ps_max - Ps));
                System.out.println(nombre2 + ":" + Ps1 + " " + "⬤".repeat(Ps1) + "◯".repeat(Ps1_max - Ps1));
                System.out.println(nombre1 + " elige 1 para atacar, 2 para curarte, 3 para escoger habilidad");
                eleccion = sc.nextInt();

                while (eleccion != 1 && eleccion != 2 && eleccion != 3) {
                    System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte, 3 para elegir habilidad");
                    eleccion = sc.nextInt();
                }
                switch (eleccion) {

                    case 1://el jugador decide atacar
                        randomj1 = random.nextInt(5);
                        randomnum = random.nextInt(10);
                        atj1 = pega + randomj1;
                        if (!afilar_activoj1) {
                            if (randomnum == 5) {//posibilidad de critico

                                Ps1 = Ps1 - criticoj1;
                                System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN GOLPE CRITICO CON UN TOTAL DE: " + criticoj1 + " PUNTOS DE DAÑO");

                                if (Ps1 <= 0) {
                                    Ps1 = 0;
                                    ganaj1 = true;
                                }

                            } else {//no critico

                                Ps1 = Ps1 - atj1;
                                System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN TOTAL DE: " + atj1 + " PUNTOS DE DAÑO");

                                if (Ps1 <= 0) {
                                    Ps1 = 0;
                                    ganaj1 = true;
                                }
                            }
                        }else{
                            if (randomnum == 5 || randomnum == 7 || randomnum == 2) {//si la habilidad esta atcivada, tiene mas posibilidad de critico

                                Ps1 = Ps1 - criticoj1;
                                System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN GOLPE CRITICO CON UN TOTAL DE: " + criticoj1 + " PUNTOS DE DAÑO");

                                if (Ps1 <= 0) {
                                    Ps1 = 0;
                                    ganaj1 = true;
                                }

                            } else {

                                Ps1 = Ps1 - atj1;
                                System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN TOTAL DE: " + atj1 + " PUNTOS DE DAÑO");

                                if (Ps1 <= 0) {
                                    Ps1 = 0;
                                    ganaj1 = true;
                                }
                            }
                        }
                        break;

                    case 2:
                        if (Ps >= Ps_max) {//si decide curarse pero tiene vida maxima
                            System.out.println("No te puedes curar mas");
                        } else {//para que se cure pero no supere la vida inicial
                            Ps = Ps + randomregen;
                            if (Ps >= Ps_max) {
                                Ps = Ps_max;
                            }
                            System.out.println(nombre1 + " SE HA CURADO ");
                        }
                        break;

                    case 3:
                        //eleccion de habilidades durante el turno
                        System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4-Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                        eleccion_habilidades = sc.nextInt();
                        while (eleccion_habilidades != 1 && eleccion_habilidades != 2 && eleccion_habilidades != 3 && eleccion_habilidades != 4 && eleccion_habilidades != 5) {
                            System.out.println("Ingrese un numero valido para las habilidades");
                            eleccion_habilidades = sc.nextInt();
                        }
                        switch (eleccion_habilidades) {
                            case 1:

                                if (!habilidad_activaj1) {
                                    System.out.println(nombre1 + " ha activado alma de acero");
                                    defensa = defensa * 3;
                                    velocidad = 1;
                                    alma_activaj1 = true;
                                    pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                    pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                } else {
                                    System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }

                                break;
                            case 2:

                                if (!habilidad_activaj1) {
                                    System.out.println(nombre1 + " ha activado sed de sangre");
                                    ataque = ataque * 2;
                                    defensa = defensa / 2;
                                    sed_activaj1 = true;
                                    pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                    pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                } else {
                                    System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 3:
                                if (!habilidad_activaj1) {
                                    System.out.println(nombre1 + " ha activado velocista");
                                    velocidad = velocidad * 3;
                                    velocista_activoj1 = true;
                                } else {
                                    System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 4:
                                if (!habilidad_activaj1) {
                                    System.out.println(nombre1 + " ha activado expansion de dominio");
                                    ataque = ataque * 2;
                                    defensa = defensa * 2;
                                    velocidad = velocidad * 2;
                                    expansion_activoj1 = true;
                                    pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                    pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                } else {
                                    System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 5:
                                if (!habilidad_activaj1) {
                                    System.out.println(nombre1 + " ha activado afilar");
                                    criticoj1 = criticoj1 + 10;
                                    afilar_activoj1 = true;
                                } else {
                                    System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");

                                }
                                break;
                        }
                }

                basura = sc.nextLine();
                System.out.println("\nPulsa cualquier tecla para continuar");
                continuar = sc.nextLine();

                System.out.println(nombre2 + " 1 para atacar, 2 para curarte, 3 para elgir habilidad");
                eleccion = sc.nextInt();

                while (eleccion != 1 && eleccion != 2 && eleccion != 3) {
                    System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte, 3 para elegir habilidad");
                    eleccion = sc.nextInt();
                }
                switch (eleccion) {//turno del otro jugador

                    case 1:
                        randomj2 = random.nextInt(5);
                        randomnum = random.nextInt(10);
                        atj2 = pega1 + randomj2;
                        if (!afilar_activoj2) {
                            if (randomnum == 3) {
                                Ps = Ps - criticoj2;
                                System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + criticoj2 + " PUNTOS DE DAÑO");
                                if (Ps <= 0) {
                                    Ps = 0;
                                    ganaj2 = true;
                                }
                            } else {
                                Ps = Ps - atj2;
                                System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + atj2 + " PUNTOS DE DAÑO");
                                if (Ps <= 0) {
                                    Ps = 0;
                                    ganaj2 = true;

                                }
                            }
                        }else {
                            if (randomnum == 3 || randomnum == 6 || randomnum == 9) {
                                Ps = Ps - criticoj2;
                                System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + criticoj2 + " PUNTOS DE DAÑO");
                                if (Ps <= 0) {
                                    Ps = 0;
                                    ganaj2 = true;
                                }
                            } else {
                                Ps = Ps - atj2;
                                System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + atj2 + " PUNTOS DE DAÑO");
                                if (Ps <= 0) {
                                    Ps = 0;
                                    ganaj2 = true;

                                }
                            }
                        }
                        break;

                    case 2:
                        if (Ps1 >= Ps1_max) {
                            System.out.println("No te puedes curar mas");
                        } else {
                            Ps1 = Ps1 + randomregen;
                            if (Ps1 >= Ps1_max) {
                                Ps1 = Ps1_max;
                            }
                            System.out.println(nombre2 + " SE HA CURADO ");
                        }
                        break;

                    case 3:

                        System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4-Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                        eleccion_habilidades = sc.nextInt();
                        while (eleccion_habilidades != 1 && eleccion_habilidades != 2 && eleccion_habilidades != 3 && eleccion_habilidades != 4 && eleccion_habilidades != 5) {
                            System.out.println("Ingrese un numero valido para las habilidades");
                            eleccion_habilidades = sc.nextInt();
                        }
                        switch (eleccion_habilidades) {
                            case 1:
                                if (!habilidad_activaj2) {
                                    System.out.println(nombre2 + " ha activado alma de acero");
                                    defensa1 = defensa1 * 3;
                                    velocidad1 = 1;
                                    alma_activaj2 = true;
                                    pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                    pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                } else {
                                    System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 2:
                                if (!habilidad_activaj2) {
                                    System.out.println(nombre2 + " ha activado sed de sangre");
                                    ataque1 = ataque1 * 2;
                                    defensa1 = defensa1 / 2;
                                    sed_activaj2 = true;
                                    pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                    pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                } else {
                                    System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 3:
                                if (!habilidad_activaj2) {
                                    System.out.println(nombre2 + " ha activado velocista");
                                    velocidad1 = velocidad1 * 3;
                                    velocista_activoj2 = true;
                                } else {
                                    System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 4:
                                if (!habilidad_activaj2) {
                                    System.out.println(nombre2 + " ha activado expansion de dominio");
                                    ataque1 = ataque1 * 2;
                                    defensa1 = defensa1 * 2;
                                    velocidad1 = velocidad1 * 2;
                                    expansion_activoj2 = true;
                                    pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                    pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                } else {
                                    System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 5:
                                if (!habilidad_activaj2) {
                                    System.out.println(nombre2 + " ha activado afilar");
                                    criticoj2 = criticoj2 + 10;
                                    afilar_activoj2 = true;
                                } else {
                                    System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");

                                }
                                break;
                        }
                }
                System.out.println(nombre1 + ":" + Ps + " " + "⬤".repeat(Ps) + "◯".repeat(Ps_max - Ps));
                System.out.println(nombre2 + ":" + Ps1 + " " + "⬤".repeat(Ps1) + "◯".repeat(Ps1_max - Ps1));

                basura = sc.nextLine();
                System.out.println("\nPulsa cualquier tecla para continuar");
                continuar = sc.nextLine();

            } else if (J2primero) {
                //###############################
                //El j2 es mas rapido
                //###############################

                System.out.println(nombre2 + " ES MAS RAPIDO");

                System.out.println(nombre1 + ":" + Ps + " " + "⬤".repeat(Ps) + "◯".repeat(Ps_max - Ps));
                System.out.println(nombre2 + ":" + Ps1 + " " + "⬤".repeat(Ps1) + "◯".repeat(Ps1_max - Ps1));

                System.out.println(nombre2 + " 1 para atacar, 2 para curarte, 3 para elegir habilidad");
                eleccion = sc.nextInt();

                while (eleccion != 1 && eleccion != 2 && eleccion != 3) {
                    System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte, 3 para elegir habilidad");
                    eleccion = sc.nextInt();
                }
                switch (eleccion) {

                    case 1:
                        randomj2 = random.nextInt(5);
                        randomnum = random.nextInt(10);
                        atj2 = pega1 + randomj2;
                        if (!afilar_activoj2) {
                            if (randomnum == 3) {
                                Ps = Ps - criticoj2;
                                System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + criticoj2 + " PUNTOS DE DAÑO");
                                if (Ps <= 0) {
                                    Ps = 0;
                                    ganaj2 = true;
                                }
                            } else {
                                Ps = Ps - atj2;
                                System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + atj2 + " PUNTOS DE DAÑO");
                                if (Ps <= 0) {
                                    Ps = 0;
                                    ganaj2 = true;

                                }
                            }
                        }else {
                            if (randomnum == 3 || randomnum == 6 || randomnum == 9) {
                                Ps = Ps - criticoj2;
                                System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + criticoj2 + " PUNTOS DE DAÑO");
                                if (Ps <= 0) {
                                    Ps = 0;
                                    ganaj2 = true;
                                }
                            } else {
                                Ps = Ps - atj2;
                                System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + atj2 + " PUNTOS DE DAÑO");
                                if (Ps <= 0) {
                                    Ps = 0;
                                    ganaj2 = true;

                                }
                            }
                        }
                        break;

                    case 2:
                        if (Ps1 >= Ps1_max) {
                            System.out.println("No te puedes curar mas");
                        } else {
                            Ps1 = Ps1 + randomregen;
                            if (Ps1 >= Ps1_max) {
                                Ps1 = Ps1_max;
                            }
                            System.out.println(nombre2 + " SE HA CURADO ");
                        }
                        break;

                    case 3:
                        System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4-Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                        eleccion_habilidades = sc.nextInt();
                        while (eleccion_habilidades != 1 && eleccion_habilidades != 2 && eleccion_habilidades != 3 && eleccion_habilidades != 4 && eleccion_habilidades != 5) {
                            System.out.println("Ingrese un numero valido para las habilidades");
                            eleccion_habilidades = sc.nextInt();
                        }
                        switch (eleccion_habilidades) {
                            case 1:
                                if (!habilidad_activaj2) {
                                    System.out.println(nombre2 + " ha activado alma de acero");
                                    defensa1 = defensa1 * 3;
                                    velocidad1 = 1;
                                    alma_activaj2 = true;
                                    pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                    pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                } else {
                                    System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 2:
                                if (!habilidad_activaj2) {
                                    System.out.println(nombre2 + " ha activado sed de sangre");
                                    ataque1 = ataque1 * 2;
                                    defensa1 = defensa1 / 2;
                                    sed_activaj2 = true;
                                    pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                    pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                } else {
                                    System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 3:
                                if (!habilidad_activaj2) {
                                    System.out.println(nombre2 + " ha activado velocista");
                                    velocidad1 = velocidad1 * 3;
                                    velocista_activoj2 = true;
                                } else {
                                    System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 4:
                                if (!habilidad_activaj2) {
                                    System.out.println(nombre2 + " ha activado expansion de dominio");
                                    ataque1 = ataque1 * 2;
                                    defensa1 = defensa1 * 2;
                                    velocidad1 = velocidad1 * 2;
                                    expansion_activoj2 = true;
                                    pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                    pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                } else {
                                    System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 5:
                                if (!habilidad_activaj2) {
                                    System.out.println(nombre2 + " ha activado afilar");
                                    criticoj2 = criticoj2 + 10;
                                    afilar_activoj2 = true;
                                } else {
                                    System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");

                                }
                                break;
                        }
                }

                basura = sc.nextLine();
                System.out.println("\nPulsa cualquier tecla para continuar");
                continuar = sc.nextLine();

                System.out.println(nombre1 + " 1 para atacar, 2 para curarte, 3 para elegir habilidad");
                eleccion = sc.nextInt();

                while (eleccion != 1 && eleccion != 2 && eleccion != 3) {
                    System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte, 3 para elegir habilidad");
                    eleccion = sc.nextInt();
                }
                switch (eleccion) {

                    case 1:
                        randomj1 = random.nextInt(5);
                        randomnum = random.nextInt(10);
                        atj1 = pega + randomj1;

                        if (!afilar_activoj1) {
                            if (randomnum == 5) {

                                Ps1 = Ps1 - criticoj1;
                                System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN GOLPE CRITICO CON UN TOTAL DE: " + criticoj1 + " PUNTOS DE DAÑO");

                                if (Ps1 <= 0) {
                                    Ps1 = 0;
                                    ganaj1 = true;
                                }

                            } else {

                                Ps1 = Ps1 - atj1;
                                System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN TOTAL DE: " + atj1 + " PUNTOS DE DAÑO");

                                if (Ps1 <= 0) {
                                    Ps1 = 0;
                                    ganaj1 = true;
                                }
                            }
                        } else {
                            if (randomnum == 5 || randomnum == 7 || randomnum == 2) {

                                Ps1 = Ps1 - criticoj1;
                                System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN GOLPE CRITICO CON UN TOTAL DE: " + criticoj1 + " PUNTOS DE DAÑO");

                                if (Ps1 <= 0) {
                                    Ps1 = 0;
                                    ganaj1 = true;
                                }

                            } else {

                                Ps1 = Ps1 - atj1;
                                System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN TOTAL DE: " + atj1 + " PUNTOS DE DAÑO");

                                if (Ps1 <= 0) {
                                    Ps1 = 0;
                                    ganaj1 = true;
                                }
                            }
                        }

                        break;

                        case 2:
                            if (Ps >= Ps_max) {
                                System.out.println("No te puedes curar mas");
                            } else {
                                Ps = Ps + randomregen;
                                if (Ps >= Ps_max) {
                                    Ps = Ps_max;
                                }
                                System.out.println(nombre1 + " SE HA CURADO " + randomregen + " PS");
                            }
                            break;

                        case 3:
                            System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4-Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                            eleccion_habilidades = sc.nextInt();
                            while (eleccion_habilidades != 1 && eleccion_habilidades != 2 && eleccion_habilidades != 3 && eleccion_habilidades != 4 && eleccion_habilidades != 5) {
                                System.out.println("Ingrese un numero valido para las habilidades");
                                eleccion_habilidades = sc.nextInt();
                            }
                            switch (eleccion_habilidades) {
                                case 1:
                                    if (!habilidad_activaj1) {
                                        System.out.println(nombre1 + " ha activado alma de acero");
                                        defensa = defensa * 3;
                                        velocidad = 1;
                                        alma_activaj1 = true;
                                        pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                        pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                    } else {
                                        System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 2:
                                    if (!habilidad_activaj1) {
                                        System.out.println(nombre1 + " ha activado sed de sangre");
                                        ataque = ataque * 2;
                                        defensa = defensa / 2;
                                        sed_activaj1 = true;
                                        pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                        pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                    } else {
                                        System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 3:
                                    if (!habilidad_activaj1) {
                                        System.out.println(nombre1 + " ha activado velocista");
                                        velocidad = velocidad * 3;
                                        velocista_activoj1 = true;
                                    } else {
                                        System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 4:
                                    if (!habilidad_activaj1) {
                                        System.out.println(nombre1 + " ha activado expansion de dominio");
                                        ataque = ataque * 2;
                                        defensa = defensa * 2;
                                        velocidad = velocidad * 2;
                                        expansion_activoj1 = true;
                                        pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                        pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                    } else {
                                        System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 5:
                                    if (!habilidad_activaj1) {
                                        System.out.println(nombre1 + " ha activado afilar");
                                        criticoj1 = criticoj1 + 10;
                                        afilar_activoj1 = true;
                                    } else {
                                        System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");

                                    }
                                    break;
                            }

                }
                System.out.println(nombre1 + ":" + Ps + " " + "⬤".repeat(Ps) + "◯".repeat(Ps_max - Ps));
                System.out.println(nombre2 + ":" + Ps1 + " " + "⬤".repeat(Ps1) + "◯".repeat(Ps1_max - Ps1));

                basura = sc.nextLine();
                System.out.println("\nPulsa cualquier tecla para continuar");
                continuar = sc.nextLine();

            } else if (vel_iguales){

                //#########################################
                //Las velocidades de j1 y j2 son iguales
                //#########################################

                System.out.println("LA VELOCIDAD DE " + nombre1 + " Y " + nombre2 + " ESTA IGUALADA");
                System.out.println(nombre1 + ":" + Ps + " " + "⬤".repeat(Ps) + "◯".repeat(Ps_max - Ps));
                System.out.println(nombre2 + ":" + Ps1 + " " + "⬤".repeat(Ps1) + "◯".repeat(Ps1_max - Ps1));

                randomvel = random.nextInt(20);
                if (randomvel % 2 == 0) {
                    System.out.println(nombre2 + " SE HA LANZADO PRIMERO AL ATAQUE");

                    System.out.println("1 para atacar, 2 para curarte,  3 para elegir habilidades");
                    eleccion = sc.nextInt();
                    while (eleccion != 1 && eleccion != 2 && eleccion != 3) {
                        System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte, 3  para elegir habilidades");
                        eleccion = sc.nextInt();
                    }
                    switch (eleccion) {

                        case 1:
                            randomj2 = random.nextInt(5);
                            randomnum = random.nextInt(10);
                            atj2 = pega1 + randomj2;
                            if (!afilar_activoj2) {
                                if (randomnum == 3) {
                                    Ps = Ps - criticoj2;
                                    System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + criticoj2 + " PUNTOS DE DAÑO");
                                    if (Ps <= 0) {
                                        Ps = 0;
                                        ganaj2 = true;
                                    }
                                } else {
                                    Ps = Ps - atj2;
                                    System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + atj2 + " PUNTOS DE DAÑO");
                                    if (Ps <= 0) {
                                        Ps = 0;
                                        ganaj2 = true;

                                    }
                                }
                            }else {
                                if (randomnum == 3 || randomnum == 6 || randomnum == 9) {
                                    Ps = Ps - criticoj2;
                                    System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + criticoj2 + " PUNTOS DE DAÑO");
                                    if (Ps <= 0) {
                                        Ps = 0;
                                        ganaj2 = true;
                                    }
                                } else {
                                    Ps = Ps - atj2;
                                    System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + atj2 + " PUNTOS DE DAÑO");
                                    if (Ps <= 0) {
                                        Ps = 0;
                                        ganaj2 = true;

                                    }
                                }
                            }
                            break;
                        case 2:
                            if (Ps1 >= Ps1_max) {
                                System.out.println("No te puedes curar mas");
                            } else {
                                Ps1 = Ps1 + randomregen;
                                if (Ps1 >= Ps1_max) {
                                    Ps1 = Ps1_max;
                                }
                                System.out.println(nombre2 + " SE HA CURADO ");
                            }
                            break;

                        case 3:
                            System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4-Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                            eleccion_habilidades = sc.nextInt();
                            while (eleccion_habilidades != 1 && eleccion_habilidades != 2 && eleccion_habilidades != 3 && eleccion_habilidades != 4 && eleccion_habilidades != 5) {
                                System.out.println("Ingrese un numero valido para las habilidades");
                                eleccion_habilidades = sc.nextInt();
                            }
                            switch (eleccion_habilidades) {
                                case 1:
                                    if (!habilidad_activaj2) {
                                        System.out.println(nombre2 + " ha activado alma de acero");
                                        defensa1 = defensa1 * 3;
                                        velocidad1 = 1;
                                        alma_activaj2 = true;
                                        pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                        pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                    } else {
                                        System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 2:
                                    if (!habilidad_activaj2) {
                                        System.out.println(nombre2 + " ha activado sed de sangre");
                                        ataque1 = ataque1 * 2;
                                        defensa1 = defensa1 / 2;
                                        sed_activaj2 = true;
                                        pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                        pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                    } else {
                                        System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 3:
                                    if (!habilidad_activaj2) {
                                        System.out.println(nombre2 + " ha activado velocista");
                                        velocidad1 = velocidad1 * 3;
                                        velocista_activoj2 = true;
                                    } else {
                                        System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 4:
                                    if (!habilidad_activaj2) {
                                        System.out.println(nombre2 + " ha activado expansion de dominio");
                                        ataque1 = ataque1 * 2;
                                        defensa1 = defensa1 * 2;
                                        velocidad1 = velocidad1 * 2;
                                        expansion_activoj2 = true;
                                        pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                        pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                    } else {
                                        System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 5:
                                    if (!habilidad_activaj2) {
                                        System.out.println(nombre2 + " ha activado afilar");
                                        criticoj2 = criticoj2 + 10;
                                        afilar_activoj2 = true;
                                    } else {
                                        System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                            }
                    }
                    basura = sc.nextLine();
                    System.out.println("\nPulsa cualquier tecla para continuar");
                    continuar = sc.nextLine();

                    System.out.println(nombre1 + " 1 para atacar, 2 para curarte, 3 para elegir habilidades");
                    eleccion = sc.nextInt();

                    while (eleccion != 1 && eleccion != 2 && eleccion != 3) {
                        System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte, 3 para elegir habilidades");
                        eleccion = sc.nextInt();
                    }
                    switch (eleccion) {

                        case 1:
                            randomj1 = random.nextInt(5);
                            randomnum = random.nextInt(10);
                            atj1 = pega + randomj1;
                            if (!afilar_activoj1) {
                                if (randomnum == 5) {

                                    Ps1 = Ps1 - criticoj1;
                                    System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN GOLPE CRITICO CON UN TOTAL DE: " + criticoj1 + " PUNTOS DE DAÑO");

                                    if (Ps1 <= 0) {
                                        Ps1 = 0;
                                        ganaj1 = true;
                                    }

                                } else {

                                    Ps1 = Ps1 - atj1;
                                    System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN TOTAL DE: " + atj1 + " PUNTOS DE DAÑO");

                                    if (Ps1 <= 0) {
                                        Ps1 = 0;
                                        ganaj1 = true;
                                    }
                                }
                            }else{
                                if (randomnum == 5 || randomnum == 7 || randomnum == 2) {

                                    Ps1 = Ps1 - criticoj1;
                                    System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN GOLPE CRITICO CON UN TOTAL DE: " + criticoj1 + " PUNTOS DE DAÑO");

                                    if (Ps1 <= 0) {
                                        Ps1 = 0;
                                        ganaj1 = true;
                                    }

                                } else {

                                    Ps1 = Ps1 - atj1;
                                    System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN TOTAL DE: " + atj1 + " PUNTOS DE DAÑO");

                                    if (Ps1 <= 0) {
                                        Ps1 = 0;
                                        ganaj1 = true;
                                    }
                                }
                            }
                            break;

                        case 2:
                            if (Ps >= Ps_max) {
                                System.out.println("No te puedes curar mas");
                            } else {
                                Ps = Ps + randomregen;
                                if (Ps >= Ps_max) {
                                    Ps = Ps_max;
                                }
                                System.out.println(nombre1 + " SE HA CURADO " + randomregen + " PS");
                            }
                            break;

                        case 3:
                            System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4-Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                            eleccion_habilidades = sc.nextInt();
                            while (eleccion_habilidades != 1 && eleccion_habilidades != 2 && eleccion_habilidades != 3 && eleccion_habilidades != 4 && eleccion_habilidades != 5) {
                                System.out.println("Ingrese un numero valido para las habilidades");
                                eleccion_habilidades = sc.nextInt();
                            }
                            switch (eleccion_habilidades) {
                                case 1:
                                    if (!habilidad_activaj1) {
                                        System.out.println(nombre1 + " ha activado alma de acero");
                                        defensa = defensa * 3;
                                        velocidad = 1;
                                        alma_activaj1 = true;
                                        pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                        pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                    } else {
                                        System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 2:
                                    if (!habilidad_activaj1) {
                                        System.out.println(nombre1 + " ha activado sed de sangre");
                                        ataque = ataque * 2;
                                        defensa = defensa / 2;
                                        sed_activaj1 = true;
                                        pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                        pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                    } else {
                                        System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 3:
                                    if (!habilidad_activaj1) {
                                        System.out.println(nombre1 + " ha activado velocista");
                                        velocidad = velocidad * 3;
                                        velocista_activoj1 = true;
                                    } else {
                                        System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 4:
                                    if (!habilidad_activaj1) {
                                        System.out.println(nombre1 + " ha activado expansion de dominio");
                                        ataque = ataque * 2;
                                        defensa = defensa * 2;
                                        velocidad = velocidad * 2;
                                        expansion_activoj1 = true;
                                        pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                        pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                    } else {
                                        System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 5:
                                    if (!habilidad_activaj1) {
                                        System.out.println(nombre1 + " ha activado afilar");
                                        criticoj1 = criticoj1 + 10;
                                        afilar_activoj1 = true;
                                    } else {
                                        System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                            }
                    }
                    System.out.println(nombre1 + ":" + Ps + " " + "⬤".repeat(Ps) + "◯".repeat(Ps_max - Ps));
                    System.out.println(nombre2 + ":" + Ps1 + " " + "⬤".repeat(Ps1) + "◯".repeat(Ps1_max - Ps1));

                    basura = sc.nextLine();
                    System.out.println("\nPulsa cualquier tecla para continuar");
                    continuar = sc.nextLine();

                } else {
                    System.out.println(nombre1 + " SE HA LANZADO AL ATAQUE PRIMERO");

                    System.out.println(nombre1 + " 1 para atacar, 2 para curarte, 3 para elegir habilidades");
                    eleccion = sc.nextInt();

                    while (eleccion != 1 && eleccion != 2 && eleccion != 3) {
                        System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte, 3  para elegir habilidades");
                        eleccion = sc.nextInt();
                    }
                    switch (eleccion) {

                        case 1:
                            randomj1 = random.nextInt(5);
                            randomnum = random.nextInt(10);
                            atj1 = pega + randomj1;
                            if (!afilar_activoj1) {
                                if (randomnum == 5) {

                                    Ps1 = Ps1 - criticoj1;
                                    System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN GOLPE CRITICO CON UN TOTAL DE: " + criticoj1 + " PUNTOS DE DAÑO");

                                    if (Ps1 <= 0) {
                                        Ps1 = 0;
                                        ganaj1 = true;
                                    }

                                } else {

                                    Ps1 = Ps1 - atj1;
                                    System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN TOTAL DE: " + atj1 + " PUNTOS DE DAÑO");

                                    if (Ps1 <= 0) {
                                        Ps1 = 0;
                                        ganaj1 = true;
                                    }
                                }
                            }else{
                                if (randomnum == 5 || randomnum == 7 || randomnum == 2) {

                                    Ps1 = Ps1 - criticoj1;
                                    System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN GOLPE CRITICO CON UN TOTAL DE: " + criticoj1 + " PUNTOS DE DAÑO");

                                    if (Ps1 <= 0) {
                                        Ps1 = 0;
                                        ganaj1 = true;
                                    }

                                } else {

                                    Ps1 = Ps1 - atj1;
                                    System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN TOTAL DE: " + atj1 + " PUNTOS DE DAÑO");

                                    if (Ps1 <= 0) {
                                        Ps1 = 0;
                                        ganaj1 = true;
                                    }
                                }
                            }
                            break;

                        case 2:
                            if (Ps >= Ps_max) {
                                System.out.println("No te puedes curar mas");
                            } else {
                                Ps = Ps + randomregen;
                                if (Ps >= Ps_max) {
                                    Ps = Ps_max;
                                }
                                System.out.println(nombre1 + " SE HA CURADO " + randomregen + " PS");
                            }
                            break;

                        case 3:
                            System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4-Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                            eleccion_habilidades = sc.nextInt();
                            while (eleccion_habilidades != 1 && eleccion_habilidades != 2 && eleccion_habilidades != 3 && eleccion_habilidades != 4 && eleccion_habilidades != 5) {
                                System.out.println("Ingrese un numero valido para las habilidades");
                                eleccion_habilidades = sc.nextInt();
                            }
                            switch (eleccion_habilidades) {
                                case 1:
                                    if (!habilidad_activaj1) {
                                        System.out.println(nombre1 + " ha activado alma de acero");
                                        defensa = defensa * 3;
                                        velocidad = 1;
                                        alma_activaj1 = true;
                                        pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                        pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                    } else {
                                        System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 2:
                                    if (!habilidad_activaj1) {
                                        System.out.println(nombre1 + " ha activado sed de sangre");
                                        ataque = ataque * 2;
                                        defensa = defensa / 2;
                                        sed_activaj1 = true;
                                        pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                        pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                    } else {
                                        System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 3:
                                    if (!habilidad_activaj1) {
                                        System.out.println(nombre1 + " ha activado velocista");
                                        velocidad = velocidad * 3;
                                        velocista_activoj1 = true;
                                    } else {
                                        System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 4:
                                    if (!habilidad_activaj1) {
                                        System.out.println(nombre1 + " ha activado expansion de dominio");
                                        ataque = ataque * 2;
                                        defensa = defensa * 2;
                                        velocidad = velocidad * 2;
                                        expansion_activoj1 = true;
                                        pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                        pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                    } else {
                                        System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 5:
                                    if (!habilidad_activaj1) {
                                        System.out.println(nombre1 + " ha activado afilar");
                                        criticoj1 = criticoj1 + 10;
                                        afilar_activoj1 = true;
                                    } else {
                                        System.out.println(nombre1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                            }
                    }

                    basura = sc.nextLine();
                    System.out.println("\nPulsa cualquier tecla para continuar");
                    continuar = sc.nextLine();

                    System.out.println(nombre2 + " 1 para atacar, 2 para curarte, 3 para elegir habilidades");
                    eleccion = sc.nextInt();

                    while (eleccion != 1 && eleccion != 2 && eleccion != 3) {
                        System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte, 3 para  elegir habilidades");
                        eleccion = sc.nextInt();
                    }
                    switch (eleccion) {

                        case 1:
                            randomj2 = random.nextInt(5);
                            randomnum = random.nextInt(10);
                            atj2 = pega1 + randomj2;
                            if (!afilar_activoj2) {
                                if (randomnum == 3) {
                                    Ps = Ps - criticoj2;
                                    System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + criticoj2 + " PUNTOS DE DAÑO");
                                    if (Ps <= 0) {
                                        Ps = 0;
                                        ganaj2 = true;
                                    }
                                } else {
                                    Ps = Ps - atj2;
                                    System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + atj2 + " PUNTOS DE DAÑO");
                                    if (Ps <= 0) {
                                        Ps = 0;
                                        ganaj2 = true;

                                    }
                                }
                            }else {
                                if (randomnum == 3 || randomnum == 6 || randomnum == 9) {
                                    Ps = Ps - criticoj2;
                                    System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + criticoj2 + " PUNTOS DE DAÑO");
                                    if (Ps <= 0) {
                                        Ps = 0;
                                        ganaj2 = true;
                                    }
                                } else {
                                    Ps = Ps - atj2;
                                    System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + atj2 + " PUNTOS DE DAÑO");
                                    if (Ps <= 0) {
                                        Ps = 0;
                                        ganaj2 = true;

                                    }
                                }
                            }
                            break;

                        case 2:
                            if (Ps1 >= Ps1_max) {
                                System.out.println("No te puedes curar mas");
                            } else {
                                Ps1 = Ps1 + randomregen;
                                if (Ps1 >= Ps1_max) {
                                    Ps1 = Ps1_max;
                                }
                                System.out.println(nombre2 + " SE HA CURADO " + randomregen + " PS");
                            }
                            break;

                        case 3:
                            System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4-Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                            eleccion_habilidades = sc.nextInt();
                            while (eleccion_habilidades != 1 && eleccion_habilidades != 2 && eleccion_habilidades != 3 && eleccion_habilidades != 4 && eleccion_habilidades != 5) {
                                System.out.println("Ingrese un numero valido para las habilidades");
                                eleccion_habilidades = sc.nextInt();
                            }
                            switch (eleccion_habilidades) {
                                case 1:
                                    if (!habilidad_activaj2) {
                                        System.out.println(nombre2 + " ha activado alma de acero");
                                        defensa1 = defensa1 * 3;
                                        velocidad1 = 1;
                                        alma_activaj2 = true;
                                        pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                        pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                    } else {
                                        System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 2:
                                    if (!habilidad_activaj2) {
                                        System.out.println(nombre2 + " ha activado sed de sangre");
                                        ataque1 = ataque1 * 2;
                                        defensa1 = defensa1 / 2;
                                        sed_activaj2 = true;
                                        pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                        pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                    } else {
                                        System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 3:
                                    if (!habilidad_activaj2) {
                                        System.out.println(nombre2 + " ha activado velocista");
                                        velocidad1 = velocidad1 * 3;
                                        velocista_activoj2 = true;
                                    } else {
                                        System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 4:
                                    if (!habilidad_activaj2) {
                                        System.out.println(nombre2 + " ha activado expansion de dominio");
                                        ataque1 = ataque1 * 2;
                                        defensa1 = defensa1 * 2;
                                        velocidad1 = velocidad1 * 2;
                                        expansion_activoj2 = true;
                                        pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                                        pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                                    } else {
                                        System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                    }
                                    break;
                                case 5:
                                    if (!habilidad_activaj2) {
                                        System.out.println(nombre2 + " ha activado afilar");
                                        criticoj2 = criticoj2 + 10;
                                        afilar_activoj2 = true;
                                    } else {
                                        System.out.println(nombre2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");

                                    }
                                    break;
                            }
                    }
                    System.out.println(nombre1 + ":" + Ps + " " + "⬤".repeat(Ps) + "◯".repeat(Ps_max - Ps));
                    System.out.println(nombre2 + ":" + Ps1 + " " + "⬤".repeat(Ps1) + "◯".repeat(Ps1_max - Ps1));

                    basura = sc.nextLine();
                    System.out.println("\nPulsa cualquier tecla para continuar");
                    continuar = sc.nextLine();

                }
            }

            //##################################
            //Comprobaciones de los turnos
            //#################################
            if (timer_almaj1 > 0 && alma_activaj1) {
                timer_almaj1--;
                if (timer_almaj1 == 0) {
                    defensa = defensa * 3;
                    velocidad = velocidad_inicialj1; // restaurar velocidad original
                    alma_activaj1 = false;
                    habilidad_activaj1 = false;
                    System.out.println(nombre1 + " ha perdido el efecto de Alma de acero");
                    pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                    pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                }
            }
                if (timer_almaj2 > 0 && alma_activaj2) {
                    timer_almaj2--;
                    if (timer_almaj2 == 0) {
                        defensa1 = defensa1 * 3;
                        velocidad1 = velocidad_inicialj2; // restaurar velocidad original
                        alma_activaj2 = false;
                        habilidad_activaj2 = false;
                        System.out.println(nombre2 + " ha perdido el efecto de Alma de acero");
                        pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                        pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                    }
                }
            if (timer_sedj1 > 0 && sed_activaj1) {
                timer_sedj1--;
                if (timer_sedj1 == 0) {
                    defensa = defensa * 2;
                    ataque = ataque / 2;
                    sed_activaj1 = false;
                    habilidad_activaj1 = false;
                    System.out.println(nombre1 + " ha perdido el efecto de Sed de sangre");
                    pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                    pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                }
            }
            if (timer_sedj2 > 0 && sed_activaj2) {
                timer_sedj2--;
                if (timer_sedj2 == 0) {
                    defensa1 = defensa1 * 2;
                    ataque1 = ataque1 / 2;
                    sed_activaj2 = false;
                    habilidad_activaj2 = false;
                    System.out.println(nombre2 + " ha perdido el efecto de Sed de sangre");
                    pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                    pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                }
            }
            if (timer_velocistaj1 > 0 && velocista_activoj1) {
                timer_velocistaj1--;
                if (timer_velocistaj1 == 0) {
                    velocidad = velocidad / 3;
                    velocista_activoj1 = false;
                    habilidad_activaj1 = false;
                    System.out.println(nombre1 + " ha perdido el efecto de Velocista");
                }
            }
            if (timer_velocistaj2 > 0 && velocista_activoj2) {
                timer_velocistaj2--;
                if (timer_velocistaj2 == 0) {
                    velocidad1 = velocidad1 / 3;
                    velocista_activoj2 = false;
                    habilidad_activaj2 = false;
                    System.out.println(nombre2 + " ha perdido el efecto de Velocista");
                }
            }
            if (timer_expansionj1 > 0 && expansion_activoj1) {
                timer_expansionj1--;
                if (timer_expansionj1 == 0) {
                    ataque = ataque / 2 ;
                    defensa = defensa / 2;
                    velocidad = velocidad / 2;
                    expansion_activoj1 = false;
                    habilidad_activaj1 = false;
                    System.out.println(nombre1 + " ha perdido el efecto de Expansion de Dominio");
                    pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                    pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                }
            }
            if (timer_expansionj2 > 0 && expansion_activoj2) {
                timer_expansionj2--;
                if (timer_expansionj2 == 0) {
                    ataque1 = ataque1 / 2 ;
                    defensa1 = defensa1 / 2;
                    velocidad1 = velocidad1 / 2;
                    expansion_activoj2 = false;
                    habilidad_activaj2 = false;
                    System.out.println(nombre2 + " ha perdido el efecto de Expansion de Dominio");
                    pega1 = Math.max(1, ((((600 + (ataque1 - defensa) * 4) * 4000) / (4000 + (defensa * 4))) / 40));
                    pega = Math.max(1, ((((600 + (ataque - defensa1) * 4) * 4000) / (4000 + (defensa1 * 4))) / 40));
                }
            }
            if (timer_afilarj1 > 0 && afilar_activoj1) {
                timer_afilarj1--;
                if (timer_afilarj1 == 0) {
                    criticoj1 = criticoj1 - 10;
                    afilar_activoj1 = false;
                    habilidad_activaj1 = false;
                    System.out.println(nombre1 + " ha perdido el efecto de Afilar");
                }
            }
            if (timer_afilarj2 > 0 && afilar_activoj2) {
                timer_afilarj2--;
                if (timer_afilarj2 == 0) {
                    criticoj2 = criticoj2 - 10;
                    afilar_activoj2 = false;
                    habilidad_activaj2 = false;
                    System.out.println(nombre2 + " ha perdido el efecto de Afilar");
                }
            }

                    if (coldown_almaj1 > 0) coldown_almaj1--;
                    if (coldown_sedj1 > 0) coldown_sedj1--;
                    if (coldown_velocistaj1 > 0) coldown_velocistaj1--;
                    if (coldown_expansionj1 > 0) coldown_expansionj1--;
                    if (coldown_afilarj1 > 0) coldown_afilarj1--;
                    if (coldown_almaj2 > 0) coldown_almaj2--;
                    if (coldown_sedj2 > 0) coldown_sedj2--;
                    if (coldown_velocistaj2 > 0) coldown_velocistaj2--;
                    if (coldown_expansionj2 > 0) coldown_expansionj2--;
                    if (coldown_afilarj2 > 0) coldown_afilarj2--;

                    //###################################
                    //Comprobaciones del enfriamiento de las habilidades
                    //#####################################
            if (Ps <= 0 && Ps1 > 0) {
                ganaj2 = true;
            } else if (Ps1 <= 0 && Ps > 0) {
                ganaj1 = true;
            }
            }
        if (ganaj1) {
            System.out.println("    /$$$$$   /$$         /$$   /$$  /$$$$$$         /$$$$$$   /$$$$$$  /$$   /$$  /$$$$$$  /$$$$$$$   /$$$$$$  /$$ /$$ /$$ /$$\n" +
                    "   |__  $$ /$$$$        | $$  | $$ /$$__  $$       /$$__  $$ /$$__  $$| $$$ | $$ /$$__  $$| $$__  $$ /$$__  $$| $$| $$| $$| $$\n" +
                    "      | $$|_  $$        | $$  | $$| $$  \\ $$      | $$  \\__/| $$  \\ $$| $$$$| $$| $$  \\ $$| $$  \\ $$| $$  \\ $$| $$| $$| $$| $$\n" +
                    "      | $$  | $$        | $$$$$$$$| $$$$$$$$      | $$ /$$$$| $$$$$$$$| $$ $$ $$| $$$$$$$$| $$  | $$| $$  | $$| $$| $$| $$| $$\n" +
                    " /$$  | $$  | $$        | $$__  $$| $$__  $$      | $$|_  $$| $$__  $$| $$  $$$$| $$__  $$| $$  | $$| $$  | $$|__/|__/|__/|__/\n" +
                    "| $$  | $$  | $$        | $$  | $$| $$  | $$      | $$  \\ $$| $$  | $$| $$\\  $$$| $$  | $$| $$  | $$| $$  | $$                \n" +
                    "|  $$$$$$/ /$$$$$$      | $$  | $$| $$  | $$      |  $$$$$$/| $$  | $$| $$ \\  $$| $$  | $$| $$$$$$$/|  $$$$$$/ /$$ /$$ /$$ /$$\n" +
                    " \\______/ |______/      |__/  |__/|__/  |__/       \\______/ |__/  |__/|__/  \\__/|__/  |__/|_______/  \\______/ |__/|__/|__/|__/\n" +
                    "                                                                                                                              \n" +
                    "                                                                                                                              \n" +
                    "                                                                                                                              ");
        } else {
            System.out.println("    /$$$$$  /$$$$$$        /$$   /$$  /$$$$$$         /$$$$$$   /$$$$$$  /$$   /$$  /$$$$$$  /$$$$$$$   /$$$$$$  /$$ /$$ /$$ /$$\n" +
                    "   |__  $$ /$$__  $$      | $$  | $$ /$$__  $$       /$$__  $$ /$$__  $$| $$$ | $$ /$$__  $$| $$__  $$ /$$__  $$| $$| $$| $$| $$\n" +
                    "      | $$|__/  \\ $$      | $$  | $$| $$  \\ $$      | $$  \\__/| $$  \\ $$| $$$$| $$| $$  \\ $$| $$  \\ $$| $$  \\ $$| $$| $$| $$| $$\n" +
                    "      | $$  /$$$$$$/      | $$$$$$$$| $$$$$$$$      | $$ /$$$$| $$$$$$$$| $$ $$ $$| $$$$$$$$| $$  | $$| $$  | $$| $$| $$| $$| $$\n" +
                    " /$$  | $$ /$$____/       | $$__  $$| $$__  $$      | $$|_  $$| $$__  $$| $$  $$$$| $$__  $$| $$  | $$| $$  | $$|__/|__/|__/|__/\n" +
                    "| $$  | $$| $$            | $$  | $$| $$  | $$      | $$  \\ $$| $$  | $$| $$\\  $$$| $$  | $$| $$  | $$| $$  | $$                \n" +
                    "|  $$$$$$/| $$$$$$$$      | $$  | $$| $$  | $$      |  $$$$$$/| $$  | $$| $$ \\  $$| $$  | $$| $$$$$$$/|  $$$$$$/ /$$ /$$ /$$ /$$\n" +
                    " \\______/ |________/      |__/  |__/|__/  |__/       \\______/ |__/  |__/|__/  \\__/|__/  |__/|_______/  \\______/ |__/|__/|__/|__/\n" +
                    "                                                                                                                                \n" +
                    "                                                                                                                                \n" +
                    "                                                                                                                                ");
        }
        }
    }