package tema4.ac2;

import tema4.ac2.Cuenta;

import java.util.Scanner;

public class Persona2 {
    private String dni;
    private Cuenta[] cuentas;
    int cCuentasCreadas = 0;
    private static final String DNI_DEFECTO = "12345678A";

    public Persona2() {
        this.dni = DNI_DEFECTO;
        this.cuentas = new Cuenta[3];
    }
    public Persona2(String dni) {
        this.dni = dni;
        this.cuentas = new Cuenta[3];
    }
    public Persona2(String dni, Cuenta[] cuentas) {
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }
    public Cuenta[] getCuentas() {
        return cuentas;
    }
    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public Cuenta[] crearCuentas(int nCuenta, double saldo) {
        if(this.cCuentasCreadas < 3) {

            cuentas[cCuentasCreadas].setSaldo(saldo);
            cuentas[cCuentasCreadas].setnCuenta(nCuenta);
            cCuentasCreadas++;
//               if (cuentas[cCuentasCrear].getnCuenta() == 0) {
//                   cuentas[cCuentasCrear].setnCuenta(nCuenta);
//                   cuentas[cCuentasCrear].setSaldo(saldo);
//               }
        }
        else {
            System.out.println("No puedes crear mas cuentas, el maximo por persona son 3");
        }
        return cuentas;
    }
    public boolean esMoroso(){
        boolean moroso = false;
        for(int i = 0; i < cuentas.length -1; i++){
            if(cuentas[i].getSaldo() <= 0 ){
                moroso = true;
            }
        }
        return moroso;
    }
    public static boolean checkDni(String dni) {
        String num = dni.substring(0, 8);
        int numDni = Integer.parseInt(num);
        int resto = numDni % 23;
        switch (resto) {
            case 0:
                num = num + "T";
                break;
            case 1:
                num = num + "R";
                break;
            case 2:
                num = num + "W";
                break;
            case 3:
                num = num + "A";
                break;
            case 4:
                num = num + "G";
                break;
            case 5:
                num = num + "M";
                break;
            case 6:
                num = num + "Y";
                break;
            case 7:
                num = num + "F";
                break;
            case 8:
                num = num + "P";
                break;
            case 9:
                num = num + "D";
                break;
            case 10:
                num = num + "X";
                break;
            case 11:
                num = num + "B";
                break;
            case 12:
                num = num + "N";
                break;
            case 13:
                num = num + "J";
                break;
            case 14:
                num = num + "Z";
                break;
            case 15:
                num = num + "S";
                break;
            case 16:
                num = num + "Q";
                break;
            case 17:
                num = num + "V";
                break;
            case 18:
                num = num + "H";
                break;
            case 19:
                num = num + "L";
                break;
            case 20:
                num = num + "C";
                break;
            case 21:
                num = num + "K";
                break;
            case 22:
                num = num + "E";
                break;
        }
        boolean correcto;
        if (num.equals(dni)) {
            correcto = true;
            System.out.println("El DNI que me has dicho es correcto");
        } else {
            correcto = false;
            System.out.println("El DNI que me has dicho no es correcto");
        }
        return correcto;
    }

    //toString
    public String toString(String dni) {
        String text1= "Dni : " + dni + "\n";
        String text2 = "Cuentas : " + cuentas[0].toString() + "\n";
        return text1 + text2;
    }
}