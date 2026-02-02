package pruebas;
/*
Aunque no hemos dado lo del try catch, he estado investigando y es la unica forma segura de que si el usuario pone una letra en el momento del switch, no falle el programa, y lo mismo ocurre con el IntegerparseInt, ademas de que son complementarios
 */
import java.util.Scanner;

public class prueba_juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Dime la vida de + nombre");
        int Ps= 0;
            Ps = sc.nextInt();
        while (0 >= Ps|| Ps > 200) {
            System.out.println("El atributo de vida no es correcto, vuelve a ponerlo");
            Ps = sc.nextInt();
        }
        System.out.println("La vida es correcta " + Ps);
        String basura = ".";
        boolean letra = false;
        int personajes = 0;
        String prueba_de_letra = ".";
        System.out.println("Pulsa 1 si escoges las estadisticas, pulsa 2 si las escoge el sistema");
        prueba_de_letra = sc.nextLine();
        if (letra == true) {
            while (letra) {

            }
        }else
        while (personajes != 1 && personajes != 2) {
            System.out.println("Tienes que elegir el numero 1 o numero 2");
            personajes = sc.nextInt();
        }*/

        /*int personajes = 0;
        String comprobacion;

        // 1. Variable booleana para controlar la salida del bucle
        boolean letra = false;

        do {
            System.out.println("Pulsa 1 si escoges las estadísticas, pulsa 2 si las escoge el sistema");

            // Leer siempre como cadena de texto para minimizar errores
            comprobacion = sc.nextLine();

            try {
                // Intentar convertir la cadena a un entero
                personajes = Integer.parseInt(comprobacion);

                // 2. Usar la respuesta del usuario para modificar el boolean
                if (personajes == 1 || personajes == 2) {
                    // Si es 1 o 2, la selección es válida. El boolean pasa a true.
                    letra = true;

                } else {
                    // Si es un número, pero no 1 ni 2. El boolean se mantiene en false.
                    System.out.println("Error! Tienes que elegir el número 1 o número 2. Inténtalo de nuevo.");
                    letra = false;
                }

            } catch (NumberFormatException e) {
                // Si la conversión falla (porque se ingresó una letra o texto),
                // el boolean se mantiene en false.
                System.out.println(Error! Debes ingresar un número (1 o 2), no letras ni otros símbolos. Inténtalo de nuevo.");
                letra = false;
            }

            // 3. El bucle se repite MIENTRAS la variable booleana sea FALSE
        } while (!letra);

        // -------------------------------------------------------------
        // El bucle termina. Ya tienes un valor válido (1 o 2) en 'personajes'.
        // -------------------------------------------------------------

        System.out.println("\n Selección exitosa. Has elegido la opción: " + personajes);

        if (personajes == 1) {
            System.out.println("Ahora se te pedirá que elijas tus estadísticas.");
            // Lógica para elegir estadísticas...
        } else { // personajes == 2
            System.out.println("El sistema generará tus estadísticas automáticamente.");
            // Lógica para generación automática...

         */
