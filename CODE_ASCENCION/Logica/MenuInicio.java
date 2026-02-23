package CODE_ASCENCION.Logica;

import utils.Colores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuInicio {
    public static String[] comprobadorStats(){
        Scanner sc = new Scanner(System.in);
        int pTotalesMax = 500;
        int puntos;
        String nombre;
        String stat;
        int ps;
        int atq;
        int def;
        int vel;
        String estirpe;
        boolean statsCorrecto = false;
        String[] Datos = new String[6];
        String conversor;

        System.out.print(Colores.colorText("Ingresa tu nombre de  Jugador : ",Colores.BOLD + Colores.PURPLE));
        nombre = sc.nextLine().toUpperCase();
        Datos[0] = nombre;
        estirpe = ElegirEstirpe(sc,nombre);
        Datos[1] = estirpe;
        while (!statsCorrecto){
            puntos = 0;
            System.out.print(Colores.colorText("INGRESA LOS PUNTOS DE SALUD DE TU PERSONAJE : ", Colores.BOLD + Colores.PURPLE));
            stat = "PS";
            ps= ComprobarStats(sc, stat);
            puntos += ps;
            cuentaPuntos(puntos);
            conversor = Integer.toString(ps);
            Datos[2] = conversor;

            System.out.print(Colores.colorText("INGRESA LOS PUNTOS DE ATAQUE DE TU PERSONAJE : ", Colores.BOLD + Colores.PURPLE));
            stat = "Ataque";
            atq= ComprobarStats(sc, stat);
            puntos += atq;
            cuentaPuntos(puntos);
            conversor = Integer.toString(atq);
            Datos[3] = conversor;

            System.out.print(Colores.colorText("INGRESA LOS PUNTOS DE DEFENSA DE TU PERSONAJE : ", Colores.BOLD + Colores.PURPLE));
            stat = "Defensa";
            def= ComprobarStats(sc, stat);
            puntos += def;
            cuentaPuntos(puntos);
            conversor = Integer.toString(def);
            Datos[4] = conversor;

            System.out.print(Colores.colorText("INGRESA LOS PUNTOS DE VELOCIDAD DE TU PERSONAJE : ", Colores.BOLD + Colores.PURPLE));
            stat = "Velocidad";
            vel= ComprobarStats(sc, stat);
            puntos += vel;
            cuentaPuntos(puntos);
            conversor = Integer.toString(vel);
            Datos[5] = conversor;

            statsCorrecto = ComprobarPuntos(pTotalesMax);
        }
        return Datos;
    }

    public static String ElegirEstirpe(Scanner sc, String nombre){
        int opcion;
        String elegido = "";
        String frase1 = nombre + " TIENES QUE ESCOGER TU ESTIRPE";
        System.out.println(Colores.colorText(frase1,Colores.PURPLE));
        String frase = ShowEstirpes();
        System.out.println(Colores.colorText(frase,Colores.CYAN));
        System.out.print(Colores.colorText("Elige tu destino : ",Colores.PURPLE));
        opcion = ComprobarEleccion(sc);
        switch (opcion){
            case 1:
                System.out.println(Colores.colorText("HAS ELEGIDO AL COMANDANTE DE LA LEGION",Colores.BOLD + Colores.GOLD));
                System.out.println(Colores.colorText("Las sombras se agitan... Tu ejército aguarda el primer cadáver.", Colores.ORANGE));
                elegido = "COMANDANTE DE LA LEGION";
                break;
            case 2:
                System.out.println(Colores.colorText("HAS ELEGIDO AL ACORAZADO OVERCLOCK",Colores.BOLD + Colores.GOLD));
                System.out.println(Colores.colorText("Reactores en línea. Sistemas de enfriamiento al límite. Arrasa con todo.", Colores.ORANGE));
                elegido = "ACORAZADO OVERCLOCK";
                break;
            case 3:
                System.out.println(Colores.colorText("HAS ELEGIDO AL HERALDO DEL ETER",Colores.BOLD + Colores.GOLD));
                System.out.println(Colores.colorText("La transmutación comienza. ¿Qué sacrificarás hoy para sobrevivir?", Colores.ORANGE));
                elegido = "HERALDO DEL ETER";
                break;
        }
        return elegido;
    }

    public static String ShowEstirpes(){
        String frase = "1. Comandante de la Legión\n" +
                "[ SIGILO | EJÉRCITO | CRÍTICO ]\n" +
                "\n" +
                "La muerte es tu reclutadora. Muévete entre sombras, asesta golpes fatales y alza a los caídos. Tu ejército crece con cada cadáver." +
                "\n" +
                "Mecánica: Extrae sombras de enemigos para la siguiente sala.";
        /*Citas Aleatorias (Ingame):

"Levantaos. Vuestro nuevo señor os reclama."

"Tu sombra ahora me pertenece."

"Solo sois ecos en mi legión."

"La oscuridad nunca pelea sola."

         */
        frase += "2. Acorazado Overclock\n" +
                "[ TANQUE | CALOR | ESCUDOS ]\n" +
                "\n" +
                "Fortaleza de cromo inamovible. Intercambia velocidad por defensa pesada. Vigila tu temperatura o tus sistemas arderán." +
                "\n" +
                "Mecánica: Escudos de energía. El ataque continuo genera Sobrecalentamiento.";
        /*Citas Aleatorias (Ingame):

"Sistemas al 110%. Que intenten traspasarme."

"Presión térmica estable... por ahora."

"Blindaje sellado. Iniciando purga."

"¿Eso es to_do lo que tienes, carne?"

         */
        frase += "3. Heraldo del Éter\n" +
                "[ MAGIA | GESTIÓN | ALQUIMIA ]\n" +
                "\n" +
                "El inventario es tu fuente de poder. Consume metales y esencias para desatar el caos. Nada se crea, todo se gasta." +
                "\n" +
                "Mecánica: Gasta items del inventario para lanzar hechizos potentes.";
        /*Citas Aleatorias (Ingame):

"Nada se crea, nada se pierde... to_do se consume."

"Un metal noble para un fin innoble."

"Siento la esencia fluyendo en mis manos."

"Tu materia será mi próximo hechizo."

         */
        return frase;
    }

    public static int ComprobarEleccion(Scanner sc){
        int opcion = 0;
        boolean valido = false;
        while (!valido) {
            try {
                Colores.logHeader("ELIGE ENTRE 1 Y 3");
                opcion = sc.nextInt();
                if(opcion >= 1 && opcion <= 3) {
                    valido = true;
                }else{
                    Colores.logError("Solo puedes escoger entre 1 y 3");
                }
            } catch (InputMismatchException ex) {
                Colores.logError("TE HE PEDIDO UN NUMERO ENTRE 1 Y 3");
            }
        }
        return opcion;
    }
    /*> Clase seleccionada: [NOMBRE_CLASE]
> Sincronizando interfaz neuronal... [OK]
> Cargando protocolos de combate... [OK]
> BIENVENIDO AL CAMPO DE BATALLA, OPERADOR.
     */
    public static int ComprobarStats(Scanner sc, String stat){
        int opcion = 0;
        boolean valido = false;
        while (!valido) {
            try {
                Colores.logHeader("ELIGE ENTRE 1 Y 200 PARA PONER LOS PUNTOS DE " + stat);
                opcion = sc.nextInt();
                if(opcion >= 1 && opcion <= 200) {
                    valido = true;
                }else{
                    Colores.logError("El minimo es 1 y el maximo es 200");
                }
            } catch (InputMismatchException ex) {
                Colores.logError("TE HE PEDIDO UN NUMERO ENTRE 1 Y 200");
            }
        }
        return opcion;
    }

    public static boolean ComprobarPuntos(int pTotales){
        boolean correcto = false;
        if (pTotales > 500){
            Colores.logError("El valor maximo de la suma de los atributos es de 500, tu has puesto un total de " + pTotales);
        }else{
            correcto = true;
        }
        return correcto;
    }

    public static void cuentaPuntos(int puntos){
        Colores.logWarning("PUNTOS RESTANTES : " + 500 + " - " + puntos);
    }
}
