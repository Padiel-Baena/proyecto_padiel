package tema1;

public class t1e5 {
    public static void main (String[] args) {
        System.out.println("Mi primer codigo");
        double primero = 24 % 5 ;
        System.out.println("El resultado de 24 % 5 es " + primero);
        double segundo = (double)7/2 + 2.5 ;
        System.out.println("El resultado de 7/2 + 2.5 es " + segundo);
        double tercero = 10.8 / 2 + 2 ;
        System.out.println("El resultado de 10.8 / 2 + 2 es " + tercero);
        double cuarto = (4+6) * 3 + 2*(5-1) ;
        System.out.println("El resultado de (4+6) * 3 + 2*(5-1) es " + cuarto) ;
        double quinto = (double)5 / 2 + 17 % 3 ;
        System.out.println("El resultado de 5 / 2 + 17 % 3 es " + quinto);
        boolean sexto = 7>=5 || 27 != 8 ;
        System.out.println("El resultado de 7>=5 || 27 != 8 es " + sexto );
        boolean septimo = (45 <= 7) || ! ( 5 >= 7 ) ;
        System.out.println("El resultado de (45 <= 7) || ! ( 5 >= 7 es )"+ septimo);
        double octavo = 27 % 4 + (double)15 / 4 ;
        System.out.println("El resultado de 27 % 4 + 15 / 4 es " + octavo);
        double noveno = (double) 37 / 4 * 4 - 2 ;
        System.out.println("El resultado de 37 / 4 * 4 – 2 es " + noveno);
        boolean decimo = (25 >= 7) && ! (7 <=2) ;
        System.out.println("El resultado de (25 >= 7) && ! (7 <=2) es " + decimo);
        boolean once = ('H' < 'J') && ('9' != '7') ;
        System.out.println("El resultado de ('H' < 'J') && ('9' != '7') es " + once);
        boolean doce = 25 > 20 && 13 > 5 ;
        System.out.println("El resultado de 25 > 20 && 13 > 5 es " + doce);
        boolean trece = 10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 - 2 * 2 ;
        System.out.println("El resltado de 10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 – 2 * 2 es " + trece);
        boolean catorce = 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1 ;
        System.out.println("El resultado de 4 * 2 <= 8 OR 2 * 2 < 5 AND 4 > 3 + 1 es " + catorce);
        boolean quince = 10 <= 2 * 5 && 3 < 4 || ! (8>7) && 3 * 2 <= 4 * 2 - 1 ;
        System.out.println("El resultado de 10 <= 2 * 5 AND 3 < 4 OR NOT (8>7) AND 3 * 2 <= 4 * 2 - 1 es " + quince);

    }

}