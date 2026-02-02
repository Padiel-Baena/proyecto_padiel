package tema3.EjerciciosMod2;

public class MyMath {
    public static double squarePerimeter(double l) {
        return 4 * l;
    }

    public static double squareArea(double l) {
        return l * l;
    }

    public static double rectanglePerimeter(double b, double h) {
        return (b * 2) + (h * 2);
    }

    public static double rectangleArea(double b, double h) {
        return b * h;
    }

    public static double circlePerimeter(double r) {
        return Math.PI * 2 * r;
    }

    public static double circleArea(double r) {
        return Math.PI * r * r;
    }

    public static boolean esPrimo(int num) {
        boolean primo = true;
        if (num <= 1) {
            return false;
        } else {
            for (int a = 2; a <= Math.sqrt(num); a++) {
                if (num % a == 0) {
                    primo = false;
                    break;
                }
            }
            return primo;
        }
    }

    public static boolean noEsPrimo(int num) {
        return !esPrimo(num);
    }

    public static int nDigitos(int num) {
        int digito = 1;
        while (num > 10) {
            num /= 10;
            digito++;
        }
        return digito;
    }

    public static void pares(int num) {

        boolean hayPares = false;
        String resultado = "";
        int cPares = 0;
        while (num > 0) {
            int digito = num % 10; // Último dígito
            if (digito % 2 == 0) {
                resultado = digito + " " + resultado; // Guardamos en orden correcto
                hayPares = true;
                cPares ++;
                //TODO: variable para contar los digitos pares
            }
            num /= 10;
        }
        if (hayPares) {
            System.out.println(resultado.trim());
        } else {
            System.out.println("Ninguno (no hay dígitos pares)");
        }
//devolver la variable
    }

    public static void noPares(int num) {
//TODO: lo mismo que en pares
        boolean noHayPares = false;
        String resultado = "";
        int cImpares = 0;
        while (num > 0) {
            int digito = num % 10; // Último dígito
            if (digito % 2 == 1) {
                resultado = digito + " " + resultado; // Guardamos en orden correcto
                noHayPares = true;
                cImpares ++;
            }
            num /= 10;
        }
        if (noHayPares) {
            System.out.println(resultado.trim());
        } else {
            System.out.println("Ninguno (no hay dígitos pares)");
        }

    }


    //TODO: factorial sin recursividad
    public static int factorialNoRecursivo(int num) {
        int var = num;
        int prod = 1;
        if (num >= 0) {
            while (num != 0) {
                prod = prod * num;
                num--;
            }
        }
        return prod;
    }

    //TODO: falta el 7, factorial con recursividad

    public static int factorialRecursivo(int num) {
        if (num == 0) return 1;
        else {
            return num * factorialRecursivo(num - 1);
        }
    }
    //TODO: revisar el enunciado y entender la función
    public static int comprobacionEcuacion(int a, int b, int c) {
        int prove = b * b - 4 * a * c;
        if (prove > 0) {
            return 2;
        } else if (prove == 0) {
            return 1;
        } else {
            return 0;
        }
    }


    public static double solucion1(int a, int b, int c) {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2.0 * a);
    }

    public static double solucion2(int a, int b, int c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2.0 * a);
    }

    public static int sumaDigitos(int n) {
        int suma = 0;
        int num = n;
        while (n >= 1) {
            num = n % 10;
            suma += num;
            n /= 10;
        }
        return suma;
    }
}