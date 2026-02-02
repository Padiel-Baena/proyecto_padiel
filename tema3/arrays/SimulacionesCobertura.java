package tema3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SimulacionesCobertura {
    public static void main(String[] args) {
        int nHabitacion;
        int potencia;
        Scanner sc = new Scanner(System.in);
        System.out.println("Este es un programa para hacer simulaciones de cobertura");
        int[] hotel = new int[20];
        System.out.println("Tienes que elegir el numero de la habitacion, en este caso de 0 a 19");
        nHabitacion = sc.nextInt();
        while (nHabitacion < 0 || nHabitacion > 19) {
            System.out.println("Me has dado un valor incorrecto, tiene que ser entre 0 y 19, ambos incluidos");
            nHabitacion = sc.nextInt();
        }
        System.out.println("Ahora dime la potencia del router, entre 1 y 6, ambos incluidos");
        potencia= sc.nextInt();
        while (potencia < 0 || potencia > 6) {
            System.out.println("Me has dado un valor incorrecto, tiene que ser entre 1 y 6");
            potencia= sc.nextInt();
        }
        System.out.println("\nCALULANDO RESULTADO...\nIMPRIMIENDO RESULTADO...\nPusla cualquier tecla para ver el resultado");
        sc.nextLine();
        sc.nextLine();
        calculo(hotel,nHabitacion,potencia);
    }
    public static void calculo(int[] hotel,int nHabitacion, int potencia){
        hotel[nHabitacion]=potencia;
        for (int i=0;i < nHabitacion;i ++){
            if (i == (nHabitacion - 1)) {
                hotel[i] = potencia - 1;
            } else if (i == (nHabitacion - 2)) {
                hotel[i] = potencia - 2;
            } else if (i == (nHabitacion - 3)) {
                hotel[i] = potencia - 3;
            } else if (i == (nHabitacion - 4)) {
                hotel[i] = potencia - 4;
            } else if (i == (nHabitacion - 5)) {
                hotel[i] = potencia - 5;
            } else if (i == (nHabitacion - 6)) {
                hotel[i] = potencia - 6;
            }

        }
        for(int i=19;i>nHabitacion;i--){
            if (i == (nHabitacion + 1)) {
                hotel[i] = potencia - 1;
            } else if (i == (nHabitacion + 2)) {
                hotel[i] = potencia - 2;
            } else if (i == (nHabitacion + 3)) {
                hotel[i] = potencia - 3;
            } else if (i == (nHabitacion + 4)) {
                hotel[i] = potencia - 4;
            } else if (i == (nHabitacion + 5)) {
                hotel[i] = potencia - 5;
            } else if (i == (nHabitacion + 6)) {
                hotel[i] = potencia - 6;
            }
        }

        for( int i = 0; i <hotel.length;i++){
            if (hotel[i] < 0){
                hotel[i] = 0;
            }
        }
        System.out.println(Arrays.toString(hotel));
        }
    }