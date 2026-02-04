package tema4.ac2;

import tema4.ac2.Persona2;

import java.util.Scanner;

public class PruebaCuentasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String dni = " ";
        String dniBusqueda = " ";
        String dniBusqueda2 = " ";


        Persona2[] personas = new Persona2[3];
        int nCuenta = 0;
        double saldo = 0;
        int cCuentasCrear = 0;
        int cuentaBusqueda =0;
        double saldoRecibido =0;
        int cuentaBusqueda2 = 0;


        boolean personaCreada = false;
        int contPersona = 0;
        boolean cuentaAsociadaPersona = false;
        boolean dniCorrecto = false;
        boolean salir = false;


        showMenu();
        int opcion = sc.nextInt();
        eleccion(opcion, personaCreada, sc, cuentaAsociadaPersona);
        while (!salir) {
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido crear un objeto de tipo Persona\nEmpieza diciendome su DNI");
                    dni = sc.nextLine();
                    dniCorrecto = Persona2.checkDni(dni);
                    while (!dniCorrecto) {
                        System.out.println("El DNI especificado no es valido");
                        dni = sc.nextLine();
                        dniCorrecto = Persona2.checkDni(dni);
                    }
                    personaCreada = true;
                    Persona2 persona2_1 = new Persona2(dni);

                    personas[contPersona] = persona2_1;
                    contPersona++;
                    break;
                case 2:
                    System.out.println("Has elegido la opcion de crear una cuenta");
                    System.out.println("Dime el numero de cuenta");
                    nCuenta = sc.nextInt();
                    System.out.println("Dime el saldo que tiene la cuenta");
                    saldo = sc.nextInt();
                    Cuenta cuenta1 = new Cuenta(nCuenta, saldo);
                    System.out.println("Dime el DNI de la persona a la que quieres asociar la/s cuenta/s creada/s");
                    dniBusqueda = sc.nextLine();
                    for (int i = 0; i < personas.length; i++) {
                        String dni2 = personas[i].getDni();
                        if (dniBusqueda.equals(dni2)) {

                            personas[i].crearCuentas(nCuenta, saldo);
//                            personas[i].setCuentas() = creaCuentas(cCuentasCrear, cCuentasCreadas, cuentas);
//                            persona2_1.setCuentas(cuentas);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Has elegido la opcion de mostrar la informacion de 1 persona");
                    for (int i = 0; i < personas.length; i++) {
                        String dni2 = personas[i].getDni();
                        if (dniBusqueda.equals(dni2)) {
                            personas[i].toString(dni);
                            System.out.println(personas[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Has elegido la opcion de recibir nomina, dime el dni de la persona que va a recibir dicha nomina");
                    dniBusqueda=sc.nextLine();
                    System.out.println("Dime el numero de cuenta para recibir el ingreso");
                    cuentaBusqueda = sc.nextInt();
                    System.out.println("Dime el saldo que va a recibir dicha cuenta");
                    saldoRecibido = sc.nextInt();
                    for (int i = 0; i < personas.length; i++) {
                        String dni2 = personas[i].getDni();
                        if (dniBusqueda.equals(dni2)) {
                            for (int j = 0; j < personas[i].cCuentasCreadas; j++) {
                                if(personas[i].getCuentas()[j].getnCuenta()==cuentaBusqueda) {
                                    personas[i].getCuentas()[j].recibirAbonos(saldoRecibido);
                                    System.out.println("La nomina ha sido ingresada de forma correcta");
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Has elegido la opcion de hacer un pago, dime el dni de la persona que va a recibir dicho pago");
                    dniBusqueda=sc.nextLine();
                    System.out.println("Dime el numero de cuenta para recibir el ingreso");
                    cuentaBusqueda = sc.nextInt();
                    System.out.println("Dime el saldo que va a recibir dicha cuenta");
                    saldoRecibido = sc.nextInt();
                    for (int i = 0; i < personas.length; i++) {
                        String dni2 = personas[i].getDni();
                        if (dniBusqueda.equals(dni2)) {
                            for (int j = 0; j < personas[i].cCuentasCreadas; j++) {
                                if(personas[i].getCuentas()[j].getnCuenta()==cuentaBusqueda) {
                                    personas[i].getCuentas()[j].pagarRecibos(saldoRecibido);
                                    System.out.println("Has hecho un pago correctamente");
                                }
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Has elegido la opcion de hacer un pago, dime el dni de la persona que va a recibir dicho pago");
                    dniBusqueda=sc.nextLine();
                    System.out.println("Dime el numero de cuenta para recibir el ingreso");
                    cuentaBusqueda = sc.nextInt();
                    System.out.println("Dime el saldo que va a recibir dicha cuenta");
                    saldoRecibido = sc.nextInt();
                    System.out.println("Dime el dni de la persona que va a realizar dicho pago");
                    dniBusqueda2=sc.nextLine();
                    System.out.println("Dime el numero de cuenta para realizar el tramite");
                    cuentaBusqueda2 = sc.nextInt();
                    for (int i = 0; i < personas.length; i++) {
                        String dni2 = personas[i].getDni();
                        if (dniBusqueda.equals(dni2)) {
                            for (int j = 0; j < personas[i].cCuentasCreadas; j++) {
                                if(personas[i].getCuentas()[j].getnCuenta()==cuentaBusqueda) {
                                    personas[i].getCuentas()[j].recibirAbonos(saldoRecibido);
                                }
                            }
                        }
                    }
                    for (int i = 0; i < personas.length; i++) {
                        String dni2 = personas[i].getDni();
                        if (dniBusqueda.equals(dni2)) {
                            for (int j = 0; j < personas[i].cCuentasCreadas; j++) {
                                if(personas[i].getCuentas()[j].getnCuenta()==cuentaBusqueda) {
                                    personas[i].getCuentas()[j].pagarRecibos(saldoRecibido);
                                }
                            }
                        }
                    }
                    System.out.println("La transferencia ha sido efectuada");
                    break;
                case 7:
                    for (int i = 0; i < personas.length; i++) {
                        boolean moroso = false;
                        moroso = personas[i].esMoroso();
                        if(moroso){
                            System.out.println(personas[i].getDni() + " es moroso");
                        }
                    }
                    break;
                case 8:
                    salir = true;
                    break;
            }
            showMenu();
            opcion = sc.nextInt();
            eleccion(opcion, personaCreada, sc, cuentaAsociadaPersona);
        }
    }


    public static void showMenu() {
        System.out.println("1-Instanciar objetos tipo Persona\n2-Instanciar objetos tipo cuenta y asociarlo a una persona\n3-Mostrar datos de una persona\n4-Recibir nomina mensual\n5-Recibir pago\n6-Realizar transferencia\n7-Imprimir personas morosas\n8-Salir\nDime que es lo que quieres hacer : ");
    }

    public static int eleccion ( int opcion, boolean personaCreada, Scanner sc,boolean cuentaAsociadaPersona){
        while (opcion < 1 || opcion > 8) {
            System.out.println("El numero que has elegido no es correcto");
            opcion = sc.nextInt();
        }

        //TODO: ¿quitar "cuentaAsociadaPersona"?
        while (opcion != 1 && !personaCreada && !cuentaAsociadaPersona) {
            System.out.println("Para hacer cualquier funcion primero necesita crear una persona");
            opcion = sc.nextInt();
        }
        /*if(personaCreada) {
            if (opcion != 2 && !cuentaAsociadaPersona || opcion != 3) {
                System.out.println("SIN UNA CUENTA ASOCIADA A UNA PERSONA UNICAMENTE PUEDES MOSTRAR SUS DATOS(OPCION 3) O CREAR UNA CUENTA(OPCION 2)");
            }
        }*/
        return opcion;
    }

    public static int filtroCrearCuentas ( int cCuentasCrear, Scanner sc){
        while (cCuentasCrear < 1 || cCuentasCrear > 3) {
            System.out.println("REPITO : MINIMO 1 MAXIMO 3");
            cCuentasCrear = sc.nextInt();
        }
        return cCuentasCrear;
    }

    public static Cuenta[] creaCuentas ( int cCuentasCrear, int cCuentasCReadas, Cuenta[] cuentas){
        for (int i = 0; i < cCuentasCrear; i++) {
            Cuenta c1 = new Cuenta();
            cuentas[i] = c1;
        }
        return cuentas;
    }
}