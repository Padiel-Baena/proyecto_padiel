package tema2;

import java.util.Scanner;
//revisar
public class t2e13 {
    public static void main (String[]args){
        System.out.println("Te voy a pedir que me digas los valores de horas, minutos y segundos , y yo le voy a sumar un segundo.Empieza por las horas");//pedimos valor y explicamos
        Scanner sc = new Scanner(System.in);

        // Leer la hora
        System.out.println("Introduce las horas (0-23):");
        int horas = sc.nextInt();

        System.out.println("Introduce los minutos (0-59):");
        int minutos = sc.nextInt();

        System.out.println("Introduce los segundos (0-59):");
        int segundos = sc.nextInt();

        // Validar valores básicos
        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
            System.out.println("Hora introducida no válida.");
            sc.close();
            return;
        }

        // Incrementar un segundo
        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }

        // Mostrar resultado
        System.out.printf("La hora que me has dicho con 1 segundo mas es " + horas + ":" + minutos + ":" + segundos );

        sc.close();
    }
}
