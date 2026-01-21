package tema4;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public static final String dniDefecto = "00000000A";
    public static final String nombreDefecto = "Eustaquio";
    public static final String apellidosDefecto = "Calatraba Martinez";
    public static final int edadDefecto = 15;
    public static final int adultAge = 18;
    public static final int retiredAge = 65;

    public Persona() {
        this.dni = dniDefecto;
        this.nombre = nombreDefecto;
        this.apellidos = apellidosDefecto;
        this.edad = edadDefecto;
    }

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void print(String dni, String nombre, String apellidos, int edad) {
        System.out.println("Mi nombre es " + nombre + apellidos + "\nMi DNI es : " + dni + "\nY tengo " + edad);
    }

    public String toString(String dni, String nombre, String apellidos, int edad) {
         return "Mi nombre es " + nombre + apellidos + "\nMi DNI es : " + dni + "\nY tengo " + edad;
    }

    public void isAdult(int edad) {
        if (edad >= adultAge) {
            System.out.println("Soy mayor de edad");
        } else {
            System.out.println("No soy mayor de edad");
        }
    }

    public void isRetired(int edad) {
        if (edad >= retiredAge) {
            System.out.println("Estoy retirado");
        } else {
            System.out.println("No estoy retirado");
        }
    }

    public void ageDifference(Persona persona1) {
        this.edad = persona1.getEdad();
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
}

