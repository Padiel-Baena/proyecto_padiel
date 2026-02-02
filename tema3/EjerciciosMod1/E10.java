package tema3;

import java.util.Scanner;

import static tema3.E5.tabla2;
import static tema3.E7.esPrimo;
import static tema3.E8.prove;
import static tema3.E9.formacion;

//Escribe un programa que muestre un menú con 9 opciones (si tus
//ejercicios son modulares no debería costarte demasiado):
//a) Muestra el signo de un número introducido por el usuario.
//b) Indica si el usuario es mayor de edad o no.
//c) Calcula el área y perímetro de un círculo.
//d) Conversor de euros a dólares y de dólares a euros.
//e) Mostrar tabla de multiplicar de un número.
//f) Mostrar tablas de multiplicar del 1 al 10.
//g) Comprobador de números primos.
//h) Comprobador de fechas.
//i) Dibujar triángulos.
public class E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que quieres que haga\na) Mostrar el signo de un número introducido por el usuario.\n" +
                "b) Indicar si el usuario es mayor de edad o no.\n" +
                "c) Calcular el área y perímetro de un círculo.\n" +
                "d) Convertir de euros a dólares y de dólares a euros.\n" +
                "e) Mostrar tabla de multiplicar de un número.\n" +
                "f) Mostrar tablas de multiplicar del 1 al 10.\n" +
                "g) Comprobar números primos.\n" +
                "h) Comprobar fechas.\n" +
                "i) Dibujar triángulos.");
        char sign = sc.next().charAt(0);
        while(sign != 'a' && sign!= 'b' && sign!= 'c' && sign!= 'd' && sign!= 'e' && sign!= 'f' && sign!= 'g' && sign!= 'h' && sign != 'i') {
            System.out.println("No me has dado una caracter valido, vuelve a intentarlo");
            sign = sc.next().charAt(0);
        }
        switch (sign) {
            case 'a':
                System.out.println("Dime un numero");
                int num = sc.nextInt();
                int result = E1.numberSign(num);
                if (result == 0 ){
                    System.out.println("El numero es 0");
                } else if (result == 1) {
                    System.out.println("El numero es positivo");
                }else{
                    System.out.println("El numero es negatico");
                }
                break;
            case 'b':
                boolean age =false;
                System.out.println("Dime una edad");
                int edad = sc.nextInt();
                age =E2.isAdult(edad);
                if (age){
                    System.out.println("Es mayor de edad");
                }else  {
                    System.out.println("Es menor de edad");
                }
                break;
            case 'c':
                boolean valido = false;
                System.out.println("Dime un valor para un radio");
                double radius = sc.nextDouble();
                valido =E3.validRadius(radius);
                while (!valido){
                    System.out.println("Dime un valor mayor a 0 para que sea un radio valido");
                    radius = sc.nextDouble();
                    valido = E3.validRadius(radius);
                }
                System.out.println("El perimetro es : "+E3.calculatePerimeter(radius));
                System.out.println("El area es : "+E3.calculateArea(radius));
                break;
            case 'd':
                double valor;
                int eleccion;
                double result2;
                System.out.println("Dime el valor que quieres convertir");
                valor = sc.nextDouble();
                while(!E4.comprobar(valor)){
                    System.out.println("Dime un valor valido para poder convertirlo, no puedo convertir numeros negativos");
                    valor = sc.nextDouble();
                }
                E4.showMenu();
                eleccion = sc.nextInt();
                while (eleccion != 1 && eleccion != 2){
                    System.out.println("Dame un valor valido, 1 o 2");
                    eleccion = sc.nextInt();
                }
                switch (eleccion) {
                    case 1:
                        result2 =E4.euro2dollar(valor);
                        System.out.println(valor + " € son un total de "  + result2 + " $");
                        break;
                    case 2:
                        result2 =E4.dollar2euro(valor);
                        System.out.println(valor + " $ son un total de "  + result2 + " €");
                        break;
                }
                break;
            case 'e':
                System.out.println("Dime un numero entero de 1 a 10 y yo te mostrare el resultado de su tabla de multiplicar");
                int num2 = sc.nextInt();
                while (num2 < 0 || num2 > 10) {
                    System.out.println("Dime un numero del 1 al 10");
                    num2= sc.nextInt();
                }
                tabla2(num2);
                break;
            case 'f':
                System.out.println("Te voy a decir las tablas del 1 al 10");
                int num3 = 1;
                int n = 1;
                for(num3 = 1; num3 < 11; num3++) {
                    E5.tabla2(num3);
                }
                break;
            case 'g':
                int num4;
                boolean primo;
                System.out.println("Dime numeros y yo te dire si es primo o no, en el caso de que me pongas el 0, se terminara el programa");
                num4 = sc.nextInt();
                while (num4 < 0) {
                    System.out.println("Los numeros negativos no son primos, dame un numero positivo");
                    num4 = sc.nextInt();
                }
                while (num4 > 0){
                    primo = esPrimo(num4);
                    if (primo){
                        System.out.println(num4 + " es Primo");
                    }else {
                        System.out.println(num4 + " no es primo");
                    }
                    System.out.println("Dime otro numero positivo o 0 para finalizar");
                    num4 = sc.nextInt();
                }
                System.out.println("Finalizando programa...");
                break;
            case 'h':
                System.out.println("Te voy a pedir un dia, mes y año, y te dire si la fecha es correcta o no.\nEmpieza por el dia");
                int DD = sc.nextInt();
                System.out.println("Ahora el mes");
                int MM = sc.nextInt();
                System.out.println("Por ultimo el año");
                int YY = sc.nextInt();
                boolean result3 = prove(YY,MM,DD);
                if (result3){
                    System.out.println("La fecha es correcta");
                }else{
                    System.out.println("La fecha no es correcta");
                }
                break;
            case 'i':
                System.out.println("Dime una cantidad de lineas, y un caracter, y yo te hare una piramide, con los paremetros que me digas\nEmpieza diciendome un numero de lineas");
                int line = sc.nextInt();
                while (line <= 0) {
                    System.out.println("No puedo hacer una piramide con 0 lineas o menos, dime un numero positivo");
                    line = sc.nextInt();
                }
                int contador = line;
                System.out.println("Dime el simbolo o caracter que quieras");
                char sign2 = sc.next().charAt(0);

                formacion(line, sign2);
                break;
        }
    }
}