package pruebas;

import java.util.Random;
import java.util.Scanner;

public class juegoV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        String nombreJ1;
        String nombreJ2;

        //###########
        //Variables para turnos
        //###########

        int eleccion = 0; //Decidir que hacer en su turno
        int personajes = 0; // Para escoger personaje
        boolean ganaJ1 = false;
        boolean ganaJ2 = false;
        boolean j1Primero = false;
        boolean velIgual = false;
        int elecHabilidades = 0;
        int contador =0;
        int numVel =0;

        //################
        //Variables para que no sean siempre las mismas estadisticas
        //################

        int randomJ1 = rn.nextInt(5);
        int randomJ2 = rn.nextInt(5);
        int randomVel = rn.nextInt(20);
        int randomRegen = rn.nextInt(50);
        int randomNum = rn.nextInt(10);

        //######################
        //Variables para contadores
        //#####################

        int cont = 1;


        //########################
        //Variables para las estadisticas
        //########################

        int ps = 0;
        int atq =0;
        int def = 0;
        int vel = 0;
        int[] stats = new int[4];

            //$$$$$$$$$
            //Variables del J1
            //$$$$$$$$$

            int psJ1 =0;
            int psMaxJ1=0;
            int atqJ1=0;
            int defJ1=0;
            int velJ1=0;
            int pegaJ1=0;
            int velocidadInicialJ1 = velJ1;

            //$$$$$$$$
            //Variables del J2
            //$$$$$$$$

            int psJ2=0;
            int psMaxJ2=0;
            int atqJ2=0;
            int defJ2=0;
            int velJ2=0;
            int pegaJ2=0;
            int velocidadInicialJ2 = velJ2;

        //################
        //Variables de ataque
        //################

        int golpeJ1;
        int golpeJ2;

        //################
        //Variables para las habilidades
        //################

            //$$$$$$$$$
            //Del J1
            //$$$$$$$$$

            boolean almaAcJ1 = false;
            boolean sedAcJ1 = false;
            boolean velocistaAcJ1 = false;
            boolean afilarAcJ1 = false;
            boolean expansionAcJ1 = false;
            boolean habAcJ1 = false;
            int timerAlmaJ1 = 4;
            int coldownAlmaJ1 = 5;
            int timerSedJ1 = 4;
            int coldownSedJ1 = 5;
            int timerVelocistaJ1 = 4;
            int coldownVelocistaJ1 = 5;
            int timerExpansionJ1 = 3;
            int coldownExpansionJ1 = 8;
            int timerAfilarJ1 = 3;
            int coldownAfilarJ1 = 5;

            //$$$$$$$
            //Del J2
            //$$$$$$$

            boolean almaAcJ2 = false;
            boolean sedAcJ2 = false;
            boolean velocistaAcJ2 = false;
            boolean afilarAcJ2 = false;
            boolean expansionAcJ2 = false;
            boolean habAcJ2 = false;
            int timerAlmaJ2 = 4;
            int coldownAlmaJ2 = 5;
            int timerSedJ2 = 4;
            int coldownSedJ2 = 5;
            int timerVelocistaJ2 = 4;
            int coldownVelocistaJ2 = 5;
            int timerExpansionJ2 = 3;
            int coldownExpansionJ2 = 8;
            int timerAfilarJ2 = 3;
            int coldownAfilarJ2 = 5;


        //##################
        //Momento de seleccion de las estadisticas del J1
        //#################

        System.out.println("Esta es la version mejorada de un jugeo por turnos\nVoy a necesitar que me digas primero tu nombre Jugador 1");
        nombreJ1 = sc.nextLine();

        System.out.println(nombreJ1 + " dime que es lo que quieres.\n1-Escoger estadisticas\n2-Las escoge el sistema");
        personajes = compPersonajes(personajes, sc);

        switch (personajes){
            case 1:
                System.out.println("Primero he de decirte que el maximo por atributo son 200, y el total de estos no puede superar los 500 puntos\n " + nombreJ1 + "  dime tus estadisticas : ");
                stats=estadisticas(ps, atq, vel, def, sc);
                psJ1 = stats[0];
                atqJ1 = stats[1];
                defJ1 = stats[2];
                velJ1 = stats[3];
                break;
            case 2 :
                System.out.println("Generando estadisticas aleatorias...");
                stats=aleatorio(ps,atq,def,vel,rn);
                psJ1 = stats[0];
                atqJ1 = stats[1];
                defJ1 = stats[2];
                velJ1 = stats[3];
                break;
        }
        sc.nextLine();
        System.out.println("Pulsa enter para continuar");
        sc.nextLine();
        System.out.println("Jugador 2 dime tu nombre");
        nombreJ2 = sc.nextLine();
        System.out.println(nombreJ2 + " dime que es lo que quieres.\n1-Escoger estadisticas\n2-Las escoge el sistema");
        personajes = compPersonajes(personajes, sc);
        switch (personajes){
            case 1:
                System.out.println("Primero he de decirte que el maximo por atributo son 200, y el total de estos no puede superar los 500 puntos\n " + nombreJ1 + "  dime tus estadisticas : ");
                stats=estadisticas(ps, atq, vel, def, sc);
                psJ2 = stats[0];
                atqJ2 = stats[1];
                defJ2 = stats[2];
                velJ2 = stats[3];
                break;
            case 2 :
                System.out.println("Generando estadisticas aleatorias...");
                stats=aleatorio(ps,atq,def,vel,rn);
                psJ2 = stats[0];
                atqJ2 = stats[1];
                defJ2 = stats[2];
                velJ2 = stats[3];
                break;
        }
        sc.nextLine();
        psMaxJ1 = psJ1;
        psMaxJ2 = psJ2;
        pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1)*4)*4000)/(4000+(defJ1*4)))/40));
        pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2)*4)*4000)/(4000+(defJ2*4)))/40));


        System.out.println("Las caracteristicas de " + nombreJ1 + " son :\nPs: " + psJ1 + "\nAtaque: " + atqJ1 + "\nDefensa: " + defJ1 + "\nVelocidad: " + velJ1 + "\n");
        System.out.println("Las caracteristicas de " + nombreJ2 + " son :\n\nPs: " + psJ2 + "\nAtaque: " + atqJ2 + "\nDefensa: " + defJ2 + "\nVelocidad: " + velJ2 + "\n");

        System.out.println("Pulsa enter para continuar");
        sc.nextLine();
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


        if (velJ1 > velJ2) {
            j1Primero = true;
        }else if(velJ1 == velJ2){
            velIgual = true;
        }

        velocidadInicialJ1 = velJ1;
        velocidadInicialJ2 = velJ2;
        while (!ganaJ1 && !ganaJ2) {
            golpeJ1 = pegaJ1 + randomJ1;
            golpeJ2 = pegaJ2 + randomJ2;
            System.out.println("\n" + "*".repeat(300));
            System.out.println("TURNO " + contador);
            contador++;
            habAcJ1 = comprobadorHabilidadesJ1(almaAcJ1, sedAcJ1, velocistaAcJ1, afilarAcJ1, expansionAcJ1);
            habAcJ2 = comprobadorHabilidadesJ2(almaAcJ2, sedAcJ2, velocistaAcJ2, afilarAcJ2, expansionAcJ2);
            if (velJ1 == velJ2) {
                numVel = randomVel;
            }
            if (j1Primero || velIgual && numVel % 2 == 0) {
                System.out.println(nombreJ1 + " ATACA PRIMERO");
                System.out.println(nombreJ1 + ":" + psJ1 + " " + "⬤".repeat(psJ1) + "◯".repeat(psMaxJ1 - psJ1));
                System.out.println(nombreJ2 + ":" + psJ2 + " " + "⬤".repeat(psJ2) + "◯".repeat(psMaxJ2 - psJ2));
                eleccion = compuebaEleccion(sc, eleccion);
                switch (eleccion) {
                    case 1:
                        golpeJ1 = ataqueJ1(randomNum, randomJ1, pegaJ1, afilarAcJ1);
                        System.out.println(nombreJ1 + " ha hecho un total de " + golpeJ1 + " de daño");
                        psJ2 -= golpeJ1;
                        ganaJ1 = comprobadorVidaJ2(psJ2, ganaJ1);
                        break;
                    case 2:
                        psJ1 = curacionJ1(randomRegen, psJ1, psMaxJ1, nombreJ1);
                        break;
                    case 3:
                        System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4-Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                        elecHabilidades = sc.nextInt();
                        while (elecHabilidades != 1 && elecHabilidades != 2 && elecHabilidades != 3 && elecHabilidades != 4 && elecHabilidades != 5) {
                            System.out.println("Ingrese un numero valido para las habilidades");
                            elecHabilidades = sc.nextInt();
                        }
                        switch (elecHabilidades) {
                            case 1:
                                if (!habAcJ1) {
                                    System.out.println(nombreJ1 + " ha activado alma de acero");
                                    defJ1 = defJ1 * 3;
                                    velJ1 = 1;
                                    almaAcJ1 = true;
                                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                                } else {
                                    System.out.println(nombreJ1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }

                                break;
                            case 2:

                                if (!habAcJ1) {
                                    System.out.println(nombreJ1 + " ha activado sed de sangre");
                                    atqJ1 = atqJ1 * 2;
                                    defJ1 = defJ1 / 2;
                                    sedAcJ1 = true;
                                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                                } else {
                                    System.out.println(nombreJ1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 3:
                                if (!habAcJ1) {
                                    System.out.println(nombreJ1 + " ha activado velocista");
                                    velJ1 = velJ1 * 3;
                                    velocistaAcJ1 = true;
                                } else {
                                    System.out.println(nombreJ1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 4:
                                if (!habAcJ1) {
                                    System.out.println(nombreJ1 + " ha activado expansion de dominio");
                                    atqJ1 = atqJ1 * 2;
                                    defJ1 = defJ1 * 2;
                                    velJ1 = velJ1 * 2;
                                    expansionAcJ1 = true;
                                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                                } else {
                                    System.out.println(nombreJ1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 5:
                                if (!habAcJ1) {
                                    System.out.println(nombreJ1 + " ha activado afilar");
                                    afilarAcJ1 = true;
                                    randomJ1 = rn.nextInt(15);
                                } else {
                                    System.out.println(nombreJ1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");

                                }
                                break;
                        }
                        break;
                }
                System.out.println(nombreJ1 + ":" + psJ1 + " " + "⬤".repeat(psJ1) + "◯".repeat(psMaxJ1 - psJ1));
                System.out.println(nombreJ2 + ":" + psJ2 + " " + "⬤".repeat(psJ2) + "◯".repeat(psMaxJ2 - psJ2));

                System.out.println("Pulsa enter para continuar");
                sc.nextLine();

                System.out.println(nombreJ2 + " te toca");
                eleccion = compuebaEleccion(sc, eleccion);

                switch (eleccion) {
                    case 1:
                        golpeJ2 = ataqueJ2(randomNum, randomJ2, pegaJ2, afilarAcJ2);
                        System.out.println(nombreJ2 + " ha hecho un total de " + golpeJ2 + " de daño");

                        psJ1 -= golpeJ2;
                        ganaJ2 = comprobadorVidaJ1(psJ1, ganaJ2);
                        break;
                    case 2:
                        psJ2 = curacionJ2(randomRegen, psJ2, psMaxJ2, nombreJ2);
                        break;
                    case 3:
                        System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4-Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                        elecHabilidades = sc.nextInt();
                        while (elecHabilidades != 1 && elecHabilidades != 2 && elecHabilidades != 3 && elecHabilidades != 4 && elecHabilidades != 5) {
                            System.out.println("Ingrese un numero valido para las habilidades");
                            elecHabilidades = sc.nextInt();
                        }
                        switch (elecHabilidades) {
                            case 1:
                                if (!habAcJ2) {
                                    System.out.println(nombreJ2 + " ha activado alma de acero");
                                    defJ2 = defJ2 * 3;
                                    velJ2 = 1;
                                    almaAcJ2 = true;
                                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                                } else {
                                    System.out.println(nombreJ2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }

                                break;
                            case 2:

                                if (!habAcJ2) {
                                    System.out.println(nombreJ2 + " ha activado sed de sangre");
                                    atqJ2 = atqJ2 * 2;
                                    defJ2 = defJ2 / 2;
                                    sedAcJ2 = true;
                                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                                } else {
                                    System.out.println(nombreJ2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 3:
                                if (!habAcJ2) {
                                    System.out.println(nombreJ2 + " ha activado velocista");
                                    velJ2 = velJ2 * 3;
                                    velocistaAcJ2 = true;
                                } else {
                                    System.out.println(nombreJ2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 4:
                                if (!habAcJ2) {
                                    System.out.println(nombreJ2 + " ha activado expansion de dominio");
                                    atqJ2 = atqJ2 * 2;
                                    defJ2 = defJ2 * 2;
                                    velJ2 = velJ2 * 2;
                                    expansionAcJ2 = true;
                                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                                } else {
                                    System.out.println(nombreJ2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 5:
                                if (!habAcJ2) {
                                    System.out.println(nombreJ2 + " ha activado afilar");
                                    afilarAcJ2 = true;
                                    randomJ2 = rn.nextInt(15);
                                } else {
                                    System.out.println(nombreJ2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");

                                }
                                break;
                        }
                        break;
                }
                System.out.println(nombreJ1 + ":" + psJ1 + " " + "⬤".repeat(psJ1) + "◯".repeat(psMaxJ1 - psJ1));
                System.out.println(nombreJ2 + ":" + psJ2 + " " + "⬤".repeat(psJ2) + "◯".repeat(psMaxJ2 - psJ2));

                System.out.println("Pulsa enter para continuar");
                sc.nextLine();
            }
            else {
                System.out.println(nombreJ2 + " Ataca primero");
                eleccion = compuebaEleccion(sc, eleccion);

                switch (eleccion) {
                    case 1:
                        golpeJ2 = ataqueJ2(randomNum, randomJ2, pegaJ2, afilarAcJ2);
                        System.out.println(nombreJ2 + " ha hecho un total de " + golpeJ2 + " de daño");
                        psJ1 -= golpeJ2;
                        ganaJ2 = comprobadorVidaJ1(psJ1, ganaJ2);
                        break;
                    case 2:
                        psJ2 = curacionJ2(randomRegen, psJ2, psMaxJ2, nombreJ2);
                        break;
                    case 3:
                        System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4-Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                        elecHabilidades = sc.nextInt();
                        while (elecHabilidades != 1 && elecHabilidades != 2 && elecHabilidades != 3 && elecHabilidades != 4 && elecHabilidades != 5) {
                            System.out.println("Ingrese un numero valido para las habilidades");
                            elecHabilidades = sc.nextInt();
                        }
                        switch (elecHabilidades) {
                            case 1:
                                if (!habAcJ2) {
                                    System.out.println(nombreJ2 + " ha activado alma de acero");
                                    defJ2 = defJ2 * 3;
                                    velJ2 = 1;
                                    almaAcJ2 = true;
                                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                                } else {
                                    System.out.println(nombreJ2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }

                                break;
                            case 2:

                                if (!habAcJ2) {
                                    System.out.println(nombreJ2 + " ha activado sed de sangre");
                                    atqJ2 = atqJ2 * 2;
                                    defJ2 = defJ2 / 2;
                                    sedAcJ2 = true;
                                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                                } else {
                                    System.out.println(nombreJ2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 3:
                                if (!habAcJ2) {
                                    System.out.println(nombreJ2 + " ha activado velocista");
                                    velJ2 = velJ2 * 3;
                                    velocistaAcJ2 = true;
                                } else {
                                    System.out.println(nombreJ2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 4:
                                if (!habAcJ2) {
                                    System.out.println(nombreJ2 + " ha activado expansion de dominio");
                                    atqJ2 = atqJ2 * 2;
                                    defJ2 = defJ2 * 2;
                                    velJ2 = velJ2 * 2;
                                    expansionAcJ2 = true;
                                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                                } else {
                                    System.out.println(nombreJ2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 5:
                                if (!habAcJ2) {
                                    System.out.println(nombreJ2 + " ha activado afilar");
                                    afilarAcJ2 = true;
                                    randomJ2 = rn.nextInt(15);

                                } else {
                                    System.out.println(nombreJ2 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");

                                }
                                break;
                        }
                        break;
                }
                System.out.println(nombreJ1 + ":" + psJ1 + " " + "⬤".repeat(psJ1) + "◯".repeat(psMaxJ1 - psJ1));
                System.out.println(nombreJ2 + ":" + psJ2 + " " + "⬤".repeat(psJ2) + "◯".repeat(psMaxJ2 - psJ2));

                System.out.println("Pulsa enter para continuar");
                sc.nextLine();

                System.out.println(nombreJ1 + " te toca");

                eleccion = compuebaEleccion(sc, eleccion);
                switch (eleccion) {
                    case 1:
                        golpeJ1 = ataqueJ1(randomNum, randomJ1, pegaJ1, afilarAcJ1);
                        System.out.println(nombreJ1 + " ha hecho un total de " + golpeJ1 + " de daño");
                        psJ2 -= golpeJ1;
                        ganaJ1 = comprobadorVidaJ2(psJ2, ganaJ1);
                        break;
                    case 2:
                        psJ1 = curacionJ1(randomRegen, psJ1, psMaxJ1, nombreJ1);
                        break;
                    case 3:
                        System.out.println("Elige las habilidades que quieres que tenga tu personaje\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4-Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
                        elecHabilidades = sc.nextInt();
                        while (elecHabilidades != 1 && elecHabilidades != 2 && elecHabilidades != 3 && elecHabilidades != 4 && elecHabilidades != 5) {
                            System.out.println("Ingrese un numero valido para las habilidades");
                            elecHabilidades = sc.nextInt();
                        }
                        switch (elecHabilidades) {
                            case 1:
                                if (!habAcJ1) {
                                    System.out.println(nombreJ1 + " ha activado alma de acero");
                                    defJ1 = defJ1 * 3;
                                    velJ1 = 1;
                                    almaAcJ1 = true;
                                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                                } else {
                                    System.out.println(nombreJ1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }

                                break;
                            case 2:

                                if (!habAcJ1) {
                                    System.out.println(nombreJ1 + " ha activado sed de sangre");
                                    atqJ1 = atqJ1 * 2;
                                    defJ1 = defJ1 / 2;
                                    sedAcJ1 = true;
                                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                                } else {
                                    System.out.println(nombreJ1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 3:
                                if (!habAcJ1) {
                                    System.out.println(nombreJ1 + " ha activado velocista");
                                    velJ1 = velJ1 * 3;
                                    velocistaAcJ1 = true;
                                } else {
                                    System.out.println(nombreJ1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 4:
                                if (!habAcJ1) {
                                    System.out.println(nombreJ1 + " ha activado expansion de dominio");
                                    atqJ1 = atqJ1 * 2;
                                    defJ1 = defJ1 * 2;
                                    velJ1 = velJ1 * 2;
                                    expansionAcJ1 = true;
                                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                                } else {
                                    System.out.println(nombreJ1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");
                                }
                                break;
                            case 5:
                                if (!habAcJ1) {
                                    System.out.println(nombreJ1 + " ha activado afilar");
                                    afilarAcJ1 = true;
                                    randomJ1 = rn.nextInt(15);
                                } else {
                                    System.out.println(nombreJ1 + "Ya tenia una habilidad activa, ha intentando activar otra y ha fallado");

                                }
                                break;
                        }
                        break;
                }
                System.out.println("Pulsa enter para continuar");
                sc.nextLine();
            }
            if (timerAlmaJ1 > 0 && almaAcJ1) {
                timerAlmaJ1--;
                if (timerAlmaJ1 == 0) {
                    defJ1 = defJ1 * 3;
                    velJ1 = velocidadInicialJ1; // restaurar velocidad original
                    almaAcJ1 = false;
                    habAcJ1 = false;
                    System.out.println(nombreJ1 + " ha perdido el efecto de Alma de acero");
                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                }
            }
            if (timerAlmaJ2 > 0 && almaAcJ2) {
                timerAlmaJ2--;
                if (timerAlmaJ2 == 0) {
                    defJ2 = defJ2 * 3;
                    velJ2 = velocidadInicialJ2; // restaurar velocidad original
                    almaAcJ2 = false;
                    habAcJ2 = false;
                    System.out.println(nombreJ2 + " ha perdido el efecto de Alma de acero");
                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                }
            }
            if (timerSedJ1 > 0 && sedAcJ1) {
                timerSedJ1--;
                if (timerSedJ1 == 0) {
                    defJ1 = defJ1 * 2;
                    atqJ1 = atqJ1 / 2;
                    sedAcJ1 = false;
                    habAcJ1 = false;
                    System.out.println(nombreJ1 + " ha perdido el efecto de Sed de sangre");
                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                }
            }
            if (timerSedJ2 > 0 && sedAcJ2) {
                timerSedJ2--;
                if (timerSedJ2 == 0) {
                    defJ2 = defJ2 * 2;
                    atqJ2 = atqJ2 / 2;
                    sedAcJ2 = false;
                    habAcJ2 = false;
                    System.out.println(nombreJ2 + " ha perdido el efecto de Sed de sangre");
                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                }
            }
            if (timerVelocistaJ1 > 0 && velocistaAcJ1) {
                timerVelocistaJ1--;
                if (timerVelocistaJ1 == 0) {
                    velJ1 = velJ1 / 3;
                    velocistaAcJ1 = false;
                    habAcJ1 = false;
                    System.out.println(nombreJ1 + " ha perdido el efecto de Velocista");
                }
            }
            if (timerVelocistaJ2 > 0 && velocistaAcJ2) {
                timerVelocistaJ2--;
                if (timerVelocistaJ2 == 0) {
                    velJ2 = velJ2 / 3;
                    velocistaAcJ2 = false;
                    habAcJ2 = false;
                    System.out.println(nombreJ2 + " ha perdido el efecto de Velocista");
                }
            }
            if (timerExpansionJ1 > 0 && expansionAcJ1) {
                timerExpansionJ1--;
                if (timerExpansionJ1 == 0) {
                    atqJ1 = atqJ1 / 2 ;
                    defJ1 = defJ1 / 2;
                    velJ1 = velJ1 / 2;
                    expansionAcJ1 = false;
                    habAcJ1 = false;
                    System.out.println(nombreJ1 + " ha perdido el efecto de Expansion de Dominio");
                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                }
            }
            if (timerExpansionJ2 > 0 && expansionAcJ1) {
                timerExpansionJ2--;
                if (timerExpansionJ2 == 0) {
                    atqJ2 = atqJ2 / 2 ;
                    defJ2 = defJ2 / 2;
                    velJ2 = velJ2 / 2;
                    expansionAcJ1 = false;
                    habAcJ2 = false;
                    System.out.println(nombreJ2 + " ha perdido el efecto de Expansion de Dominio");
                    pegaJ2 = Math.max(1, ((((600 + (atqJ2 - defJ1) * 4) * 4000) / (4000 + (defJ1 * 4))) / 40));
                    pegaJ1 = Math.max(1, ((((600 + (atqJ1 - defJ2) * 4) * 4000) / (4000 + (defJ2 * 4))) / 40));
                }
            }
            if (timerAfilarJ1 > 0 && afilarAcJ1) {
                timerAfilarJ1--;
                if (timerAfilarJ1 == 0) {
                    randomJ1 = rn.nextInt(5);
                    afilarAcJ1 = false;
                    habAcJ1 = false;
                    System.out.println(nombreJ1 + " ha perdido el efecto de Afilar");
                }
            }
            if (timerAfilarJ2 > 0 && afilarAcJ2) {
                timerAfilarJ2--;
                if (timerAfilarJ2 == 0) {
                    randomJ2 = rn.nextInt(5);
                    afilarAcJ2 = false;
                    habAcJ2 = false;
                    System.out.println(nombreJ2 + " ha perdido el efecto de Afilar");
                }
            }

            if (coldownAlmaJ1 > 0) coldownAlmaJ1--;
            if (coldownSedJ1 > 0) coldownSedJ1--;
            if (coldownVelocistaJ1 > 0) coldownVelocistaJ1--;
            if (coldownExpansionJ1 > 0) coldownExpansionJ1--;
            if (coldownAfilarJ1 > 0) coldownAfilarJ1--;
            if (coldownAlmaJ2 > 0) coldownAlmaJ2--;
            if (coldownSedJ2 > 0) coldownSedJ2--;
            if (coldownVelocistaJ2 > 0) coldownVelocistaJ2--;
            if (coldownExpansionJ2 > 0) coldownExpansionJ2--;
            if (coldownAfilarJ2 > 0) coldownAfilarJ2--;
        }
        if (ganaJ1) {
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


    public static int compPersonajes(int personajes, Scanner sc){
        personajes = sc.nextInt();
        while (personajes != 1 && personajes != 2){
            System.out.println("Elige 1 o 2, para colocar las estadisticas manualmente o que se generen");
            personajes= sc.nextInt();
        }
        return personajes;
    }


    public static int[] estadisticas (int ps, int atq, int vel, int def, Scanner sc){
        int [] stats = new int[4];
        int total = 0;
        while (total != 500){
        System.out.print("Dime tus PS : ");
        ps = sc.nextInt();
        while (0 >= ps || ps > 200) {
            System.out.println("El atributo de vida no es correcto, vuelve a ponerlo");
            ps = sc.nextInt();
        }
        total += ps;
        System.out.print("Dime tu ataque : ");
        atq = sc.nextInt();
        while (0 >= atq || atq > 200) {
            System.out.println("El atributo de ataque no es correcto, vuelve a ponerlo");
            atq = sc.nextInt();
        }
        total += atq;
        System.out.print("Dime tu defensa : ");
        def = sc.nextInt();
        while (0 >= def || def > 200) {
            System.out.println("El atributo de defensa no es correcto, vuelve a ponerlo");
            def = sc.nextInt();
        }
        total += def;
        System.out.print("Dime tu velocidad : ");
        vel = sc.nextInt();
        while (0 >= vel || vel > 200) {
            System.out.println("El atributo de vida no es correcto, vuelve a ponerlo");
            vel = sc.nextInt();
        }
        total += vel;
            System.out.println("El total de las caracteristicas no es 500, repite la colocacion de atributos");
        }
        stats[0] = ps;
        stats[1]=atq;
        stats[2]=def;
        stats[3]=vel;
        return stats;
    }


    public static int[] aleatorio(int ps, int atq, int vel, int def,Random rn){
        int[] srandom = new int[4];
        int total;
        do {
            ps = rn.nextInt(200) + 1;
            atq = rn.nextInt(200) + 1;
            def = rn.nextInt(200) + 1;
            vel = rn.nextInt(200) + 1;
            total = ps + atq + def + vel;

        } while ((total != 500));
        srandom[0] = ps;
        srandom[1]=atq;
        srandom[2]=def;
        srandom[3]=vel;
        return srandom;
    }


    public static boolean comprobadorHabilidadesJ1(boolean almaAcJ1, boolean sedAcJ1, boolean velocistaAcJ1, boolean afilarAcJ1, boolean expansionAcJ1){
        boolean habAcJ1;
        if (afilarAcJ1 || almaAcJ1 || sedAcJ1 || expansionAcJ1 || velocistaAcJ1) {
            habAcJ1 = true;
        } else {
            habAcJ1 = false;
        }
        return habAcJ1;
    }


    public static boolean comprobadorHabilidadesJ2(boolean almaAcJ2, boolean sedAcJ2, boolean velocistaAcJ2, boolean afilarAcJ2, boolean expansionAcJ2){
        boolean habAcJ2;
        if (afilarAcJ2 || almaAcJ2 || sedAcJ2 || expansionAcJ2 || velocistaAcJ2) {
            habAcJ2 = true;
        } else {
            habAcJ2 = false;
        }
        return habAcJ2;
    }


    public static int compuebaEleccion(Scanner sc, int eleccion){
        System.out.println("Dime que quieres hacer:\n1-Atacar\n2-Curarte\n3-Habilidades");
        eleccion = sc.nextInt();
        while (eleccion != 1 && eleccion != 2 && eleccion != 3) {
            System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte, 3 para elegir habilidad");
            eleccion = sc.nextInt();
        }
        return eleccion;
    }


    public static int ataqueJ1(int randomNum, int randomJ1, int pegaJ1, boolean afilarAcJ1){
        int damage;
        if (!afilarAcJ1) {
            if (randomNum == 5) {//posibilidad de critico
                damage = pegaJ1 + randomJ1;
            } else {//no critico
                damage = pegaJ1;
            }
        }else {
            if (randomNum == 5 || randomNum == 7 || randomNum == 2) {//si la habilidad esta atcivada, tiene mas posibilidad de critico
                damage = pegaJ1 + randomJ1;
            } else {
                damage = pegaJ1;
            }
        }
        return damage;
    }

    public static int ataqueJ2(int randomNum, int randomJ2, int pegaJ2, boolean afilarAcJ2){
        int damage;
        if (!afilarAcJ2) {
            if (randomNum == 3) {//posibilidad de critico
                damage = pegaJ2 + randomJ2;
            } else {//no critico
                damage = pegaJ2;
            }
        }else {
            if (randomNum == 3 || randomNum == 6 || randomNum == 9) {//si la habilidad esta atcivada, tiene mas posibilidad de critico
                damage = pegaJ2 + randomJ2;
            } else {
                damage = pegaJ2;
            }
        }
        return damage;
    }


    public static boolean comprobadorVidaJ1(int psJ1, boolean ganaJ2){
        if (psJ1 <= 0){
            ganaJ2 = true;
        }
        else{
            ganaJ2 = false;
        }
        return ganaJ2;
    }


    public static boolean comprobadorVidaJ2(int psJ2, boolean ganaJ1){
        if (psJ2 <= 0){
            ganaJ1 = true;
        }
        else{
            ganaJ1 = false;
        }
        return ganaJ1;
    }

    public static int curacionJ1(int randomRegen, int psJ1, int psMaxJ1, String nombreJ1){
        if (psJ1 >= psMaxJ1) {//si decide curarse pero tiene vida maxima
            System.out.println("No te puedes curar mas");
        } else {//para que se cure pero no supere la vida inicial
            psJ1 += randomRegen;
            if (psJ1 >= psMaxJ1) {
                psJ1 = psMaxJ1;
            }
            System.out.println(nombreJ1 + " SE HA CURADO ");
        }
        return psJ1;
    }

    public static int curacionJ2(int randomRegen, int psJ2, int psMaxJ2, String nombreJ2){
        if (psJ2 >= psMaxJ2) {//si decide curarse pero tiene vida maxima
            System.out.println("No te puedes curar mas");
        } else {//para que se cure pero no supere la vida inicial
            psJ2 += randomRegen;
            if (psJ2 >= psMaxJ2) {
                psJ2 = psMaxJ2;
            }
            System.out.println(nombreJ2 + " SE HA CURADO ");
        }
        return psJ2;
    }
}