/*
        String letra = ".";
        boolean filtro = false;//false
        do {
            System.out.println("1 para elegir las estadisticas, 2 para estadisticas aleatorias");
            letra = sc.nextLine();

            if ((letra.equals("a")) || (letra.equals("b"))) {
                filtro = true;
            }
        } while (filtro == false);
            System.out.println("Has dado un valor incorrecto, vuelve a darme el valor");
            letra = sc.nextLine();
            if ((letra.equals("a")) || (letra.equals("b"))) {
                filtro = true;
        }
        System.out.println("valor correcto");

        int ps = 100;
        System.out.println(nombre1 + ":"+ Ps + " "+"-".repeat(Ps));
        System.out.println(nombre2 + ":"+ Ps1 + " "+"-".repeat(Ps1));

*/
        //int eleccion =0;
        /*eleccion= sc.nextInt();
        while (eleccion!= 1 && eleccion!= 2){
            System.out.println("El valor que me has dado no concuerda con las opciones disponibles, escoge otra o espera a una actualizacion\n1 para atacar, 2 para curarte");
        }
        switch (eleccion){
            case 1:{
                Ps1 = Ps1 - atj1;
                System.out.println(nombre1 + " HA GOLPEADO A " + nombre2 + " HACIENDOLE UN TOTAL DE: " + atj1 + " PUNTOS DE DAÑO");
                if (Ps1 <= 0) {
                    Ps1 = 0;
                    ganaj1 = true;
                    System.out.println(nombre2 + ":"+ Ps1 + " "+"-".repeat(Ps1));
                    break;
                }
            }
            case 2 :{
                Ps = Ps + (Ps*0.3);
            }
        }

         */
       /* switch (eleccion){

            case 1:{
                randomj1 = random.nextInt(5);
                randomj2 = random.nextInt(5);
                randomnum;
                if (randomnum == 5){
                    Ps1 = Ps1 - criticoj1;
                    System.out.println(nombre2 + " HA GOLPEADO A " + nombre1 + " HACIENDOLE UN TOTAL DE: " + atj1 + " PUNTOS DE DAÑO");
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
            }

            case 2 :{
                Ps = Ps + randomregen;
                System.out.println(nombre1 + " SE HA CURADO " + randomregen + " PS");
                break;
            }
        }
*/
       /* case 3:
            System.out.println("elige las habilidades que quieres que tenga tu personaje\nPuedes elegir tres de las siguientes habilidades\n1-Alma de acero: triplica la defensa y te reduce la velocidad a 1.\n2-Sed de sangre: duplica el ataque y reduce la defensa a la mitad.\n3-Velocista, duplica la velocidad.\n4Expansión de dominio: duplica todas las caracteristicas\n5-Afilar:duplica el daño de critico");
            eleccion_habilidades = sc.nextInt();
            while (eleccion_habilidades != 1 && eleccion_habilidades != 2 && eleccion_habilidades != 3 && eleccion_habilidades != 4 && eleccion_habilidades != 5){
                System.out.println("Ingrese un numero valido para las habilidades");
            }
            switch (eleccion_habilidades){
                case 1:
                    if (alma_activa == false) {
                        System.out.println(nombre + " ha activado alma de acero");
                        defensa = defensa * 3;
                        velocidad = 1;
                        alma_activa = true;
                    }else{
                        System.out.println("Alma de acero ya estaba activa, " +nombre + " ha intentando activarla otra vez y ha fallado");
                    }
                    break;
                case 2:
                    if (sed_activa == false) {
                        System.out.println(nombre + " ha activado sed de sangre");
                        ataque = ataque * 2;
                        defensa = defensa / 2;
                        sed_activa = true;
                    }else{
                        System.out.println("Sed de sangre ya estaba activa, " +nombre + " ha intentando activarla otra vez y ha fallado");
                    }
                    break;
                case 3:
                    if (velocista_activo == false) {
                        System.out.println(nombre + " ha activado velocista");
                        velocidad = velocidad * 3;
                        velocista_activo == true;
                    }else {
                        System.out.println("Velocista ya estaba activa" + nombre + " ha intentado activarla otra vez y ha fallado");
                    }
                    break;
                case 4:
                    if (expansion_activo == false) {
                        System.out.println(nombre + " ha activado expansion de dominio");
                        ataque = ataque * 2;
                        defensa = defensa * 2;
                        velocidad = velocidad * 2;
                        Ps = Ps * 2;
                    }else {
                        System.out.println("Expansión de dominio ya estaba activo" + nombre + " ha intentado activarlo otra vez y ha fallado");
                    }
                    break;
                case 5:
                    if (afilar_activo == false) {
                        System.out.println(nombre" ha activado afilar");
                        criticoj = criticoj + 10;
                    }else{
                        System.out.println("Afilar ya estaba activa" + nombre + " ha intentado activarla otra vez y ha fallado");

                    }
                    break;

        */
        /*
        System.out.println("Pulsa 1 si escoges las estadisticas, pulsa 2 si las escoge el sistema");
        personajes = sc.nextInt();
        while (personajes != 1 && personajes != 2) {
            System.out.println("Tienes que elegir el numero 1 o numero 2");
            personajes = sc.nextInt();
        }
        switch (personaje1){
            case 1:
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
            case 2:
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
        }

        System.out.println("Pulsa 1 si escoges las estadisticas, pulsa 2 si las escoge el sistema");
        personajes = sc.nextInt();
        while (personajes != 1 && personajes != 2) {
            System.out.println("Tienes que elegir el numero 1 o numero 2");
            personajes = sc.nextInt();
        }
        switch (personaje2){
            case 1:
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


                    if (total1 > 500) {
                        System.out.println("El total de las caracteristicas supera el maximo, vuelve a decirmelas de forma que no superen los 500 puntos en total");
                    }
                }
                basura = sc.nextLine();
                System.out.println("Las caracteristicas de " + nombre2 + " son :\n\nPs: " + Ps1 + "\nAtaque: " + ataque1 + "\nDefensa: " + defensa1 + "\nVelocidad: " + velocidad1 + "\nY el total de atributos es " + total + "\n");
                break;
            case 2:
                Ps1 = random.nextInt(200);
                ataque1 = random.nextInt(200);
                defensa1 = random.nextInt(200);
                velocidad1 = random.nextInt(200);
                total1 = Ps1 + ataque1 + defensa1 + velocidad1;

        } while ((total1 != 500));
        //comprobacion estadisticas


        System.out.println("Las caracteristicas de " + nombre2 + " son :\n\nPs: " + Ps1 + "\nAtaque: " + ataque1 + "\nDefensa: " + defensa1 + "\nVelocidad: " + velocidad1 + "\nEl total es " + total1);
        break;
        }
*/



            }
        }






